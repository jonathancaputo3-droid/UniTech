package Controller;

import javafx.animation.FadeTransition;
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
    private Label profiloLabel;
    @FXML
    private Label creaAccountLabel;
    @FXML
    private Label accediLabel;

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
                tt.play();

                FadeTransition ft = new FadeTransition(Duration.millis(200), dropDownMenu);
                ft.setToValue(1);
                ft.play();

            } else {
                TranslateTransition tt = new TranslateTransition(Duration.millis(150), dropDownMenu);
                tt.setToY(-10);

                FadeTransition ft = new FadeTransition(Duration.millis(150), dropDownMenu);
                ft.setToValue(0);

                tt.setOnFinished(event -> {
                    dropDownMenu.setVisible(false);
                    dropDownMenu.setManaged(false);
                    dropDownMenu.setTranslateY(0);
                    dropDownMenu.setOpacity(1);
                });

                tt.play();
                ft.play();
            }
        });
    }
}