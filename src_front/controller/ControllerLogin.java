package controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

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


public class ControllerLogin {

	private Stage stage;
	
	@FXML
	private Button loginButton;

	@FXML
	private Button registerButton;

	@FXML
	private TextField textPassword;

	@FXML
	private TextField textUser;

	@FXML
	public void initialize() {

		File file = new File(
				"T:\\\\ProyectoJAVA\\\\Eclipse\\\\ProyectoPokemon\\\\recursos\\\\audios\\\\introLoginAudio.mp3");
		Media sound = new Media(file.toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer.setAutoPlay(true);
		mediaPlayer.setVolume(1);
	}

	@FXML
	void iniciarSesion(ActionEvent event) {
		
		
		
	}

	@FXML
	void showRegister(ActionEvent event) throws IOException {
		
		InputStream fxmlStream = getClass().getResourceAsStream("/view/Register.fxml");
	    FXMLLoader loader = new FXMLLoader();
	    Parent root = loader.load(fxmlStream);
	    ControllerRegister registerController = loader.getController();
	    Scene scene = new Scene(root);
	    Stage stage = new Stage();        
	    stage.setScene(scene);
	    registerController.init();
	    stage.show();
	    this.stage.close();
	}

	public void setStage(Stage primaryStage) {
		
		stage = primaryStage;
		
	}
}
