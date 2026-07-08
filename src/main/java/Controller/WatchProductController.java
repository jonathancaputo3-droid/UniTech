package Controller;

import Model.Carrello;
import Model.ElementoCarrello;
import Util.AnimazioneUtil;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import Util.Navigation;
import org.kordamp.ikonli.javafx.FontIcon;

import static Util.AnimazioneUtil.*;
import static Util.AnimazioneUtil.aggiungiAnimazione;
import static Util.AnimazioneUtil.verificaCambiaScena;

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
    @FXML
    private Label prezzoLabelUltra;
    @FXML
    private Label coloreLabelUltra;
    @FXML
    private Circle circleNeroUltra;
    @FXML
    private Circle circleBluUltra;
    @FXML
    private Circle circleVerdeUltra;
    @FXML
    private Button btnGPSUltra;
    @FXML
    private Button btnGPSCellularUltra;
    @FXML
    private FontIcon loginIconUltra;
    @FXML
    private ImageView logoIconUltra;
    @FXML
    private ImageView immagineProdottoUltra;


    public void initialize(){

        AnimazioneUtil.aggiungiClickColore(circleNeroUltra, "Nero", "/it/uid/unitech/Images/Apple Watch Ultra 3 Black.png", coloreLabelUltra, immagineProdottoUltra);
        AnimazioneUtil.aggiungiClickBottone(btnGPSUltra, "759€", prezzoLabelUltra);

        AnimazioneUtil.aggiungiClickColore(circleVerdeUltra, "Verde Neon", "/it/uid/unitech/Images/Apple Watch Ultra 3 Green.png", coloreLabelUltra, immagineProdottoUltra);

        AnimazioneUtil.aggiungiClickColore(circleBluUltra, "Blu Navy", "/it/uid/unitech/Images/Apple Watch Ultra 3 Blu.png", coloreLabelUltra, immagineProdottoUltra);

        AnimazioneUtil.aggiungiClickBottone(btnGPSCellularUltra,"859€",prezzoLabelUltra);


        AnimazioneUtil.aggiungiAnimazione(loginIconUltra);

        AnimazioneUtil.verificaCambiaScena(loginIconUltra, "/Fxml/ProfileOption.fxml");

        AnimazioneUtil.aggiungiAnimazione(logoIconUltra);

        AnimazioneUtil.verificaCambiaScena(logoIconUltra, "/Fxml/Home.fxml");

    }
}