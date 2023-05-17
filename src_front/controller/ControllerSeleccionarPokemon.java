package controller;

import java.io.File;
import java.io.IOException;
import controllercrud.EntrenadorCRUD;
import controllercrud.EquipoPokemonCRUD;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControllerSeleccionarPokemon {

	@FXML
	private Button btnBulbasaur;

	@FXML
	private Button btnSquirtle;

	@FXML
	private Button btnCharmander;

	@FXML
	private Button btnSeleccionar;

	@FXML
	private Button btnChikorita;

	@FXML
	private Button btnCindaquil;

	@FXML
	private Button btnPikachu;

	@FXML
	private Button btnTotodile;

	private int currentPokemonIndex = 0;

	private static MediaPlayer buttonClickPlayer;
	
	private String nombreJugador;

	void initialize(String nombre) {
		
		this.nombreJugador = nombre;
		
		btnBulbasaur.setGraphic(Sprite.mostrarSprite(1));

		btnCharmander.setGraphic(Sprite.mostrarSprite(4));

		btnSquirtle.setGraphic(Sprite.mostrarSprite(7));

		btnChikorita.setGraphic(Sprite.mostrarSprite(152));

		btnCindaquil.setGraphic(Sprite.mostrarSprite(155));

		btnTotodile.setGraphic(Sprite.mostrarSprite(158));

		btnPikachu.setGraphic(Sprite.mostrarSprite(25));
	}

	@FXML
	void sonidoBulbasur(ActionEvent event) {

		Sprite.playAudio(1).play();
		currentPokemonIndex = 1;

	}

	@FXML
	void sonidoCharmander(ActionEvent event) {
		currentPokemonIndex = 4;
		Sprite.playAudio(4).play();

	}

	@FXML
	void sonidoSquirtle(ActionEvent event) {

		currentPokemonIndex = 7;
		Sprite.playAudio(7).play();

	}

	@FXML
	void sonidoChikorita(ActionEvent event) {

		currentPokemonIndex = 152;
		Sprite.playAudio(152).play();

	}

	@FXML
	void sonidoCindaquil(ActionEvent event) {

		currentPokemonIndex = 155;
		Sprite.playAudio(155).play();
	}

	@FXML
	void sonidoPikachu(ActionEvent event) {

		currentPokemonIndex = 25;
		Sprite.playAudio(25).play();
	}

	@FXML
	void sonidoTotodile(ActionEvent event) {

		currentPokemonIndex = 158;
		Sprite.playAudio(158).play();
	}

	@FXML
	void seleccionarPokemon(ActionEvent event) throws IOException {
		
		efectoBoton().play();
		if (currentPokemonIndex == 0) {
			Alert alert = new Alert(AlertType.ERROR, "No ha elegido ningun pokemon.");
			alert.showAndWait();
			return;
		} else {
			EquipoPokemonCRUD.insertPokemonInicialEnEquipo(getSelectIndicePokemonInicial(), nombreJugador);

			File fxmlFile = new File("src_front/view/Login.fxml");
			FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
			Parent root = loader.load();
			Scene scene = new Scene(root);
			Parent rootCurrent = btnSeleccionar.getScene().getRoot();
			FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootCurrent);
			fadeOut.setFromValue(1.0);
			fadeOut.setToValue(0.0);
			fadeOut.setOnFinished(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					Stage stage = (Stage) btnSeleccionar.getScene().getWindow();
					stage.setScene(scene);

					FadeTransition fadeIn = new FadeTransition(Duration.millis(500), root);
					fadeIn.setFromValue(0.0);
					fadeIn.setToValue(1.0);
					fadeIn.play();
				}
			});
			fadeOut.play();

		}

	}

	private int getSelectIndicePokemonInicial() {
		return currentPokemonIndex;
	}

	public static MediaPlayer efectoBoton() {

		File buttonClickFile = new File(System.getProperty("user.dir") + "/recursos/audios/efectoBotonPresion.mp3");
		Media buttonClickMedia = new Media(buttonClickFile.toURI().toString());
		buttonClickPlayer = new MediaPlayer(buttonClickMedia);
		buttonClickPlayer.setVolume(1);

		return buttonClickPlayer;

	}

}
