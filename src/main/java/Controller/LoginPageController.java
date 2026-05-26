package Controller;

import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    }
}