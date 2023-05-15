package controller;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControllerRegister {

	@FXML
	private TextField ageCreateField;

	@FXML
	private Button buttonFemale;

	@FXML
	private Button buttonMale;

	@FXML
	private Button buttonHelicopter;

	@FXML
	private Button buttonRegisterAllDate;

	@FXML
	private ImageView imagenEntrenadorSeleccion;

	@FXML
	private ImageView helicopteroImage;

	@FXML
	private TextField passwordCreateField;

	@FXML
	private TextField userCreateField;

	@FXML
	private Parent myAnchorPane;

	@FXML
	private Button exitButton;

	@FXML
	private Button backButton;

	private static MediaPlayer mediaPlayer;

	private MediaPlayer buttonClickPlayer;

	private char selectedGender = 'X';

	@FXML
	public void init() {

		File file = new File(System.getProperty("user.dir") + "/recursos/audios/registerAudio.mp3");
		Media sound = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer.setVolume(1);
		mediaPlayer.play();

		File buttonClickFile = new File(System.getProperty("user.dir") + "/recursos/audios/efectoBotonPresion.mp3");
		Media buttonClickMedia = new Media(buttonClickFile.toURI().toString());
		buttonClickPlayer = new MediaPlayer(buttonClickMedia);
		buttonClickPlayer.setVolume(1);
	}

	@FXML
	void comebackHelicopter(ActionEvent event) {

		imagenEntrenadorSeleccion.setImage(null);
		File iconFile = new File("recursos/imagenes/imagenes_register/helicoptero.png");
		Image image = new Image(iconFile.toURI().toString());
		helicopteroImage.setImage(image);

		selectedGender = 'N';
		buttonHelicopter.setStyle("-fx-background-color: #00722e");
		buttonFemale.setStyle(null);
		buttonMale.setStyle(null);

		buttonClickPlayer.seek(Duration.ZERO);
		buttonClickPlayer.play();

	}

	@FXML
	void comebackDarling(ActionEvent event) {

		helicopteroImage.setImage(null);
		File iconFile = new File("recursos/imagenes/imagenes_register/liraEntrenador.png");
		Image image = new Image(iconFile.toURI().toString());
		imagenEntrenadorSeleccion.setImage(image);

		selectedGender = 'M';
		buttonFemale.setStyle("-fx-background-color: #ff66cc");
		buttonMale.setStyle(null);
		buttonHelicopter.setStyle(null);

		buttonClickPlayer.seek(Duration.ZERO);
		buttonClickPlayer.play();
	}

	@FXML
	void comebackMan(ActionEvent event) {

		helicopteroImage.setImage(null);
		File iconFile = new File("recursos/imagenes/imagenes_register/ecoEntrenador.png");
		Image image = new Image(iconFile.toURI().toString());
		imagenEntrenadorSeleccion.setImage(image);

		selectedGender = 'H';
		buttonMale.setStyle("-fx-background-color: #6699ff");
		buttonFemale.setStyle(null);
		buttonHelicopter.setStyle(null);

		buttonClickPlayer.seek(Duration.ZERO);
		buttonClickPlayer.play();
	}

	@FXML
	void registerButton(ActionEvent event) throws IOException {

		// Obtener datos de los campos de texto y botones de radio
		String nombre = userCreateField.getText();
		String pass = passwordCreateField.getText();
		int age = 0;
		// Validar que los campos requeridos estén llenos
		try {
			age = Integer.parseInt(ageCreateField.getText());
		} catch (NumberFormatException e) {
			// Mostrar mensaje de error si la edad no es un número válido
			Alert alert = new Alert(AlertType.ERROR, "La edad debe ser un número entero.");
			alert.showAndWait();
			return;
		}
		if (nombre.isEmpty() || pass.isEmpty() || age == 0) {
			// Mostrar mensaje de error si hay algún campo vacío
			Alert alert = new Alert(AlertType.ERROR, "Debe completar todos los campos.");
			alert.showAndWait();
			return;
		}

		// Agregar el nuevo usuario a la lista de usuarios existente
		LoginCRUD.crearUsuario(nombre, pass, age, getSelectedGender());

		// Cerrar la ventana actual y abrir la ventana de selección de Pokemon
		File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/SeleccionPokemon.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		Parent root = loader.load();
		Scene scene = new Scene(root);

		// Obtiene la raíz de la escena actual y asigna la transición
		Parent rootCurrent = backButton.getScene().getRoot();
		FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootCurrent);
		fadeOut.setFromValue(1.0);
		fadeOut.setToValue(0.0);
		fadeOut.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// Cuando la transición de desvanecimiento termina, asigna la nueva escena
				Stage stage = (Stage) backButton.getScene().getWindow();
				stage.setScene(scene);

				// Crea la transición de aparición para la nueva escena
				FadeTransition fadeIn = new FadeTransition(Duration.millis(500), root);
				fadeIn.setFromValue(0.0);
				fadeIn.setToValue(1.0);
				fadeIn.play();
			}
		});
		fadeOut.play();
		buttonClickPlayer.play();

	}

	@FXML
	void exit(ActionEvent event) {

		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.close();
		buttonClickPlayer.play();

	}

	@FXML
	void volver(ActionEvent event) throws IOException {
		File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/Login.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		Parent root = loader.load();
		Scene scene = new Scene(root);

		buttonClickPlayer.play();

		// Obtiene la raíz de la escena actual y asigna la transición
		Parent rootCurrent = backButton.getScene().getRoot();
		FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootCurrent);
		fadeOut.setFromValue(1.0);
		fadeOut.setToValue(0.0);
		fadeOut.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// Cuando la transición de desvanecimiento termina, asigna la nueva escena
				Stage stage = (Stage) backButton.getScene().getWindow();
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

	private char getSelectedGender() {
		return selectedGender;
	}

}