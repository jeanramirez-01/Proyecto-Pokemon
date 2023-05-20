package controller;

import java.io.File;

import controllercrud.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import mecanicaspokemon.Objeto;
import mecanicaspokemon.Objeto.NombreObjeto;

public class ControllerBolsa {

	@FXML
	private Button btnMasterball;

	@FXML
	private Button btnPokeball;

	@FXML
	private Button btnSalir;

	@FXML
	private Button btnSuperball;

	@FXML
	private Button btnUltraball;

	@FXML
	private Label eleccionPokeball;

	private Objeto choosepoke;

	@FXML
	void init() {

		File poke = new File("recursos/imagenes/imagenes_captura/pokeball.png");
		Image imgB = new Image(poke.toURI().toString());
		ImageView imgViewB = new ImageView(imgB);
		btnPokeball.setGraphic(imgViewB);

		File superS = new File("recursos/imagenes/imagenes_captura/superball.png");
		Image po1 = new Image(superS.toURI().toString());
		ImageView po2 = new ImageView(po1);
		btnSuperball.setGraphic(po2);

		File ultra = new File("recursos/imagenes/imagenes_captura/ultraball.png");
		Image po3 = new Image(ultra.toURI().toString());
		ImageView po4 = new ImageView(po3);
		btnUltraball.setGraphic(po4);

		File master = new File("recursos/imagenes/imagenes_captura/masterball.png");
		Image po5 = new Image(master.toURI().toString());
		ImageView po6 = new ImageView(po5);
		btnMasterball.setGraphic(po6);

	}

	@FXML
	void esMasterball(ActionEvent event) {
		eleccionPokeball.setText("Has elegido la masterball para capturar");
		choosepoke = new Objeto(NombreObjeto.MASTERBALL);
	}

	@FXML
	void esPokeball(ActionEvent event) {
		eleccionPokeball.setText("Has elegido la pokeball para capturar");
		choosepoke = new Objeto(NombreObjeto.POKE_BALL);
	}

	@FXML
	void esSuperball(ActionEvent event) {
		eleccionPokeball.setText("Has elegido la superball para capturar");
		choosepoke = new Objeto(NombreObjeto.SUPERBALL);
	}

	@FXML
	void esUltraBall(ActionEvent event) {
		eleccionPokeball.setText("Has elegido la ultraball para capturar");
		choosepoke = new Objeto(NombreObjeto.ULTRABALL);
	}

	@FXML
	void salir(ActionEvent event) {

		if (choosepoke == null) {
			Alert alert = new Alert(AlertType.ERROR, "No has elegido ninguna pokeball");
			alert.showAndWait();
			return;
		} else {
			Singleton.liberarMemoriaObjeto();
			Singleton.getInstanceObjeto(choosepoke);
			Logger.write("El usuario a escogido " + choosepoke.getNombre() + " y ha cerrado la bolsa\n");
			Stage currentStage = (Stage) btnSalir.getScene().getWindow();
			currentStage.close();
		}

	}

}
