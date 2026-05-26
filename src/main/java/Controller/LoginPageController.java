package Controller;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LoginPageController {

    @FXML
    private Button loginButton;
    @FXML
    private Label signUp;

    public void initialize() {

        loginButton.setOnMouseEntered(event -> {
            ScaleTransition scaleDown = new ScaleTransition(Duration.millis(150),loginButton);
            scaleDown.setToX(0.9);
            scaleDown.setToY(0.9);
            scaleDown.play();
        });

        loginButton.setOnMouseExited(event -> {
            ScaleTransition scaleUp = new ScaleTransition(Duration.millis(150),loginButton);
            scaleUp.setToX(1);
            scaleUp.setToY(1);
            scaleUp.play();
        });

        signUp.setOnMouseEntered(event -> {
            ScaleTransition scaleDown= new ScaleTransition(Duration.millis(150),signUp);
            scaleDown.setToX(0.9);
            scaleDown.setToY(0.9);
            scaleDown.play();
        });
        signUp.setOnMouseExited(event -> {
            ScaleTransition scaleUp = new ScaleTransition(Duration.millis(150),signUp);
            scaleUp.setToX(1);
            scaleUp.setToY(1);
            scaleUp.play();
        });
        signUp.setOnMouseClicked(event -> {
            Node root=signUp.getScene().getRoot();
            FadeTransition fadeOut = new FadeTransition(Duration.millis(600),root);
            fadeOut.setFromValue(1);
            fadeOut.setToValue(0);
            fadeOut.setOnFinished((e) -> {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/SignUp.fxml"));
                    Parent newRoot=loader.load();
                    newRoot.setOpacity(0);
                    Stage stage= (Stage) signUp.getScene().getWindow();
                    stage.setScene(new Scene(newRoot,stage.getWidth(),stage.getHeight()));
                    stage.setMaximized(true);
                    FadeTransition fadeIn = new FadeTransition(Duration.millis(600),newRoot);
                    fadeIn.setFromValue(0);
                    fadeIn.setToValue(1);
                    fadeIn.play();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            });
            fadeOut.play();
        });
    }
}