package controller;

import java.io.File;
import java.io.IOException;

import controllercrud.EquipoPokemonCRUD;
import controllercrud.Logger;
import controllercrud.PcPokemonCRUD;
import controllercrud.PokedexCRUD;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;
import mecanicaspokemon.Entrenador;
import mecanicaspokemon.Objeto;
import mecanicaspokemon.Pokemon;

public class ControllerCapturarPokemon {

	@FXML
	private Button btnBolsa;

	@FXML
	private Button btnCambiarPokemonSalvaje;

	@FXML
	private Button btnHuir;

	@FXML
	private ImageView imagePokemonRandom;

	@FXML
	private ImageView spriteBackEntrenador;

	@FXML
	private ImageView imagenHelicoptero;

	@FXML
	private ImageView imagenVidaPokemon;

	@FXML
	private Label labelNombrePokemon;

	@FXML
	private Label labelLevel;

	@FXML
	private Button btnCapturar;

	private static Entrenador jugador;

	private Pokemon pokemonSalvaje;

	private MediaPlayer musicaFondo;

	private MediaPlayer sonidoHuir;

	private Objeto pokeball;

	@FXML
	void init() {

		Singleton singleton = Singleton.getInstanceTrainer(null);
		jugador = singleton.value;

		colocarImagen();

		File file = new File("recursos/audios/sonidoCapturaPokemon.mp3");
		Media sound = new Media(file.toURI().toString());
		musicaFondo = new MediaPlayer(sound);
		musicaFondo.setCycleCount(MediaPlayer.INDEFINITE);
		musicaFondo.setVolume(1);
		musicaFondo.play();

	}

	@FXML
	void mostrarBolsa(ActionEvent event) throws IOException {

		
		File fxmlFile = new File("src_front/view/Bolsa.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		Parent root = loader.load();
		Scene scene = new Scene(root);
		ControllerBolsa bag = loader.getController();
		bag.init();
		Logger.write(jugador.getNombre()+ " ha accedido a la bolsa\n");
		Stage nuevaVentana = new Stage();
		nuevaVentana.setResizable(false);
		nuevaVentana.setScene(scene);
		nuevaVentana.show();

	}

	@FXML
	void buscarPokemonSalvaje(ActionEvent event) throws IOException {

		int random = (int) (Math.random() * 251) + 1;

		pokemonSalvaje = PokedexCRUD.selectSinglePokemonAleatorio(random);
		labelNombrePokemon.setText(pokemonSalvaje.getNombre());
		labelLevel.setText("1");
		imagePokemonRandom.setImage(Sprite.mostrarSpriteImagen(pokemonSalvaje.getIdPokemon()));
		Sprite.playAudio(pokemonSalvaje.getIdPokemon()).play();
		Logger.write("Ha aparecido un " + pokemonSalvaje.getNombre() + " salvaje\n");
	}

	@FXML
	void capturarPokemon(ActionEvent event) {
		Singleton singleton = Singleton.getInstanceObjeto(null);
		pokeball = singleton.valued;
		
		if (pokemonSalvaje == null) {
			Alert alert = new Alert(AlertType.ERROR, "No hay ningun pokemon salvaje");
			alert.showAndWait();
			return;
		}
		if (pokeball == null) {
			Alert alert = new Alert(AlertType.ERROR, "No has elegido ninguna pokeball");
			alert.showAndWait();
			return;
		}

		Logger.write(jugador.getNombre()+ " ha usado una " +pokeball.getNombre()+"\n");
		
		if (jugador.capturar(pokemonSalvaje, pokeball)) {
			int random = (int) (Math.random() * 251) + 1;
			Logger.write("El usuario " +jugador.getNombre()+ " ha capturado a " +pokemonSalvaje.getNombre()+"\n");
			
			if (jugador.getEquipo().getEquipoEntrenador().length < 6) {
				Logger.write(pokemonSalvaje.getNombre()+ " se ha agregado al equipo de " +jugador.getNombre()+"\n");
				EquipoPokemonCRUD.insertPokemonEquipo(pokemonSalvaje.getIdPokemon(), jugador.getNombre());
			} else {
				Logger.write(pokemonSalvaje.getNombre()+ " se ha agregado a la caja de " +jugador.getNombre()+"\n");
				PcPokemonCRUD.insertPokemonCaja(pokemonSalvaje.getIdPokemon(), jugador.getNombre());
			}
			
			pokemonSalvaje = PokedexCRUD.selectSinglePokemonAleatorio(random);
			labelNombrePokemon.setText(pokemonSalvaje.getNombre());
			labelLevel.setText("1");
			imagePokemonRandom.setImage(Sprite.mostrarSpriteImagen(pokemonSalvaje.getIdPokemon()));
			Sprite.playAudio(pokemonSalvaje.getIdPokemon()).play();
			Logger.write("Ha aparecido un " + pokemonSalvaje.getNombre() + " salvaje\n");
		} else {
			Logger.write(pokemonSalvaje.getNombre() + " se ha escapado\n");
			Alert alert = new Alert(AlertType.ERROR, pokemonSalvaje.getNombre() + " se ha escapado");
			alert.showAndWait();
			return;
		}
	}

	@FXML
	void huirCombate(ActionEvent event) throws IOException {

		musicaFondo.stop();

		File file2 = new File("recursos/audios/efectoBotonPresion.mp3");
		Media sound2 = new Media(file2.toURI().toString());
		sonidoHuir = new MediaPlayer(sound2);
		sonidoHuir.setVolume(1);
		sonidoHuir.play();

		File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/Main.fxml");
		FXMLLoader loader = new FXMLLoader(fxmlFile.toURI().toURL());
		Parent root = loader.load();
		Scene scene = new Scene(root);		
		Logger.write(jugador.getNombre()+ " ha huido del combate\n");
		
		ControllerMainMenu menu = loader.getController();
		menu.init();
		
		Parent rootCurrent = btnHuir.getScene().getRoot();
		FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootCurrent);
		fadeOut.setFromValue(1.0);
		fadeOut.setToValue(0.0);
		fadeOut.setOnFinished(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Stage stage = (Stage) btnHuir.getScene().getWindow();
				stage.setScene(scene);
				FadeTransition fadeIn = new FadeTransition(Duration.millis(500), root);
				fadeIn.setFromValue(0.0);
				fadeIn.setToValue(1.0);
				fadeIn.play();
			}
		});
		fadeOut.play();

	}

	public void colocarImagen() {

		File iconfile = null;
		Image image = null;

		switch (jugador.getSexo()) {
		case 'H':
			iconfile = new File("recursos/imagenes/imagenes_captura/ecoTrainer.png");
			image = new Image(iconfile.toURI().toString());
			spriteBackEntrenador.setImage(image);
			break;
		case 'M':
			iconfile = new File("recursos/imagenes/imagenes_captura/lyraTrainer.png");
			image = new Image(iconfile.toURI().toString());
			spriteBackEntrenador.setImage(image);
			break;
		default:
			iconfile = new File("recursos/imagenes/imagenes_register/helicoptero.gif");
			image = new Image(iconfile.toURI().toString());
			imagenHelicoptero.setImage(image);
			break;
		}

	}

}
