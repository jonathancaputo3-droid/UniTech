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
    //DATI iPnone 17
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

    //DATI iPnone 17 Pro

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

    //DATI iPnone 17 Air
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

    public void initialize()
    {
    //Prodotto iPhone 17
        AnimazioneUtil.aggiungiClickColore(circleNero17, "Nero", "/it/uid/unitech/Images/iPhone 17 Nero.png", coloreLabel17, immagineProdotto17);
        AnimazioneUtil.aggiungiClickColore(circleBlu17, "Blu", "/it/uid/unitech/Images/iPhone 17 Azzurro.png", coloreLabel17, immagineProdotto17);
        AnimazioneUtil.aggiungiClickColore(circleBianco17, "Bianco", "/it/uid/unitech/Images/iPhone 17 Bianco.png", coloreLabel17, immagineProdotto17);
        AnimazioneUtil.aggiungiClickColore(circleVerde17, "Verde", "/it/uid/unitech/Images/iPhone 17 Verde.png", coloreLabel17, immagineProdotto17);
        AnimazioneUtil.aggiungiClickColore(circleRosa17, "Rosa", "/it/uid/unitech/Images/iPhone 17 Rosa.png", coloreLabel17, immagineProdotto17);
        AnimazioneUtil.aggiungiClickBottone(btn128_17, "939€", prezzoLabel17);
        AnimazioneUtil.aggiungiClickBottone(btn256_17, "1.039€", prezzoLabel17);
        AnimazioneUtil.aggiungiClickBottone(btn512_17, "1.239€", prezzoLabel17);

    //Prodotto iPhone 17 Pro
        AnimazioneUtil.aggiungiClickColore(circleArancione17Pro, "Arancione", "/it/uid/unitech/Images/iPhone 17 Pro Arancione.png", coloreLabel17Pro, immagineProdotto17Pro);
        AnimazioneUtil.aggiungiClickColore(circleBianco17Pro, "Bianco", "/it/uid/unitech/Images/iPhone 17 Pro Bianco.png", coloreLabel17Pro, immagineProdotto17Pro);
        AnimazioneUtil.aggiungiClickColore(circleBlu17Pro, "Blu", "/it/uid/unitech/Images/iPhone 17 Pro Blu.png", coloreLabel17Pro, immagineProdotto17Pro);
        AnimazioneUtil.aggiungiClickBottone(btn256_17Pro, "1.339€", prezzoLabel17Pro);
        AnimazioneUtil.aggiungiClickBottone(btn512_17Pro, "1.539€", prezzoLabel17Pro);
        AnimazioneUtil.aggiungiClickBottone(btn1TB_17Pro, "1.839€", prezzoLabel17Pro);

    //Prodotto iPhone Air
        AnimazioneUtil.aggiungiClickColore(circleNeroAir, "Nero", "/it/uid/unitech/Images/iPhone Air Nero.png", coloreLabelAir, immagineProdottoAir);
        AnimazioneUtil.aggiungiClickColore(circleBiancoAir, "Bianco", "/it/uid/unitech/Images/iPhone Air Bianco.png", coloreLabelAir, immagineProdottoAir);
        AnimazioneUtil.aggiungiClickColore(circleCelesteAir, "Celeste", "/it/uid/unitech/Images/iPhone Air Celeste.png", coloreLabelAir, immagineProdottoAir);
        AnimazioneUtil.aggiungiClickColore(circleOroAir, "Oro", "/it/uid/unitech/Images/iPhone Air Oro.png", coloreLabelAir, immagineProdottoAir);
        AnimazioneUtil.aggiungiClickBottone(btn256Air, "1.219€", prezzoLabelAir);
        AnimazioneUtil.aggiungiClickBottone(btn512Air, "1.419€", prezzoLabelAir);  
        AnimazioneUtil.aggiungiClickBottone(btn1TBAir, "1.619€", prezzoLabelAir);

    }
}