package Controller;

import Model.Utente;
import Model.UtenteDAO;
import Util.SessioneUtente;
import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.sql.SQLException;

public class ProfileController {

    @FXML
    private TextField nomeTextField;
    @FXML
    private TextField cognomeTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private Label nomeLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label cognomeLabel;
    @FXML
    private TextField sessoTextField;
    @FXML
    private TextField linguaTextField;
    @FXML
    private TextField datanascitaTextField;
    @FXML
    private TextField indirizzoTextField;
    @FXML
    private TextField cellulareTextField;
    @FXML
    private TextField cittaTextField;
    @FXML
    private Button modificaDettagli;
    @FXML
    private Button inviaBottone;
    @FXML
    private Label messaggioSuccesso;
    @FXML
    private Label nomeError;
    @FXML
    private Label cognomeError;
    @FXML
    private Label linguaError;
    @FXML
    private Label sessoError;
    @FXML
    private Label dataError;
    @FXML
    private Label cellulareError;
    @FXML
    private Label cittaError;
    @FXML
    private Label indirizzoError;
    @FXML
    private Label emailError;

    private static final String SOLO_LETTERE="^[a-zA-ZÀ-ù\\s]+$";
    private  static final String LETTERE_NUMERI="^[a-zA-ZÀ-ù0-9\\s]+$";
    private static final String ESTENSIONE_EMAIL = "^[\\w.+\\-]+@[\\w\\-]+(\\.[\\w\\-]+)*\\.[a-zA-Z]{2,}$";
    private static final String SOLO_NUMERI = "^[0-9]+$";
    private static final String DATA_NASCITA = "^\\d{2}/\\d{2}/\\d{4}$";
    private static final String SESSO = "^[MF]$";

    public void initialize() {
        Utente u = SessioneUtente.getUtente();
        inviaBottone.setVisible(false);

        nomeTextField.textProperty().addListener((obs,old,newVal)->{
            nomeError.setVisible(newVal.isEmpty() || !newVal.matches(SOLO_LETTERE));
        });
        cognomeTextField.textProperty().addListener((obs,old,newVal)->{
            cognomeError.setVisible(newVal.isEmpty() || !newVal.matches(SOLO_LETTERE));
        });
        linguaTextField.textProperty().addListener((obs, old, newVal) -> {
            linguaError.setVisible(!newVal.isEmpty() && !newVal.matches(SOLO_LETTERE));
        });
        cittaTextField.textProperty().addListener((obs, old, newVal) -> {
            cittaError.setVisible(!newVal.isEmpty() && !newVal.matches(SOLO_LETTERE));
        });
        emailTextField.textProperty().addListener((obs, old, newVal) -> {
            emailError.setVisible(newVal.isEmpty() || !newVal.matches(ESTENSIONE_EMAIL));
        });
        cellulareTextField.textProperty().addListener((obs, old, newVal) -> {
            cellulareError.setVisible(!newVal.isEmpty() && !newVal.matches(SOLO_NUMERI));
        });
        datanascitaTextField.textProperty().addListener((obs, old, newVal) -> {
            dataError.setVisible(!newVal.isEmpty() && !newVal.matches(DATA_NASCITA));
        });
        sessoTextField.textProperty().addListener((obs, old, newVal) -> {
            sessoError.setVisible(!newVal.isEmpty() && !newVal.matches(SESSO));
        });
        indirizzoTextField.textProperty().addListener((obs, old, newVal) -> {
            indirizzoError.setVisible(!newVal.isEmpty() && !newVal.matches(LETTERE_NUMERI));
        });


        if (u != null) {
            nomeTextField.setText(u.getNome());
            cognomeTextField.setText(u.getCognome());
            emailTextField.setText(u.getEmail());
            nomeLabel.setText(u.getNome());
            emailLabel.setText(u.getEmail());
            cognomeLabel.setText(u.getCognome());

            if(u.getSesso()!=null){ sessoTextField.setText(u.getSesso());}
            if (u.getLingua() != null){linguaTextField.setText(u.getLingua());}
            if (u.getDataNascita() != null) datanascitaTextField.setText(u.getDataNascita());
            if (u.getIndirizzo() != null) {indirizzoTextField.setText(u.getIndirizzo());}
            if (u.getCellulare() != null) {cellulareTextField.setText(u.getCellulare());}
            if (u.getCitta() != null) {cittaTextField.setText(u.getCitta());}
        }

        modificaDettagli.setOnMouseEntered(event -> {
            ScaleTransition scaleIn = new ScaleTransition(Duration.millis(150), modificaDettagli);
            scaleIn.setToX(0.9);
            scaleIn.setToY(0.9);
            scaleIn.play();
        });

        modificaDettagli.setOnMouseExited(event -> {
            ScaleTransition scaleOut= new ScaleTransition(Duration.millis(150), modificaDettagli);
            scaleOut.setToX(1);
            scaleOut.setToY(1);
            scaleOut.play();
        });

        modificaDettagli.setOnMouseClicked(event -> {
            sessoTextField.setEditable(true);
            datanascitaTextField.setEditable(true);
            indirizzoTextField.setEditable(true);
            cittaTextField.setEditable(true);
            emailTextField.setEditable(true);
            nomeTextField.setEditable(true);
            cognomeTextField.setEditable(true);
            linguaTextField.setEditable(true);
            cellulareTextField.setEditable(true);
            inviaBottone.setVisible(true);
        });

        inviaBottone.setOnMouseEntered(event -> {
            ScaleTransition scaleIn = new ScaleTransition(Duration.millis(150), inviaBottone);
            scaleIn.setToX(0.9);
            scaleIn.setToY(0.9);
            scaleIn.play();
        });

        inviaBottone.setOnMouseExited(event -> {
            ScaleTransition scaleOut= new ScaleTransition(Duration.millis(150), inviaBottone);
            scaleOut.setToX(1);
            scaleOut.setToY(1);
            scaleOut.play();
        });

        inviaBottone.setOnMouseClicked(event -> {
            messaggioSuccesso.setVisible(false);
            messaggioSuccesso.setOpacity(1.0);
            Utente uCorrente= SessioneUtente.getUtente();
            if(uCorrente==null){return;}

            if (nomeError.isVisible() || cognomeError.isVisible() || linguaError.isVisible() ||
                    sessoError.isVisible() || dataError.isVisible() || cellulareError.isVisible() ||
                    cittaError.isVisible() || emailError.isVisible() || indirizzoError.isVisible()) {

                messaggioSuccesso.setText("Correggi i campi errati!");
                messaggioSuccesso.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(10), Insets.EMPTY)));
                messaggioSuccesso.setVisible(true);
                messaggioSuccesso.setOpacity(0.0);

                FadeTransition fadeIn = new FadeTransition(Duration.millis(300), messaggioSuccesso);
                fadeIn.setFromValue(0.0);
                fadeIn.setToValue(1.0);
                fadeIn.play();

                FadeTransition fadeOut = new FadeTransition(Duration.millis(300), messaggioSuccesso);
                fadeOut.setFromValue(1.0);
                fadeOut.setToValue(0.0);
                fadeOut.setDelay(Duration.millis(2000));
                fadeOut.setOnFinished(event1 -> {
                    messaggioSuccesso.setVisible(false);
                });
                fadeOut.play();
                return;
            }

            uCorrente.setNome(nomeTextField.getText().trim());
            uCorrente.setCognome(cognomeTextField.getText().trim());
            uCorrente.setEmail(emailTextField.getText().trim());
            uCorrente.setSesso(sessoTextField.getText().trim());
            uCorrente.setLingua(linguaTextField.getText().trim());
            uCorrente.setDataNascita(datanascitaTextField.getText().trim());
            uCorrente.setIndirizzo(indirizzoTextField.getText().trim());
            uCorrente.setCellulare(cellulareTextField.getText().trim());
            uCorrente.setCitta(cittaTextField.getText().trim());

            try{
                boolean successo= UtenteDAO.aggiornaProfilo(uCorrente);
                if (successo){
                    SessioneUtente.setUtente(uCorrente);
                    nomeLabel.setText(uCorrente.getNome());
                    cognomeLabel.setText(uCorrente.getCognome());
                    emailLabel.setText(uCorrente.getEmail());

                    nomeTextField.setEditable(false);
                    cognomeTextField.setEditable(false);
                    emailTextField.setEditable(false);
                    sessoTextField.setEditable(false);
                    linguaTextField.setEditable(false);
                    cellulareTextField.setEditable(false);
                    datanascitaTextField.setEditable(false);
                    indirizzoTextField.setEditable(false);
                    cittaTextField.setEditable(false);
                    inviaBottone.setVisible(false);


                    messaggioSuccesso.setVisible(true);
                    messaggioSuccesso.setText("Profilo Aggiornato Correttamente!");
                    messaggioSuccesso.setBackground(new Background(new BackgroundFill(Color.GREEN, new CornerRadii(10), Insets.EMPTY)));
                    messaggioSuccesso.setOpacity(0.0);

                    FadeTransition fadeIn = new FadeTransition(Duration.millis(300), messaggioSuccesso);
                    fadeIn.setFromValue(0.0);
                    fadeIn.setToValue(1.0);
                    fadeIn.play();

                    FadeTransition fadeOut = new FadeTransition(Duration.millis(300), messaggioSuccesso);
                    fadeOut.setFromValue(1.0);
                    fadeOut.setToValue(0.0);
                    fadeOut.setDelay(Duration.millis(2000));
                    fadeOut.setOnFinished(event1 -> {
                        messaggioSuccesso.setVisible(false);
                    });
                    fadeOut.play();
                }else{
                    messaggioSuccesso.setVisible(true);
                    messaggioSuccesso.setText("Errore durante il salvataggio.");
                    messaggioSuccesso.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                    messaggioSuccesso.setOpacity(0.0);

                    FadeTransition fadeIn = new FadeTransition(Duration.millis(300), messaggioSuccesso);
                    fadeIn.setFromValue(0.0);
                    fadeIn.setToValue(1.0);
                    fadeIn.play();

                    FadeTransition fadeOut = new FadeTransition(Duration.millis(300), messaggioSuccesso);
                    fadeOut.setFromValue(1.0);
                    fadeOut.setToValue(0.0);
                    fadeOut.setDelay(Duration.millis(2000));
                    fadeOut.setOnFinished(event1 -> {
                        messaggioSuccesso.setVisible(false);
                    });
                    fadeOut.play();
                }
            } catch (SQLException ex) {
                if(ex.getMessage().contains("UNIQUE")){
                    messaggioSuccesso.setText("Email già in uso!.");
                    messaggioSuccesso.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                    messaggioSuccesso.setVisible(true);
                }else{
                    messaggioSuccesso.setText("Errore: "+ex.getMessage());
                    messaggioSuccesso.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                    messaggioSuccesso.setVisible(true);
                }
                ex.printStackTrace();
            }
        });



    }



}
