package Util;
import javafx.animation.*;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
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
}
