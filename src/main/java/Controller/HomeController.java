package Controller;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.kordamp.ikonli.javafx.FontIcon;

public class HomeController {

    @FXML
    private FontIcon loginIcon;

    public void initialize() {

        loginIcon.setOnMouseEntered(event -> {
            ScaleTransition scaleIn= new ScaleTransition(Duration.millis(150),loginIcon);
            scaleIn.setToX(0.9);
            scaleIn.setToY(0.9);
            scaleIn.play();
        });

        loginIcon.setOnMouseExited(event -> {
            ScaleTransition scaleOut = new ScaleTransition(Duration.millis(150),loginIcon);
            scaleOut.setToX(1.0);
            scaleOut.setToY(1.0);
            scaleOut.play();
        });

        loginIcon.setOnMouseClicked(event -> {

            Node root= loginIcon.getScene().getRoot();
            FadeTransition fadeOut = new FadeTransition(Duration.millis(600),root);
            fadeOut.setFromValue(1.0);
            fadeOut.setToValue(0.0);
            fadeOut.setOnFinished(event1 -> {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/ProfileOption.fxml"));
                    Parent newRoot=loader.load();
                    newRoot.setOpacity(0.0);
                    Stage stage= (Stage) loginIcon.getScene().getWindow();
                    stage.setScene(new Scene(newRoot, stage.getWidth(), stage.getHeight()));
                    stage.setMaximized(true);
                    FadeTransition fadeIn = new FadeTransition(Duration.millis(600),newRoot);
                    fadeIn.setFromValue(0.0);
                    fadeIn.setToValue(1.0);
                    fadeIn.play();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            fadeOut.play();
        });
    }
}
