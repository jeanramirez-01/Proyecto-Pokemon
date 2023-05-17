package gamegui;

import java.io.File;
import controller.ControllerLogin;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		File fxmlFile = new File(System.getProperty("user.dir") + "/src_front/view/Login.fxml");
		Parent root = FXMLLoader.load(fxmlFile.toURI().toURL());
		Scene scene = new Scene(root);
		File file1 = new File("recursos/imagenes/imagenes_login/iconoVentana.png");
		Image icono = new Image(file1.toURI().toString());
		primaryStage.setTitle("Pokemon Cesur");
		primaryStage.getIcons().add(icono);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		ControllerLogin controller = new ControllerLogin();
		controller.setStage(primaryStage);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
