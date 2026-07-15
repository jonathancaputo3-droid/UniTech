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
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
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

        // Navigazione (sezione iMac)
    @FXML private SplitMenuButton iPhoneHomeiMac;
    @FXML private SplitMenuButton iPadHomeiMac;
    @FXML private SplitMenuButton MacHomeiMac;
    @FXML private SplitMenuButton MacBookHomeiMac;
    @FXML private SplitMenuButton WatchHomeiMac;
    @FXML private SplitMenuButton AirPodsHomeiMac;

    @FXML private MenuItem iPhone17ProHomeiMac;
    @FXML private MenuItem iPhone17HomeiMac;
    @FXML private MenuItem iPhoneAirHomeiMac;
    @FXML private MenuItem iPadProHomeiMac;
    @FXML private MenuItem iPadAirHomeiMac;
    @FXML private MenuItem iPadBaseHomeiMac;
    @FXML private MenuItem MacBookProHomeiMac;
    @FXML private MenuItem MacBookAirHomeiMac;
    @FXML private MenuItem MacBookNeoHomeiMac;
    @FXML private MenuItem MacStudioHomeiMac;
    @FXML private MenuItem MacMiniHomeiMac;
    @FXML private MenuItem iMacHomeiMac;
    @FXML private MenuItem WatchUltra3HomeiMac;
    @FXML private MenuItem WatchSeries11HomeiMac;
    @FXML private MenuItem WatchSE3HomeiMac;
    @FXML private MenuItem AirPodsMax2HomeiMac;
    @FXML private MenuItem AirPodsPro3HomeiMac;
    @FXML private MenuItem AirPods4HomeiMac;


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

        // Navigazione (sezione Mac Studio)
    @FXML private SplitMenuButton iPhoneHomeMacStudio;
    @FXML private SplitMenuButton iPadHomeMacStudio;
    @FXML private SplitMenuButton MacHomeMacStudio;
    @FXML private SplitMenuButton MacBookHomeMacStudio;
    @FXML private SplitMenuButton WatchHomeMacStudio;
    @FXML private SplitMenuButton AirPodsHomeMacStudio;

    @FXML private MenuItem iPhone17ProHomeMacStudio;
    @FXML private MenuItem iPhone17HomeMacStudio;
    @FXML private MenuItem iPhoneAirHomeMacStudio;
    @FXML private MenuItem iPadProHomeMacStudio;
    @FXML private MenuItem iPadAirHomeMacStudio;
    @FXML private MenuItem iPadBaseHomeMacStudio;
    @FXML private MenuItem MacBookProHomeMacStudio;
    @FXML private MenuItem MacBookAirHomeMacStudio;
    @FXML private MenuItem MacBookNeoHomeMacStudio;
    @FXML private MenuItem MacStudioHomeMacStudio;
    @FXML private MenuItem MacMiniHomeMacStudio;
    @FXML private MenuItem iMacHomeMacStudio;
    @FXML private MenuItem WatchUltra3HomeMacStudio;
    @FXML private MenuItem WatchSeries11HomeMacStudio;
    @FXML private MenuItem WatchSE3HomeMacStudio;
    @FXML private MenuItem AirPodsMax2HomeMacStudio;
    @FXML private MenuItem AirPodsPro3HomeMacStudio;
    @FXML private MenuItem AirPods4HomeMacStudio;


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

        // Navigazione (sezione Mac Mini)
    @FXML private SplitMenuButton iPhoneHomeMacMini;
    @FXML private SplitMenuButton iPadHomeMacMini;
    @FXML private SplitMenuButton MacHomeMacMini;
    @FXML private SplitMenuButton MacBookHomeMacMini;
    @FXML private SplitMenuButton WatchHomeMacMini;
    @FXML private SplitMenuButton AirPodsHomeMacMini;

    @FXML private MenuItem iPhone17ProHomeMacMini;
    @FXML private MenuItem iPhone17HomeMacMini;
    @FXML private MenuItem iPhoneAirHomeMacMini;
    @FXML private MenuItem iPadProHomeMacMini;
    @FXML private MenuItem iPadAirHomeMacMini;
    @FXML private MenuItem iPadBaseHomeMacMini;
    @FXML private MenuItem MacBookProHomeMacMini;
    @FXML private MenuItem MacBookAirHomeMacMini;
    @FXML private MenuItem MacBookNeoHomeMacMini;
    @FXML private MenuItem MacStudioHomeMacMini;
    @FXML private MenuItem MacMiniHomeMacMini;
    @FXML private MenuItem iMacHomeMacMini;
    @FXML private MenuItem WatchUltra3HomeMacMini;
    @FXML private MenuItem WatchSeries11HomeMacMini;
    @FXML private MenuItem WatchSE3HomeMacMini;
    @FXML private MenuItem AirPodsMax2HomeMacMini;
    @FXML private MenuItem AirPodsPro3HomeMacMini;
    @FXML private MenuItem AirPods4HomeMacMini;

    public void initialize()
    {
        //Prodotto iMac
        AnimazioneUtil.aggiungiClickColore(circleArgentoiM, "Argento", "/it/uid/unitech/Images/imac_argento.png", coloreLabeliM, immagineProdottoiM);
        AnimazioneUtil.aggiungiClickColore(circleRosaiM, "Rosa", "/it/uid/unitech/Images/imac_rosa.png", coloreLabeliM, immagineProdottoiM);
        AnimazioneUtil.aggiungiClickBottone(btn256_iM, "2.029€", prezzoLabeliM);
        AnimazioneUtil.aggiungiClickBottone(btn512_iM, "2.259€", prezzoLabeliM);
        AnimazioneUtil.aggiungiClickBottone(btn1_iM, "2.719€", prezzoLabeliM);

        AnimazioneUtil.verificaCambiaScena(iPhoneHomeiMac, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeiMac, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeiMac, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeiMac, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeiMac, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeiMac, "/fxml/AirPods Product.fxml");

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeiMac, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeiMac, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeiMac, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeiMac, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeiMac, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeiMac, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeiMac, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeiMac, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeiMac, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeiMac, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeiMac, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeiMac, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeiMac, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeiMac, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeiMac, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeiMac, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeiMac, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeiMac, "/fxml/AirPods 4 PageProduct.fxml");

        //Prodotto Mac Studio
        AnimazioneUtil.aggiungiClickColore(circleArgentoMS, "Argento", "/it/uid/unitech/Images/mac_studio.png", coloreLabelMS, immagineProdottoMS);
        AnimazioneUtil.aggiungiClickBottone(btn512_MS, "3.049€", prezzoLabelMS);
        AnimazioneUtil.aggiungiClickBottone(btn1_MS, "3.279€", prezzoLabelMS);
        AnimazioneUtil.aggiungiClickBottone(btn2_MS, "3.739€", prezzoLabelMS);

        AnimazioneUtil.verificaCambiaScena(iPhoneHomeMacStudio, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeMacStudio, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeMacStudio, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeMacStudio, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeMacStudio, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeMacStudio, "/fxml/AirPods Product.fxml");

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeMacStudio, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeMacStudio, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeMacStudio, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeMacStudio, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeMacStudio, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeMacStudio, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeMacStudio, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeMacStudio, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeMacStudio, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeMacStudio, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeMacStudio, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeMacStudio, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeMacStudio, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeMacStudio, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeMacStudio, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeMacStudio, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeMacStudio, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeMacStudio, "/fxml/AirPods 4 PageProduct.fxml");

        //Prodotto Mac Mini
        AnimazioneUtil.aggiungiClickColore(circleArgentoMini, "Argento", "/it/uid/unitech/Images/mac_mini.png", coloreLabelMini, immagineProdottoMini);
        AnimazioneUtil.aggiungiClickBottone(btn256_Mini, "979€", prezzoLabelMini);
        AnimazioneUtil.aggiungiClickBottone(btn512_Mini, "1.209€", prezzoLabelMini);
        AnimazioneUtil.aggiungiClickBottone(btn1_Mini, "1.669€", prezzoLabelMini);

        AnimazioneUtil.verificaCambiaScena(iPhoneHomeMacMini, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeMacMini, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeMacMini, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeMacMini, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeMacMini, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeMacMini, "/fxml/AirPods Product.fxml");

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeMacMini, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeMacMini, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeMacMini, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeMacMini, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeMacMini, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeMacMini, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeMacMini, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeMacMini, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeMacMini, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeMacMini, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeMacMini, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeMacMini, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeMacMini, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeMacMini, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeMacMini, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeMacMini, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeMacMini, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeMacMini, "/fxml/AirPods 4 PageProduct.fxml");
    }
}