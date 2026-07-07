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
    }
}