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

public class MacBookController {

    // ==========================================
    // 📦 AGGIUNTA PRODOTTI AL CARRELLO
    // ==========================================

    @FXML
    private void aggiungiIPhone17Pro(MouseEvent event) {
        ElementoCarrello item = new ElementoCarrello(
                "iPhone 17 Pro",
                1339.0,
                new Image(getClass().getResourceAsStream("/it/uid/unitech/Images/iPhone 17 Pro_ipProduct.png"))
        );
        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiIPhoneAir(MouseEvent event) {
        ElementoCarrello item = new ElementoCarrello(
                "iPhone Air",
                1219.0,
                new Image(getClass().getResourceAsStream("/it/uid/unitech/Images/iPhone Air_ipProduct.png"))
        );
        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiIPhone17(MouseEvent event) {
        ElementoCarrello item = new ElementoCarrello(
                "iPhone 17",
                939.0,
                new Image(getClass().getResourceAsStream("/it/uid/unitech/Images/iPhone 17_ipProduct.png"))
        );
        Carrello.getIstanza().aggiungiProdotto(item);
    }

    // ==========================================
    // 🛒 APERTURA CARRELLO
    // ==========================================

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
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Carrello.fxml"));
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

    // ==========================================
    // 💻 DATI MacBook Pro 14
    // ==========================================
    @FXML private ImageView immagineProdotto14;
    @FXML private Label prezzoLabel14;
    @FXML private Label coloreLabel14;
    @FXML private Circle circleNero14;
    @FXML private Circle circleArgento14;
    @FXML private Button btn1_14;
    @FXML private Button btn2_14;

    // Navigazione MacBook Pro 14
    @FXML private ImageView logoiconMacBookPro14;
    @FXML private FontIcon loginIconMacBookPro14;
    @FXML private SplitMenuButton iPhoneHomeMacBookPro14;
    @FXML private SplitMenuButton iPadHomeMacBookPro14;
    @FXML private SplitMenuButton MacHomeMacBookPro14;
    @FXML private SplitMenuButton MacBookHomeMacBookPro14;
    @FXML private SplitMenuButton WatchHomeMacBookPro14;
    @FXML private SplitMenuButton AirPodsHomeMacBookPro14;

    @FXML private MenuItem iPhone17ProHomeMacBookPro14;
    @FXML private MenuItem iPhone17HomeMacBookPro14;
    @FXML private MenuItem iPhoneAirHomeMacBookPro14;
    @FXML private MenuItem iPadProHomeMacBookPro14;
    @FXML private MenuItem iPadAirHomeMacBookPro14;
    @FXML private MenuItem iPadBaseHomeMacBookPro14;
    @FXML private MenuItem MacBookProHomeMacBookPro14;
    @FXML private MenuItem MacBookAirHomeMacBookPro14;
    @FXML private MenuItem MacBookNeoHomeMacBookPro14;
    @FXML private MenuItem MacStudioHomeMacBookPro14;
    @FXML private MenuItem MacMiniHomeMacBookPro14;
    @FXML private MenuItem iMacHomeMacBookPro14;
    @FXML private MenuItem WatchUltra3HomeMacBookPro14;
    @FXML private MenuItem WatchSeries11HomeMacBookPro14;
    @FXML private MenuItem WatchSE3HomeMacBookPro14;
    @FXML private MenuItem AirPodsMax2HomeMacBookPro14;
    @FXML private MenuItem AirPodsPro3HomeMacBookPro14;
    @FXML private MenuItem AirPods4HomeMacBookPro14;

    // ==========================================
    // 💻 DATI MacBook Air 13
    // ==========================================
    @FXML private ImageView immagineProdotto13;
    @FXML private Label prezzoLabel13;
    @FXML private Label coloreLabel13;
    @FXML private Circle circleCeleste13;
    @FXML private Circle circleArgento13;
    @FXML private Circle circleGalassia13;
    @FXML private Circle circleMezzanotte13;
    @FXML private Button btn512_13;
    @FXML private Button btn1_13;

    // Navigazione MacBook Air 13
    @FXML private ImageView logoiconMacBookAir13;
    @FXML private FontIcon loginIconMacBookAir13;
    @FXML private SplitMenuButton iPhoneHomeMacBookAir13;
    @FXML private SplitMenuButton iPadHomeMacBookAir13;
    @FXML private SplitMenuButton MacHomeMacBookAir13;
    @FXML private SplitMenuButton MacBookHomeMacBookAir13;
    @FXML private SplitMenuButton WatchHomeMacBookAir13;
    @FXML private SplitMenuButton AirPodsHomeMacBookAir13;

    @FXML private MenuItem iPhone17ProHomeMacBookAir13;
    @FXML private MenuItem iPhone17HomeMacBookAir13;
    @FXML private MenuItem iPhoneAirHomeMacBookAir13;
    @FXML private MenuItem iPadProHomeMacBookAir13;
    @FXML private MenuItem iPadAirHomeMacBookAir13;
    @FXML private MenuItem iPadBaseHomeMacBookAir13;
    @FXML private MenuItem MacBookProHomeMacBookAir13;
    @FXML private MenuItem MacBookAirHomeMacBookAir13;
    @FXML private MenuItem MacBookNeoHomeMacBookAir13;
    @FXML private MenuItem MacStudioHomeMacBookAir13;
    @FXML private MenuItem MacMiniHomeMacBookAir13;
    @FXML private MenuItem iMacHomeMacBookAir13;
    @FXML private MenuItem WatchUltra3HomeMacBookAir13;
    @FXML private MenuItem WatchSeries11HomeMacBookAir13;
    @FXML private MenuItem WatchSE3HomeMacBookAir13;
    @FXML private MenuItem AirPodsMax2HomeMacBookAir13;
    @FXML private MenuItem AirPodsPro3HomeMacBookAir13;
    @FXML private MenuItem AirPods4HomeMacBookAir13;


    // ==========================================
    // 💻 DATI MacBook Neo
    // ==========================================
    @FXML private ImageView immagineProdottoNeo;
    @FXML private Label prezzoLabelNeo;
    @FXML private Label coloreLabelNeo;
    @FXML private Circle circleArgentoNeo;
    @FXML private Circle circleRosaNeo;
    @FXML private Circle circleGialloNeo;
    @FXML private Circle circleIndacoNeo;
    @FXML private Button btn256_Neo;
    @FXML private Button btn512_Neo;

    // Navigazione MacBook Neo
    @FXML private ImageView logoiconMacBookNeo;
    @FXML private FontIcon loginIconMacBookNeo;
    @FXML private SplitMenuButton iPhoneHomeMacBookNeo;
    @FXML private SplitMenuButton iPadHomeMacBookNeo;
    @FXML private SplitMenuButton MacHomeMacBookNeo;
    @FXML private SplitMenuButton MacBookHomeMacBookNeo;
    @FXML private SplitMenuButton WatchHomeMacBookNeo;
    @FXML private SplitMenuButton AirPodsHomeMacBookNeo;

    @FXML private MenuItem iPhone17ProHomeMacBookNeo;
    @FXML private MenuItem iPhone17HomeMacBookNeo;
    @FXML private MenuItem iPhoneAirHomeMacBookNeo;
    @FXML private MenuItem iPadProHomeMacBookNeo;
    @FXML private MenuItem iPadAirHomeMacBookNeo;
    @FXML private MenuItem iPadBaseHomeMacBookNeo;
    @FXML private MenuItem MacBookProHomeMacBookNeo;
    @FXML private MenuItem MacBookAirHomeMacBookNeo;
    @FXML private MenuItem MacBookNeoHomeMacBookNeo;
    @FXML private MenuItem MacStudioHomeMacBookNeo;
    @FXML private MenuItem MacMiniHomeMacBookNeo;
    @FXML private MenuItem iMacHomeMacBookNeo;
    @FXML private MenuItem WatchUltra3HomeMacBookNeo;
    @FXML private MenuItem WatchSeries11HomeMacBookNeo;
    @FXML private MenuItem WatchSE3HomeMacBookNeo;
    @FXML private MenuItem AirPodsMax2HomeMacBookNeo;
    @FXML private MenuItem AirPodsPro3HomeMacBookNeo;
    @FXML private MenuItem AirPods4HomeMacBookNeo;



    // ==========================================
    // ⚙️ INITIALIZE
    // ==========================================
    public void initialize() {

        // ==========================================
        // 💻 1️⃣ DATI & GRAFICA PRODOTTO: MacBook Pro 14
        // ==========================================
        AnimazioneUtil.aggiungiClickColore(circleNero14, "Nero", "/it/uid/unitech/Images/macbook pro 14 m5 nero.png", coloreLabel14, immagineProdotto14);
        AnimazioneUtil.aggiungiClickColore(circleArgento14, "Argento", "/it/uid/unitech/Images/macbook pro 14 m5 argento.png", coloreLabel14, immagineProdotto14);
        AnimazioneUtil.aggiungiClickBottone(btn1_14, "2.249€", prezzoLabel14);
        AnimazioneUtil.aggiungiClickBottone(btn2_14, "2.739€", prezzoLabel14);

        // 🔄 Navigazione MacBook Pro 14
        AnimazioneUtil.verificaCambiaScena(iPhoneHomeMacBookPro14, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeMacBookPro14, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeMacBookPro14, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeMacBookPro14, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeMacBookPro14, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeMacBookPro14, "/fxml/AirPods Product.fxml");

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeMacBookPro14, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeMacBookPro14, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeMacBookPro14, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeMacBookPro14, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeMacBookPro14, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeMacBookPro14, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeMacBookPro14, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeMacBookPro14, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeMacBookPro14, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeMacBookPro14, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeMacBookPro14, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeMacBookPro14, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeMacBookPro14, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeMacBookPro14, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeMacBookPro14, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeMacBookPro14, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeMacBookPro14, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeMacBookPro14, "/fxml/AirPods 4 PageProduct.fxml");


        AnimazioneUtil.verificaCambiaScena(loginIconMacBookPro14, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.verificaCambiaScena(logoiconMacBookPro14, "/fxml/Home.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoiconMacBookPro14);
        AnimazioneUtil.aggiungiAnimazione(loginIconMacBookPro14);


        // ==========================================
        // 💻 2️⃣ DATI & GRAFICA PRODOTTO: MacBook Air 13
        // ==========================================
        AnimazioneUtil.aggiungiClickColore(circleCeleste13, "Celeste", "/it/uid/unitech/Images/macbook air 13 m5 celeste.png", coloreLabel13, immagineProdotto13);
        AnimazioneUtil.aggiungiClickColore(circleArgento13, "Argento", "/it/uid/unitech/Images/mackbook air 13 m5 argento.png", coloreLabel13, immagineProdotto13);
        AnimazioneUtil.aggiungiClickColore(circleGalassia13, "Galassia", "/it/uid/unitech/Images/macbook air 13 m5 galassia.png", coloreLabel13, immagineProdotto13);
        AnimazioneUtil.aggiungiClickColore(circleMezzanotte13, "Mezzanotte", "/it/uid/unitech/Images/macbook air 13 m5 mezzanotte.png", coloreLabel13, immagineProdotto13);
        AnimazioneUtil.aggiungiClickBottone(btn512_13, "1.449€", prezzoLabel13);
        AnimazioneUtil.aggiungiClickBottone(btn1_13, "1.762€", prezzoLabel13);

        // 🔄 Navigazione MacBook Air 13
        AnimazioneUtil.verificaCambiaScena(iPhoneHomeMacBookAir13, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeMacBookAir13, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeMacBookAir13, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeMacBookAir13, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeMacBookAir13, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeMacBookAir13, "/fxml/AirPods Product.fxml");

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeMacBookAir13, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeMacBookAir13, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeMacBookAir13, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeMacBookAir13, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeMacBookAir13, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeMacBookAir13, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeMacBookAir13, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeMacBookAir13, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeMacBookAir13, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeMacBookAir13, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeMacBookAir13, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeMacBookAir13, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeMacBookAir13, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeMacBookAir13, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeMacBookAir13, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeMacBookAir13, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeMacBookAir13, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeMacBookAir13, "/fxml/AirPods 4 PageProduct.fxml");


        AnimazioneUtil.verificaCambiaScena(loginIconMacBookAir13, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.verificaCambiaScena(logoiconMacBookAir13, "/fxml/Home.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoiconMacBookAir13);
        AnimazioneUtil.aggiungiAnimazione(loginIconMacBookAir13);


        // ==========================================
        // 💻 3️⃣ DATI & GRAFICA PRODOTTO: MacBook Neo
        // ==========================================
        AnimazioneUtil.aggiungiClickColore(circleArgentoNeo, "Argento", "/it/uid/unitech/Images/macbook neo argento.png", coloreLabelNeo, immagineProdottoNeo);
        AnimazioneUtil.aggiungiClickColore(circleRosaNeo, "Rosa", "/it/uid/unitech/Images/macbook neo rosa pastello.png", coloreLabelNeo, immagineProdottoNeo);
        AnimazioneUtil.aggiungiClickColore(circleGialloNeo, "Giallo", "/it/uid/unitech/Images/macbook neo giallo agrume.png", coloreLabelNeo, immagineProdottoNeo);
        AnimazioneUtil.aggiungiClickColore(circleIndacoNeo, "Indaco", "/it/uid/unitech/Images/macbook neo indaco.png", coloreLabelNeo, immagineProdottoNeo);
        AnimazioneUtil.aggiungiClickBottone(btn256_Neo, "799€", prezzoLabelNeo);
        AnimazioneUtil.aggiungiClickBottone(btn512_Neo, "899€", prezzoLabelNeo);

        // 🔄 Navigazione MacBook Neo
        AnimazioneUtil.verificaCambiaScena(iPhoneHomeMacBookNeo, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeMacBookNeo, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeMacBookNeo, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeMacBookNeo, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeMacBookNeo, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeMacBookNeo, "/fxml/AirPods Product.fxml");

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeMacBookNeo, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeMacBookNeo, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeMacBookNeo, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeMacBookNeo, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeMacBookNeo, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeMacBookNeo, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeMacBookNeo, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeMacBookNeo, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeMacBookNeo, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeMacBookNeo, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeMacBookNeo, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeMacBookNeo, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeMacBookNeo, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeMacBookNeo, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeMacBookNeo, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeMacBookNeo, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeMacBookNeo, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeMacBookNeo, "/fxml/AirPods 4 PageProduct.fxml");

        AnimazioneUtil.verificaCambiaScena(loginIconMacBookNeo, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.verificaCambiaScena(logoiconMacBookNeo, "/fxml/Home.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoiconMacBookNeo);
        AnimazioneUtil.aggiungiAnimazione(loginIconMacBookNeo);
    }
}