package Controller;

import Model.Carrello;
import Model.ElementoCarrello;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;
import Util.Navigation;

public class WatchProductController {

    // =========================
    // 📦 AGGIUNTA PRODOTTI
    // =========================

    @FXML
    private void aggiungiWatchUltra3(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "Apple Watch Ultra 3",
                879.0,
                new Image(getClass().getResourceAsStream(
                        "/it/uid/unitech/Images/WatchUltra3_AWHome.png"
                ))
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiWatchSeries11(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "Apple Watch Series 11",
                449.0,
                new Image(getClass().getResourceAsStream(
                        "/it/uid/unitech/Images/WatchSeries11_AWHome.png"
                ))
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiWatchSE3(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "Apple Watch SE 3",
                279.0,
                new Image(getClass().getResourceAsStream(
                        "/it/uid/unitech/Images/WatchSE3_AWHome.png"
                ))
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }

    // =========================
    // 🛒 APERTURA CARRELLO
    // =========================

    @FXML
    private void apriCarrello(MouseEvent event) {

        Scene scene = ((Node) event.getSource()).getScene();
        Parent root = scene.getRoot();

        Navigation.setPreviousRoot(root);

        FadeTransition fadeOut = new FadeTransition(Duration.millis(600), root);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);

        fadeOut.setOnFinished(e -> {
            try {
                FXMLLoader loader = new FXMLLoader(
                        getClass().getResource("/Fxml/Carrello.fxml")
                );

                Parent newRoot = loader.load();

                newRoot.setOpacity(0.0);
                scene.setRoot(newRoot);

                FadeTransition fadeIn = new FadeTransition(Duration.millis(600), newRoot);
                fadeIn.setFromValue(0.0);
                fadeIn.setToValue(1.0);
                fadeIn.play();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        fadeOut.play();
    }
}