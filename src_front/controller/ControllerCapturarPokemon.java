package controller;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import mecanicaspokemon.Entrenador;

public class ControllerCapturarPokemon {

	@FXML
	private Button btnBolsa;

	@FXML
	private Button btnCambiarPokemonSalvaje;

	@FXML
	private Button btnCapturar;

	@FXML
	private Button btnHuir;

	@FXML
	private ImageView imagePokemonRandom;

	@FXML
	private ImageView spriteBackEntrenador;

	private static Entrenador jugador;

	private MediaPlayer musicaFondo;

	@FXML
	void init() {

		Singleton singleton = Singleton.getInstance(null);
		jugador = singleton.value;

		System.out.println(jugador.getNombre());

		File file = new File("recursos/audios/sonidoCapturaPokemon.mp3");
		Media sound = new Media(file.toURI().toString());
		musicaFondo = new MediaPlayer(sound);
		musicaFondo.setCycleCount(MediaPlayer.INDEFINITE);
		musicaFondo.setVolume(1);
		musicaFondo.play();

	}

	@FXML
	void mostrarBolsa(ActionEvent event) {

	}

	@FXML
	void buscarPokemonSalvaje(ActionEvent event) {

	}

	@FXML
	void capturarPokemonSalvaje(ActionEvent event) {

	}

	@FXML
	void huirCombate(ActionEvent event) {

	}

}
