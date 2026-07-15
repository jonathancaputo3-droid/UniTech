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

public class MacBookController {

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

    //DATI MacBook 14 pro
    @FXML
    private ImageView immagineProdotto14;
    @FXML
    private Label prezzoLabel14;
    @FXML
    private Label coloreLabel14;
    @FXML
    private Circle circleNero14;
    @FXML
    private Circle circleArgento14;
    @FXML
    private Button btn1_14;
    @FXML
    private Button btn2_14;
    @FXML
    private FontIcon loginIcon14;
    @FXML
    private ImageView logoIcon14;


    //DATI Macbook Air 13
    @FXML
    private ImageView immagineProdotto13;
    @FXML
    private Label prezzoLabel13;
    @FXML
    private Label coloreLabel13;
    @FXML
    private Circle circleCeleste13;
    @FXML
    private Circle circleArgento13;
    @FXML
    private Circle circleGalassia13;
    @FXML
    private Circle circleMezzanotte13;
    @FXML
    private Button btn512_13;
    @FXML
    private Button btn1_13;
    @FXML
    private FontIcon loginIcon13;
    @FXML
    private ImageView logoIcon13;


    //DATI MacBook Neo
    @FXML
    private ImageView immagineProdottoNeo;
    @FXML
    private Label prezzoLabelNeo;
    @FXML
    private Label coloreLabelNeo;
    @FXML
    private Circle circleArgentoNeo;
    @FXML
    private Circle circleRosaNeo;
    @FXML
    private Circle circleGialloNeo;
    @FXML
    private Circle circleIndacoNeo;
    @FXML
    private Button btn256_Neo;
    @FXML
    private Button btn512_Neo;
    @FXML
    private FontIcon loginIconNeo;
    @FXML
    private ImageView logoIconNeo;

    public void initialize()
    {
        //Prodotto MacBook Pro 14
        AnimazioneUtil.aggiungiClickColore(circleNero14, "Nero", "/it/uid/unitech/Images/macbook pro 14 m5 nero.png", coloreLabel14, immagineProdotto14);
        AnimazioneUtil.aggiungiClickColore(circleArgento14, "Argento", "/it/uid/unitech/Images/macbook pro 14 m5 argento.png", coloreLabel14, immagineProdotto14);
        AnimazioneUtil.aggiungiClickBottone(btn1_14, "2.249€", prezzoLabel14);
        AnimazioneUtil.aggiungiClickBottone(btn2_14, "2.739€", prezzoLabel14);

        //Prodotto MacBook Air 13
        AnimazioneUtil.aggiungiClickColore(circleCeleste13, "Celeste", "/it/uid/unitech/Images/macbook air 13 m5 celeste.png", coloreLabel13, immagineProdotto13);
        AnimazioneUtil.aggiungiClickColore(circleArgento13, "Argento", "/it/uid/unitech/Images/mackbook air 13 m5 argento.png", coloreLabel13, immagineProdotto13);
        AnimazioneUtil.aggiungiClickColore(circleGalassia13, "Galassia", "/it/uid/unitech/Images/macbook air 13 m5 galassia.png", coloreLabel13, immagineProdotto13);
        AnimazioneUtil.aggiungiClickColore(circleMezzanotte13, "Mezzanotte", "/it/uid/unitech/Images/macbook air 13 m5 mezzanotte.png", coloreLabel13, immagineProdotto13);
        AnimazioneUtil.aggiungiClickBottone(btn512_13, "1.449€", prezzoLabel13);
        AnimazioneUtil.aggiungiClickBottone(btn1_13, "1.762€", prezzoLabel13);


        //Prodotto MacBook Neo
        AnimazioneUtil.aggiungiClickColore(circleArgentoNeo, "Argento", "/it/uid/unitech/Images/macbook neo argento.png", coloreLabelNeo, immagineProdottoNeo);
        AnimazioneUtil.aggiungiClickColore(circleRosaNeo, "Rosa", "/it/uid/unitech/Images/macbook neo rosa pastello.png", coloreLabelNeo, immagineProdottoNeo);
        AnimazioneUtil.aggiungiClickColore(circleGialloNeo, "Giallo", "/it/uid/unitech/Images/macbook neo giallo agrume.png", coloreLabelNeo, immagineProdottoNeo);
        AnimazioneUtil.aggiungiClickColore(circleIndacoNeo, "Indaco", "/it/uid/unitech/Images/macbook neo indaco.png", coloreLabelNeo, immagineProdottoNeo);
        AnimazioneUtil.aggiungiClickBottone(btn256_Neo, "799€", prezzoLabelNeo);
        AnimazioneUtil.aggiungiClickBottone(btn512_Neo, "899€", prezzoLabelNeo);


    }
}