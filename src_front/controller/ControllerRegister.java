package controller;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class ControllerRegister {

	@FXML
	private TextField passwordCreate;

	@FXML
	private Button registerAllUser;

	@FXML
	private TextField userCreate;

	@FXML
	void registerButton(ActionEvent event) throws IOException {

		Stage currentStage = (Stage) registerAllUser.getScene().getWindow();
		currentStage.close();
		
		File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/SeleccionPokemon.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		ControllerSeleccionarPokemon pokemon = loader.getController();
		Parent root = loader.load();
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.show();
		
	}

	public void init() {
		File file = new File(System.getProperty("user.dir") + "/recursos/audios/registerAudio.mp3");
		Media sound = new Media(file.toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer.setAutoPlay(true);
		mediaPlayer.setVolume(1);
	}

}