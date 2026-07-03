package Controller;

import Model.Utente;
import Model.UtenteDAO;
import Util.DatabaseConnection;
import Util.SessioneUtente;
import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.sql.SQLException;

public class LoginPageController {

    @FXML
    private Button loginButton;
    @FXML
    private Label signUp;
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label erroreLabel;

    public void initialize() {

        try {
            DatabaseConnection.inizializzaDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        erroreLabel.setVisible(false);
        loginButton.setOnMouseEntered(event -> {
            ScaleTransition scaleDown = new ScaleTransition(Duration.millis(150),loginButton);
            scaleDown.setToX(0.9);
            scaleDown.setToY(0.9);
            scaleDown.play();
        });

        loginButton.setOnMouseExited(event -> {
            ScaleTransition scaleUp = new ScaleTransition(Duration.millis(150),loginButton);
            scaleUp.setToX(1);
            scaleUp.setToY(1);
            scaleUp.play();
        });

        loginButton.setOnMouseClicked(event -> {
            String email    = emailField.getText().trim();
            String password = passwordField.getText().trim();
            erroreLabel.setVisible(false);

            if (email.isEmpty() || password.isEmpty()) {
                erroreLabel.setText("Compila tutti i campi!");
                erroreLabel.setVisible(true);
                return;
            }

            try {
                Utente u = UtenteDAO.login(email, password);
                if (u == null) {
                    erroreLabel.setText("Email o password errati!");
                    erroreLabel.setVisible(true);
                    return;
                }
                SessioneUtente.setUtente(u);
            } catch (SQLException e) {
                erroreLabel.setText("Errore di connessione al database.");
                erroreLabel.setVisible(true);
                e.printStackTrace();
                return;
            }

            // Arriva qui SOLO se il login è andato a buon fine
            Node root = loginButton.getScene().getRoot();
            FadeTransition fadeOut = new FadeTransition(Duration.millis(600), root);
            fadeOut.setFromValue(1);
            fadeOut.setToValue(0);
            fadeOut.setOnFinished(event1 -> {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Home.fxml"));
                    Parent newRoot = loader.load();
                    newRoot.setOpacity(0);
                    Stage stage = (Stage) loginButton.getScene().getWindow();
                    stage.setScene(new Scene(newRoot, stage.getWidth(), stage.getHeight()));
                    stage.setMaximized(true);
                    FadeTransition fadeIn = new FadeTransition(Duration.millis(600), newRoot);
                    fadeIn.setFromValue(0);
                    fadeIn.setToValue(1);
                    fadeIn.play();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            fadeOut.play();
        });

        signUp.setOnMouseEntered(event -> {
            ScaleTransition scaleDown= new ScaleTransition(Duration.millis(150),signUp);
            scaleDown.setToX(0.9);
            scaleDown.setToY(0.9);
            scaleDown.play();
        });
        signUp.setOnMouseExited(event -> {
            ScaleTransition scaleUp = new ScaleTransition(Duration.millis(150),signUp);
            scaleUp.setToX(1);
            scaleUp.setToY(1);
            scaleUp.play();
        });
        signUp.setOnMouseClicked(event -> {
            Node root=signUp.getScene().getRoot();
            FadeTransition fadeOut = new FadeTransition(Duration.millis(600),root);
            fadeOut.setFromValue(1);
            fadeOut.setToValue(0);
            fadeOut.setOnFinished((e) -> {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/SignUp.fxml"));
                    Parent newRoot=loader.load();
                    newRoot.setOpacity(0);
                    Stage stage= (Stage) signUp.getScene().getWindow();
                    stage.setScene(new Scene(newRoot,stage.getWidth(),stage.getHeight()));
                    stage.setMaximized(true);
                    FadeTransition fadeIn = new FadeTransition(Duration.millis(600),newRoot);
                    fadeIn.setFromValue(0);
                    fadeIn.setToValue(1);
                    fadeIn.play();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            });
            fadeOut.play();
        });
    }
}