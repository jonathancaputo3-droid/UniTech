package Controller;

import org.kordamp.ikonli.javafx.FontIcon;

import Model.Carrello;
import Model.ElementoCarrello;
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
import javafx.stage.Stage;
import javafx.util.Duration;
import Util.AnimazioneUtil;
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
                        "/it/uid/unitech/Images/iPad Pro Nero.png"
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
                        "/it/uid/unitech/Images/iPad Air Nero.png"
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
                        "/it/uid/unitech/Images/iPad Argento.png"
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
    //Dati iPad
    @FXML
    private ImageView immagineProdottoiPad;
    @FXML
    private Label prezzoLabeliPad;
    @FXML
    private Label coloreLabeliPad;
    @FXML
    private Circle circleArgentoiPad;
    @FXML
    private Circle circleAzzurroiPad; 
    @FXML
    private Circle circleRosaiPad;
    @FXML
    private Circle circleGialloiPad;
    @FXML
    private Button btn128_iPad;
    @FXML
    private Button btn256_iPad;
    @FXML
    private Button btn512_iPad;

    //Dati iPad Air
    @FXML
    private ImageView immagineProdottoiPadAir;
    @FXML
    private Label prezzoLabeliPadAir;
    @FXML
    private Label coloreLabeliPadAir;
    @FXML
    private Circle circleGrigioiPadAir;
    @FXML
    private Circle circleOroiPadAir; 
    @FXML
    private Circle circleAzzurroiPadAir;
    @FXML
    private Circle circleViolaiPadAir;
    @FXML
    private Button btn128_iPadAir;
    @FXML
    private Button btn256_iPadAir;
    @FXML
    private Button btn512_iPadAir;
    @FXML
    private Button btn1TB_iPadAir;

    //Dati iPad Pro
    @FXML
    private ImageView immagineProdottoiPadPro;
    @FXML
    private Label prezzoLabeliPadPro;
    @FXML
    private Label coloreLabeliPadPro;
    @FXML
    private Circle circleNeroiPadPro;
    @FXML
    private Circle circleArgentoiPadPro;
    @FXML
    private Button btn256_iPadPro;
    @FXML
    private Button btn512_iPadPro;
    @FXML
    private Button btn1TB_iPadPro;
    @FXML
    private Button btn2TB_iPadPro;

    public void initialize() {
        //Prodotto iPad
        AnimazioneUtil.aggiungiClickColore(circleArgentoiPad, "Argento", "/it/uid/unitech/Images/iPad Argento.png", coloreLabeliPad, immagineProdottoiPad);
        AnimazioneUtil.aggiungiClickColore(circleAzzurroiPad, "Azzurro", "/it/uid/unitech/Images/iPad Azzurro.png", coloreLabeliPad, immagineProdottoiPad);
        AnimazioneUtil.aggiungiClickColore(circleRosaiPad, "Rosa", "/it/uid/unitech/Images/iPad Rosa.png", coloreLabeliPad, immagineProdottoiPad);
        AnimazioneUtil.aggiungiClickColore(circleGialloiPad, "Giallo", "/it/uid/unitech/Images/iPad Giallo.png", coloreLabeliPad, immagineProdottoiPad);
        AnimazioneUtil.aggiungiClickBottone(btn128_iPad, "509€", prezzoLabeliPad);
        AnimazioneUtil.aggiungiClickBottone(btn256_iPad, "639€", prezzoLabeliPad);
        AnimazioneUtil.aggiungiClickBottone(btn512_iPad, "889€", prezzoLabeliPad);
        //Prodotto iPad Air
        AnimazioneUtil.aggiungiClickColore(circleGrigioiPadAir, "Grigio", "/it/uid/unitech/Images/iPad Air Grigio.png", coloreLabeliPadAir, immagineProdottoiPadAir);
        AnimazioneUtil.aggiungiClickColore(circleOroiPadAir, "Oro", "/it/uid/unitech/Images/iPad Air Oro.png", coloreLabeliPadAir, immagineProdottoiPadAir);
        AnimazioneUtil.aggiungiClickColore(circleAzzurroiPadAir, "Azzurro", "/it/uid/unitech/Images/iPad Air Azzurro.png", coloreLabeliPadAir, immagineProdottoiPadAir);
        AnimazioneUtil.aggiungiClickColore(circleViolaiPadAir, "Viola", "/it/uid/unitech/Images/iPad Air Viola.png", coloreLabeliPadAir, immagineProdottoiPadAir);
        AnimazioneUtil.aggiungiClickBottone(btn128_iPadAir, "1029€", prezzoLabeliPadAir);
        AnimazioneUtil.aggiungiClickBottone(btn256_iPadAir, "1159€", prezzoLabeliPadAir);
        AnimazioneUtil.aggiungiClickBottone(btn512_iPadAir, "1409€", prezzoLabeliPadAir);
        AnimazioneUtil.aggiungiClickBottone(btn1TB_iPadAir, "1789€", prezzoLabeliPadAir);

        //Prodotto iPad Pro
        AnimazioneUtil.aggiungiClickColore(circleNeroiPadPro, "Nero", "/it/uid/unitech/Images/iPad Pro Nero.png", coloreLabeliPadPro, immagineProdottoiPadPro);
        AnimazioneUtil.aggiungiClickColore(circleArgentoiPadPro, "Argento", "/it/uid/unitech/Images/iPad Pro Argento.png", coloreLabeliPadPro, immagineProdottoiPadPro);
        AnimazioneUtil.aggiungiClickBottone(btn256_iPadPro, "1299€", prezzoLabeliPadPro);
        AnimazioneUtil.aggiungiClickBottone(btn512_iPadPro, "1569€", prezzoLabeliPadPro);
        AnimazioneUtil.aggiungiClickBottone(btn1TB_iPadPro, "2049€", prezzoLabeliPadPro);
        AnimazioneUtil.aggiungiClickBottone(btn2TB_iPadPro, "2269€", prezzoLabeliPadPro);
    }
}

    