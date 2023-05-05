package gamegui;

import java.io.File;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Controller {

	@FXML
	private MediaView mediaIntro;

	private MediaPlayer mediaPlayer;
	private Media media;
	private File file;

	@FXML
	public void initialize() {

		file = new File("T:\\ProyectoJAVA\\Eclipse\\ProyectoPokemon\\recursos\\videointros\\introPokemon.mp4");
		media = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		// Asigna el MediaPlayer al MediaView.
		mediaIntro.setMediaPlayer(mediaPlayer);
		// Comienza a reproducir el video automáticamente al abrir el programa.
		mediaPlayer.setAutoPlay(true);

	}

	@FXML
	public void playMedia() {
		// Detiene la reproducción del primer video.
		mediaPlayer.stop();

		file = new File("T:\\ProyectoJAVA\\Eclipse\\ProyectoPokemon\\recursos\\videointros\\pollaIntro.mp4");
		media = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(media);

		// Asigna el MediaPlayer al MediaView.
		mediaIntro.setMediaPlayer(mediaPlayer);

		// Comienza a reproducir el segundo video.
		mediaPlayer.setAutoPlay(true);
	}

}
