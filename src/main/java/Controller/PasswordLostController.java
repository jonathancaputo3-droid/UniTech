package Controller;

import Model.UtenteDAO;
import Util.AnimazioneUtil;
import Util.DatabaseConnection;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.sql.SQLException;

public class PasswordLostController {

    @FXML
    private Label tornaLogin;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Button resettaPassword;
    @FXML
    private Label erroreEmail;

    private static final String PASSWORD = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[#@!.&%$])[a-zA-Z0-9#@!.&%$]{8,}$";

    public void initialize(){

        try {
            DatabaseConnection.inizializzaDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        AnimazioneUtil.aggiungiAnimazione(tornaLogin);
        tornaLogin.setOnMouseClicked(event -> {
            AnimazioneUtil.cambiaScena(tornaLogin,"/Fxml/Login.fxml");
        });

        AnimazioneUtil.aggiungiAnimazione(resettaPassword);

        emailTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            try {
                if(!newValue.isEmpty() && !UtenteDAO.emailEsistente(newValue)){
                    erroreEmail.setVisible(true);
                    passwordTextField.setEditable(false);
                }else{
                    erroreEmail.setVisible(false);
                    passwordTextField.setEditable(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        passwordTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue.isEmpty() && !newValue.matches(PASSWORD)){
                erroreEmail.setVisible(true);
                erroreEmail.setText("Usa: #@!.&%$ 8 caratteri Una lettera");
            }else{
                erroreEmail.setVisible(false);
            }
        });

        resettaPassword.setOnMouseClicked(event -> {
            if(!emailTextField.getText().trim().isEmpty() && !passwordTextField.getText().trim().isEmpty() && !erroreEmail.isVisible()){
                erroreEmail.setVisible(false);
                try{
                    if(UtenteDAO.cambiaPassword(emailTextField.getText().trim(),passwordTextField.getText().trim())){
                        AnimazioneUtil.cambiaScena(resettaPassword,"/Fxml/Login.fxml");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                erroreEmail.setText("Correggi i Campi!");
                erroreEmail.setVisible(true);
            }
        });

    }
}
