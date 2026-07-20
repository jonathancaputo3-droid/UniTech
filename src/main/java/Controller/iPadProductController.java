package Controller;

import Util.NavigationManager;
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
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import Util.AnimazioneUtil;
import Util.Navigation;

import java.util.Objects;

public class iPadProductController {

    // =========================
    // 📦 VARIABILI IPAD
    // =========================
    private String coloreIPad = "Argento";
    private String memoriaIPad = "128GB";
    private double prezzoIPad = 509.0;
    private Image immagineIPad = loadImage("/it/uid/unitech/Images/iPad Argento.png");

    // =========================
    // 📦 VARIABILI IPAD AIR
    // =========================
    private String coloreIPadAir = "Grigio";
    private String memoriaIPadAir = "128GB";
    private double prezzoIPadAir = 829.0;
    private Image immagineIPadAir = loadImage("/it/uid/unitech/Images/iPad Air Grigio.png");

    // =========================
    // 📦 VARIABILI IPAD PRO
    // =========================
    private String coloreIPadPro = "Nero";
    private String memoriaIPadPro = "256GB";
    private double prezzoIPadPro = 1299.0;
    private Image immagineIPadPro = loadImage("/it/uid/unitech/Images/iPad Pro Nero.png");


    // =========================
    // 🛒 AGGIUNTA AL CARRELLO
    // =========================

    @FXML
    private void aggiungiIPad(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "iPad",
                prezzoIPad,
                1,
                immagineIPad,
                "Colore: " + coloreIPad + " | Memoria: " + memoriaIPad
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiIPadAir(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "iPad Air",
                prezzoIPadAir,
                1,
                immagineIPadAir,
                "Colore: " + coloreIPadAir + " | Memoria: " + memoriaIPadAir
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiIPadPro(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "iPad Pro",
                prezzoIPadPro,
                1,
                immagineIPadPro,
                "Colore: " + coloreIPadPro + " | Memoria: " + memoriaIPadPro
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }


    // =========================
    // 🛒 APERTURA CARRELLO
    // =========================

    @FXML
    private void apriCarrello(MouseEvent event) {
        NavigationManager.apriCarrello((Node) event.getSource());
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

        // Navigazione (sezione iPad)
    @FXML private SplitMenuButton iPhoneHomeiPad;
    @FXML private SplitMenuButton iPadHomeiPad;
    @FXML private SplitMenuButton MacHomeiPad;
    @FXML private SplitMenuButton MacBookHomeiPad;
    @FXML private SplitMenuButton WatchHomeiPad;
    @FXML private SplitMenuButton AirPodsHomeiPad;
    @FXML private ImageView logoIconiPad;
    @FXML private FontIcon loginIconiPad;


    @FXML private MenuItem iPhone17ProHomeiPad;
    @FXML private MenuItem iPhone17HomeiPad;
    @FXML private MenuItem iPhoneAirHomeiPad;
    @FXML private MenuItem iPadProHomeiPad;
    @FXML private MenuItem iPadAirHomeiPad;
    @FXML private MenuItem iPadBaseHomeiPad;
    @FXML private MenuItem MacBookProHomeiPad;
    @FXML private MenuItem MacBookAirHomeiPad;
    @FXML private MenuItem MacBookNeoHomeiPad;
    @FXML private MenuItem MacStudioHomeiPad;
    @FXML private MenuItem MacMiniHomeiPad;
    @FXML private MenuItem iMacHomeiPad;
    @FXML private MenuItem WatchUltra3HomeiPad;
    @FXML private MenuItem WatchSeries11HomeiPad;
    @FXML private MenuItem WatchSE3HomeiPad;
    @FXML private MenuItem AirPodsMax2HomeiPad;
    @FXML private MenuItem AirPodsPro3HomeiPad;
    @FXML private MenuItem AirPods4HomeiPad;
    


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

        // Navigazione (sezione iPad Air)
    @FXML private SplitMenuButton iPhoneHomeiPadAir;
    @FXML private SplitMenuButton iPadHomeiPadAir;
    @FXML private SplitMenuButton MacHomeiPadAir;
    @FXML private SplitMenuButton MacBookHomeiPadAir;
    @FXML private SplitMenuButton WatchHomeiPadAir;
    @FXML private SplitMenuButton AirPodsHomeiPadAir;
    @FXML private ImageView logoIconiPadAir;
    @FXML private FontIcon loginIconiPadAir;

    @FXML private MenuItem iPhone17ProHomeiPadAir;
    @FXML private MenuItem iPhone17HomeiPadAir;
    @FXML private MenuItem iPhoneAirHomeiPadAir;
    @FXML private MenuItem iPadProHomeiPadAir;
    @FXML private MenuItem iPadAirHomeiPadAir;
    @FXML private MenuItem iPadBaseHomeiPadAir;
    @FXML private MenuItem MacBookProHomeiPadAir;
    @FXML private MenuItem MacBookAirHomeiPadAir;
    @FXML private MenuItem MacBookNeoHomeiPadAir;
    @FXML private MenuItem MacStudioHomeiPadAir;
    @FXML private MenuItem MacMiniHomeiPadAir;
    @FXML private MenuItem iMacHomeiPadAir;
    @FXML private MenuItem WatchUltra3HomeiPadAir;
    @FXML private MenuItem WatchSeries11HomeiPadAir;
    @FXML private MenuItem WatchSE3HomeiPadAir;
    @FXML private MenuItem AirPodsMax2HomeiPadAir;
    @FXML private MenuItem AirPodsPro3HomeiPadAir;
    @FXML private MenuItem AirPods4HomeiPadAir;


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

        // Navigazione (sezione iPad Pro)
    @FXML private SplitMenuButton iPhoneHomeiPadPro;
    @FXML private SplitMenuButton iPadHomeiPadPro;
    @FXML private SplitMenuButton MacHomeiPadPro;
    @FXML private SplitMenuButton MacBookHomeiPadPro;
    @FXML private SplitMenuButton WatchHomeiPadPro;
    @FXML private SplitMenuButton AirPodsHomeiPadPro;
    @FXML private ImageView logoIconiPadPro;
    @FXML private FontIcon loginIconiPadPro;

    @FXML private MenuItem iPhone17ProHomeiPadPro;
    @FXML private MenuItem iPhone17HomeiPadPro;
    @FXML private MenuItem iPhoneAirHomeiPadPro;
    @FXML private MenuItem iPadProHomeiPadPro;
    @FXML private MenuItem iPadAirHomeiPadPro;
    @FXML private MenuItem iPadBaseHomeiPadPro;
    @FXML private MenuItem MacBookProHomeiPadPro;
    @FXML private MenuItem MacBookAirHomeiPadPro;
    @FXML private MenuItem MacBookNeoHomeiPadPro;
    @FXML private MenuItem MacStudioHomeiPadPro;
    @FXML private MenuItem MacMiniHomeiPadPro;
    @FXML private MenuItem iMacHomeiPadPro;
    @FXML private MenuItem WatchUltra3HomeiPadPro;
    @FXML private MenuItem WatchSeries11HomeiPadPro;
    @FXML private MenuItem WatchSE3HomeiPadPro;
    @FXML private MenuItem AirPodsMax2HomeiPadPro;
    @FXML private MenuItem AirPodsPro3HomeiPadPro;
    @FXML private MenuItem AirPods4HomeiPadPro;



    public void initialize() {
        //Prodotto iPad
        AnimazioneUtil.aggiungiClickColore(circleArgentoiPad, "Argento", "/it/uid/unitech/Images/iPad Argento.png", coloreLabeliPad, immagineProdottoiPad);
        AnimazioneUtil.aggiungiClickColore(circleAzzurroiPad, "Azzurro", "/it/uid/unitech/Images/iPad Azzurro.png", coloreLabeliPad, immagineProdottoiPad);
        AnimazioneUtil.aggiungiClickColore(circleRosaiPad, "Rosa", "/it/uid/unitech/Images/iPad Rosa.png", coloreLabeliPad, immagineProdottoiPad);
        AnimazioneUtil.aggiungiClickColore(circleGialloiPad, "Giallo", "/it/uid/unitech/Images/iPad Giallo.png", coloreLabeliPad, immagineProdottoiPad);
        AnimazioneUtil.aggiungiClickBottone(btn128_iPad, "509€", prezzoLabeliPad);
        AnimazioneUtil.aggiungiClickBottone(btn256_iPad, "639€", prezzoLabeliPad);
        AnimazioneUtil.aggiungiClickBottone(btn512_iPad, "889€", prezzoLabeliPad);

        // Tracciamento stato per il carrello (iPad)
        if (circleArgentoiPad != null) {
            circleArgentoiPad.setOnMouseClicked(e -> {
                coloreIPad = "Argento";
                immagineIPad = loadImage("/it/uid/unitech/Images/iPad Argento.png");
                AnimazioneUtil.selezionaColore(circleArgentoiPad, "Argento", "/it/uid/unitech/Images/iPad Argento.png", coloreLabeliPad, immagineProdottoiPad);
            });

            circleAzzurroiPad.setOnMouseClicked(e -> {
                coloreIPad = "Azzurro";
                immagineIPad = loadImage("/it/uid/unitech/Images/iPad Azzurro.png");
                AnimazioneUtil.selezionaColore(circleAzzurroiPad, "Azzurro", "/it/uid/unitech/Images/iPad Azzurro.png", coloreLabeliPad, immagineProdottoiPad);
            });

            circleRosaiPad.setOnMouseClicked(e -> {
                coloreIPad = "Rosa";
                immagineIPad = loadImage("/it/uid/unitech/Images/iPad Rosa.png");
                AnimazioneUtil.selezionaColore(circleRosaiPad, "Rosa", "/it/uid/unitech/Images/iPad Rosa.png", coloreLabeliPad, immagineProdottoiPad);
            });

            circleGialloiPad.setOnMouseClicked(e -> {
                coloreIPad = "Giallo";
                immagineIPad = loadImage("/it/uid/unitech/Images/iPad Giallo.png");
                AnimazioneUtil.selezionaColore(circleGialloiPad, "Giallo", "/it/uid/unitech/Images/iPad Giallo.png", coloreLabeliPad, immagineProdottoiPad);
            });

            btn128_iPad.setOnAction(e -> {
                memoriaIPad = "128GB";
                prezzoIPad = 509.0;
                prezzoLabeliPad.setText("509€");
            });

            btn256_iPad.setOnAction(e -> {
                memoriaIPad = "256GB";
                prezzoIPad = 639.0;
                prezzoLabeliPad.setText("639€");
            });

            btn512_iPad.setOnAction(e -> {
                memoriaIPad = "512GB";
                prezzoIPad = 889.0;
                prezzoLabeliPad.setText("889€");
            });
        }

        AnimazioneUtil.verificaCambiaScena(iPhoneHomeiPad, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeiPad, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeiPad, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeiPad, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeiPad, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeiPad, "/fxml/AirPods Product.fxml");
        AnimazioneUtil.verificaCambiaScena(logoIconiPad, "/fxml/Home.fxml");
        AnimazioneUtil.verificaCambiaScena(loginIconiPad, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoIconiPad);
        AnimazioneUtil.aggiungiAnimazione(loginIconiPad);

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeiPad, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeiPad, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeiPad, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeiPad, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeiPad, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeiPad, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeiPad, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeiPad, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeiPad, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeiPad, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeiPad, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeiPad, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeiPad, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeiPad, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeiPad, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeiPad, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeiPad, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeiPad, "/fxml/AirPods 4 PageProduct.fxml");

        //Prodotto iPad Air
        AnimazioneUtil.aggiungiClickColore(circleGrigioiPadAir, "Grigio", "/it/uid/unitech/Images/iPad Air Grigio.png", coloreLabeliPadAir, immagineProdottoiPadAir);
        AnimazioneUtil.aggiungiClickColore(circleOroiPadAir, "Oro", "/it/uid/unitech/Images/iPad Air Argento.png", coloreLabeliPadAir, immagineProdottoiPadAir);
        AnimazioneUtil.aggiungiClickColore(circleAzzurroiPadAir, "Azzurro", "/it/uid/unitech/Images/iPad Air Azzurro.png", coloreLabeliPadAir, immagineProdottoiPadAir);
        AnimazioneUtil.aggiungiClickColore(circleViolaiPadAir, "Viola", "/it/uid/unitech/Images/iPad Air Viola.png", coloreLabeliPadAir, immagineProdottoiPadAir);
        AnimazioneUtil.aggiungiClickBottone(btn128_iPadAir, "829€", prezzoLabeliPadAir);
        AnimazioneUtil.aggiungiClickBottone(btn256_iPadAir, "959€", prezzoLabeliPadAir);
        AnimazioneUtil.aggiungiClickBottone(btn512_iPadAir, "1209€", prezzoLabeliPadAir);
        AnimazioneUtil.aggiungiClickBottone(btn1TB_iPadAir, "1589€", prezzoLabeliPadAir);

        // Tracciamento stato per il carrello (iPad Air)
        if (circleGrigioiPadAir != null) {
            circleGrigioiPadAir.setOnMouseClicked(e -> {
                coloreIPadAir = "Grigio";
                AnimazioneUtil.selezionaColore(circleGrigioiPadAir, "Grigio", "/it/uid/unitech/Images/iPad Air Grigio.png", coloreLabeliPadAir, immagineProdottoiPadAir);
            });

            circleOroiPadAir.setOnMouseClicked(e -> {
                coloreIPadAir = "Oro";
                AnimazioneUtil.selezionaColore(circleOroiPadAir, "Oro", "/it/uid/unitech/Images/iPad Air Argento.png", coloreLabeliPadAir, immagineProdottoiPadAir);
            });

            circleAzzurroiPadAir.setOnMouseClicked(e -> {
                coloreIPadAir = "Azzurro";
                AnimazioneUtil.selezionaColore(circleAzzurroiPadAir, "Azzurro", "/it/uid/unitech/Images/iPad Air Azzurro.png", coloreLabeliPadAir, immagineProdottoiPadAir);
            });

            circleViolaiPadAir.setOnMouseClicked(e -> {
                coloreIPadAir = "Viola";
                AnimazioneUtil.selezionaColore(circleViolaiPadAir, "Viola", "/it/uid/unitech/Images/iPad Air Viola.png", coloreLabeliPadAir, immagineProdottoiPadAir);
            });

            btn128_iPadAir.setOnAction(e -> {
                memoriaIPadAir = "128GB";
                prezzoIPadAir = 829.0;
                prezzoLabeliPadAir.setText("829€");
            });

            btn256_iPadAir.setOnAction(e -> {
                memoriaIPadAir = "256GB";
                prezzoIPadAir = 959.0;
                prezzoLabeliPadAir.setText("959€");
            });

            btn512_iPadAir.setOnAction(e -> {
                memoriaIPadAir = "512GB";
                prezzoIPadAir = 1209.0;
                prezzoLabeliPadAir.setText("1209€");
            });

            btn1TB_iPadAir.setOnAction(e -> {
                memoriaIPadAir = "1TB";
                prezzoIPadAir = 1589.0;
                prezzoLabeliPadAir.setText("1589€");
            });
        }

        AnimazioneUtil.verificaCambiaScena(iPhoneHomeiPadAir, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeiPadAir, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeiPadAir, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeiPadAir, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeiPadAir, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeiPadAir, "/fxml/AirPods Product.fxml");
        AnimazioneUtil.verificaCambiaScena(logoIconiPadAir, "/fxml/Home.fxml");
        AnimazioneUtil.verificaCambiaScena(loginIconiPadAir, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoIconiPadAir);
        AnimazioneUtil.aggiungiAnimazione(loginIconiPadAir);

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeiPadAir, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeiPadAir, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeiPadAir, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeiPadAir, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeiPadAir, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeiPadAir, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeiPadAir, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeiPadAir, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeiPadAir, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeiPadAir, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeiPadAir, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeiPadAir, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeiPadAir, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeiPadAir, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeiPadAir, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeiPadAir, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeiPadAir, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeiPadAir, "/fxml/AirPods 4 PageProduct.fxml");

        //Prodotto iPad Pro
        AnimazioneUtil.aggiungiClickColore(circleNeroiPadPro, "Nero", "/it/uid/unitech/Images/iPad Pro Nero.png", coloreLabeliPadPro, immagineProdottoiPadPro);
        AnimazioneUtil.aggiungiClickColore(circleArgentoiPadPro, "Argento", "/it/uid/unitech/Images/iPad Pro Argento.png", coloreLabeliPadPro, immagineProdottoiPadPro);
        AnimazioneUtil.aggiungiClickBottone(btn256_iPadPro, "1299€", prezzoLabeliPadPro);
        AnimazioneUtil.aggiungiClickBottone(btn512_iPadPro, "1569€", prezzoLabeliPadPro);
        AnimazioneUtil.aggiungiClickBottone(btn1TB_iPadPro, "2049€", prezzoLabeliPadPro);
        AnimazioneUtil.aggiungiClickBottone(btn2TB_iPadPro, "2269€", prezzoLabeliPadPro);

        // Tracciamento stato per il carrello (iPad Pro)
        if (circleNeroiPadPro != null) {
            circleNeroiPadPro.setOnMouseClicked(e -> {
                coloreIPadPro = "Nero";
                immagineIPadPro = loadImage("/it/uid/unitech/Images/iPad Pro Nero.png");
                AnimazioneUtil.selezionaColore(circleNeroiPadPro, "Nero", "/it/uid/unitech/Images/iPad Pro Nero.png", coloreLabeliPadPro, immagineProdottoiPadPro);
            });

            circleArgentoiPadPro.setOnMouseClicked(e -> {
                coloreIPadPro = "Argento";
                immagineIPadPro = loadImage("/it/uid/unitech/Images/iPad Pro Argento.png");
                AnimazioneUtil.selezionaColore(circleArgentoiPadPro, "Argento", "/it/uid/unitech/Images/iPad Pro Argento.png", coloreLabeliPadPro, immagineProdottoiPadPro);
            });

            btn256_iPadPro.setOnAction(e -> {
                memoriaIPadPro = "256GB";
                prezzoIPadPro = 1299.0;
                prezzoLabeliPadPro.setText("1299€");
            });

            btn512_iPadPro.setOnAction(e -> {
                memoriaIPadPro = "512GB";
                prezzoIPadPro = 1569.0;
                prezzoLabeliPadPro.setText("1569€");
            });

            btn1TB_iPadPro.setOnAction(e -> {
                memoriaIPadPro = "1TB";
                prezzoIPadPro = 2049.0;
                prezzoLabeliPadPro.setText("2049€");
            });

            btn2TB_iPadPro.setOnAction(e -> {
                memoriaIPadPro = "2TB";
                prezzoIPadPro = 2269.0;
                prezzoLabeliPadPro.setText("2269€");
            });
        }

        AnimazioneUtil.verificaCambiaScena(iPhoneHomeiPadPro, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeiPadPro, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeiPadPro, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeiPadPro, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeiPadPro, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeiPadPro, "/fxml/AirPods Product.fxml");
        AnimazioneUtil.verificaCambiaScena(logoIconiPadPro, "/fxml/Home.fxml");
        AnimazioneUtil.verificaCambiaScena(loginIconiPadPro, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoIconiPadPro);
        AnimazioneUtil.aggiungiAnimazione(loginIconiPadPro);

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeiPadPro, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeiPadPro, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeiPadPro, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeiPadPro, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeiPadPro, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeiPadPro, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeiPadPro, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeiPadPro, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeiPadPro, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeiPadPro, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeiPadPro, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeiPadPro, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeiPadPro, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeiPadPro, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeiPadPro, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeiPadPro, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeiPadPro, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeiPadPro, "/fxml/AirPods 4 PageProduct.fxml");


    }

    private Image loadImage(String resourcePath) {
        return new Image(Objects.requireNonNull(getClass().getResourceAsStream(resourcePath),
                "Resource not found: " + resourcePath));
    }
}