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
    @FXML
    private Label prezzoLabelSE;
    @FXML
    private Label coloreLabelSE;
    @FXML
    private Circle circleNeroSE;
    @FXML
    private Circle circleBluSE;
    @FXML
    private Circle circleGialloSE;
    @FXML
    private Circle circleRosaSE;
    @FXML
    private Button btnGPSSE;
    @FXML
    private Button btnGPSCellularSE;
    @FXML
    private FontIcon loginIconSE;
    @FXML
    private ImageView logoIconSE;
    @FXML
    private ImageView immagineProdottoSE;
    @FXML
    private Label prezzoLabel11;
    @FXML
    private Label coloreLabel11;
    @FXML
    private Circle circleNero11;
    @FXML
    private Circle circleGrigio11;
    @FXML
    private Circle circleOro11;
    @FXML
    private Button btnGPS11;
    @FXML
    private Button btnGPSCellular11;
    @FXML
    private FontIcon loginIcon11;
    @FXML
    private ImageView logoIcon11;
    @FXML
    private ImageView immagineProdotto11;


    public void initialize(){

        AnimazioneUtil.aggiungiClickColore(circleNeroUltra, "Nero", "/it/uid/unitech/Images/Apple Watch Ultra 3 Black.png", coloreLabelUltra, immagineProdottoUltra);
        AnimazioneUtil.aggiungiClickBottone(btnGPSUltra, "759€", prezzoLabelUltra);

        AnimazioneUtil.aggiungiClickColore(circleGrigio11, "Naturale", "/it/uid/unitech/Images/Apple Watch Series 11 Naturale.png", coloreLabel11, immagineProdotto11);
        AnimazioneUtil.aggiungiClickBottone(btnGPS11, "759€", prezzoLabel11);

        AnimazioneUtil.aggiungiClickColore(circleNeroSE, "Nero", "/it/uid/unitech/Images/Apple Watch SE 3 Black.png", coloreLabelSE, immagineProdottoSE);
        AnimazioneUtil.aggiungiClickBottone(btnGPSSE, "279€", prezzoLabelSE);

        AnimazioneUtil.aggiungiClickColore(circleVerdeUltra, "Verde Neon", "/it/uid/unitech/Images/Apple Watch Ultra 3 Green.png", coloreLabelUltra, immagineProdottoUltra);

        AnimazioneUtil.aggiungiClickColore(circleBluUltra, "Blu Navy", "/it/uid/unitech/Images/Apple Watch Ultra 3 Blu.png", coloreLabelUltra, immagineProdottoUltra);

        AnimazioneUtil.aggiungiClickColore(circleRosaSE, "Rosa Fard", "/it/uid/unitech/Images/Apple Watch SE 3 Pink.png", coloreLabelSE, immagineProdottoSE);

        AnimazioneUtil.aggiungiClickColore(circleGialloSE, "Giallo Neon", "/it/uid/unitech/Images/Apple Watch SE 3 Yellow.png", coloreLabelSE, immagineProdottoSE);

        AnimazioneUtil.aggiungiClickColore(circleBluSE, "Blu Salmastro", "/it/uid/unitech/Images/Apple Watch SE 3 Blu.png", coloreLabelSE, immagineProdottoSE);

        AnimazioneUtil.aggiungiClickColore(circleOro11, "Oro", "/it/uid/unitech/Images/Apple Watch Series 11 Oro.png", coloreLabel11, immagineProdotto11);

        AnimazioneUtil.aggiungiClickColore(circleNero11, "Ardesia", "/it/uid/unitech/Images/Apple Watch Series 11 Ardesia.png", coloreLabel11, immagineProdotto11);

        AnimazioneUtil.aggiungiClickBottone(btnGPSCellular11, "859€", prezzoLabel11);

        AnimazioneUtil.aggiungiClickBottone(btnGPSCellularUltra,"859€",prezzoLabelUltra);

        AnimazioneUtil.aggiungiClickBottone(btnGPSCellularSE, "379€", prezzoLabelSE);

        AnimazioneUtil.aggiungiAnimazione(loginIconUltra);

        AnimazioneUtil.aggiungiAnimazione(loginIconSE);

        AnimazioneUtil.aggiungiAnimazione(loginIcon11);

        AnimazioneUtil.verificaCambiaScena(loginIconUltra, "/Fxml/ProfileOption.fxml");

        AnimazioneUtil.verificaCambiaScena(loginIconSE, "/Fxml/ProfileOption.fxml");

        AnimazioneUtil.verificaCambiaScena(loginIcon11, "/Fxml/ProfileOption.fxml");

        AnimazioneUtil.aggiungiAnimazione(logoIconSE);

        AnimazioneUtil.aggiungiAnimazione(logoIconUltra);

        AnimazioneUtil.aggiungiAnimazione(logoIcon11);

        AnimazioneUtil.verificaCambiaScena(logoIconSE, "/Fxml/Home.fxml");

        AnimazioneUtil.verificaCambiaScena(logoIconUltra, "/Fxml/Home.fxml");

        AnimazioneUtil.verificaCambiaScena(logoIcon11, "/Fxml/Home.fxml");
    }
}