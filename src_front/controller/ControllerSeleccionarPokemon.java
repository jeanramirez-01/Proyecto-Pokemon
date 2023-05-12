package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

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

	private Stage stage;
	private int currentPokemonIndex = 0;

	@FXML
	void initialize() {
		btnBulbasaur.setGraphic(Sprite.mostrarSprite(1));

		btnCharmander.setGraphic(Sprite.mostrarSprite(4));

		btnSquirtle.setGraphic(Sprite.mostrarSprite(7));

		btnChikorita.setGraphic(Sprite.mostrarSprite(152));

		btnCindaquil.setGraphic(Sprite.mostrarSprite(155));

		btnTotodile.setGraphic(Sprite.mostrarSprite(158));

		btnPikachu.setGraphic(Sprite.mostrarSprite(25));
	}

	public void setStage(Stage stage) {
		this.stage = stage;
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
	void seleccionarPokemon(ActionEvent event) {
		
		System.out.println(currentPokemonIndex);
		
	}

	private int getSelectIndicePokemonInicial() {
		return currentPokemonIndex;
	}

}
