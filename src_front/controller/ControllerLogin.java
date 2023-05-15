package controller;

import java.io.File;
import java.io.IOException;
import controllercrud.LoginCRUD;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControllerLogin {

	private static MediaPlayer mediaPlayer;

	private Stage stage;

	@FXML
	private Button loginButton;

	@FXML
	private Button registerButton;

	@FXML
	private Button exitButton;

	@FXML
	private PasswordField textPassword;

	@FXML
	private TextField textUser;

	@FXML
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
			
				File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/SeleccionPokemon.fxml");
				FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
				Parent root = loader.load();
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.setScene(scene);
				Parent rootCurrent = loginButton.getScene().getRoot();
				FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootCurrent);
				fadeOut.setFromValue(1.0);
				fadeOut.setToValue(0.0);
				fadeOut.setOnFinished(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						// Cuando la transición de desvanecimiento termina, asigna la nueva escena
						Stage stage = (Stage) loginButton.getScene().getWindow();
						stage.setScene(scene);

						// Crea la transición de aparición para la nueva escena
						FadeTransition fadeIn = new FadeTransition(Duration.millis(500), root);
						fadeIn.setFromValue(0.0);
						fadeIn.setToValue(1.0);
						fadeIn.play();
					}
				});
				fadeOut.play();
				mediaPlayer.stop();

				// Carga la nueva escena

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

		File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/Register.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		Parent root = loader.load();
		Scene scene = new Scene(root);
		ControllerRegister registerController = loader.getController();
		registerController.init();

		// Obtiene la raíz de la escena actual y asigna la transición
		Parent rootCurrent = loginButton.getScene().getRoot();
		FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootCurrent);
		fadeOut.setFromValue(1.0);
		fadeOut.setToValue(0.0);
		fadeOut.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// Cuando la transición de desvanecimiento termina, asigna la nueva escena
				Stage stage = (Stage) loginButton.getScene().getWindow();
				stage.setScene(scene);

				// Crea la transición de aparición para la nueva escena
				FadeTransition fadeIn = new FadeTransition(Duration.millis(500), root);
				fadeIn.setFromValue(0.0);
				fadeIn.setToValue(1.0);
				fadeIn.play();
			}
		});
		fadeOut.play();

		mediaPlayer.stop();

	}

	@FXML
	void salir(ActionEvent event) {

		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.close();

	}

	public void setStage(Stage primaryStage) {

		stage = primaryStage;

	}
}
