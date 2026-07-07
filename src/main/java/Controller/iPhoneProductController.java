package Controller;

import Model.Carrello;
import Model.ElementoCarrello;
import Util.AnimazioneUtil;
import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
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
import javafx.stage.Stage;
import javafx.util.Duration;
import Util.Navigation;
import org.kordamp.ikonli.javafx.FontIcon;

public class iPhoneProductController {

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
    private Circle circleVerde;
    @FXML
    private Button btn128;
    @FXML
    private Button btn256;
    @FXML
    private Button btn512;
    @FXML
    private FontIcon loginIcon;
    @FXML
    private ImageView logoIcon;

    public void initialize(){

        AnimazioneUtil.selezionaColore(circleNero,"Nero","/it/uid/unitech/Images/IPhone 17 Black.png",coloreLabel,immagineProdotto);
        AnimazioneUtil.selezionaVariante(btn128,"999€",prezzoLabel);
        coloreLabel.setText("Nero");

        circleNero.setOnMouseClicked(event -> {
            AnimazioneUtil.selezionaColore(circleNero,"Nero","/it/uid/unitech/Images/IPhone 17 Black.png",coloreLabel,immagineProdotto);
        });
        circleBianco.setOnMouseClicked(event -> {
            AnimazioneUtil.selezionaColore(circleBianco,"Bianco","/it/uid/unitech/Images/IPhone 17 Bianco.png",coloreLabel,immagineProdotto);
        });
        circleVerde.setOnMouseClicked(event -> {
            AnimazioneUtil.selezionaColore(circleVerde,"Salvia","/it/uid/unitech/Images/iPhone 17 Verde.png",coloreLabel,immagineProdotto);
        });
        circleBlu.setOnMouseClicked(event -> {
            AnimazioneUtil.selezionaColore(circleBlu,"Azzurro","/it/uid/unitech/Images/iPhone 17 Blu.png",coloreLabel,immagineProdotto);
        });

        btn128.setOnMouseClicked(event -> {
            AnimazioneUtil.selezionaVariante(btn128,"999€",prezzoLabel);
        });
        btn256.setOnMouseClicked(event -> {
            AnimazioneUtil.selezionaVariante(btn256,"1099€",prezzoLabel);
        });
        btn512.setOnMouseClicked(event -> {
            AnimazioneUtil.selezionaVariante(btn512,"1299€",prezzoLabel);
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