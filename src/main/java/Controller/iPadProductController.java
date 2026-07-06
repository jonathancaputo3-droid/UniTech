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
import javafx.stage.Stage;
import javafx.util.Duration;
import Util.Navigation;

public class iPadProductController {

    // =========================
    // 📦 AGGIUNTA PRODOTTI
    // =========================

    @FXML
    private void aggiungiIPadPro(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "iPad Pro",
                1299.0,
                new Image(getClass().getResourceAsStream(
                        "/it/uid/unitech/Images/iPad Pro_ipdProcuct.png"
                ))
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiIPadAir(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "iPad Air",
                799.0,
                new Image(getClass().getResourceAsStream(
                        "/it/uid/unitech/Images/iPad Air_ipdProcuct.png"
                ))
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiIPadBase(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "iPad",
                449.0,
                new Image(getClass().getResourceAsStream(
                        "/it/uid/unitech/Images/iPad_ipdProcuct.png"
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

        // 👉 SALVA IL ROOT ATTUALE (iPad page), non la Scene
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

                // 🔑 sostituisci SOLO il root, niente new Scene, niente setMaximized
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