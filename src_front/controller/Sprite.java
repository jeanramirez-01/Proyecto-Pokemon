package controller;

import java.io.File;

import controllercrud.PokemonCRUD;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Sprite {

	public static ImageView mostrarSprite(int id) {

		File iconFileGifB = new File(PokemonCRUD.selectRutaSprite(id));
		Image imgB = new Image(iconFileGifB.toURI().toString());
		ImageView imgViewB = new ImageView(imgB);
		
		return imgViewB;
	}
	
	public static MediaPlayer playAudio(int id) {
		
		File file = new File(PokemonCRUD.selectRutaSonidoPokemon(id));
		Media sound = new Media(file.toURI().toString());
		MediaPlayer mediaPlaye = new MediaPlayer(sound);
		mediaPlaye.setVolume(1);
		return mediaPlaye;
	}
}
