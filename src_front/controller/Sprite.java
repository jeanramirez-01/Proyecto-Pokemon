package controller;

import java.io.File;

import controllercrud.PokemonCRUD;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Sprite {

	public static ImageView mostrarSprite(int num_pokedex) {

		File iconFileGifB = new File(PokemonCRUD.selectRutaSprite(num_pokedex));
		Image imgB = new Image(iconFileGifB.toURI().toString());
		ImageView imgViewB = new ImageView(imgB);

		return imgViewB;
	}

	public static Image mostrarSpriteImagen(int numPokedex) {

		File iconFileGifB = new File(PokemonCRUD.selectRutaSprite(numPokedex));
		Image imgB = new Image(iconFileGifB.toURI().toString());

		return imgB;
	}

	public static MediaPlayer playAudio(int num_pokedex) {

		File file = new File(PokemonCRUD.selectRutaSonidoPokemon(num_pokedex));
		Media sound = new Media(file.toURI().toString());
		MediaPlayer mediaPlaye = new MediaPlayer(sound);
		mediaPlaye.setVolume(1);
		return mediaPlaye;
	}

}