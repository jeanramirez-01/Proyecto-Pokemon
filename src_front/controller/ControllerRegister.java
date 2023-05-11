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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

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

	private char selectedGender = 'X';

	@FXML
	private Parent myAnchorPane;

	@FXML
	public void init() {
		File backgroundMusicFile = new File(System.getProperty("user.dir") + "/recursos/audios/registerAudio.mp3");
		Media backgroundMusicMedia = new Media(backgroundMusicFile.toURI().toString());
		MediaPlayer backgroundMusicPlayer = new MediaPlayer(backgroundMusicMedia);
		backgroundMusicPlayer.play();
		backgroundMusicPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		backgroundMusicPlayer.setVolume(1);
	}

	@FXML
	void comebackHelicopter(ActionEvent event) {
		
		imagenEntrenadorSeleccion.setImage(null);
		File iconFile = new File("recursos/imagenes/imagenes_register/helicoptero.png");
		Image image = new Image(iconFile.toURI().toString());
		helicopteroImage.setImage(image);

		File file = new File(System.getProperty("user.dir") + "/recursos/audios/efectoBotonPresion.mp3");
		Media sound = new Media(file.toURI().toString());
		MediaPlayer mediaPlaye = new MediaPlayer(sound);
		mediaPlaye.setVolume(1);
		mediaPlaye.play();
		selectedGender = 'N';
		buttonHelicopter.setStyle("-fx-background-color: #00722e");
		buttonFemale.setStyle(null);
		buttonMale.setStyle(null);

	}

	@FXML
	void comebackDarling(ActionEvent event) {
		
		helicopteroImage.setImage(null);
		File iconFile = new File("recursos/imagenes/imagenes_register/liraEntrenador.png");
		Image image = new Image(iconFile.toURI().toString());
		imagenEntrenadorSeleccion.setImage(image);

		File file = new File(System.getProperty("user.dir") + "/recursos/audios/efectoBotonPresion.mp3");
		Media sound = new Media(file.toURI().toString());
		MediaPlayer mediaPlaye = new MediaPlayer(sound);
		mediaPlaye.setVolume(1);
		mediaPlaye.play();
		selectedGender = 'M';
		buttonFemale.setStyle("-fx-background-color: #ff66cc");
		buttonMale.setStyle(null);
		buttonHelicopter.setStyle(null);
	}

	@FXML
	void comebackMan(ActionEvent event) {

		helicopteroImage.setImage(null);
		File iconFile = new File("recursos/imagenes/imagenes_register/ecoEntrenador.png");
		Image image = new Image(iconFile.toURI().toString());
		imagenEntrenadorSeleccion.setImage(image);

		File file = new File(System.getProperty("user.dir") + "/recursos/audios/efectoBotonPresion.mp3");
		Media sound = new Media(file.toURI().toString());
		MediaPlayer mediaPlaye = new MediaPlayer(sound);
		mediaPlaye.setVolume(1);
		mediaPlaye.play();
		selectedGender = 'H';
		buttonMale.setStyle("-fx-background-color: #6699ff");
		buttonFemale.setStyle(null);
		buttonHelicopter.setStyle(null);

	}

	@FXML
	void registerButton(ActionEvent event) throws IOException {

		File file = new File(System.getProperty("user.dir") + "/recursos/audios/efectoBotonPresion.mp3");
		Media sound = new Media(file.toURI().toString());
		MediaPlayer mediaPlaye = new MediaPlayer(sound);
		mediaPlaye.setVolume(1);
		mediaPlaye.play();

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
		Stage currentStage = (Stage) buttonRegisterAllDate.getScene().getWindow();
		currentStage.close();
		File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/SeleccionPokemon.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		Parent root = loader.load();

		Stage registerStage = new Stage();
		registerStage.setScene(new Scene(root));
		registerStage.setResizable(false);
		File iconFile = new File(System.getProperty("user.dir") + "/recursos/imagenes/imagenes_login/iconoVentana.png");
		Image icon = new Image(iconFile.toURI().toString());
		registerStage = (Stage) root.getScene().getWindow();
		registerStage.getIcons().add(icon);
		registerStage.setTitle("Pokemon Cesur");
		registerStage.show();

	}

	private char getSelectedGender() {
		return selectedGender;
	}

}