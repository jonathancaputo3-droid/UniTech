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

public class MacProductController {

    // =========================
    // 📦 AGGIUNTA PRODOTTI
    // =========================

    @FXML
    private void aggiungiIPhone17Pro(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "iPhone 17 Pro",
                1339.0,
                new Image(getClass().getResourceAsStream(
                        "/it/uid/unitech/Images/iPhone 17 Pro_ipProduct.png"
                ))
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiIPhoneAir(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "iPhone Air",
                1219.0,
                new Image(getClass().getResourceAsStream(
                        "/it/uid/unitech/Images/iPhone Air_ipProduct.png"
                ))
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiIPhone17(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "iPhone 17",
                939.0,
                new Image(getClass().getResourceAsStream(
                        "/it/uid/unitech/Images/iPhone 17_ipProduct.png"
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

    //DATI iMac
    @FXML
    private ImageView immagineProdottoiM;
    @FXML
    private Label prezzoLabeliM;
    @FXML
    private Label coloreLabeliM;
    @FXML
    private Circle circleArgentoiM;
    @FXML
    private Circle circleRosaiM;
    @FXML
    private Button btn256_iM;
    @FXML
    private Button btn512_iM;
    @FXML
    private Button btn1_iM;
    @FXML
    private FontIcon loginIconiM;
    @FXML
    private ImageView logoIconiM;


    //DATI MacStudio
    @FXML
    private ImageView immagineProdottoMS;
    @FXML
    private Label prezzoLabelMS;
    @FXML
    private Label coloreLabelMS;
    @FXML
    private Circle circleArgentoMS;
    @FXML
    private Button btn512_MS;
    @FXML
    private Button btn1_MS;
    @FXML
    private Button btn2_MS;
    @FXML
    private FontIcon loginIconMS;
    @FXML
    private ImageView logoIconMS;


    //DATI Mac Mini
    @FXML
    private ImageView immagineProdottoMini;
    @FXML
    private Label prezzoLabelMini;
    @FXML
    private Label coloreLabelMini;
    @FXML
    private Circle circleArgentoMini;
    @FXML
    private Button btn256_Mini;
    @FXML
    private Button btn512_Mini;
    @FXML
    private Button btn1_Mini;
    @FXML
    private FontIcon loginIconMini;
    @FXML
    private ImageView logoIconMini;

    public void initialize()
    {
        //Prodotto iMac
        AnimazioneUtil.aggiungiClickColore(circleArgentoiM, "Argento", "/it/uid/unitech/Images/imac_argento.png", coloreLabeliM, immagineProdottoiM);
        AnimazioneUtil.aggiungiClickColore(circleRosaiM, "Rosa", "/it/uid/unitech/Images/imac_rosa.png", coloreLabeliM, immagineProdottoiM);
        AnimazioneUtil.aggiungiClickBottone(btn256_iM, "2.029€", prezzoLabeliM);
        AnimazioneUtil.aggiungiClickBottone(btn512_iM, "2.259€", prezzoLabeliM);
        AnimazioneUtil.aggiungiClickBottone(btn1_iM, "2.719€", prezzoLabeliM);

        //Prodotto Mac Studio
        AnimazioneUtil.aggiungiClickColore(circleArgentoMS, "Argento", "/it/uid/unitech/Images/mac_studio.png", coloreLabelMS, immagineProdottoMS);
        AnimazioneUtil.aggiungiClickBottone(btn512_MS, "3.049€", prezzoLabelMS);
        AnimazioneUtil.aggiungiClickBottone(btn1_MS, "3.279€", prezzoLabelMS);
        AnimazioneUtil.aggiungiClickBottone(btn2_MS, "3.739€", prezzoLabelMS);


        //Prodotto Mac Mini
        AnimazioneUtil.aggiungiClickColore(circleArgentoMini, "Argento", "/it/uid/unitech/Images/mac_mini.png", coloreLabelMini, immagineProdottoMini);
        AnimazioneUtil.aggiungiClickBottone(btn256_Mini, "979€", prezzoLabelMini);
        AnimazioneUtil.aggiungiClickBottone(btn512_Mini, "1.209€", prezzoLabelMini);
        AnimazioneUtil.aggiungiClickBottone(btn1_Mini, "1.669€", prezzoLabelMini);


    }
}