package controller;

import java.io.File;
import java.io.IOException;
import controllercrud.LoginCRUD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class ControllerLogin {

	private static MediaPlayer mediaPlayer;

	private Stage stage;

	@FXML
	private Button loginButton;

	@FXML
	private Button registerButton;

	@FXML
	private PasswordField textPassword;

	@FXML
	private TextField textUser;

	public void initialize() {

		File file = new File(System.getProperty("user.dir") + "/recursos/audios/introLoginAudio.mp3");
		Media sound = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer.setVolume(1);
		mediaPlayer.play();
	}

	@FXML
	void iniciarSesion(ActionEvent event) {
		
		File file = new File(System.getProperty("user.dir") + "/recursos/audios/efectoBotonPresion.mp3");
		Media sound = new Media(file.toURI().toString());
		MediaPlayer mediaPlaye = new MediaPlayer(sound);
		mediaPlaye.setVolume(1);
		mediaPlaye.play();
		
		String nombre = textUser.getText();
		String pass = textPassword.getText();
		
		if (LoginCRUD.selectIniciarSesion(nombre, pass)) {
			try {
				Stage currentStage = (Stage) loginButton.getScene().getWindow();
				currentStage.close();
				mediaPlayer.stop();
				
				File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/SeleccionPokemon.fxml");
				FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
				Parent root = loader.load();
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.setScene(scene);
				File iconFile = new File(System.getProperty("user.dir") + "/recursos/imagenes/imagenes_login/iconoVentana.png");
			    Image icon = new Image(iconFile.toURI().toString());
			    stage = (Stage) root.getScene().getWindow();
			    stage.getIcons().add(icon);
			    stage.setTitle("Pokemon Cesur");
				stage.show();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Credenciales incorrectas");
			alert.setContentText("El usuario o la contraseña son incorrectos");
			alert.showAndWait();
		}
	}

	@FXML
	void showRegister(ActionEvent event) throws IOException {

		File file = new File(System.getProperty("user.dir") + "/recursos/audios/efectoBotonPresion.mp3");
		Media sound = new Media(file.toURI().toString());
		MediaPlayer mediaPlaye = new MediaPlayer(sound);
		mediaPlaye.setVolume(1);
		mediaPlaye.play();
		
		Stage currentStage = (Stage) loginButton.getScene().getWindow();
		currentStage.close();
		
		File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/Register.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		Parent root = loader.load();
		Stage registerStage = new Stage();
		registerStage.setScene(new Scene(root));
		registerStage.setResizable(false);
		ControllerRegister registerController = loader.getController();
		registerController.init();
		
		File iconFile = new File(System.getProperty("user.dir") + "/recursos/imagenes/imagenes_login/iconoVentana.png");
	    Image icon = new Image(iconFile.toURI().toString());
	    registerStage = (Stage) root.getScene().getWindow(); 
	    registerStage.getIcons().add(icon);
		registerStage.setTitle("Pokemon Cesur");
		registerStage.show();
		mediaPlayer.stop();
		
		
	}
	
	public void setStage(Stage primaryStage) {

		stage = primaryStage;

	}
}
