package Controller;

import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import org.kordamp.ikonli.javafx.FontIcon;



public class LoginPageController {

    @FXML
    private Button loginButton;

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

    }
}