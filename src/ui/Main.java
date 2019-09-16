package ui;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//_________________________________________________________________________________________________________________________________________
/**
* This class is the main
*@author Yimar Tamayo
*@version V0.1_2019
*/
public class Main extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		Parent root =
				FXMLLoader.load(getClass().getResource("MinecraftStorage.fxml"));

		Scene scene = new Scene(root);
		stage.setTitle("Minecraft Storage");
		stage.setScene(scene);
		stage.show();

	}  
}
