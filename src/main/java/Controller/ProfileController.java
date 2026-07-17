package Controller;

import Model.Utente;
import Model.UtenteDAO;
import Util.AnimazioneUtil;
import Util.SessioneUtente;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import java.sql.SQLException;

import static Util.AnimazioneUtil.*;

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
    @FXML
    private Label tornaHome;
    @FXML
    private Button eliminaAccount;
    @FXML
    private StackPane overlayPane;
    @FXML
    private Button confermaElimina;
    @FXML
    private Button annullaElimina;
    @FXML
    private Label passwordLost;

    private static final String SOLO_LETTERE="^[a-zA-ZÀ-ù\\s]+$";
    private  static final String LETTERE_NUMERI="^[a-zA-ZÀ-ù0-9\\s]+$";
    private static final String ESTENSIONE_EMAIL = "^[\\w.+\\-]+@[\\w\\-]+(\\.[\\w\\-]+)*\\.[a-zA-Z]{2,}$";
    private static final String SOLO_NUMERI = "^[0-9]+$";
    private static final String DATA_NASCITA = "^\\d{2}/\\d{2}/\\d{4}$";
    private static final String SESSO = "^[MF]$";


    private void setFieldsEditable(boolean editable) {
        nomeTextField.setEditable(editable);
        cognomeTextField.setEditable(editable);
        emailTextField.setEditable(editable);
        sessoTextField.setEditable(editable);
        linguaTextField.setEditable(editable);
        datanascitaTextField.setEditable(editable);
        indirizzoTextField.setEditable(editable);
        cellulareTextField.setEditable(editable);
        cittaTextField.setEditable(editable);
    }

    private boolean campiErrati() {
        return nomeError.isVisible() || cognomeError.isVisible() ||
                emailError.isVisible() || sessoError.isVisible() ||
                linguaError.isVisible() || dataError.isVisible() ||
                cellulareError.isVisible() || cittaError.isVisible() ||
                indirizzoError.isVisible();
    }

    private void aggiornaDatiUtente(Utente u) {
        u.setNome(nomeTextField.getText().trim());
        u.setCognome(cognomeTextField.getText().trim());
        u.setEmail(emailTextField.getText().trim());
        u.setSesso(sessoTextField.getText().trim());
        u.setLingua(linguaTextField.getText().trim());
        u.setDataNascita(datanascitaTextField.getText().trim());
        u.setIndirizzo(indirizzoTextField.getText().trim());
        u.setCellulare(cellulareTextField.getText().trim());
        u.setCitta(cittaTextField.getText().trim());
    }


    public void initialize() {
        Utente u = SessioneUtente.getUtente();
        inviaBottone.setVisible(false);
        messaggioSuccesso.setVisible(false);

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

        AnimazioneUtil.aggiungiAnimazioneScale(modificaDettagli);
        AnimazioneUtil.aggiungiAnimazioneScale(inviaBottone);
        AnimazioneUtil.aggiungiAnimazioneScale(eliminaAccount);
        AnimazioneUtil.aggiungiAnimazioneScale(tornaHome);
        AnimazioneUtil.aggiungiAnimazioneScale(annullaElimina);
        AnimazioneUtil.aggiungiAnimazioneScale(confermaElimina);
        AnimazioneUtil.aggiungiAnimazione(passwordLost);

        modificaDettagli.setOnMouseClicked(event -> {
            setFieldsEditable(true);
            inviaBottone.setVisible(true);
        });

        inviaBottone.setOnMouseClicked(event -> {
            messaggioSuccesso.setVisible(false);
            Utente uCorrente= SessioneUtente.getUtente();
            if(uCorrente==null){return;}

            if (campiErrati()) {
                mostraMessaggio(messaggioSuccesso,"Correggi i campi errati!", Color.RED);
                return;
            }

            aggiornaDatiUtente(uCorrente);

            try{
                boolean successo= UtenteDAO.aggiornaProfilo(uCorrente);
                if (successo){
                    SessioneUtente.setUtente(uCorrente);
                    nomeLabel.setText(uCorrente.getNome());
                    cognomeLabel.setText(uCorrente.getCognome());
                    emailLabel.setText(uCorrente.getEmail());
                    setFieldsEditable(false);
                    inviaBottone.setVisible(false);
                    mostraMessaggio(messaggioSuccesso,"Profilo Aggiornato Correttamente!",Color.GREEN);
                }else{
                    mostraMessaggio(messaggioSuccesso,"Errore durante il salvataggio!",Color.RED);
                }
            } catch (SQLException ex) {
                if(ex.getMessage().contains("UNIQUE")){
                    mostraMessaggio(messaggioSuccesso,"Email già in uso!",Color.RED);
                }else{
                    mostraMessaggio(messaggioSuccesso,"Errore: "+ex.getMessage(),Color.RED);
                }
                ex.printStackTrace();
            }
        });

        tornaHome.setOnMouseClicked(event -> {
           cambiaScena(tornaHome,"/Fxml/Home.fxml");
        });

        passwordLost.setOnMouseClicked(event -> {
            cambiaScena(passwordLost,"/Fxml/PasswordUpdate.fxml");
        });


        eliminaAccount.setOnMouseClicked(event -> {
            apriOverlay(overlayPane);
        });

        annullaElimina.setOnMouseClicked(event -> {
            chiudiOverlay(overlayPane);
        });

        confermaElimina.setOnMouseClicked(event -> {
            Utente uCorrente= SessioneUtente.getUtente();
            if(uCorrente==null){return;}
            try {
                boolean successo=UtenteDAO.eliminaAccount(uCorrente.getId());
                if(successo){
                    SessioneUtente.setUtente(null);
                    cambiaScena(confermaElimina,"/Fxml/Login.fxml");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}
