package Controller;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class HomePageController {

    @FXML
    private ImageView logoView;

    @FXML
    private ImageView loginIcon;

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

    public void initialize() {

        logoView.setOnMouseEntered(e -> {
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
        });

        loginIcon.setOnMouseEntered(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.millis(150), loginIcon);
            scale.setToX(0.9);
            scale.setToY(0.9);
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


    }
}