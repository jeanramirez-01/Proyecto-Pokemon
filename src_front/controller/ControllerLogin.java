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
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class ControllerLogin {

	private Stage stage;

	private MediaPlayer mediaPlayer;

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
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setAutoPlay(true);
	}

	@FXML
	void iniciarSesion(ActionEvent event) {
		String nombre = textUser.getText();
		String pass = textPassword.getText();

		if (LoginCRUD.selectIniciarSesion(nombre, pass)) {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/SeleccionPokemon.fxml"));
				Parent root = loader.load();
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.setScene(scene);
				stage.show();
				// Cerrar la ventana actual de inicio de sesión
				Stage currentStage = (Stage) loginButton.getScene().getWindow();
				currentStage.close();
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

		mediaPlayer.stop();
		mediaPlayer.setVolume(0);
		mediaPlayer.setOnStopped(() -> mediaPlayer.dispose());

		// Carga la vista de registro
		File fxmlFile = new File("T:\\ProyectoJAVA\\Eclipse\\ProyectoPokemon\\src_front\\view\\Register.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		Parent root = loader.load();
		ControllerRegister registerController = loader.getController();

		// Crea una nueva ventana de registro y establece su escena
		Stage registerStage = new Stage();
		registerStage.setScene(new Scene(root));

		// Inicializa el controlador de registro y muestra la ventana
		registerController.init();
		registerStage.show();

		// Cierra la ventana actual de inicio de sesión
		Stage currentStage = (Stage) loginButton.getScene().getWindow();
		currentStage.close();
	}

	public void setStage(Stage primaryStage) {

		stage = primaryStage;

	}
}
