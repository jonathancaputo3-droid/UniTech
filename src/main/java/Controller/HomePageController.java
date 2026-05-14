package Controller;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;

public class HomePageController {

    @FXML
    private ImageView logoView;
    @FXML
    private FontIcon loginIcon;
    @FXML
    private BorderPane contentArea;
    @FXML
    private VBox dropDownMenu;
    @FXML
    private Label creaAccountLabel;
    @FXML
    private Label accediLabel;
    @FXML
    private Label profileLabel;
    @FXML
    private StackPane rootPane;
    @FXML
    private ImageView backgroundImage;
    @FXML
    private FontIcon loginArrow;

    public void initialize() {

        backgroundImage.setSmooth(true);
        backgroundImage.setCache(true);

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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Login.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            try {
                Parent root = loader.load();
                Scene scene = new Scene(root,stage.getWidth(),stage.getHeight());
                stage.setScene(scene);
                stage.setMaximized(true);
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }

        });
        /*logoView.setOnMouseEntered(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.millis(150), logoView);
            scale.setToX(0.9);
            scale.setToY(0.9);
            scale.play();
        });

        logoView.setOnMouseExited(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.millis(150), logoView);
            scale.setToX(1);
            scale.setToY(1);
            scale.play();
        });

        logoView.setOnMouseClicked(e -> {
            try {
                Parent homepage = FXMLLoader.load(
                        getClass().getResource("/fxml/UniTech.fxml")
                );

                contentArea.setCenter(null);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });*/

        /*loginIcon.setOnMouseEntered(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.millis(150), loginIcon);
            scale.setToX(0.9);
            scale.setToY(0.9);
            scale.play();
        });

        loginIcon.setOnMouseExited(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.millis(150), loginIcon);
            scale.setToX(1);
            scale.setToY(1);
            scale.play();
        });

        loginIcon.setOnMouseClicked(e -> {
            if (!dropDownMenu.isVisible()) {
                dropDownMenu.setVisible(true);
                dropDownMenu.setManaged(true);
                dropDownMenu.setTranslateY(-10);
                dropDownMenu.setOpacity(0);

                TranslateTransition tt = new TranslateTransition(Duration.millis(200), dropDownMenu);
                tt.setToY(0);

                FadeTransition ft = new FadeTransition(Duration.millis(200), dropDownMenu);
                ft.setToValue(1);

                ParallelTransition open = new ParallelTransition(tt, ft);
                open.play();

            } else {
                TranslateTransition tt = new TranslateTransition(Duration.millis(150), dropDownMenu);
                tt.setToY(-10);

                FadeTransition ft = new FadeTransition(Duration.millis(150), dropDownMenu);
                ft.setToValue(0);

                ParallelTransition close = new ParallelTransition(tt, ft);
                close.setOnFinished(event -> {
                    dropDownMenu.setVisible(false);
                    dropDownMenu.setManaged(false);
                    dropDownMenu.setTranslateY(0);
                    dropDownMenu.setOpacity(1);
                });

                close.play();
            }
        });

        profileLabel.setOnMouseEntered(event -> {

            ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(150),profileLabel);
            scaleTransition.setToX(0.95);
            scaleTransition.setToY(0.95);
            scaleTransition.play();
        });

        profileLabel.setOnMouseExited(event -> {
            ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(150),profileLabel);
            scaleTransition.setToX(1);
            scaleTransition.setToY(1);
            scaleTransition.play();
        });

        creaAccountLabel.setOnMouseEntered(event -> {
            ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(150),creaAccountLabel);
            scaleTransition.setToX(0.95);
            scaleTransition.setToY(0.95);
            scaleTransition.play();
        });

        creaAccountLabel.setOnMouseExited(event -> {
            ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(150),creaAccountLabel);
            scaleTransition.setToX(1);
            scaleTransition.setToY(1);
            scaleTransition.play();
        });

        accediLabel.setOnMouseEntered(event -> {
            ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(150),accediLabel);
            scaleTransition.setToX(0.95);
            scaleTransition.setToY(0.95);
            scaleTransition.play();
        });

        accediLabel.setOnMouseExited(event -> {
            ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(150),accediLabel);
            scaleTransition.setToX(1);
            scaleTransition.setToY(1);
            scaleTransition.play();
        });

        accediLabel.setOnMouseClicked(event -> {
            try {

                Stage stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"));
                Scene scene= stage.getScene();

                FadeTransition fadeOut=new FadeTransition(Duration.millis(200), scene.getRoot());
                fadeOut.setFromValue(1);
                fadeOut.setToValue(0);
                fadeOut.setOnFinished(e->{
                    scene.setRoot(root);
                    FadeTransition fadeIn=new FadeTransition(Duration.millis(200), root);
                    fadeIn.setFromValue(0);
                    fadeIn.setToValue(1);
                    fadeIn.play();
                });
                fadeOut.play();

            }catch (Exception ex) {
                ex.printStackTrace();
            }
        });*/

    }
}