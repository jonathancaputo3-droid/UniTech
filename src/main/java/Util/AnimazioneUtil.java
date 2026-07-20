package Util;
import javafx.animation.*;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimazioneUtil {

    //Metodo per aggiungere la ScaleTransition agli elementi
    public static void aggiungiAnimazioneScale(Node nodo){
        nodo.setOnMouseEntered(event -> {
            ScaleTransition scaleIn = new ScaleTransition(Duration.millis(150), nodo);
            scaleIn.setToX(0.9);
            scaleIn.setToY(0.9);
            scaleIn.play();
        });
        nodo.setOnMouseExited(event -> {
            ScaleTransition scaleOut = new ScaleTransition(Duration.millis(150), nodo);
            scaleOut.setToX(1);
            scaleOut.setToY(1);
            scaleOut.play();
        });
    }

    //Metodo per mostrare il messaggio di aggiornamento dei dati profilo
    public static void mostraMessaggio(Label label, String testo, Color colore){
        label.setText(testo);
        label.setBackground(new Background(new BackgroundFill(colore,new CornerRadii(10), Insets.EMPTY)));
        label.setOpacity(0);
        label.setVisible(true);

        FadeTransition fadeIn = new FadeTransition(Duration.millis(300), label);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);
        fadeIn.play();

        FadeTransition fadeOut = new FadeTransition(Duration.millis(300), label);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);
        fadeOut.setDelay(Duration.millis(2000));
        fadeOut.setOnFinished(e -> label.setVisible(false));
        fadeOut.play();
    }

    //Metodo per cambiare scena con effetto FadeTransition
    public static void cambiaScena(Node nodo,String fxmlPath){
        Node root=nodo.getScene().getRoot();
        FadeTransition fadeOut = new FadeTransition(Duration.millis(600), root);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);
        fadeOut.setOnFinished(e -> {
            try {
                FXMLLoader loader = new FXMLLoader(AnimazioneUtil.class.getResource(fxmlPath));
                Parent newRoot = loader.load();
                newRoot.setOpacity(0.0);
                Stage stage = (Stage) nodo.getScene().getWindow();
                stage.setScene(new Scene(newRoot, stage.getWidth(), stage.getHeight()));
                stage.setMaximized(true);
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

    //Metodo per aprire il messaggio popUp
    public static void apriOverlay(Node overlay) {
        overlay.setVisible(true);
        overlay.setOpacity(0.0);
        overlay.setTranslateY(-200);
        TranslateTransition slide = new TranslateTransition(Duration.millis(400), overlay);
        slide.setFromY(-200); slide.setToY(0);
        slide.setInterpolator(Interpolator.EASE_OUT);
        FadeTransition fade = new FadeTransition(Duration.millis(400), overlay);
        fade.setFromValue(0.0); fade.setToValue(1.0);
        new ParallelTransition(fade, slide).play();
    }

    //Metodo per chiudere il messaggio popUp
    public static void chiudiOverlay(Node overlay) {
        TranslateTransition slide = new TranslateTransition(Duration.millis(300), overlay);
        slide.setFromY(0); slide.setToY(-200);
        slide.setInterpolator(Interpolator.EASE_IN);
        FadeTransition fade = new FadeTransition(Duration.millis(300), overlay);
        fade.setFromValue(1.0); fade.setToValue(0.0);
        ParallelTransition chiudi = new ParallelTransition(slide, fade);
        chiudi.setOnFinished(e -> overlay.setVisible(false));
        chiudi.play();
    }

    //Metodo per mostrare i messaggi di errore
    public static void mostraErrore(Label label, String testo, Color colore){
        label.setText(testo);
        label.setTextFill(colore);
        label.setVisible(true);
    }

    private static Circle getSelectedCircleScope(Node scope) {
        if (scope == null) {
            return null;
        }
        Object selected = scope.getProperties().get("selectedColorCircle");
        return selected instanceof Circle ? (Circle) selected : null;
    }

    private static void setSelectedCircleScope(Node scope, Circle cerchio) {
        if (scope != null) {
            scope.getProperties().put("selectedColorCircle", cerchio);
        }
    }

    private static Button getSelectedVariantScope(Node scope) {
        if (scope == null) {
            return null;
        }
        Object selected = scope.getProperties().get("selectedVariantButton");
        return selected instanceof Button ? (Button) selected : null;
    }

    private static void setSelectedVariantScope(Node scope, Button bottone) {
        if (scope != null) {
            scope.getProperties().put("selectedVariantButton", bottone);
        }
    }

    //Metodo per selezionare i cerchi dei colori prodotti e cambio immagine
    public static void selezionaColore(Circle cerchio, String nomeColore, String pathImmagine, Label coloreLabel, ImageView immagineProdotto){
        Node scope = cerchio.getParent() != null ? cerchio.getParent() : cerchio.getScene() != null ? cerchio.getScene().getRoot() : null;
        Circle cerchioSelezionato = getSelectedCircleScope(scope);
        if(cerchioSelezionato!=null && cerchioSelezionato != cerchio){
            if (Color.WHITE.equals(cerchioSelezionato.getFill())){
                cerchioSelezionato.setStroke(javafx.scene.paint.Color.web("#cccccc"));
                cerchioSelezionato.setStrokeWidth(2);
            }else{
                cerchioSelezionato.setStroke(null);
                cerchioSelezionato.setStrokeWidth(0);
            }
        }

        cerchio.setStroke(javafx.scene.paint.Color.web("#3A7BD5"));
        cerchio.setStrokeWidth(3);
        setSelectedCircleScope(scope, cerchio);
        if (coloreLabel != null) {
            coloreLabel.setText("Colore: " + nomeColore);
        }

        if (immagineProdotto == null) {
            return;
        }

        FadeTransition fadeOut = new FadeTransition(Duration.millis(150), immagineProdotto);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);
        fadeOut.setOnFinished(e -> {
            immagineProdotto.setImage(new Image(AnimazioneUtil.class.getResourceAsStream(pathImmagine)));
            FadeTransition fadeIn= new FadeTransition(Duration.millis(150), immagineProdotto);
            fadeIn.setFromValue(0.0);
            fadeIn.setToValue(1.0);
            fadeIn.play();
        });
        fadeOut.play();
    }

    //Metodo per selezionare le variante del prodotto con cambio prezzo
    public static void selezionaVariante(Button bottone, String prezzo, Label prezzoLabel){
        Node scope = bottone.getParent() != null ? bottone.getParent() : bottone.getScene() != null ? bottone.getScene().getRoot() : null;
        Button varianteSelezionata = getSelectedVariantScope(scope);
        if(varianteSelezionata!=null && varianteSelezionata != bottone){
            varianteSelezionata.setStyle("");
            varianteSelezionata.getStyleClass().remove("memory-btn-selected");
        }
        bottone.setStyle("-fx-background-color: #EEF2FB; -fx-border-color: #3A7BD5; -fx-border-width: 2; -fx-text-fill: #3A7BD5;");
        setSelectedVariantScope(scope, bottone);
        if (prezzoLabel != null) {
            prezzoLabel.setText(prezzo);
        }
    }

    //Metodo per evitare cerchi colori null
    public static void aggiungiClickColore(Circle cerchio, String nome, String immagine, Label label, ImageView imageView){
        if(cerchio != null){
            cerchio.setOnMouseClicked(e ->
                    selezionaColore(cerchio,nome,immagine,label,imageView)
            );
        }
    }

    //Metodo per evitare bottoni null
    public static void aggiungiClickBottone(Button bottone, String prezzo, Label label) {
        if (bottone != null) {
            bottone.setOnMouseClicked(event -> {
                selezionaVariante(bottone, prezzo, label);
            });
        }
    }

    //Metodo per evitare nodi null
    public static void aggiungiAnimazione(Node nodo){
        if(nodo != null){
            aggiungiAnimazioneScale(nodo);
        }
    }

    //Metodo per evitare cambio scena con nodi null
    public static void verificaCambiaScena(Node nodo,String path){
        if(nodo != null){
            nodo.setOnMouseClicked(event -> {
                cambiaScena(nodo,path);
            });
        }
    }

    //Metodo per evitare cambio scena con item null
    public static void verificaCambiaScenaItem(MenuItem item,String path){
        if(item != null){
            item.setOnAction(event -> {
                cambiaScenaItem(item,path);
            });
        }
    }

    //Metodo per i cambio scena con item del MenuBar
    public static void cambiaScenaItem(MenuItem item,String path){
        Stage stage=(Stage) item.getParentPopup().getOwnerWindow();
        Node root=stage.getScene().getRoot();
        FadeTransition fadeOut = new FadeTransition(Duration.millis(600), root);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);
        fadeOut.setOnFinished(e -> {
            try {
                FXMLLoader loader = new FXMLLoader(AnimazioneUtil.class.getResource(path));
                Parent newRoot = loader.load();
                newRoot.setOpacity(0);
                stage.setScene(new Scene(newRoot,stage.getWidth(),stage.getHeight()));
                stage.setMaximized(true);
                FadeTransition fadeIn = new FadeTransition(Duration.millis(600), newRoot);
                fadeIn.setFromValue(0);
                fadeIn.setToValue(1);
                fadeIn.play();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        fadeOut.play();
    }
}
