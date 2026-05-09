package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.animation.ScaleTransition;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;


public class HomePageController {

    @FXML
    private ImageView logoView;
    @FXML
    private ImageView loginIcon;
    @FXML
    private BorderPane contentArea;


    public void initialize(){

        logoView.setOnMouseEntered(e -> {
            ScaleTransition scale= new ScaleTransition(Duration.millis(150), logoView);
            scale.setToX(0.9);
            scale.setToY(0.9);
            scale.play();
        });
        logoView.setOnMouseExited(e -> {
            ScaleTransition scale= new ScaleTransition(Duration.millis(150), logoView);
            scale.setToX(1);
            scale.setToY(1);
            scale.play();
        });

        logoView.setOnMouseClicked(e -> {
            try {
                Parent homepage = FXMLLoader.load(getClass().getResource("/fxml/UniTech.fxml"));
                contentArea.setCenter(homepage);
                contentArea.getChildren().clear();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        });

        loginIcon.setOnMouseEntered(e -> {
            ScaleTransition scale= new ScaleTransition(Duration.millis(150), loginIcon);
            scale.setToX(0.9);
            scale.setToY(0.9);
            scale.play();
        });
        loginIcon.setOnMouseExited(e -> {
            ScaleTransition scale= new ScaleTransition(Duration.millis(150), loginIcon);
            scale.setToX(1);
            scale.setToY(1);
            scale.play();
        });
        loginIcon.setOnMouseClicked(e->{
            try {
                Parent loginPage=FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"));
                contentArea.setCenter(loginPage);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        });
    }
}
