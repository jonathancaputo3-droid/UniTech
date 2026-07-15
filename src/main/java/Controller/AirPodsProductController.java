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

import static Util.AnimazioneUtil.*;

public class AirPodsProductController {

    // =========================
    // 📦 AGGIUNTA PRODOTTI
    // =========================

    @FXML
    private void aggiungiAirPodsMax2(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "AirPods Max 2",
                579.0,
                new Image(getClass().getResourceAsStream(
                        "/it/uid/unitech/Images/AirPods Max 2 Home.png"
                ))
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiAirPodsPro3(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "AirPods Pro 3",
                249.0,
                new Image(getClass().getResourceAsStream(
                        "/it/uid/unitech/Images/AirPods Pro 3 Home.png"
                ))
        );

        Carrello.getIstanza().aggiungiProdotto(item);
    }

    @FXML
    private void aggiungiAirPods4(MouseEvent event) {

        ElementoCarrello item = new ElementoCarrello(
                "AirPods 4",
                129.0,
                new Image(getClass().getResourceAsStream(
                        "/it/uid/unitech/Images/AirPods 4 Home.png"
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
    private FontIcon loginIcon;
    @FXML
    private ImageView logoIcon;

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


        aggiungiClickColore(circleNero, "Mezzanotte", "/it/uid/unitech/Images/AirPods Max 2 Nere.png", coloreLabel, immagineProdotto);
        aggiungiClickBottone(btnNo, "579€", prezzoLabel);

        aggiungiClickColore(circleBianco4, "Bianco", "/it/uid/unitech/Images/AirPods 4.png", coloreLabel4, immagineProdotto4);
        aggiungiClickBottone(btnNo4, "149€", prezzoLabel4);

        aggiungiClickColore(circleBianco3, "Bianco", "/it/uid/unitech/Images/AirPods Pro 3.png", coloreLabel3, immagineProdotto3);
        aggiungiClickBottone(btnNo3, "249€", prezzoLabel3);

        aggiungiClickColore(circleBianco,"Baige","/it/uid/unitech/Images/AirPods Max 2 Bianche.png",coloreLabel,immagineProdotto);

        aggiungiClickColore(circleArancione,"Arancione","/it/uid/unitech/Images/AirPods Max 2 Arancioni.png",coloreLabel,immagineProdotto);

        aggiungiClickColore(circleBlu,"Azzurro","/it/uid/unitech/Images/AirPods Max 2 Blu.png",coloreLabel,immagineProdotto);

        aggiungiClickBottone(btnNo,"579€",prezzoLabel);

        aggiungiClickBottone(btnSi,"679€",prezzoLabel);

        aggiungiClickBottone(btnNo4,"149€",prezzoLabel4);

        aggiungiClickBottone(btnSi4,"249€",prezzoLabel4);

        aggiungiClickBottone(btnNo3,"249€",prezzoLabel3);

        aggiungiClickBottone(btnSi3,"349€",prezzoLabel3);


        aggiungiAnimazione(loginIcon);
        aggiungiAnimazione(loginIcon4);
        aggiungiAnimazione(loginIcon3);

        verificaCambiaScena(loginIcon, "/Fxml/ProfileOption.fxml");

        verificaCambiaScena(loginIcon4, "/Fxml/ProfileOption.fxml");

        verificaCambiaScena(loginIcon3, "/Fxml/ProfileOption.fxml");


        aggiungiAnimazione(logoIcon);
        aggiungiAnimazione(logoIcon4);
        aggiungiAnimazione(logoIcon3);

        verificaCambiaScena(logoIcon, "/Fxml/Home.fxml");

        verificaCambiaScena(logoIcon4, "/Fxml/Home.fxml");

        verificaCambiaScena(logoIcon3, "/Fxml/Home.fxml");

        // Navigazione (sezione AirPods Max 2)
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

        // Navigazione (sezione AirPods 4)
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

        // Navigazione (sezione AirPods Pro 3)
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