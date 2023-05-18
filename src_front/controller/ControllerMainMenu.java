package controller;

import java.io.File;
import java.io.IOException;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;
import mecanicaspokemon.Entrenador;

public class ControllerMainMenu {

	@FXML
	private Button bagbtn;

	@FXML
	private Button exitbtn;

	@FXML
	private Button pcPokemonbtn;

	@FXML
	private Button pokedexbtn;

	@FXML
	private Button shopbtn;

	@FXML
	private Button singOutbtn;

	@FXML
	private Button teambtn;

	@FXML
	private Button capturabtn;

	@FXML
	private Button mutebtn;

	private static MediaPlayer musicaFondo;

	private MediaPlayer buttonClickPlayer;

	private boolean musicPlaying = true;

	private ImageView playIcon;

	private ImageView pauseIcon;
	
	private static Entrenador jugador;

	@FXML
	void init() {

		Singleton singleton = Singleton.getInstance(null); 
		jugador = singleton.value;

		System.out.println(jugador.getNombre());

		File playIconFile = new File("recursos/imagenes/imagenes_main_menu/soundImage.png");
		Image playImage = new Image(playIconFile.toURI().toString());
		playIcon = new ImageView(playImage);
		playIcon.setFitWidth(15);
		playIcon.setFitHeight(15);

		File pauseIconFile = new File("recursos/imagenes/imagenes_main_menu/muteImage.png");
		Image pauseImage = new Image(pauseIconFile.toURI().toString());
		pauseIcon = new ImageView(pauseImage);
		pauseIcon.setFitWidth(15);
		pauseIcon.setFitHeight(15);
		mutebtn.setGraphic(pauseIcon);

		File file2 = new File("recursos/audios/efectoBotonPresion.mp3");
		Media sound2 = new Media(file2.toURI().toString());
		buttonClickPlayer = new MediaPlayer(sound2);
		buttonClickPlayer.setVolume(1);

		File file = new File("recursos/audios/mainMenuAudio.mp3");
		Media sound = new Media(file.toURI().toString());
		musicaFondo = new MediaPlayer(sound);
		musicaFondo.setCycleCount(MediaPlayer.INDEFINITE);
		musicaFondo.setVolume(1);
		musicaFondo.play();

	}

	@FXML
	void cerrarSesion(ActionEvent event) throws IOException {

		buttonClickPlayer.play();
		File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/Login.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		Parent root = loader.load();
		Scene scene = new Scene(root);
		musicaFondo.stop();

		Parent rootCurrent = singOutbtn.getScene().getRoot();
		FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootCurrent);
		fadeOut.setFromValue(1.0);
		fadeOut.setToValue(0.0);
		fadeOut.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Stage stage = (Stage) singOutbtn.getScene().getWindow();
				stage.setScene(scene);
				FadeTransition fadeIn = new FadeTransition(Duration.millis(500), root);
				fadeIn.setFromValue(0.0);
				fadeIn.setToValue(1.0);
				fadeIn.play();
			}
		});
		fadeOut.play();

	}

	@FXML
	void mostrarBolsa(ActionEvent event) throws IOException {

		buttonClickPlayer.play();
		File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/Login.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		Parent root = loader.load();
		Scene scene = new Scene(root);

		Parent rootCurrent = singOutbtn.getScene().getRoot();
		FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootCurrent);
		fadeOut.setFromValue(1.0);
		fadeOut.setToValue(0.0);
		fadeOut.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				Stage stage = (Stage) singOutbtn.getScene().getWindow();
				stage.setScene(scene);

				FadeTransition fadeIn = new FadeTransition(Duration.millis(500), root);
				fadeIn.setFromValue(0.0);
				fadeIn.setToValue(1.0);
				fadeIn.play();
			}
		});
		fadeOut.play();

	}

	@FXML
	void mostrarCaja(ActionEvent event) throws IOException {

		buttonClickPlayer.play();
		File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/Login.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		Parent root = loader.load();
		Scene scene = new Scene(root);

		Parent rootCurrent = singOutbtn.getScene().getRoot();
		FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootCurrent);
		fadeOut.setFromValue(1.0);
		fadeOut.setToValue(0.0);
		fadeOut.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				Stage stage = (Stage) singOutbtn.getScene().getWindow();
				stage.setScene(scene);

				FadeTransition fadeIn = new FadeTransition(Duration.millis(500), root);
				fadeIn.setFromValue(0.0);
				fadeIn.setToValue(1.0);
				fadeIn.play();
			}
		});
		fadeOut.play();

	}

	@FXML
	void mostrarEquipo(ActionEvent event) throws IOException {

		buttonClickPlayer.play();
//		File fxmlFile = new File("src_front/view/Login.fxml");
//		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
//		Parent root = loader.load();
//		Scene scene = new Scene(root);

		System.out.println(jugador.getNombre());

//		// Obtiene la raíz de la escena actual y asigna la transición
//		Parent rootCurrent = singOutbtn.getScene().getRoot();
//		FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootCurrent);
//		fadeOut.setFromValue(1.0);
//		fadeOut.setToValue(0.0);
//		fadeOut.setOnFinished(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				// Cuando la transición de desvanecimiento termina, asigna la nueva escena
//				Stage stage = (Stage) singOutbtn.getScene().getWindow();
//				stage.setScene(scene);
//
//				// Crea la transición de aparición para la nueva escena
//				FadeTransition fadeIn = new FadeTransition(Duration.millis(500), root);
//				fadeIn.setFromValue(0.0);
//				fadeIn.setToValue(1.0);
//				fadeIn.play();
//			}
//		});
//		fadeOut.play();ç

	}

	@FXML
	void mostrarPokedex(ActionEvent event) throws IOException {

		buttonClickPlayer.play();
		File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/Login.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		Parent root = loader.load();
		Scene scene = new Scene(root);

		// Obtiene la raíz de la escena actual y asigna la transición
		Parent rootCurrent = singOutbtn.getScene().getRoot();
		FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootCurrent);
		fadeOut.setFromValue(1.0);
		fadeOut.setToValue(0.0);
		fadeOut.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// Cuando la transición de desvanecimiento termina, asigna la nueva escena
				Stage stage = (Stage) singOutbtn.getScene().getWindow();
				stage.setScene(scene);

				// Crea la transición de aparición para la nueva escena
				FadeTransition fadeIn = new FadeTransition(Duration.millis(500), root);
				fadeIn.setFromValue(0.0);
				fadeIn.setToValue(1.0);
				fadeIn.play();
			}
		});
		fadeOut.play();

	}

	@FXML
	void mostrarTienda(ActionEvent event) throws IOException {

		buttonClickPlayer.play();
		File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/Login.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		Parent root = loader.load();
		Scene scene = new Scene(root);

		// Obtiene la raíz de la escena actual y asigna la transición
		Parent rootCurrent = singOutbtn.getScene().getRoot();
		FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootCurrent);
		fadeOut.setFromValue(1.0);
		fadeOut.setToValue(0.0);
		fadeOut.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				// Cuando la transición de desvanecimiento termina, asigna la nueva escena
				Stage stage = (Stage) singOutbtn.getScene().getWindow();
				stage.setScene(scene);

				// Crea la transición de aparición para la nueva escena
				FadeTransition fadeIn = new FadeTransition(Duration.millis(500), root);
				fadeIn.setFromValue(0.0);
				fadeIn.setToValue(1.0);
				fadeIn.play();
			}
		});
		fadeOut.play();

	}

	@FXML
	void salir(ActionEvent event) {

		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.close();
	}

	@FXML
	void mostrarCaptura(ActionEvent event) throws IOException {

		buttonClickPlayer.play();
		File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/Login.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		Parent root = loader.load();
		Scene scene = new Scene(root);

		Parent rootCurrent = singOutbtn.getScene().getRoot();
		FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootCurrent);
		fadeOut.setFromValue(1.0);
		fadeOut.setToValue(0.0);
		fadeOut.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				Stage stage = (Stage) singOutbtn.getScene().getWindow();
				stage.setScene(scene);
				FadeTransition fadeIn = new FadeTransition(Duration.millis(500), root);
				fadeIn.setFromValue(0.0);
				fadeIn.setToValue(1.0);
				fadeIn.play();
			}
		});
		fadeOut.play();

	}

	@FXML
	void muteSong(ActionEvent event) {
		if (musicPlaying) {
			musicaFondo.pause();
			mutebtn.setGraphic(playIcon);
			musicPlaying = false;
		} else {
			musicaFondo.play();
			mutebtn.setGraphic(pauseIcon);
			musicPlaying = true;
		}
	}
}
