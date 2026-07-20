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

public class MacProductController {

    // =========================
    // 📦 VARIABILI iMac
    // =========================
    private String coloreiMac = "Argento";
    private String memoriaiMac = "256 GB";
    private double prezzoiMac = 2029.0;
    private Image immagineiMac = loadImage("/it/uid/unitech/Images/imac_argento.png");

    // =========================
    // 📦 VARIABILI Mac Studio
    // =========================
    private String coloreMacStudio = "Argento";
    private String memoriaMacStudio = "512 GB";
    private double prezzoMacStudio = 3049.0;
    private Image immagineMacStudio = loadImage("/it/uid/unitech/Images/mac_studio.png");

    // =========================
    // 📦 VARIABILI Mac Mini
    // =========================
    private String coloreMacMini = "Argento";
    private String memoriaMacMini = "256 GB";
    private double prezzoMacMini = 979.0;
    private Image immagineMacMini = loadImage("/it/uid/unitech/Images/mac_mini.png");


    // =========================
    // 🛒 AGGIUNTA AL CARRELLO
    // =========================
    @FXML
    private void aggiungiiMac(MouseEvent event) {
        ElementoCarrello item = new ElementoCarrello(
                "iMac",
                prezzoiMac,
                1,
                immagineiMac,
                "Colore: " + coloreiMac + " | Memoria: " + memoriaiMac
        );
        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiMacStudio(MouseEvent event) {
        ElementoCarrello item = new ElementoCarrello(
                "Mac Studio",
                prezzoMacStudio,
                1,
                immagineMacStudio,
                "Colore: " + coloreMacStudio + " | Memoria: " + memoriaMacStudio
        );
        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiMacMini(MouseEvent event) {
        ElementoCarrello item = new ElementoCarrello(
                "Mac Mini",
                prezzoMacMini,
                1,
                immagineMacMini,
                "Colore: " + coloreMacMini + " | Memoria: " + memoriaMacMini
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
        if (immagineProdottoiM != null) {
            AnimazioneUtil.aggiungiClickColore(circleArgentoiM, "Argento", "/it/uid/unitech/Images/imac_argento.png", coloreLabeliM, immagineProdottoiM);
            AnimazioneUtil.aggiungiClickColore(circleRosaiM, "Rosa", "/it/uid/unitech/Images/imac_rosa.png", coloreLabeliM, immagineProdottoiM);
            AnimazioneUtil.aggiungiClickBottone(btn256_iM, "2.029€", prezzoLabeliM);
            AnimazioneUtil.aggiungiClickBottone(btn512_iM, "2.259€", prezzoLabeliM);
            AnimazioneUtil.aggiungiClickBottone(btn1_iM, "2.719€", prezzoLabeliM);

            if (circleArgentoiM != null) {
                circleArgentoiM.setOnMouseClicked(e -> {
                    coloreiMac = "Argento";
                    immagineiMac = loadImage("/it/uid/unitech/Images/imac_argento.png");
                    AnimazioneUtil.selezionaColore(circleArgentoiM, "Argento", "/it/uid/unitech/Images/imac_argento.png", coloreLabeliM, immagineProdottoiM);
                });
            }

            if (circleRosaiM != null) {
                circleRosaiM.setOnMouseClicked(e -> {
                    coloreiMac = "Rosa";
                    immagineiMac = loadImage("/it/uid/unitech/Images/imac_rosa.png");
                    AnimazioneUtil.selezionaColore(circleRosaiM, "Rosa", "/it/uid/unitech/Images/imac_rosa.png", coloreLabeliM, immagineProdottoiM);
                });
            }

            if (btn256_iM != null) {
                btn256_iM.setOnAction(e -> {
                    memoriaiMac = "256 GB";
                    prezzoiMac = 2029.0;
                    prezzoLabeliM.setText("2.029€");
                });
            }

            if (btn512_iM != null) {
                btn512_iM.setOnAction(e -> {
                    memoriaiMac = "512 GB";
                    prezzoiMac = 2259.0;
                    prezzoLabeliM.setText("2.259€");
                });
            }

            if (btn1_iM != null) {
                btn1_iM.setOnAction(e -> {
                    memoriaiMac = "1TB";
                    prezzoiMac = 2719.0;
                    prezzoLabeliM.setText("2.719€");
                });
            }

            AnimazioneUtil.verificaCambiaScena(iPhoneHomeiMac, "/fxml/iPhone Product.fxml");
            AnimazioneUtil.verificaCambiaScena(iPadHomeiMac, "/fxml/iPad Product.fxml");
            AnimazioneUtil.verificaCambiaScena(MacHomeiMac, "/fxml/Mac Product.fxml");
            AnimazioneUtil.verificaCambiaScena(MacBookHomeiMac, "/fxml/MacBook Product.fxml");
            AnimazioneUtil.verificaCambiaScena(WatchHomeiMac, "/fxml/Watch Product.fxml");
            AnimazioneUtil.verificaCambiaScena(AirPodsHomeiMac, "/fxml/AirPods Product.fxml");
            AnimazioneUtil.verificaCambiaScena(loginIconiM, "/fxml/ProfileOption.fxml");
            AnimazioneUtil.verificaCambiaScena(logoIconiM, "/fxml/Home.fxml");
            AnimazioneUtil.aggiungiAnimazione(logoIconiM);
            AnimazioneUtil.aggiungiAnimazione(loginIconiM);

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
        }

        //Prodotto Mac Studio
        if (immagineProdottoMS != null) {
            if (circleArgentoMS != null) AnimazioneUtil.aggiungiClickColore(circleArgentoMS, "Argento", "/it/uid/unitech/Images/mac_studio.png", coloreLabelMS, immagineProdottoMS);
            if (btn512_MS != null) AnimazioneUtil.aggiungiClickBottone(btn512_MS, "3.049€", prezzoLabelMS);
            if (btn1_MS != null) AnimazioneUtil.aggiungiClickBottone(btn1_MS, "3.279€", prezzoLabelMS);
            if (btn2_MS != null) AnimazioneUtil.aggiungiClickBottone(btn2_MS, "3.739€", prezzoLabelMS);

            if (circleArgentoMS != null) {
                circleArgentoMS.setOnMouseClicked(e -> {
                    coloreMacStudio = "Argento";
                    immagineMacStudio = loadImage("/it/uid/unitech/Images/mac_studio.png");
                    AnimazioneUtil.selezionaColore(circleArgentoMS, "Argento", "/it/uid/unitech/Images/mac_studio.png", coloreLabelMS, immagineProdottoMS);
                });
            }

            if (btn512_MS != null) {
                btn512_MS.setOnAction(e -> {
                    memoriaMacStudio = "512 GB";
                    prezzoMacStudio = 3049.0;
                    prezzoLabelMS.setText("3.049€");
                });
            }

            if (btn1_MS != null) {
                btn1_MS.setOnAction(e -> {
                    memoriaMacStudio = "1TB";
                    prezzoMacStudio = 3279.0;
                    prezzoLabelMS.setText("3.279€");
                });
            }

            if (btn2_MS != null) {
                btn2_MS.setOnAction(e -> {
                    memoriaMacStudio = "2TB";
                    prezzoMacStudio = 3739.0;
                    prezzoLabelMS.setText("3.739€");
                });
            }

            AnimazioneUtil.verificaCambiaScena(iPhoneHomeMacStudio, "/fxml/iPhone Product.fxml");
            AnimazioneUtil.verificaCambiaScena(iPadHomeMacStudio, "/fxml/iPad Product.fxml");
            AnimazioneUtil.verificaCambiaScena(MacHomeMacStudio, "/fxml/Mac Product.fxml");
            AnimazioneUtil.verificaCambiaScena(MacBookHomeMacStudio, "/fxml/MacBook Product.fxml");
            AnimazioneUtil.verificaCambiaScena(WatchHomeMacStudio, "/fxml/Watch Product.fxml");
            AnimazioneUtil.verificaCambiaScena(AirPodsHomeMacStudio, "/fxml/AirPods Product.fxml");
            AnimazioneUtil.verificaCambiaScena(loginIconMS, "/fxml/ProfileOption.fxml");
            AnimazioneUtil.verificaCambiaScena(logoIconMS, "/fxml/Home.fxml");
            AnimazioneUtil.aggiungiAnimazione(logoIconMS);
            AnimazioneUtil.aggiungiAnimazione(loginIconMS);

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
        }

        //Prodotto Mac Mini
        if (immagineProdottoMini != null) {
            AnimazioneUtil.aggiungiClickColore(circleArgentoMini, "Argento", "/it/uid/unitech/Images/mac_mini.png", coloreLabelMini, immagineProdottoMini);
            AnimazioneUtil.aggiungiClickBottone(btn256_Mini, "979€", prezzoLabelMini);
            AnimazioneUtil.aggiungiClickBottone(btn512_Mini, "1.209€", prezzoLabelMini);
            AnimazioneUtil.aggiungiClickBottone(btn1_Mini, "1.669€", prezzoLabelMini);

            if (circleArgentoMini != null) {
                circleArgentoMini.setOnMouseClicked(e -> {
                    coloreMacMini = "Argento";
                    immagineMacMini = loadImage("/it/uid/unitech/Images/mac_mini.png");
                    AnimazioneUtil.selezionaColore(circleArgentoMini, "Argento", "/it/uid/unitech/Images/mac_mini.png", coloreLabelMini, immagineProdottoMini);
                });
            }

            if (btn256_Mini != null) {
                btn256_Mini.setOnAction(e -> {
                    memoriaMacMini = "256 GB";
                    prezzoMacMini = 979.0;
                    prezzoLabelMini.setText("979€");
                });
            }

            if (btn512_Mini != null) {
                btn512_Mini.setOnAction(e -> {
                    memoriaMacMini = "512 GB";
                    prezzoMacMini = 1209.0;
                    prezzoLabelMini.setText("1.209€");
                });
            }

            if (btn1_Mini != null) {
                btn1_Mini.setOnAction(e -> {
                    memoriaMacMini = "1TB";
                    prezzoMacMini = 1669.0;
                    prezzoLabelMini.setText("1.669€");
                });
            }

            AnimazioneUtil.verificaCambiaScena(iPhoneHomeMacMini, "/fxml/iPhone Product.fxml");
            AnimazioneUtil.verificaCambiaScena(iPadHomeMacMini, "/fxml/iPad Product.fxml");
            AnimazioneUtil.verificaCambiaScena(MacHomeMacMini, "/fxml/Mac Product.fxml");
            AnimazioneUtil.verificaCambiaScena(MacBookHomeMacMini, "/fxml/MacBook Product.fxml");
            AnimazioneUtil.verificaCambiaScena(WatchHomeMacMini, "/fxml/Watch Product.fxml");
            AnimazioneUtil.verificaCambiaScena(AirPodsHomeMacMini, "/fxml/AirPods Product.fxml");
            AnimazioneUtil.verificaCambiaScena(loginIconMini, "/fxml/ProfileOption.fxml");
            AnimazioneUtil.verificaCambiaScena(logoIconMini, "/fxml/Home.fxml");
            AnimazioneUtil.aggiungiAnimazione(logoIconMini);
            AnimazioneUtil.aggiungiAnimazione(loginIconMini);
        }

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

    private Image loadImage(String resourcePath) {
        return new Image(Objects.requireNonNull(getClass().getResourceAsStream(resourcePath),
                "Resource not found: " + resourcePath));
    }
}