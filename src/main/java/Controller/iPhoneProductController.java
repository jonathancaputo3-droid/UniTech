package Controller;

import Model.Carrello;
import Model.ElementoCarrello;
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

        selezionaColore(circleNero,"Nero","/it/uid/unitech/Images/IPhone 17 Black.png");
        selezionaMemoria(btn128,"999€");
        coloreLabel.setText("Nero");

        circleNero.setOnMouseClicked(event -> {
            selezionaColore(circleNero,"Nero","/it/uid/unitech/Images/IPhone 17 Black.png");
        });
        circleBianco.setOnMouseClicked(event -> {
            selezionaColore(circleBianco,"Bianco","/it/uid/unitech/Images/IPhone 17 Bianco.png");
        });
        circleVerde.setOnMouseClicked(event -> {
            selezionaColore(circleVerde,"Salvia","/it/uid/unitech/Images/iPhone 17 Verde.png");
        });
        circleBlu.setOnMouseClicked(event -> {
            selezionaColore(circleBlu,"Azzurro","/it/uid/unitech/Images/iPhone 17 Blu.png");
        });

        btn128.setOnMouseClicked(event -> {
            selezionaMemoria(btn128,"999€");
        });
        btn256.setOnMouseClicked(event -> {
            selezionaMemoria(btn256,"1099€");
        });
        btn512.setOnMouseClicked(event -> {
            selezionaMemoria(btn512,"1299€");
        });

        loginIcon.setOnMouseEntered(event -> {
            ScaleTransition scaleIn= new ScaleTransition(Duration.millis(150),loginIcon);
            scaleIn.setToX(0.9);
            scaleIn.setToY(0.9);
            scaleIn.play();
        });

        loginIcon.setOnMouseExited(event -> {
            ScaleTransition scaleOut = new ScaleTransition(Duration.millis(150),loginIcon);
            scaleOut.setToX(1);
            scaleOut.setToY(1);
            scaleOut.play();
        });

        loginIcon.setOnMouseClicked(event -> {
            Node root= loginIcon.getScene().getRoot();
            FadeTransition fadeOut = new FadeTransition(Duration.millis(600), root);
            fadeOut.setFromValue(1.0);
            fadeOut.setToValue(0.0);
            fadeOut.setOnFinished(event1 -> {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/ProfileOption.fxml"));
                    Parent newRoot = loader.load();
                    newRoot.setOpacity(0.0);
                    Stage stage = (Stage) loginIcon.getScene().getWindow();
                    stage.setScene(new Scene(newRoot,stage.getWidth(),stage.getHeight()));
                    stage.setMaximized(true);
                    FadeTransition fadeIn = new FadeTransition(Duration.millis(600), newRoot);
                    fadeIn.setFromValue(0.0);
                    fadeIn.setToValue(1.0);
                    fadeIn.play();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            });
            fadeOut.play();
        });

        logoIcon.setOnMouseEntered(event -> {
            ScaleTransition scaleIn= new ScaleTransition(Duration.millis(150),logoIcon);
            scaleIn.setToX(0.9);
            scaleIn.setToY(0.9);
            scaleIn.play();
        });

        logoIcon.setOnMouseExited(event -> {
            ScaleTransition scaleOut = new ScaleTransition(Duration.millis(150),logoIcon);
            scaleOut.setToX(1);
            scaleOut.setToY(1);
            scaleOut.play();
        });

        logoIcon.setOnMouseClicked(event -> {
            Node root= logoIcon.getScene().getRoot();
            FadeTransition fadeOut = new FadeTransition(Duration.millis(600), root);
            fadeOut.setFromValue(1.0);
            fadeOut.setToValue(0.0);
            fadeOut.setOnFinished(event1 -> {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Home.fxml"));
                    Parent newRoot = loader.load();
                    newRoot.setOpacity(0.0);
                    Stage stage = (Stage) logoIcon.getScene().getWindow();
                    stage.setScene(new Scene(newRoot,stage.getWidth(),stage.getHeight()));
                    stage.setMaximized(true);
                    FadeTransition fadeIn = new FadeTransition(Duration.millis(600), newRoot);
                    fadeIn.setFromValue(0.0);
                    fadeIn.setToValue(1.0);
                    fadeIn.play();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            });
            fadeOut.play();
        });



    }

    private Circle cerchioSelezionato;
    private Button memoriaSelezionata;

    private void selezionaColore(Circle cerchio, String nomeColore, String pathImmagine){
        if(cerchioSelezionato!=null && cerchioSelezionato!=circleBianco){
            cerchioSelezionato.setStroke(null);
            cerchioSelezionato.setStrokeWidth(0);
        }
        if (cerchioSelezionato==circleBianco){
            cerchioSelezionato.setStroke(javafx.scene.paint.Color.web("#cccccc"));
            cerchioSelezionato.setStrokeWidth(2);
        }
        cerchio.setStroke(javafx.scene.paint.Color.web("#3A7BD5"));
        cerchio.setStrokeWidth(3);
        cerchioSelezionato=cerchio;
        coloreLabel.setText(nomeColore);

        FadeTransition fadeOut = new FadeTransition(Duration.millis(150), immagineProdotto);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);
        fadeOut.setOnFinished(e -> {
            immagineProdotto.setImage(new Image(getClass().getResourceAsStream(pathImmagine)));
            FadeTransition fadeIn= new FadeTransition(Duration.millis(150), immagineProdotto);
            fadeIn.setFromValue(0.0);
            fadeIn.setToValue(1.0);
            fadeIn.play();
        });
        fadeOut.play();
    }

    private void selezionaMemoria(Button bottone,String prezzo){
        if(memoriaSelezionata!=null){
            memoriaSelezionata.setStyle("");
            memoriaSelezionata.getStyleClass().remove("memory-btn-selected");
        }
        bottone.setStyle("-fx-background-color: #EEF2FB; -fx-border-color: #3A7BD5; -fx-border-width: 2; -fx-text-fill: #3A7BD5;");
        memoriaSelezionata=bottone;
        prezzoLabel.setText(prezzo);
    }


}