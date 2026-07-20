package Controller;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Region;
import javafx.scene.layout.Priority;

import Model.Carrello;
import Model.ElementoCarrello;
import Util.NavigationManager;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.kordamp.ikonli.javafx.FontIcon;

public class CarrelloController {

    @FXML
    private VBox boxProdotti;

    @FXML
    private Label lblCarrelloVuoto;

    @FXML
    private Label lblTotale;

    @FXML
    private Button btnCheckout;

    @FXML
    public void initialize() {
        aggiornaCarrello();
    }

    public void aggiornaCarrello() {

        var prodotti = Carrello.getIstanza().getProdotti();

        boxProdotti.getChildren().clear();


        if (prodotti.isEmpty()) {
            lblCarrelloVuoto.setVisible(true);
            lblCarrelloVuoto.setManaged(true);
            lblTotale.setText("€ 0.00");
            btnCheckout.setVisible(false);
            btnCheckout.setManaged(false);
            return;
        }

        lblCarrelloVuoto.setVisible(false);
        lblCarrelloVuoto.setManaged(false);
        btnCheckout.setVisible(true);
        btnCheckout.setManaged(true);

        for (ElementoCarrello p : prodotti) {



            HBox card = new HBox(15);
            card.setStyle("-fx-background-color: white; -fx-padding: 10;");

            ImageView img = new ImageView(p.getImmagine());
            img.setFitWidth(70);
            img.setFitHeight(70);
            img.setPreserveRatio(true);

            VBox info = new VBox(5);

            Label nome = new Label(p.getNome());
            Label prezzo = new Label("Prezzo: € " + p.getPrezzo());
            Label quantita = new Label("Quantità: " + p.getQuantita());
            Label caratteristiche = new Label(p.getCaratteristiche());
            Label totale = new Label("Totale: € " + p.getTotale());

            // 🔥 BOTTONI QUI
            Button btnMinus = new Button("-");
            Button btnPlus = new Button("+");


            FontIcon btnDelete = new FontIcon("fas-times");
            btnDelete.setIconSize(18);
            btnDelete.setIconColor(javafx.scene.paint.Color.RED);
            btnDelete.setCursor(javafx.scene.Cursor.HAND);

            btnMinus.setOnAction(e -> {
                Carrello.getIstanza().diminuisciProdotto(p);
                aggiornaCarrello();
            });

            btnPlus.setOnAction(e -> {
                p.aumentaQuantita();
                aggiornaCarrello();
            });


            btnDelete.setOnMouseClicked(e -> {

                Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.setResizable(false);

                Label title = new Label("Rimuovere prodotto?");
                title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

                Label msg = new Label("Sei sicuro di voler eliminare questo articolo dal carrello?");
                msg.setStyle("-fx-font-size: 14px; -fx-text-fill: #555;");


                Button si = new Button("Sì, elimina");
                Button no = new Button("Annulla");

                si.setStyle("""
        -fx-background-color: #ff3b30;
        -fx-text-fill: white;
        -fx-background-radius: 8;
        -fx-padding: 8 16;
    """);

                no.setStyle("""
        -fx-background-color: #e0e0e0;
        -fx-text-fill: black;
        -fx-background-radius: 8;
        -fx-padding: 8 16;
    """);

                si.setOnAction(ev -> {
                    Carrello.getIstanza().rimuoviProdotto(p);
                    aggiornaCarrello();
                    dialog.close();
                });

                no.setOnAction(ev -> dialog.close());

                HBox buttons = new HBox(10, si, no);
                buttons.setStyle("-fx-alignment: center;");

                VBox root = new VBox(15, title, msg, buttons);
                root.setStyle("""
        -fx-padding: 20;
        -fx-background-color: white;
        -fx-alignment: center;
        -fx-background-radius: 12;
    """);

                Scene scene = new Scene(root, 320, 160);
                dialog.setScene(scene);
                dialog.showAndWait();
            });



            HBox controls = new HBox(10, btnMinus, btnPlus);

            info.getChildren().addAll(nome, prezzo, quantita, totale, controls, caratteristiche);

            Region spacer = new Region();
            HBox.setHgrow(spacer, Priority.ALWAYS);

            HBox leftSide = new HBox(15, img, info);

            card.getChildren().addAll(leftSide, spacer, btnDelete);

            boxProdotti.getChildren().add(card);
        }
        lblTotale.setText("€ " + String.format("%.2f", Carrello.getIstanza().getTotale()));
    }


    @FXML
    private void esciDalCarrello() {

        Parent previousRoot = Util.Navigation.getPreviousRoot();

        if (previousRoot != null) {

            Scene scene = boxProdotti.getScene();
            Node currentRoot = scene.getRoot();

            // 🔥 FADE OUT del carrello (come fa HomeController con l'home)
            FadeTransition fadeOut = new FadeTransition(Duration.millis(600), currentRoot);
            fadeOut.setFromValue(1.0);
            fadeOut.setToValue(0.0);

            fadeOut.setOnFinished(event -> {

                previousRoot.setOpacity(0.0);
                scene.setRoot(previousRoot); // stesso Stage, niente flicker

                // 🔥 FADE IN della pagina precedente
                FadeTransition fadeIn = new FadeTransition(Duration.millis(600), previousRoot);
                fadeIn.setFromValue(0.0);
                fadeIn.setToValue(1.0);
                fadeIn.play();
            });

            fadeOut.play();
        }
    }

    @FXML
    private void vaiAlCheckout(javafx.event.ActionEvent event) {
        NavigationManager.apriCheckout((Node) event.getSource());
    }


}