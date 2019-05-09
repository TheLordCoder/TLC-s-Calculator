package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage window) throws IOException {
		window.setTitle("TLC's Calculator");
		window.setScene(createMainScene(loadMainPane()));
		window.setResizable(false);
		window.show();
	}

	private Scene createMainScene(Pane mainPane) {
		Scene scene = new Scene(mainPane);
		scene.getStylesheets().setAll(getClass().getResource("DarkTheme.css").toExternalForm());
		return scene;
	}

	private Pane loadMainPane() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		return loader.load(getClass().getResourceAsStream("MainWindow.fxml"));
	}

	public static void main(String[] args) {
		launch(args);
	}
}
