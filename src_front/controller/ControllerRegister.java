package controller;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class ControllerRegister {

    @FXML
    private TextField passwordCreate;

    @FXML
    private Button registerAllUser;

    @FXML
    private TextField userCreate;

    @FXML
    void registerButton(ActionEvent event) {

    }

	public void init() {
		
		
		File file = new File(
				"T:\\\\ProyectoJAVA\\\\Eclipse\\\\ProyectoPokemon\\\\recursos\\\\audios\\\\registerAudio.mp3");
		Media sound = new Media(file.toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer.setAutoPlay(true);
		mediaPlayer.setVolume(1);
	}

}