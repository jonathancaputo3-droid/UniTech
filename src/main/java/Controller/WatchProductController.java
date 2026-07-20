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


public class WatchProductController {

    // =========================
    // 📦 VARIABILI Apple Watch Ultra 3
    // =========================
    private String coloreUltra3 = "Nero";
    private String connettivitaUltra3 = "GPS";
    private double prezzoUltra3 = 759.0;
    private Image immagineUltra3 = loadImage("/it/uid/unitech/Images/Apple Watch Ultra 3 Black.png");

    // =========================
    // 📦 VARIABILI Apple Watch SE 3
    // =========================
    private String coloreSE3 = "Nero";
    private String connettivitaSE3 = "GPS";
    private double prezzoSE3 = 279.0;
    private Image immagineSE3 = loadImage("/it/uid/unitech/Images/Apple Watch SE 3 Black.png");

    // =========================
    // 📦 VARIABILI Apple Watch Series 11
    // =========================
    private String coloreSeries11 = "Naturale";
    private String connettivitaSeries11 = "GPS";
    private double prezzoSeries11 = 759.0;
    private Image immagineSeries11 = loadImage("/it/uid/unitech/Images/Apple Watch Series 11 Naturale.png");


    // =========================
    // 🛒 AGGIUNTA AL CARRELLO
    // =========================
    @FXML
    private void aggiungiWatchUltra3(MouseEvent event) {
        ElementoCarrello item = new ElementoCarrello(
                "Apple Watch Ultra 3",
                prezzoUltra3,
                1,
                immagineUltra3,
                "Colore: " + coloreUltra3 + " | Connettività: " + connettivitaUltra3
        );
        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiWatchSE3(MouseEvent event) {
        ElementoCarrello item = new ElementoCarrello(
                "Apple Watch SE 3",
                prezzoSE3,
                1,
                immagineSE3,
                "Colore: " + coloreSE3 + " | Connettività: " + connettivitaSE3
        );
        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiWatchSeries11(MouseEvent event) {
        ElementoCarrello item = new ElementoCarrello(
                "Apple Watch Series 11",
                prezzoSeries11,
                1,
                immagineSeries11,
                "Colore: " + coloreSeries11 + " | Connettività: " + connettivitaSeries11
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

        // Navigazione (sezione Apple Watch Ultra 3)
    @FXML private SplitMenuButton iPhoneHomeWatchUltra3;
    @FXML private SplitMenuButton iPadHomeWatchUltra3;
    @FXML private SplitMenuButton MacHomeWatchUltra3;
    @FXML private SplitMenuButton MacBookHomeWatchUltra3;
    @FXML private SplitMenuButton WatchHomeWatchUltra3;
    @FXML private SplitMenuButton AirPodsHomeWatchUltra3;

    @FXML private MenuItem iPhone17ProHomeWatchUltra3;
    @FXML private MenuItem iPhone17HomeWatchUltra3;
    @FXML private MenuItem iPhoneAirHomeWatchUltra3;
    @FXML private MenuItem iPadProHomeWatchUltra3;
    @FXML private MenuItem iPadAirHomeWatchUltra3;
    @FXML private MenuItem iPadBaseHomeWatchUltra3;
    @FXML private MenuItem MacBookProHomeWatchUltra3;
    @FXML private MenuItem MacBookAirHomeWatchUltra3;
    @FXML private MenuItem MacBookNeoHomeWatchUltra3;
    @FXML private MenuItem MacStudioHomeWatchUltra3;
    @FXML private MenuItem MacMiniHomeWatchUltra3;
    @FXML private MenuItem iMacHomeWatchUltra3;
    @FXML private MenuItem WatchUltra3HomeWatchUltra3;
    @FXML private MenuItem WatchSeries11HomeWatchUltra3;
    @FXML private MenuItem WatchSE3HomeWatchUltra3;
    @FXML private MenuItem AirPodsMax2HomeWatchUltra3;
    @FXML private MenuItem AirPodsPro3HomeWatchUltra3;
    @FXML private MenuItem AirPods4HomeWatchUltra3;


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
    private FontIcon loginIconSE3;
    @FXML
    private ImageView logoIconSE3;
    @FXML
    private ImageView immagineProdottoSE;

        // Navigazione (sezione Apple Watch SE 3)
    @FXML private SplitMenuButton iPhoneHomeWatchSE3;
    @FXML private SplitMenuButton iPadHomeWatchSE3;
    @FXML private SplitMenuButton MacHomeWatchSE3;
    @FXML private SplitMenuButton MacBookHomeWatchSE3;
    @FXML private SplitMenuButton WatchHomeWatchSE3;
    @FXML private SplitMenuButton AirPodsHomeWatchSE3;

    @FXML private MenuItem iPhone17ProHomeWatchSE3;
    @FXML private MenuItem iPhone17HomeWatchSE3;
    @FXML private MenuItem iPhoneAirHomeWatchSE3;
    @FXML private MenuItem iPadProHomeWatchSE3;
    @FXML private MenuItem iPadAirHomeWatchSE3;
    @FXML private MenuItem iPadBaseHomeWatchSE3;
    @FXML private MenuItem MacBookProHomeWatchSE3;
    @FXML private MenuItem MacBookAirHomeWatchSE3;
    @FXML private MenuItem MacBookNeoHomeWatchSE3;
    @FXML private MenuItem MacStudioHomeWatchSE3;
    @FXML private MenuItem MacMiniHomeWatchSE3;
    @FXML private MenuItem iMacHomeWatchSE3;
    @FXML private MenuItem WatchUltra3HomeWatchSE3;
    @FXML private MenuItem WatchSeries11HomeWatchSE3;
    @FXML private MenuItem WatchSE3HomeWatchSE3;
    @FXML private MenuItem AirPodsMax2HomeWatchSE3;
    @FXML private MenuItem AirPodsPro3HomeWatchSE3;
    @FXML private MenuItem AirPods4HomeWatchSE3;


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

        // Navigazione (sezione Apple Watch Series 11)
    @FXML private SplitMenuButton iPhoneHomeWatchSeries11;
    @FXML private SplitMenuButton iPadHomeWatchSeries11;
    @FXML private SplitMenuButton MacHomeWatchSeries11;
    @FXML private SplitMenuButton MacBookHomeWatchSeries11;
    @FXML private SplitMenuButton WatchHomeWatchSeries11;
    @FXML private SplitMenuButton AirPodsHomeWatchSeries11;

    @FXML private MenuItem iPhone17ProHomeWatchSeries11;
    @FXML private MenuItem iPhone17HomeWatchSeries11;
    @FXML private MenuItem iPhoneAirHomeWatchSeries11;
    @FXML private MenuItem iPadProHomeWatchSeries11;
    @FXML private MenuItem iPadAirHomeWatchSeries11;
    @FXML private MenuItem iPadBaseHomeWatchSeries11;
    @FXML private MenuItem MacBookProHomeWatchSeries11;
    @FXML private MenuItem MacBookAirHomeWatchSeries11;
    @FXML private MenuItem MacBookNeoHomeWatchSeries11;
    @FXML private MenuItem MacStudioHomeWatchSeries11;
    @FXML private MenuItem MacMiniHomeWatchSeries11;
    @FXML private MenuItem iMacHomeWatchSeries11;
    @FXML private MenuItem WatchUltra3HomeWatchSeries11;
    @FXML private MenuItem WatchSeries11HomeWatchSeries11;
    @FXML private MenuItem WatchSE3HomeWatchSeries11;
    @FXML private MenuItem AirPodsMax2HomeWatchSeries11;
    @FXML private MenuItem AirPodsPro3HomeWatchSeries11;
    @FXML private MenuItem AirPods4HomeWatchSeries11;


    public void initialize(){

        // ==========================================
        // ⌚ Apple Watch Ultra 3
        // ==========================================
        if (immagineProdottoUltra != null) {
            if (circleNeroUltra != null) AnimazioneUtil.aggiungiClickColore(circleNeroUltra, "Nero", "/it/uid/unitech/Images/Apple Watch Ultra 3 Black.png", coloreLabelUltra, immagineProdottoUltra);
            if (btnGPSUltra != null) AnimazioneUtil.aggiungiClickBottone(btnGPSUltra, "759€", prezzoLabelUltra);
            if (circleVerdeUltra != null) AnimazioneUtil.aggiungiClickColore(circleVerdeUltra, "Verde Neon", "/it/uid/unitech/Images/Apple Watch Ultra 3 Green.png", coloreLabelUltra, immagineProdottoUltra);
            if (circleBluUltra != null) AnimazioneUtil.aggiungiClickColore(circleBluUltra, "Blu Navy", "/it/uid/unitech/Images/Apple Watch Ultra 3 Blu.png", coloreLabelUltra, immagineProdottoUltra);
            if (btnGPSCellularUltra != null) AnimazioneUtil.aggiungiClickBottone(btnGPSCellularUltra,"859€",prezzoLabelUltra);

            if (circleNeroUltra != null) {
                circleNeroUltra.setOnMouseClicked(e -> {
                    coloreUltra3 = "Nero";
                    immagineUltra3 = loadImage("/it/uid/unitech/Images/Apple Watch Ultra 3 Black.png");
                    AnimazioneUtil.selezionaColore(circleNeroUltra, "Nero", "/it/uid/unitech/Images/Apple Watch Ultra 3 Black.png", coloreLabelUltra, immagineProdottoUltra);
                });
            }

            if (circleVerdeUltra != null) {
                circleVerdeUltra.setOnMouseClicked(e -> {
                    coloreUltra3 = "Verde Neon";
                    immagineUltra3 = loadImage("/it/uid/unitech/Images/Apple Watch Ultra 3 Green.png");
                    AnimazioneUtil.selezionaColore(circleVerdeUltra, "Verde Neon", "/it/uid/unitech/Images/Apple Watch Ultra 3 Green.png", coloreLabelUltra, immagineProdottoUltra);
                });
            }

            if (circleBluUltra != null) {
                circleBluUltra.setOnMouseClicked(e -> {
                    coloreUltra3 = "Blu Navy";
                    immagineUltra3 = loadImage("/it/uid/unitech/Images/Apple Watch Ultra 3 Blu.png");
                    AnimazioneUtil.selezionaColore(circleBluUltra, "Blu Navy", "/it/uid/unitech/Images/Apple Watch Ultra 3 Blu.png", coloreLabelUltra, immagineProdottoUltra);
                });
            }

            if (btnGPSUltra != null) {
                btnGPSUltra.setOnAction(e -> {
                    connettivitaUltra3 = "GPS";
                    prezzoUltra3 = 759.0;
                    prezzoLabelUltra.setText("759€");
                });
            }

            if (btnGPSCellularUltra != null) {
                btnGPSCellularUltra.setOnAction(e -> {
                    connettivitaUltra3 = "GPS+Cellular";
                    prezzoUltra3 = 859.0;
                    prezzoLabelUltra.setText("859€");
                });
            }
        }


        // ==========================================
        // ⌚ Apple Watch SE 3
        // ==========================================
        if (immagineProdottoSE != null) {
            if (circleNeroSE != null) AnimazioneUtil.aggiungiClickColore(circleNeroSE, "Nero", "/it/uid/unitech/Images/Apple Watch SE 3 Black.png", coloreLabelSE, immagineProdottoSE);
            if (btnGPSSE != null) AnimazioneUtil.aggiungiClickBottone(btnGPSSE, "279€", prezzoLabelSE);
            if (circleRosaSE != null) AnimazioneUtil.aggiungiClickColore(circleRosaSE, "Rosa Fard", "/it/uid/unitech/Images/Apple Watch SE 3 Pink.png", coloreLabelSE, immagineProdottoSE);
            if (circleGialloSE != null) AnimazioneUtil.aggiungiClickColore(circleGialloSE, "Giallo Neon", "/it/uid/unitech/Images/Apple Watch SE 3 Yellow.png", coloreLabelSE, immagineProdottoSE);
            if (circleBluSE != null) AnimazioneUtil.aggiungiClickColore(circleBluSE, "Blu Salmastro", "/it/uid/unitech/Images/Apple Watch SE 3 Blu.png", coloreLabelSE, immagineProdottoSE);
            if (btnGPSCellularSE != null) AnimazioneUtil.aggiungiClickBottone(btnGPSCellularSE, "379€", prezzoLabelSE);

            if (circleNeroSE != null) {
                circleNeroSE.setOnMouseClicked(e -> {
                    coloreSE3 = "Nero";
                    immagineSE3 = loadImage("/it/uid/unitech/Images/Apple Watch SE 3 Black.png");
                    AnimazioneUtil.selezionaColore(circleNeroSE, "Nero", "/it/uid/unitech/Images/Apple Watch SE 3 Black.png", coloreLabelSE, immagineProdottoSE);
                });
            }

            if (circleRosaSE != null) {
                circleRosaSE.setOnMouseClicked(e -> {
                    coloreSE3 = "Rosa Fard";
                    immagineSE3 = loadImage("/it/uid/unitech/Images/Apple Watch SE 3 Pink.png");
                    AnimazioneUtil.selezionaColore(circleRosaSE, "Rosa Fard", "/it/uid/unitech/Images/Apple Watch SE 3 Pink.png", coloreLabelSE, immagineProdottoSE);
                });
            }

            if (circleGialloSE != null) {
                circleGialloSE.setOnMouseClicked(e -> {
                    coloreSE3 = "Giallo Neon";
                    immagineSE3 = loadImage("/it/uid/unitech/Images/Apple Watch SE 3 Yellow.png");
                    AnimazioneUtil.selezionaColore(circleGialloSE, "Giallo Neon", "/it/uid/unitech/Images/Apple Watch SE 3 Yellow.png", coloreLabelSE, immagineProdottoSE);
                });
            }

            if (circleBluSE != null) {
                circleBluSE.setOnMouseClicked(e -> {
                    coloreSE3 = "Blu Salmastro";
                    immagineSE3 = loadImage("/it/uid/unitech/Images/Apple Watch SE 3 Blu.png");
                    AnimazioneUtil.selezionaColore(circleBluSE, "Blu Salmastro", "/it/uid/unitech/Images/Apple Watch SE 3 Blu.png", coloreLabelSE, immagineProdottoSE);
                });
            }

            if (btnGPSSE != null) {
                btnGPSSE.setOnAction(e -> {
                    connettivitaSE3 = "GPS";
                    prezzoSE3 = 279.0;
                    prezzoLabelSE.setText("279€");
                });
            }

            if (btnGPSCellularSE != null) {
                btnGPSCellularSE.setOnAction(e -> {
                    connettivitaSE3 = "GPS+Cellular";
                    prezzoSE3 = 379.0;
                    prezzoLabelSE.setText("379€");
                });
            }
        }


        // ==========================================
        // ⌚ Apple Watch Series 11
        // ==========================================
        if (immagineProdotto11 != null) {
            if (circleGrigio11 != null) AnimazioneUtil.aggiungiClickColore(circleGrigio11, "Naturale", "/it/uid/unitech/Images/Apple Watch Series 11 Naturale.png", coloreLabel11, immagineProdotto11);
            if (btnGPS11 != null) AnimazioneUtil.aggiungiClickBottone(btnGPS11, "759€", prezzoLabel11);
            if (circleOro11 != null) AnimazioneUtil.aggiungiClickColore(circleOro11, "Oro", "/it/uid/unitech/Images/Apple Watch Series 11 Oro.png", coloreLabel11, immagineProdotto11);
            if (circleNero11 != null) AnimazioneUtil.aggiungiClickColore(circleNero11, "Ardesia", "/it/uid/unitech/Images/Apple Watch Series 11 Ardesia.png", coloreLabel11, immagineProdotto11);
            if (btnGPSCellular11 != null) AnimazioneUtil.aggiungiClickBottone(btnGPSCellular11, "859€", prezzoLabel11);

            if (circleGrigio11 != null) {
                circleGrigio11.setOnMouseClicked(e -> {
                    coloreSeries11 = "Naturale";
                    immagineSeries11 = loadImage("/it/uid/unitech/Images/Apple Watch Series 11 Naturale.png");
                    AnimazioneUtil.selezionaColore(circleGrigio11, "Naturale", "/it/uid/unitech/Images/Apple Watch Series 11 Naturale.png", coloreLabel11, immagineProdotto11);
                });
            }

            if (circleOro11 != null) {
                circleOro11.setOnMouseClicked(e -> {
                    coloreSeries11 = "Oro";
                    immagineSeries11 = loadImage("/it/uid/unitech/Images/Apple Watch Series 11 Oro.png");
                    AnimazioneUtil.selezionaColore(circleOro11, "Oro", "/it/uid/unitech/Images/Apple Watch Series 11 Oro.png", coloreLabel11, immagineProdotto11);
                });
            }

            if (circleNero11 != null) {
                circleNero11.setOnMouseClicked(e -> {
                    coloreSeries11 = "Ardesia";
                    immagineSeries11 = loadImage("/it/uid/unitech/Images/Apple Watch Series 11 Ardesia.png");
                    AnimazioneUtil.selezionaColore(circleNero11, "Ardesia", "/it/uid/unitech/Images/Apple Watch Series 11 Ardesia.png", coloreLabel11, immagineProdotto11);
                });
            }

            if (btnGPS11 != null) {
                btnGPS11.setOnAction(e -> {
                    connettivitaSeries11 = "GPS";
                    prezzoSeries11 = 759.0;
                    prezzoLabel11.setText("759€");
                });
            }

            if (btnGPSCellular11 != null) {
                btnGPSCellular11.setOnAction(e -> {
                    connettivitaSeries11 = "GPS+Cellular";
                    prezzoSeries11 = 859.0;
                    prezzoLabel11.setText("859€");
                });
            }
        }

        AnimazioneUtil.aggiungiAnimazione(loginIconUltra);
        AnimazioneUtil.aggiungiAnimazione(loginIconSE3);
        AnimazioneUtil.aggiungiAnimazione(loginIcon11);

        AnimazioneUtil.verificaCambiaScena(loginIconUltra, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.verificaCambiaScena(loginIconSE3, "/fxml/ProfileOption.fxml");
        AnimazioneUtil.verificaCambiaScena(loginIcon11, "/fxml/ProfileOption.fxml");

        AnimazioneUtil.aggiungiAnimazione(logoIconSE3);
        AnimazioneUtil.aggiungiAnimazione(logoIconUltra);
        AnimazioneUtil.aggiungiAnimazione(logoIcon11);

        AnimazioneUtil.verificaCambiaScena(logoIconSE3, "/fxml/Home.fxml");
        AnimazioneUtil.verificaCambiaScena(logoIconUltra, "/fxml/Home.fxml");
        AnimazioneUtil.verificaCambiaScena(logoIcon11, "/fxml/Home.fxml");

        // Navigazione (sezione Apple Watch Ultra 3)
        AnimazioneUtil.verificaCambiaScena(iPhoneHomeWatchUltra3, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeWatchUltra3, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeWatchUltra3, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeWatchUltra3, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeWatchUltra3, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeWatchUltra3, "/fxml/AirPods Product.fxml");

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeWatchUltra3, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeWatchUltra3, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeWatchUltra3, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeWatchUltra3, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeWatchUltra3, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeWatchUltra3, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeWatchUltra3, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeWatchUltra3, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeWatchUltra3, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeWatchUltra3, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeWatchUltra3, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeWatchUltra3, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeWatchUltra3, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeWatchUltra3, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeWatchUltra3, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeWatchUltra3, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeWatchUltra3, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeWatchUltra3, "/fxml/AirPods 4 PageProduct.fxml");
        

        // Navigazione (sezione Apple Watch SE 3)
        AnimazioneUtil.verificaCambiaScena(iPhoneHomeWatchSE3, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeWatchSE3, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeWatchSE3, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeWatchSE3, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeWatchSE3, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeWatchSE3, "/fxml/AirPods Product.fxml");

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeWatchSE3, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeWatchSE3, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeWatchSE3, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeWatchSE3, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeWatchSE3, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeWatchSE3, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeWatchSE3, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeWatchSE3, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeWatchSE3, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeWatchSE3, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeWatchSE3, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeWatchSE3, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeWatchSE3, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeWatchSE3, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeWatchSE3, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeWatchSE3, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeWatchSE3, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeWatchSE3, "/fxml/AirPods 4 PageProduct.fxml");

        // Navigazione (sezione Apple Watch Series 11)
        AnimazioneUtil.verificaCambiaScena(iPhoneHomeWatchSeries11, "/fxml/iPhone Product.fxml");
        AnimazioneUtil.verificaCambiaScena(iPadHomeWatchSeries11, "/fxml/iPad Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacHomeWatchSeries11, "/fxml/Mac Product.fxml");
        AnimazioneUtil.verificaCambiaScena(MacBookHomeWatchSeries11, "/fxml/MacBook Product.fxml");
        AnimazioneUtil.verificaCambiaScena(WatchHomeWatchSeries11, "/fxml/Watch Product.fxml");
        AnimazioneUtil.verificaCambiaScena(AirPodsHomeWatchSeries11, "/fxml/AirPods Product.fxml");

        AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeWatchSeries11, "/fxml/iPhone 17 Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeWatchSeries11, "/fxml/iPhone 17 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeWatchSeries11, "/fxml/iPhone Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeWatchSeries11, "/fxml/iPad Pro PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeWatchSeries11, "/fxml/iPad Air PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeWatchSeries11, "/fxml/iPad PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeWatchSeries11, "/fxml/MacBook Pro 14 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeWatchSeries11, "/fxml/MacBook Air 13 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeWatchSeries11, "/fxml/MacBook Neo PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeWatchSeries11, "/fxml/MacStudio PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeWatchSeries11, "/fxml/MacMini PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(iMacHomeWatchSeries11, "/fxml/iMac PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeWatchSeries11, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeWatchSeries11, "/fxml/Apple Watch Series 11 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeWatchSeries11, "/fxml/Apple Watch SE 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeWatchSeries11, "/fxml/AirPods Max 2 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeWatchSeries11, "/fxml/AirPods Pro 3 PageProduct.fxml");
        AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeWatchSeries11, "/fxml/AirPods 4 PageProduct.fxml");
    }

    private Image loadImage(String resourcePath) {
        return new Image(Objects.requireNonNull(getClass().getResourceAsStream(resourcePath),
                "Resource not found: " + resourcePath));
    }
}