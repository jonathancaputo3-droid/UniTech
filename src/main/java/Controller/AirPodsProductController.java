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

    public void initialize(){

        AnimazioneUtil.selezionaColore(circleNero,"Mezzanotte","/it/uid/unitech/Images/AirPods Max 2 Nere.png",coloreLabel,immagineProdotto);
        AnimazioneUtil.selezionaVariante(btnNo,"579€",prezzoLabel);
        coloreLabel.setText("Mezzanotte");

        circleNero.setOnMouseClicked(event -> {
            AnimazioneUtil.selezionaColore(circleNero,"Mezzanotte","/it/uid/unitech/Images/AirPods Max 2 Nere.png",coloreLabel,immagineProdotto);
        });
        circleBianco.setOnMouseClicked(event -> {
            AnimazioneUtil.selezionaColore(circleBianco,"Baige","/it/uid/unitech/Images/AirPods Max 2 Bianche.png",coloreLabel,immagineProdotto);
        });
        circleArancione.setOnMouseClicked(event -> {
            AnimazioneUtil.selezionaColore(circleArancione,"Arancione","/it/uid/unitech/Images/AirPods Max 2 Arancioni.png",coloreLabel,immagineProdotto);
        });
        circleBlu.setOnMouseClicked(event -> {
            AnimazioneUtil.selezionaColore(circleBlu,"Azzurro","/it/uid/unitech/Images/AirPods Max 2 Blu.png",coloreLabel,immagineProdotto);
        });

        btnNo.setOnMouseClicked(event -> {
            AnimazioneUtil.selezionaVariante(btnNo,"579€",prezzoLabel);
        });
        btnSi.setOnMouseClicked(event -> {
            AnimazioneUtil.selezionaVariante(btnSi,"679€",prezzoLabel);
        });

        AnimazioneUtil.aggiungiAnimazioneScale(loginIcon);

        loginIcon.setOnMouseClicked(event -> {
            AnimazioneUtil.cambiaScena(loginIcon, "/Fxml/ProfileOption.fxml");
        });

        AnimazioneUtil.aggiungiAnimazioneScale(logoIcon);

        logoIcon.setOnMouseClicked(event -> {
            AnimazioneUtil.cambiaScena(logoIcon, "/Fxml/Home.fxml");
        });
    }
}