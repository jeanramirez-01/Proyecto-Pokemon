package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import controllercrud.PokemonCRUD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class ControllerSeleccionarPokemon {

	@FXML
    private Button btnBulbasaur;

    @FXML
    private Button btnCharmander;

    @FXML
    private Button btnSeleccionar;

    @FXML
    private Button btnSquirtle;
	
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
        
    	
		File iconFileGifB = new File(PokemonCRUD.selectRutaSprite(1));
    	Image imgB = new Image(iconFileGifB.toURI().toString());
    	ImageView imgViewB = new ImageView(imgB);
    	btnBulbasaur.setGraphic(imgViewB);
    	File iconFileGifS = new File("recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/4.gif");
    	Image imgS = new Image(iconFileGifS.toURI().toString());
    	ImageView imgViewS = new ImageView(imgS);
    	btnSquirtle.setGraphic(imgViewS);
    	File iconFileGifC = new File("recursos/sprites/sprites_pokemon_animaciones/sprites_animaciones/animated/7.gif");
    	Image imgC = new Image(iconFileGifC.toURI().toString());
    	ImageView imgViewC = new ImageView(imgC);
    	btnCharmander.setGraphic(imgViewC);

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
    	
    	File file = new File(System.getProperty("user.dir") + "/recursos/audios/Original_Pokemon_Cries/Gen1/001_bulbasaur.mp3");
		Media sound = new Media(file.toURI().toString());
		MediaPlayer mediaPlaye = new MediaPlayer(sound);
		mediaPlaye.setVolume(1);
		mediaPlaye.play();
    	
    }
    
	
}

