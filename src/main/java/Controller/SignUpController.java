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

import java.io.IOException;
import java.sql.SQLException;

public class SignUpController {

    @FXML
    private TextField nomeField;
    @FXML
    private Label nomeErrorLabel;
    @FXML
    private Label cognomeErrorLabel;
    @FXML
    private TextField cognomeField;
    @FXML
    private TextField emailField;
    @FXML
    private Label emailErrorLabel;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label passwordErrorLabel;
    @FXML
    private Button confermaButton;
    @FXML
    private Label confermaErrorLabelEmpty;
    @FXML
    private Label accediQui;


    private static final String ESTENSIONE_EMAIL="^[\\w.+\\-]+@[\\w\\-]+(\\.[\\w\\-]+)*\\.[a-zA-Z]{2,}$";
    private static final String SOLO_LETTERE="^[a-zA-Z]+$";
    private static final String PASSWORD = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[#@!.&%$])[a-zA-Z0-9#@!.&%$]{8,}$";

    public void initialize(){

        try {
            DatabaseConnection.inizializzaDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        nomeErrorLabel.setVisible(false);
        nomeField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.isEmpty()){
                nomeErrorLabel.setVisible(false);
            }else if (!newValue.matches(SOLO_LETTERE)){
                nomeErrorLabel.setVisible(true);
            }else{
                nomeErrorLabel.setVisible(false);
            }
        });
        cognomeErrorLabel.setVisible(false);
        cognomeField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.isEmpty()){
                cognomeErrorLabel.setVisible(false);
            }else if (!newValue.matches(SOLO_LETTERE)){
                cognomeErrorLabel.setVisible(true);
            }else{
                cognomeErrorLabel.setVisible(false);
            }
        });
        emailErrorLabel.setVisible(false);
        emailField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.isEmpty()){
                emailErrorLabel.setVisible(false);
            }else if (!newValue.matches(ESTENSIONE_EMAIL)){
                emailErrorLabel.setVisible(true);
            }else{
                emailErrorLabel.setVisible(false);
            }
        });
        passwordErrorLabel.setVisible(false);
        passwordField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.isEmpty()){
                passwordErrorLabel.setVisible(false);
            }else if (newValue.length()<8){
                passwordErrorLabel.setVisible(true);
            }else if (!newValue.matches(PASSWORD)) {
                passwordErrorLabel.setVisible(true);
            }else{
                passwordErrorLabel.setVisible(false);
            }
        });
        confermaButton.setOnMouseEntered(event -> {
            ScaleTransition scaleIn= new ScaleTransition(Duration.millis(150), confermaButton);
            scaleIn.setToX(0.9);
            scaleIn.setToY(0.9);
            scaleIn.play();
        });
        confermaButton.setOnMouseExited(event -> {
            ScaleTransition scaleout = new ScaleTransition(Duration.millis(150), confermaButton);
            scaleout.setToX(1);
            scaleout.setToY(1);
            scaleout.play();
        });
        confermaErrorLabelEmpty.setVisible(false);
        confermaButton.setOnMouseClicked(event -> {
            if (nomeField.getText().isEmpty() || cognomeField.getText().isEmpty() || emailField.getText().isEmpty() || passwordField.getText().isEmpty()){
                confermaErrorLabelEmpty.setVisible(true);
            }else if(nomeErrorLabel.isVisible() ||  cognomeErrorLabel.isVisible() ||  emailErrorLabel.isVisible() || passwordErrorLabel.isVisible()){
                confermaErrorLabelEmpty.setText("Correggi i campi Errati!");
                confermaErrorLabelEmpty.setVisible(true);
            }
            else{
                confermaErrorLabelEmpty.setVisible(false);
                try {
                    Utente u = new Utente(
                            nomeField.getText().trim(),
                            cognomeField.getText().trim(),
                            emailField.getText().trim(),
                            passwordField.getText()
                    );
                    boolean successo = UtenteDAO.registra(u);

                    if (!successo) {
                        confermaErrorLabelEmpty.setText("Errore durante la registrazione.");
                        confermaErrorLabelEmpty.setVisible(true);
                        return;
                    }
                    SessioneUtente.setUtente(u);
                } catch (SQLException e) {
                    if (e.getMessage().contains("UNIQUE")) {
                        confermaErrorLabelEmpty.setText("Email già registrata!");
                    } else {
                        confermaErrorLabelEmpty.setText("Errore durante la registrazione.");
                        e.printStackTrace();
                    }
                    confermaErrorLabelEmpty.setVisible(true);
                    return;
                }
                Node root=confermaButton.getScene().getRoot();
                FadeTransition fadeOut= new FadeTransition(Duration.millis(600), root);
                fadeOut.setFromValue(1.0);
                fadeOut.setToValue(0.0);
                fadeOut.setOnFinished(event1 -> {
                    try{
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Home.fxml"));
                        Parent newRoot= loader.load();
                        newRoot.setOpacity(0.0);
                        Stage stage=(Stage) confermaButton.getScene().getWindow();
                        stage.setScene(new Scene(newRoot,stage.getWidth(),stage.getHeight()));
                        stage.setMaximized(true);
                        FadeTransition fadeIn = new FadeTransition(Duration.millis(600), newRoot);
                        fadeIn.setFromValue(0);
                        fadeIn.setToValue(1);
                        fadeIn.play();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });
                fadeOut.play();
            }
        });
        accediQui.setOnMouseEntered(event -> {
            ScaleTransition scaleIn= new ScaleTransition(Duration.millis(150), accediQui);
            scaleIn.setToX(0.9);
            scaleIn.setToY(0.9);
            scaleIn.play();
        });
        accediQui.setOnMouseExited(event -> {
            ScaleTransition scaleout = new ScaleTransition(Duration.millis(150), accediQui);
            scaleout.setToX(1);
            scaleout.setToY(1);
            scaleout.play();
        });
        accediQui.setOnMouseClicked(event -> {
            Node root= accediQui.getScene().getRoot();
            FadeTransition fadeOut= new FadeTransition(Duration.millis(600), root);
            fadeOut.setFromValue(1);
            fadeOut.setToValue(0);
            fadeOut.setOnFinished(event1 -> {
                try{
                    FXMLLoader loader= new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
                    Parent newRoot=loader.load();
                    newRoot.setOpacity(0);
                    Stage stage=(Stage) accediQui.getScene().getWindow();
                    stage.setScene(new Scene(newRoot,stage.getWidth(),stage.getHeight()));
                    stage.setMaximized(true);
                    FadeTransition fadeIn = new FadeTransition(Duration.millis(600),newRoot);
                    fadeIn.setFromValue(0);
                    fadeIn.setToValue(1);
                    fadeIn.play();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            fadeOut.play();
        });

    }
}
