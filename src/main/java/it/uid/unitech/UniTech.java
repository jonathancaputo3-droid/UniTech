package it.uid.unitech;

import View.HomePage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class UniTech extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/fxml/UniTech.fxml")
        );

        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setTitle("UniTech");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }
}
