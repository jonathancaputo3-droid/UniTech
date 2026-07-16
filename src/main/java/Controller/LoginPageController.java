package Controller;

import Model.Utente;
import Model.UtenteDAO;
import Util.DatabaseConnection;
import Util.SessioneUtente;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import  Util.AnimazioneUtil;
import javafx.scene.paint.Color;

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
    @FXML
    private Label passwordLost;


    public void initialize() {

        try {
            DatabaseConnection.inizializzaDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        erroreLabel.setVisible(false);

        AnimazioneUtil.aggiungiAnimazioneScale(loginButton);

        loginButton.setOnMouseClicked(event -> {
            String email    = emailField.getText().trim();
            String password = passwordField.getText().trim();

            if (email.isEmpty() || password.isEmpty()) {
                AnimazioneUtil.mostraErrore(erroreLabel,"Compila tutti i campi!", Color.RED);
                return;
            }

            try {
                Utente u = UtenteDAO.login(email, password);
                if (u == null) {
                    AnimazioneUtil.mostraErrore(erroreLabel,"Email o password errati!",Color.RED);
                    return;
                }
                SessioneUtente.setUtente(u);
                AnimazioneUtil.cambiaScena(loginButton,"/Fxml/Home.fxml");
            } catch (SQLException e) {
                AnimazioneUtil.mostraMessaggio(erroreLabel,"Errore di connessione al database.",Color.RED);
                e.printStackTrace();
            }
        });

        AnimazioneUtil.aggiungiAnimazioneScale(signUp);
        AnimazioneUtil.aggiungiAnimazione(passwordLost);

        signUp.setOnMouseClicked(event -> {
            AnimazioneUtil.cambiaScena(signUp,"/Fxml/SignUp.fxml");
        });

        passwordLost.setOnMouseClicked(event -> {
            AnimazioneUtil.cambiaScena(passwordLost,"/Fxml/PasswordUpdate.fxml");
        });
    }
}