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

import static Util.AnimazioneUtil.*;

public class AirPodsProductController {

    // =========================
    // 📦 AGGIUNTA PRODOTTI
    // =========================


    // =========================
// VARIABILI AIRPODS MAX 2
// =========================
    private String coloreMax2 = "Mezzanotte";
    private String ancMax2 = "Standard";
    private double prezzoMax2 = 579.0;
    private Image immagineMax2 = loadImage("/it/uid/unitech/Images/AirPods Max 2 Nere.png");

    // =========================
// VARIABILI AIRPODS PRO 3
// =========================
    private String colorePro3 = "Bianco";
    private String ancPro3 = "Standard";
    private double prezzoPro3 = 249.0;
    private Image immaginePro3 = loadImage("/it/uid/unitech/Images/AirPods Pro 3.png");

    // =========================
// VARIABILI AIRPODS 4
// =========================
    private String colore4 = "Bianco";
    private String anc4 = "No";
    private double prezzo4 = 149.0;
    private Image immagine4 = loadImage("/it/uid/unitech/Images/AirPods 4.png");







    @FXML
    private void aggiungiAirPodsMax2(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "AirPods Max 2",
                prezzoMax2,
                1,
                immagineMax2,
                "Colore: " + coloreMax2 + " | ANC: " + ancMax2
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiAirPodsPro3(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "AirPods Pro 3",
                prezzoPro3,
                1,
                immaginePro3,
                "Colore: " + colorePro3 + " | ANC: " + ancPro3
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }


    @FXML
    private void aggiungiAirPods4(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "AirPods 4",
                prezzo4,
                1,
                immagine4,
                "Colore: " + colore4 + " | ANC: " + anc4
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


    //Dati AirPods Max 2
    @FXML
    private ImageView immagineProdotto;
    @FXML
    private Label prezzoLabel;
    @FXML
    private Label coloreLabel;
    @FXML
    private Circle circleNero;
    @FXML
    private Circle circleBlu;
    @FXML
    private Circle circleBianco;
    @FXML
    private Circle circleArancione;
    @FXML
    private Button btnNo;
    @FXML
    private Button btnSi;
    @FXML
    private FontIcon loginIconMax2;
    @FXML
    private ImageView logoIconMax2;

    // Navigazione (sezione AirPods Max 2)
    @FXML private SplitMenuButton iPhoneHomeAirPodsMax2;
    @FXML private SplitMenuButton iPadHomeAirPodsMax2;
    @FXML private SplitMenuButton MacHomeAirPodsMax2;
    @FXML private SplitMenuButton MacBookHomeAirPodsMax2;
    @FXML private SplitMenuButton WatchHomeAirPodsMax2;
    @FXML private SplitMenuButton AirPodsHomeAirPodsMax2;

    @FXML private MenuItem iPhone17ProHomeAirPodsMax2;
    @FXML private MenuItem iPhone17HomeAirPodsMax2;
    @FXML private MenuItem iPhoneAirHomeAirPodsMax2;
    @FXML private MenuItem iPadProHomeAirPodsMax2;
    @FXML private MenuItem iPadAirHomeAirPodsMax2;
    @FXML private MenuItem iPadBaseHomeAirPodsMax2;
    @FXML private MenuItem MacBookProHomeAirPodsMax2;
    @FXML private MenuItem MacBookAirHomeAirPodsMax2;
    @FXML private MenuItem MacBookNeoHomeAirPodsMax2;
    @FXML private MenuItem MacStudioHomeAirPodsMax2;
    @FXML private MenuItem MacMiniHomeAirPodsMax2;
    @FXML private MenuItem iMacHomeAirPodsMax2;
    @FXML private MenuItem WatchUltra3HomeAirPodsMax2;
    @FXML private MenuItem WatchSeries11HomeAirPodsMax2;
    @FXML private MenuItem WatchSE3HomeAirPodsMax2;
    @FXML private MenuItem AirPodsMax2HomeAirPodsMax2;
    @FXML private MenuItem AirPodsPro3HomeAirPodsMax2;
    @FXML private MenuItem AirPods4HomeAirPodsMax2;


    //Dati AirPods 4
    @FXML
    private Label prezzoLabel4;
    @FXML
    private Label coloreLabel4;
    @FXML
    private Circle circleBianco4;
    @FXML
    private Button btnNo4;
    @FXML
    private Button btnSi4;
    @FXML
    private FontIcon loginIcon4;
    @FXML
    private ImageView logoIcon4;
    @FXML
    private ImageView immagineProdotto4;

    // Navigazione (sezione AirPods 4)
    @FXML private SplitMenuButton iPhoneHomeAirPods4;
    @FXML private SplitMenuButton iPadHomeAirPods4;
    @FXML private SplitMenuButton MacHomeAirPods4;
    @FXML private SplitMenuButton MacBookHomeAirPods4;
    @FXML private SplitMenuButton WatchHomeAirPods4;
    @FXML private SplitMenuButton AirPodsHomeAirPods4;

    @FXML private MenuItem iPhone17ProHomeAirPods4;
    @FXML private MenuItem iPhone17HomeAirPods4;
    @FXML private MenuItem iPhoneAirHomeAirPods4;
    @FXML private MenuItem iPadProHomeAirPods4;
    @FXML private MenuItem iPadAirHomeAirPods4;
    @FXML private MenuItem iPadBaseHomeAirPods4;
    @FXML private MenuItem MacBookProHomeAirPods4;
    @FXML private MenuItem MacBookAirHomeAirPods4;
    @FXML private MenuItem MacBookNeoHomeAirPods4;
    @FXML private MenuItem MacStudioHomeAirPods4;
    @FXML private MenuItem MacMiniHomeAirPods4;
    @FXML private MenuItem iMacHomeAirPods4;
    @FXML private MenuItem WatchUltra3HomeAirPods4;
    @FXML private MenuItem WatchSeries11HomeAirPods4;
    @FXML private MenuItem WatchSE3HomeAirPods4;
    @FXML private MenuItem AirPodsMax2HomeAirPods4;
    @FXML private MenuItem AirPodsPro3HomeAirPods4;
    @FXML private MenuItem AirPods4HomeAirPods4;


    //Dati AirPods Pro 3
    @FXML
    private Label prezzoLabel3;
    @FXML
    private Label coloreLabel3;
    @FXML
    private Circle circleBianco3;
    @FXML
    private Button btnNo3;
    @FXML
    private Button btnSi3;
    @FXML
    private FontIcon loginIcon3;
    @FXML
    private ImageView logoIcon3;
    @FXML
    private ImageView immagineProdotto3;

    // Navigazione (sezione AirPods Pro 3)
    @FXML private SplitMenuButton iPhoneHomeAirPodsPro3;
    @FXML private SplitMenuButton iPadHomeAirPodsPro3;
    @FXML private SplitMenuButton MacHomeAirPodsPro3;
    @FXML private SplitMenuButton MacBookHomeAirPodsPro3;
    @FXML private SplitMenuButton WatchHomeAirPodsPro3;
    @FXML private SplitMenuButton AirPodsHomeAirPodsPro3;

    @FXML private MenuItem iPhone17ProHomeAirPodsPro3;
    @FXML private MenuItem iPhone17HomeAirPodsPro3;
    @FXML private MenuItem iPhoneAirHomeAirPodsPro3;
    @FXML private MenuItem iPadProHomeAirPodsPro3;
    @FXML private MenuItem iPadAirHomeAirPodsPro3;
    @FXML private MenuItem iPadBaseHomeAirPodsPro3;
    @FXML private MenuItem MacBookProHomeAirPodsPro3;
    @FXML private MenuItem MacBookAirHomeAirPodsPro3;
    @FXML private MenuItem MacBookNeoHomeAirPodsPro3;
    @FXML private MenuItem MacStudioHomeAirPodsPro3;
    @FXML private MenuItem MacMiniHomeAirPodsPro3;
    @FXML private MenuItem iMacHomeAirPodsPro3;
    @FXML private MenuItem WatchUltra3HomeAirPodsPro3;
    @FXML private MenuItem WatchSeries11HomeAirPodsPro3;
    @FXML private MenuItem WatchSE3HomeAirPodsPro3;
    @FXML private MenuItem AirPodsMax2HomeAirPodsPro3;
    @FXML private MenuItem AirPodsPro3HomeAirPodsPro3;
    @FXML private MenuItem AirPods4HomeAirPodsPro3;


    public void initialize(){

        // =========================
        // Sezione AirPods Max 2 (attiva solo se questa pagina contiene questi campi)
        // =========================
        if (circleNero != null) {

            aggiungiClickColore(circleNero, "Mezzanotte", "/it/uid/unitech/Images/AirPods Max 2 Nere.png", coloreLabel, immagineProdotto);
            aggiungiClickColore(circleBianco,"Baige","/it/uid/unitech/Images/AirPods Max 2 Bianche.png",coloreLabel,immagineProdotto);
            aggiungiClickColore(circleArancione,"Arancione","/it/uid/unitech/Images/AirPods Max 2 Arancioni.png",coloreLabel,immagineProdotto);
            aggiungiClickColore(circleBlu,"Azzurro","/it/uid/unitech/Images/AirPods Max 2 Blu.png",coloreLabel,immagineProdotto);

            aggiungiClickBottone(btnNo,"579€",prezzoLabel);
            aggiungiClickBottone(btnSi,"679€",prezzoLabel);

            circleNero.setOnMouseClicked(e -> {
                coloreMax2 = "Mezzanotte";
                immagineMax2 = loadImage("/it/uid/unitech/Images/AirPods Max 2 Nere.png");
                AnimazioneUtil.selezionaColore(circleNero, "Mezzanotte", "/it/uid/unitech/Images/AirPods Max 2 Nere.png", coloreLabel, immagineProdotto);
            });

            circleBianco.setOnMouseClicked(e -> {
                coloreMax2 = "Baige";
                immagineMax2 = loadImage("/it/uid/unitech/Images/AirPods Max 2 Bianche.png");
                AnimazioneUtil.selezionaColore(circleBianco, "Baige", "/it/uid/unitech/Images/AirPods Max 2 Bianche.png", coloreLabel, immagineProdotto);
            });

            circleBlu.setOnMouseClicked(e -> {
                coloreMax2 = "Azzurro";
                immagineMax2 = loadImage("/it/uid/unitech/Images/AirPods Max 2 Blu.png");
                AnimazioneUtil.selezionaColore(circleBlu, "Azzurro", "/it/uid/unitech/Images/AirPods Max 2 Blu.png", coloreLabel, immagineProdotto);
            });

            circleArancione.setOnMouseClicked(e -> {
                coloreMax2 = "Arancione";
                immagineMax2 = loadImage("/it/uid/unitech/Images/AirPods Max 2 Arancioni.png");
                AnimazioneUtil.selezionaColore(circleArancione, "Arancione", "/it/uid/unitech/Images/AirPods Max 2 Arancioni.png", coloreLabel, immagineProdotto);
            });

            btnNo.setOnAction(e -> {
                ancMax2 = "No";
                prezzoMax2 = 579.0;
                prezzoLabel.setText("579€");
            });

            btnSi.setOnAction(e -> {
                ancMax2 = "Si";
                prezzoMax2 = 679.0;
                prezzoLabel.setText("679€");
            });
        }

        // =========================
        // Sezione AirPods Pro 3
        // =========================
        if (circleBianco3 != null) {

            aggiungiClickColore(circleBianco3, "Bianco", "/it/uid/unitech/Images/AirPods Pro 3.png", coloreLabel3, immagineProdotto3);
            aggiungiClickBottone(btnNo3, "249€", prezzoLabel3);
            aggiungiClickBottone(btnSi3,"349€",prezzoLabel3);

            circleBianco3.setOnMouseClicked(e -> {
                colorePro3 = "Bianco";
                immaginePro3 = loadImage("/it/uid/unitech/Images/AirPods Pro 3.png");
                AnimazioneUtil.selezionaColore(circleBianco3, "Bianco", "/it/uid/unitech/Images/AirPods Pro 3.png", coloreLabel3, immagineProdotto3);
            });

            btnNo3.setOnAction(e -> {
                ancPro3 = "Standard";
                prezzoPro3 = 249.0;
                prezzoLabel3.setText("249€");
            });

            btnSi3.setOnAction(e -> {
                ancPro3 = "Pro";
                prezzoPro3 = 349.0;
                prezzoLabel3.setText("349€");
            });
        }

        // =========================
        // Sezione AirPods 4
        // =========================
        if (circleBianco4 != null) {

            aggiungiClickColore(circleBianco4, "Bianco", "/it/uid/unitech/Images/AirPods 4.png", coloreLabel4, immagineProdotto4);
            aggiungiClickBottone(btnNo4, "149€", prezzoLabel4);
            aggiungiClickBottone(btnSi4,"249€",prezzoLabel4);

            circleBianco4.setOnMouseClicked(e -> {
                colore4 = "Bianco";
                immagine4 = loadImage("/it/uid/unitech/Images/AirPods 4.png");
                AnimazioneUtil.selezionaColore(circleBianco4, "Bianco", "/it/uid/unitech/Images/AirPods 4.png", coloreLabel4, immagineProdotto4);
            });

            btnNo4.setOnAction(e -> {
                anc4 = "No";
                prezzo4 = 149.0;
                prezzoLabel4.setText("149€");
            });

            btnSi4.setOnAction(e -> {
                anc4 = "Si";
                prezzo4 = 249.0;
                prezzoLabel4.setText("249€");
            });
        }











        if (loginIconMax2 != null) {
            aggiungiAnimazione(loginIconMax2);
            verificaCambiaScena(loginIconMax2, "/fxml/ProfileOption.fxml");
            aggiungiAnimazione(logoIconMax2);
            verificaCambiaScena(logoIconMax2, "/fxml/Home.fxml");
        }

        if (loginIcon4 != null) {
            aggiungiAnimazione(loginIcon4);
            verificaCambiaScena(loginIcon4, "/fxml/ProfileOption.fxml");
            aggiungiAnimazione(logoIcon4);
            verificaCambiaScena(logoIcon4, "/fxml/Home.fxml");
        }

        if (loginIcon3 != null) {
            aggiungiAnimazione(loginIcon3);
            verificaCambiaScena(loginIcon3, "/fxml/ProfileOption.fxml");
            aggiungiAnimazione(logoIcon3);
            verificaCambiaScena(logoIcon3, "/fxml/Home.fxml");
        }

        // Navigazione (sezione AirPods Max 2)
        if (iPhoneHomeAirPodsMax2 != null) {
            AnimazioneUtil.verificaCambiaScena(iPhoneHomeAirPodsMax2, "/fxml/iPhone Product.fxml");
            AnimazioneUtil.verificaCambiaScena(iPadHomeAirPodsMax2, "/fxml/iPad Product.fxml");
            AnimazioneUtil.verificaCambiaScena(MacHomeAirPodsMax2, "/fxml/Mac Product.fxml");
            AnimazioneUtil.verificaCambiaScena(MacBookHomeAirPodsMax2, "/fxml/MacBook Product.fxml");
            AnimazioneUtil.verificaCambiaScena(WatchHomeAirPodsMax2, "/fxml/Watch Product.fxml");
            AnimazioneUtil.verificaCambiaScena(AirPodsHomeAirPodsMax2, "/fxml/AirPods Product.fxml");

            AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeAirPodsMax2, "/fxml/iPhone 17 Pro PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeAirPodsMax2, "/fxml/iPhone 17 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeAirPodsMax2, "/fxml/iPhone Air PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeAirPodsMax2, "/fxml/iPad Pro PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeAirPodsMax2, "/fxml/iPad Air PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeAirPodsMax2, "/fxml/iPad PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeAirPodsMax2, "/fxml/MacBook Pro 14 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeAirPodsMax2, "/fxml/MacBook Air 13 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeAirPodsMax2, "/fxml/MacBook Neo PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeAirPodsMax2, "/fxml/MacStudio PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeAirPodsMax2, "/fxml/MacMini PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iMacHomeAirPodsMax2, "/fxml/iMac PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeAirPodsMax2, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeAirPodsMax2, "/fxml/Apple Watch Series 11 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeAirPodsMax2, "/fxml/Apple Watch SE 3 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeAirPodsMax2, "/fxml/AirPods Max 2 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeAirPodsMax2, "/fxml/AirPods Pro 3 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeAirPodsMax2, "/fxml/AirPods 4 PageProduct.fxml");
        }

        // Navigazione (sezione AirPods 4)
        if (iPhoneHomeAirPods4 != null) {
            AnimazioneUtil.verificaCambiaScena(iPhoneHomeAirPods4, "/fxml/iPhone Product.fxml");
            AnimazioneUtil.verificaCambiaScena(iPadHomeAirPods4, "/fxml/iPad Product.fxml");
            AnimazioneUtil.verificaCambiaScena(MacHomeAirPods4, "/fxml/Mac Product.fxml");
            AnimazioneUtil.verificaCambiaScena(MacBookHomeAirPods4, "/fxml/MacBook Product.fxml");
            AnimazioneUtil.verificaCambiaScena(WatchHomeAirPods4, "/fxml/Watch Product.fxml");
            AnimazioneUtil.verificaCambiaScena(AirPodsHomeAirPods4, "/fxml/AirPods Product.fxml");

            AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeAirPods4, "/fxml/iPhone 17 Pro PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeAirPods4, "/fxml/iPhone 17 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeAirPods4, "/fxml/iPhone Air PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeAirPods4, "/fxml/iPad Pro PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeAirPods4, "/fxml/iPad Air PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeAirPods4, "/fxml/iPad PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeAirPods4, "/fxml/MacBook Pro 14 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeAirPods4, "/fxml/MacBook Air 13 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeAirPods4, "/fxml/MacBook Neo PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeAirPods4, "/fxml/MacStudio PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeAirPods4, "/fxml/MacMini PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iMacHomeAirPods4, "/fxml/iMac PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeAirPods4, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeAirPods4, "/fxml/Apple Watch Series 11 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeAirPods4, "/fxml/Apple Watch SE 3 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeAirPods4, "/fxml/AirPods Max 2 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeAirPods4, "/fxml/AirPods Pro 3 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeAirPods4, "/fxml/AirPods 4 PageProduct.fxml");
        }

        // Navigazione (sezione AirPods Pro 3)
        if (iPhoneHomeAirPodsPro3 != null) {
            AnimazioneUtil.verificaCambiaScena(iPhoneHomeAirPodsPro3, "/fxml/iPhone Product.fxml");
            AnimazioneUtil.verificaCambiaScena(iPadHomeAirPodsPro3, "/fxml/iPad Product.fxml");
            AnimazioneUtil.verificaCambiaScena(MacHomeAirPodsPro3, "/fxml/Mac Product.fxml");
            AnimazioneUtil.verificaCambiaScena(MacBookHomeAirPodsPro3, "/fxml/MacBook Product.fxml");
            AnimazioneUtil.verificaCambiaScena(WatchHomeAirPodsPro3, "/fxml/Watch Product.fxml");
            AnimazioneUtil.verificaCambiaScena(AirPodsHomeAirPodsPro3, "/fxml/AirPods Product.fxml");

            AnimazioneUtil.verificaCambiaScenaItem(iPhone17ProHomeAirPodsPro3, "/fxml/iPhone 17 Pro PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPhone17HomeAirPodsPro3, "/fxml/iPhone 17 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPhoneAirHomeAirPodsPro3, "/fxml/iPhone Air PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPadProHomeAirPodsPro3, "/fxml/iPad Pro PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPadAirHomeAirPodsPro3, "/fxml/iPad Air PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iPadBaseHomeAirPodsPro3, "/fxml/iPad PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacBookProHomeAirPodsPro3, "/fxml/MacBook Pro 14 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacBookAirHomeAirPodsPro3, "/fxml/MacBook Air 13 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacBookNeoHomeAirPodsPro3, "/fxml/MacBook Neo PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacStudioHomeAirPodsPro3, "/fxml/MacStudio PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(MacMiniHomeAirPodsPro3, "/fxml/MacMini PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(iMacHomeAirPodsPro3, "/fxml/iMac PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(WatchUltra3HomeAirPodsPro3, "/fxml/Apple Watch Ultra 3 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(WatchSeries11HomeAirPodsPro3, "/fxml/Apple Watch Series 11 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(WatchSE3HomeAirPodsPro3, "/fxml/Apple Watch SE 3 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(AirPodsMax2HomeAirPodsPro3, "/fxml/AirPods Max 2 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(AirPodsPro3HomeAirPodsPro3, "/fxml/AirPods Pro 3 PageProduct.fxml");
            AnimazioneUtil.verificaCambiaScenaItem(AirPods4HomeAirPodsPro3, "/fxml/AirPods 4 PageProduct.fxml");
        }
    }

    private Image loadImage(String resourcePath) {
        return new Image(Objects.requireNonNull(getClass().getResourceAsStream(resourcePath),
                "Resource not found: " + resourcePath));
    }
}