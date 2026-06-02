package Controller;

import Util.DatabaseConnection;
import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.kordamp.ikonli.javafx.FontIcon;

import java.sql.SQLException;

public class SplashScreenController {
    @FXML
    private FontIcon loginArrow;
    @FXML
    private AnchorPane rootPane;

    public void initialize() {

        try {
            DatabaseConnection.inizializzaDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ScaleTransition pulse = new ScaleTransition(Duration.millis(2000), loginArrow);
        pulse.setFromX(0.9);
        pulse.setFromY(0.9);
        pulse.setToX(1.0);
        pulse.setToY(1.0);
        pulse.setAutoReverse(true);
        pulse.setInterpolator(Interpolator.EASE_BOTH);
        pulse.setCycleCount(Animation.INDEFINITE);
        pulse.play();

        loginArrow.setOnMouseClicked(event -> {
            pulse.stop();

            TranslateTransition slideOut = new TranslateTransition(Duration.millis(600), rootPane);
            slideOut.setFromX(0.0);
            slideOut.setToX(-1200);
            slideOut.setInterpolator(Interpolator.EASE_IN);

            FadeTransition fadeOut = new FadeTransition(Duration.millis(600), rootPane);
            fadeOut.setFromValue(1.0);
            fadeOut.setToValue(0.0);

            ParallelTransition outTransition = new ParallelTransition(slideOut, fadeOut);

            outTransition.setOnFinished(e -> {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
                    Parent root = loader.load();

                    root.setTranslateX(1200);
                    root.setOpacity(0.0);

                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root, stage.getWidth(), stage.getHeight());
                    stage.setScene(scene);
                    stage.setMaximized(true);
                    stage.show();

                    TranslateTransition slideIn = new TranslateTransition(Duration.millis(600), root);
                    slideIn.setFromX(1200);
                    slideIn.setToX(0);
                    slideIn.setInterpolator(Interpolator.EASE_OUT);

                    FadeTransition fadeIn = new FadeTransition(Duration.millis(600), root);
                    fadeIn.setFromValue(0.0);
                    fadeIn.setToValue(1.0);

                    ParallelTransition inTransition = new ParallelTransition(slideIn, fadeIn);
                    inTransition.play();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });
            outTransition.play();
        });
    }
}