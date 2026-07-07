package Controller;

import Model.Utente;
import Model.UtenteDAO;
import Util.AnimazioneUtil;
import Util.DatabaseConnection;
import Util.SessioneUtente;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
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
                try{
                    if (UtenteDAO.emailEsistente((newValue))) {
                        AnimazioneUtil.mostraErrore(emailErrorLabel,"Email già registrata! Accedi!", Color.RED);
                    }else{
                        emailErrorLabel.setVisible(false);
                    }
                }catch (SQLException e){
                    e.printStackTrace();
                }
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

        AnimazioneUtil.aggiungiAnimazioneScale(confermaButton);

        confermaErrorLabelEmpty.setVisible(false);

        confermaButton.setOnMouseClicked(event -> {
            if (nomeField.getText().isEmpty() || cognomeField.getText().isEmpty() || emailField.getText().isEmpty() || passwordField.getText().isEmpty()){
                confermaErrorLabelEmpty.setVisible(true);
            }else if(nomeErrorLabel.isVisible() ||  cognomeErrorLabel.isVisible() ||  emailErrorLabel.isVisible() || passwordErrorLabel.isVisible()){
                AnimazioneUtil.mostraErrore(confermaErrorLabelEmpty,"Correggi i campi Errati!",Color.RED);
            }
            else {
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
                        AnimazioneUtil.mostraErrore(confermaErrorLabelEmpty,"Errore durante la registrazione.",Color.RED);
                        return;
                    }
                    AnimazioneUtil.cambiaScena(confermaButton,"/Fxml/Home.fxml");
                    SessioneUtente.setUtente(u);
                } catch (SQLException e) {
                    if (e.getMessage().contains("UNIQUE")) {
                        confermaErrorLabelEmpty.setText("Email già registrata!");
                    } else {
                        confermaErrorLabelEmpty.setText("Errore durante la registrazione.");
                        e.printStackTrace();
                    }
                    confermaErrorLabelEmpty.setVisible(true);
                }
            }
        });

        AnimazioneUtil.aggiungiAnimazioneScale(accediQui);

        accediQui.setOnMouseClicked(event -> {
            AnimazioneUtil.cambiaScena(accediQui, "/Fxml/Login.fxml");
        });
    }
}
