package it.uid.unitech;

import Util.DatabaseConnection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class UniTech extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/Fxml/Home.fxml")
        );
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setTitle("UniTech");
        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/it/uid/unitech/Images/UnitechLogo.png"))));
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
        stage.setOnCloseRequest(event -> System.exit(0));
    }

    @Override
    public void stop() throws Exception{
        DatabaseConnection.chiudi();
        super.stop();
    }
}
