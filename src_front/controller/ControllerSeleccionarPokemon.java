package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerSeleccionarPokemon {

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

    private String[] availablePokemonNames = {"Bulbasaur", "Charmander", "Squirtle"};
    private int currentPokemonIndex = 0;

    private Stage stage;
    private String selectedPokemonName;

    @FXML
    void initialize() {
        // Mostrar el primer Pokemon disponible
        showCurrentPokemonName();
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

	
}

