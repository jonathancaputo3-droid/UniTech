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

    public static void mostraErrore(Label label, String testo, Color colore){
        label.setText(testo);
        label.setTextFill(colore);
        label.setVisible(true);
    }

    private static Circle cerchioSelezionato;
    private static Button varianteSelezionata;

    public static void selezionaColore(Circle cerchio, String nomeColore, String pathImmagine, Label coloreLabel, ImageView immagineProdotto){
        if(cerchioSelezionato!=null){
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
        cerchioSelezionato=cerchio;
        coloreLabel.setText(nomeColore);

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

    public static void selezionaVariante(Button bottone, String prezzo, Label prezzoLabel){
        if(varianteSelezionata!=null){
            varianteSelezionata.setStyle("");
            varianteSelezionata.getStyleClass().remove("memory-btn-selected");
        }
        bottone.setStyle("-fx-background-color: #EEF2FB; -fx-border-color: #3A7BD5; -fx-border-width: 2; -fx-text-fill: #3A7BD5;");
        varianteSelezionata=bottone;
        prezzoLabel.setText(prezzo);
    }

    public static void aggiungiClickColore(Circle cerchio, String nome, String immagine, Label label, ImageView imageView){
        if(cerchio != null){
            cerchio.setOnMouseClicked(e ->
                    selezionaColore(cerchio,nome,immagine,label,imageView)
            );
        }
    }

    public static void aggiungiClickBottone(Button bottone, String prezzo, Label label) {
        if (bottone != null) {
            bottone.setOnMouseClicked(event -> {
                selezionaVariante(bottone, prezzo, label);
            });
        }
    }

    public static void aggiungiAnimazione(Node nodo){
        if(nodo != null){
            aggiungiAnimazioneScale(nodo);
        }
    }
    public static void verificaCambiaScena(Node nodo,String path){
        if(nodo != null){
            nodo.setOnMouseClicked(event -> {
                cambiaScena(nodo,path);
            });
        }
    }
    public static void verificaCambiaScenaItem(MenuItem item,String path){
        if(item != null){
            item.setOnAction(event -> {
                cambiaScenaItem(item,path);
            });
        }
    }

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
