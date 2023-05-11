package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private Label pokemonNameLabel;

	@FXML
	private Button previousButton;

	@FXML
	private Button nextButton;

	@FXML
	private Button selectButton;

	@FXML
	private Button cancelButton;

	private String[] availablePokemonNames = { "Bulbasaur", "Charmander", "Squirtle" };
	private int currentPokemonIndex = 0;

	private Stage stage;
	private String selectedPokemonName;

	@FXML
	void initialize() {

		try {
			btnBulbasaur.setGraphic(Sprite.mostrarSprite(1));

			btnCharmander.setGraphic(Sprite.mostrarSprite(4));
			
			btnSquirtle.setGraphic(Sprite.mostrarSprite(7));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@FXML
	void handleCancelButton(ActionEvent event) {
		// Cerrar la ventana sin seleccionar ningún Pokemon
		stage.close();
	}

	@FXML
	void handleNextButton(ActionEvent event) {
		// Mostrar el siguiente Pokemon disponible
		currentPokemonIndex = (currentPokemonIndex + 1) % availablePokemonNames.length;
		showCurrentPokemonName();
	}

	@FXML
	void handlePreviousButton(ActionEvent event) {
		// Mostrar el Pokemon anterior disponible
		currentPokemonIndex = (currentPokemonIndex - 1 + availablePokemonNames.length) % availablePokemonNames.length;
		showCurrentPokemonName();
	}

	@FXML
	void handleSelectButton(ActionEvent event) {
		// Seleccionar el Pokemon actual y cerrar la ventana
		selectedPokemonName = availablePokemonNames[currentPokemonIndex];
		stage.close();
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public String getSelectedPokemonName() {
		return selectedPokemonName;
	}

	private void showCurrentPokemonName() {
		pokemonNameLabel.setText(availablePokemonNames[currentPokemonIndex]);
	}

	@FXML
	void sonidoBulbasur(ActionEvent event) {

		Sprite.playAudio(1).play();

	}

	@FXML
	void sonidoCharmander(ActionEvent event) {

		Sprite.playAudio(4).play();

	}

	@FXML
	void sonidoSquirtle(ActionEvent event) {

		Sprite.playAudio(7).play();

	}

}
