package Controller;

import Model.Carrello;
import Model.ElementoCarrello;
import Util.AnimazioneUtil;
import Util.NavigationManager;
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

import java.util.Objects;

public class iPhoneProductController {

    // =========================
    // 📦 VARIABILI IPHONE 17
    // =========================
    private String colore17 = "Nero";
    private String memoria17 = "128GB";
    private double prezzo17 = 939.0;
    private Image immagine17 = loadImage("/it/uid/unitech/Images/iPhone 17 Nero.png");

    // =========================
    // 📦 VARIABILI IPHONE 17 PRO
    // =========================
    private String colore17Pro = "Arancione";
    private String memoria17Pro = "256GB";
    private double prezzo17Pro = 1339.0;
    private Image immagine17Pro = loadImage("/it/uid/unitech/Images/iPhone 17 Pro Arancione.png");

    // =========================
    // 📦 VARIABILI IPHONE AIR
    // =========================
    private String coloreAir = "Nero";
    private String memoriaAir = "256GB";
    private double prezzoAir = 1219.0;
    private Image immagineAir = loadImage("/it/uid/unitech/Images/iPhone Air Nero.png");


    // =========================
    // 🛒 AGGIUNTA AL CARRELLO
    // =========================

    @FXML
    private void aggiungiIPhone17(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "iPhone 17",
                prezzo17,
                1,
                immagine17,
                "Colore: " + colore17 + " | Memoria: " + memoria17
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiIPhone17Pro(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "iPhone 17 Pro",
                prezzo17Pro,
                1,
                immagine17Pro,
                "Colore: " + colore17Pro + " | Memoria: " + memoria17Pro
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiIPhoneAir(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "iPhone Air",
                prezzoAir,
                1,
                immagineAir,
                "Colore: " + coloreAir + " | Memoria: " + memoriaAir
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


    // ==========================================
    // 📱 DATI iPhone 17
    // ==========================================
    @FXML
    private ImageView immagineProdotto17;
    @FXML
    private Label prezzoLabel17;
    @FXML
    private Label coloreLabel17;
    @FXML
    private Circle circleNero17;
    @FXML
    private Circle circleBlu17;
    @FXML
    private Circle circleBianco17;
    @FXML
    private Circle circleVerde17;   
    @FXML
    private Circle circleRosa17;
    @FXML
    private Button btn128_17;
    @FXML
    private Button btn256_17;
    @FXML
    private Button btn512_17;
    @FXML
    private FontIcon loginIcon17;
    @FXML
    private ImageView logoIcon17;

    // Navigazione iPhone 17
    @FXML private SplitMenuButton iPhoneHome17;
    @FXML private SplitMenuButton iPadHome17;
    @FXML private SplitMenuButton MacHome17;
    @FXML private SplitMenuButton MacBookHome17;
    @FXML private SplitMenuButton WatchHome17;
    @FXML private SplitMenuButton AirPodsHome17;

    @FXML private MenuItem iPhone17ProHome17;
    @FXML private MenuItem iPhone17Home17;
    @FXML private MenuItem iPhoneAirHome17;
    @FXML private MenuItem iPadProHome17;
    @FXML private MenuItem iPadAirHome17;
    @FXML private MenuItem iPadBaseHome17;
    @FXML private MenuItem MacBookProHome17;
    @FXML private MenuItem MacBookAirHome17;
    @FXML private MenuItem MacBookNeoHome17;
    @FXML private MenuItem MacStudioHome17;
    @FXML private MenuItem MacMiniHome17;
    @FXML private MenuItem iMacHome17;
    @FXML private MenuItem WatchUltra3Home17;
    @FXML private MenuItem WatchSeries11Home17;
    @FXML private MenuItem WatchSE3Home17;
    @FXML private MenuItem AirPodsMax2Home17;
    @FXML private MenuItem AirPodsPro3Home17;
    @FXML private MenuItem AirPods4Home17;


    // ==========================================
    // 📱 DATI iPhone 17 Pro
    // ==========================================
    @FXML
    private ImageView immagineProdotto17Pro;
    @FXML
    private Label prezzoLabel17Pro;
    @FXML
    private Label coloreLabel17Pro;    
    @FXML
    private Circle circleArancione17Pro;
    @FXML
    private Circle circleBianco17Pro;
    @FXML
    private Circle circleBlu17Pro;
    @FXML
    private Button btn256_17Pro;
    @FXML
    private Button btn512_17Pro;
    @FXML
    private Button btn1TB_17Pro;
    @FXML
    private FontIcon loginIcon17Pro;
    @FXML
    private ImageView logoIcon17Pro;   

    // Navigazione iPhone 17 Pro
    @FXML private SplitMenuButton iPhoneHome17Pro;
    @FXML private SplitMenuButton iPadHome17Pro;
    @FXML private SplitMenuButton MacHome17Pro;
    @FXML private SplitMenuButton MacBookHome17Pro;
    @FXML private SplitMenuButton WatchHome17Pro;
    @FXML private SplitMenuButton AirPodsHome17Pro;

    @FXML private MenuItem iPhone17ProHome17Pro;
    @FXML private MenuItem iPhone17Home17Pro;
    @FXML private MenuItem iPhoneAirHome17Pro;
    @FXML private MenuItem iPadProHome17Pro;
    @FXML private MenuItem iPadAirHome17Pro;
    @FXML private MenuItem iPadBaseHome17Pro;
    @FXML private MenuItem MacBookProHome17Pro;
    @FXML private MenuItem MacBookAirHome17Pro;
    @FXML private MenuItem MacBookNeoHome17Pro;
    @FXML private MenuItem MacStudioHome17Pro;
    @FXML private MenuItem MacMiniHome17Pro;
    @FXML private MenuItem iMacHome17Pro;
    @FXML private MenuItem WatchUltra3Home17Pro;
    @FXML private MenuItem WatchSeries11Home17Pro;
    @FXML private MenuItem WatchSE3Home17Pro;
    @FXML private MenuItem AirPodsMax2Home17Pro;
    @FXML private MenuItem AirPodsPro3Home17Pro;
    @FXML private MenuItem AirPods4Home17Pro;


    // ==========================================
    // 📱 DATI iPhone Air
    // ==========================================
    @FXML
    private ImageView immagineProdottoAir;
    @FXML
    private Label prezzoLabelAir;
    @FXML
    private Label coloreLabelAir;    
    @FXML
    private Circle circleNeroAir;
    @FXML
    private Circle circleBiancoAir;
    @FXML
    private Circle circleCelesteAir;
    @FXML
    private Circle circleOroAir;
    @FXML
    private Button btn256Air;
    @FXML
    private Button btn512Air;
    @FXML
    private Button btn1TBAir;
    @FXML
    private FontIcon loginIconAir;
    @FXML
    private ImageView logoIconAir;  

    // Navigazione iPhone Air
    @FXML private SplitMenuButton iPhoneHomeAir;
    @FXML private SplitMenuButton iPadHomeAir;
    @FXML private SplitMenuButton MacHomeAir;
    @FXML private SplitMenuButton MacBookHomeAir;
    @FXML private SplitMenuButton WatchHomeAir;
    @FXML private SplitMenuButton AirPodsHomeAir;

    @FXML private MenuItem iPhone17ProHomeAir;
    @FXML private MenuItem iPhone17HomeAir;
    @FXML private MenuItem iPhoneAirHomeAir;
    @FXML private MenuItem iPadProHomeAir;
    @FXML private MenuItem iPadAirHomeAir;
    @FXML private MenuItem iPadBaseHomeAir;
    @FXML private MenuItem MacBookProHomeAir;
    @FXML private MenuItem MacBookAirHomeAir;
    @FXML private MenuItem MacBookNeoHomeAir;
    @FXML private MenuItem MacStudioHomeAir;
    @FXML private MenuItem MacMiniHomeAir;
    @FXML private MenuItem iMacHomeAir;
    @FXML private MenuItem WatchUltra3HomeAir;
    @FXML private MenuItem WatchSeries11HomeAir;
    @FXML private MenuItem WatchSE3HomeAir;
    @FXML private MenuItem AirPodsMax2HomeAir;
    @FXML private MenuItem AirPodsPro3HomeAir;
    @FXML private MenuItem AirPods4HomeAir;


    public void initialize() {
        // ------------------------------------------
        // Prodotto iPhone 17
        // ------------------------------------------
        AnimazioneUtil.aggiungiClickColore(circleNero17, "Nero", "/it/uid/unitech/Images/iPhone 17 Nero.png", coloreLabel17, immagineProdotto17);
        AnimazioneUtil.aggiungiClickColore(circleBlu17, "Blu", "/it/uid/unitech/Images/iPhone 17 Azzurro.png", coloreLabel17, immagineProdotto17);
        AnimazioneUtil.aggiungiClickColore(circleBianco17, "Bianco", "/it/uid/unitech/Images/iPhone 17 Bianco.png", coloreLabel17, immagineProdotto17);
        AnimazioneUtil.aggiungiClickColore(circleVerde17, "Verde", "/it/uid/unitech/Images/iPhone 17 Verde.png", coloreLabel17, immagineProdotto17);
        AnimazioneUtil.aggiungiClickColore(circleRosa17, "Rosa", "/it/uid/unitech/Images/iPhone 17 Rosa.png", coloreLabel17, immagineProdotto17);
        AnimazioneUtil.aggiungiClickBottone(btn128_17, "939€", prezzoLabel17);
        AnimazioneUtil.aggiungiClickBottone(btn256_17, "1.039€", prezzoLabel17);
        AnimazioneUtil.aggiungiClickBottone(btn512_17, "1.239€", prezzoLabel17);

        // Tracciamento stato per il carrello (iPhone 17)
        if (circleNero17 != null) {
            circleNero17.setOnMouseClicked(e -> {
                colore17 = "Nero";
                immagine17 = loadImage("/it/uid/unitech/Images/iPhone 17 Nero.png");
                AnimazioneUtil.selezionaColore(circleNero17, "Nero", "/it/uid/unitech/Images/iPhone 17 Nero.png", coloreLabel17, immagineProdotto17);
            });

            circleBlu17.setOnMouseClicked(e -> {
                colore17 = "Blu";
                immagine17 = loadImage("/it/uid/unitech/Images/iPhone 17 Azzurro.png");
                AnimazioneUtil.selezionaColore(circleBlu17, "Blu", "/it/uid/unitech/Images/iPhone 17 Azzurro.png", coloreLabel17, immagineProdotto17);
            });

            circleBianco17.setOnMouseClicked(e -> {
                colore17 = "Bianco";
                immagine17 = loadImage("/it/uid/unitech/Images/iPhone 17 Bianco.png");
                AnimazioneUtil.selezionaColore(circleBianco17, "Bianco", "/it/uid/unitech/Images/iPhone 17 Bianco.png", coloreLabel17, immagineProdotto17);
            });

            circleVerde17.setOnMouseClicked(e -> {
                colore17 = "Verde";
                immagine17 = loadImage("/it/uid/unitech/Images/iPhone 17 Verde.png");
                AnimazioneUtil.selezionaColore(circleVerde17, "Verde", "/it/uid/unitech/Images/iPhone 17 Verde.png", coloreLabel17, immagineProdotto17);
            });

            circleRosa17.setOnMouseClicked(e -> {
                colore17 = "Rosa";
                immagine17 = loadImage("/it/uid/unitech/Images/iPhone 17 Rosa.png");
                AnimazioneUtil.selezionaColore(circleRosa17, "Rosa", "/it/uid/unitech/Images/iPhone 17 Rosa.png", coloreLabel17, immagineProdotto17);
            });

            btn128_17.setOnAction(e -> {
                memoria17 = "128GB";
                prezzo17 = 939.0;
                prezzoLabel17.setText("939€");
            });

            btn256_17.setOnAction(e -> {
                memoria17 = "256GB";
                prezzo17 = 1039.0;
                prezzoLabel17.setText("1.039€");
            });

            btn512_17.setOnAction(e -> {
                memoria17 = "512GB";
                prezzo17 = 1239.0;
                prezzoLabel17.setText("1.239€");
            });
        }

        AnimazioneUtil.verificaCambiaScena(iPhoneHome17, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHome17, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHome17, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHome17, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHome17, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHome17, "/fxml/AirPods Product.fxml");

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHome17, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17Home17, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHome17, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHome17, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHome17, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHome17, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHome17, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHome17, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHome17, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHome17, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHome17, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHome17, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3Home17, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11Home17, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3Home17, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2Home17, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3Home17, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4Home17, "/fxml/AirPods 4 PageProduct.fxml");

        AnimazioneUtil.verificaCambiaScena(loginIcon17, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.verificaCambiaScena(logoIcon17, "/fxml/Home.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoIcon17);
        AnimazioneUtil.aggiungiAnimazione(loginIcon17);

        // ------------------------------------------
        // Prodotto iPhone 17 Pro
        // ------------------------------------------
        AnimazioneUtil.aggiungiClickColore(circleArancione17Pro, "Arancione", "/it/uid/unitech/Images/iPhone 17 Pro Arancione.png", coloreLabel17Pro, immagineProdotto17Pro);
        AnimazioneUtil.aggiungiClickColore(circleBianco17Pro, "Bianco", "/it/uid/unitech/Images/iPhone 17 Pro Bianco.png", coloreLabel17Pro, immagineProdotto17Pro);
        AnimazioneUtil.aggiungiClickColore(circleBlu17Pro, "Blu", "/it/uid/unitech/Images/iPhone 17 Pro Blu.png", coloreLabel17Pro, immagineProdotto17Pro);
        AnimazioneUtil.aggiungiClickBottone(btn256_17Pro, "1.339€", prezzoLabel17Pro);
        AnimazioneUtil.aggiungiClickBottone(btn512_17Pro, "1.539€", prezzoLabel17Pro);
        AnimazioneUtil.aggiungiClickBottone(btn1TB_17Pro, "1.839€", prezzoLabel17Pro);

        // Tracciamento stato per il carrello (iPhone 17 Pro)
        if (circleArancione17Pro != null) {
            circleArancione17Pro.setOnMouseClicked(e -> {
                colore17Pro = "Arancione";
                immagine17Pro = loadImage("/it/uid/unitech/Images/iPhone 17 Pro Arancione.png");
                AnimazioneUtil.selezionaColore(circleArancione17Pro, "Arancione", "/it/uid/unitech/Images/iPhone 17 Pro Arancione.png", coloreLabel17Pro, immagineProdotto17Pro);
            });

            circleBianco17Pro.setOnMouseClicked(e -> {
                colore17Pro = "Bianco";
                immagine17Pro = loadImage("/it/uid/unitech/Images/iPhone 17 Pro Bianco.png");
                AnimazioneUtil.selezionaColore(circleBianco17Pro, "Bianco", "/it/uid/unitech/Images/iPhone 17 Pro Bianco.png", coloreLabel17Pro, immagineProdotto17Pro);
            });

            circleBlu17Pro.setOnMouseClicked(e -> {
                colore17Pro = "Blu";
                immagine17Pro = loadImage("/it/uid/unitech/Images/iPhone 17 Pro Blu.png");
                AnimazioneUtil.selezionaColore(circleBlu17Pro, "Blu", "/it/uid/unitech/Images/iPhone 17 Pro Blu.png", coloreLabel17Pro, immagineProdotto17Pro);
            });

            btn256_17Pro.setOnAction(e -> {
                memoria17Pro = "256GB";
                prezzo17Pro = 1339.0;
                prezzoLabel17Pro.setText("1.339€");
            });

            btn512_17Pro.setOnAction(e -> {
                memoria17Pro = "512GB";
                prezzo17Pro = 1539.0;
                prezzoLabel17Pro.setText("1.539€");
            });

            btn1TB_17Pro.setOnAction(e -> {
                memoria17Pro = "1TB";
                prezzo17Pro = 1839.0;
                prezzoLabel17Pro.setText("1.839€");
            });
        }

        AnimazioneUtil.verificaCambiaScena(iPhoneHome17Pro, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHome17Pro, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHome17Pro, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHome17Pro, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHome17Pro, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHome17Pro, "/fxml/AirPods Product.fxml");

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHome17Pro, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17Home17Pro, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHome17Pro, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHome17Pro, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHome17Pro, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHome17Pro, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHome17Pro, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHome17Pro, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHome17Pro, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHome17Pro, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHome17Pro, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHome17Pro, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3Home17Pro, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11Home17Pro, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3Home17Pro, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2Home17Pro, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3Home17Pro, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4Home17Pro, "/fxml/AirPods 4 PageProduct.fxml");

        AnimazioneUtil.verificaCambiaScena(loginIcon17Pro, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.verificaCambiaScena(logoIcon17Pro, "/fxml/Home.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoIcon17Pro);
        AnimazioneUtil.aggiungiAnimazione(loginIcon17Pro);

        // ------------------------------------------
        // Prodotto iPhone Air
        // ------------------------------------------
        AnimazioneUtil.aggiungiClickColore(circleNeroAir, "Nero", "/it/uid/unitech/Images/iPhone Air Nero.png", coloreLabelAir, immagineProdottoAir);
        AnimazioneUtil.aggiungiClickColore(circleBiancoAir, "Bianco", "/it/uid/unitech/Images/iPhone Air Bianco.png", coloreLabelAir, immagineProdottoAir);
        AnimazioneUtil.aggiungiClickColore(circleCelesteAir, "Celeste", "/it/uid/unitech/Images/iPhone Air Celeste.png", coloreLabelAir, immagineProdottoAir);
        AnimazioneUtil.aggiungiClickColore(circleOroAir, "Oro", "/it/uid/unitech/Images/iPhone Air Oro.png", coloreLabelAir, immagineProdottoAir);
        AnimazioneUtil.aggiungiClickBottone(btn256Air, "1.219€", prezzoLabelAir);
        AnimazioneUtil.aggiungiClickBottone(btn512Air, "1.419€", prezzoLabelAir);  
        AnimazioneUtil.aggiungiClickBottone(btn1TBAir, "1.619€", prezzoLabelAir);

        // Tracciamento stato per il carrello (iPhone Air)
        if (circleNeroAir != null) {
            circleNeroAir.setOnMouseClicked(e -> {
                coloreAir = "Nero";
                immagineAir = loadImage("/it/uid/unitech/Images/iPhone Air Nero.png");
                AnimazioneUtil.selezionaColore(circleNeroAir, "Nero", "/it/uid/unitech/Images/iPhone Air Nero.png", coloreLabelAir, immagineProdottoAir);
            });

            circleBiancoAir.setOnMouseClicked(e -> {
                coloreAir = "Bianco";
                immagineAir = loadImage("/it/uid/unitech/Images/iPhone Air Bianco.png");
                AnimazioneUtil.selezionaColore(circleBiancoAir, "Bianco", "/it/uid/unitech/Images/iPhone Air Bianco.png", coloreLabelAir, immagineProdottoAir);
            });

            circleCelesteAir.setOnMouseClicked(e -> {
                coloreAir = "Celeste";
                immagineAir = loadImage("/it/uid/unitech/Images/iPhone Air Celeste.png");
                AnimazioneUtil.selezionaColore(circleCelesteAir, "Celeste", "/it/uid/unitech/Images/iPhone Air Celeste.png", coloreLabelAir, immagineProdottoAir);
            });

            circleOroAir.setOnMouseClicked(e -> {
                coloreAir = "Oro";
                immagineAir = loadImage("/it/uid/unitech/Images/iPhone Air Oro.png");
                AnimazioneUtil.selezionaColore(circleOroAir, "Oro", "/it/uid/unitech/Images/iPhone Air Oro.png", coloreLabelAir, immagineProdottoAir);
            });

            btn256Air.setOnAction(e -> {
                memoriaAir = "256GB";
                prezzoAir = 1219.0;
                prezzoLabelAir.setText("1.219€");
            });

            btn512Air.setOnAction(e -> {
                memoriaAir = "512GB";
                prezzoAir = 1419.0;
                prezzoLabelAir.setText("1.419€");
            });

            btn1TBAir.setOnAction(e -> {
                memoriaAir = "1TB";
                prezzoAir = 1619.0;
                prezzoLabelAir.setText("1.619€");
            });
        }

        AnimazioneUtil.verificaCambiaScena(iPhoneHomeAir, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeAir, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeAir, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeAir, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeAir, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeAir, "/fxml/AirPods Product.fxml");

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeAir, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeAir, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeAir, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeAir, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeAir, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeAir, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeAir, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeAir, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeAir, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeAir, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeAir, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeAir, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeAir, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeAir, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeAir, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeAir, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeAir, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeAir, "/fxml/AirPods 4 PageProduct.fxml");

        AnimazioneUtil.verificaCambiaScena(loginIconAir, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.verificaCambiaScena(logoIconAir, "/fxml/Home.fxml");
        AnimazioneUtil.aggiungiAnimazione(logoIconAir);
        AnimazioneUtil.aggiungiAnimazione(loginIconAir);
    }

    private Image loadImage(String resourcePath) {
        return new Image(Objects.requireNonNull(getClass().getResourceAsStream(resourcePath),
                "Resource not found: " + resourcePath));
    }
}