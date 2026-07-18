package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.kordamp.ikonli.javafx.FontIcon;

import java.util.function.UnaryOperator;

import Model.Carrello;
import Model.ElementoCarrello;
import Util.AnimazioneUtil;
import Util.NavigationManager;

public class CheckoutController {

    // ==========================================
    // 📦 CAMPI FORM SPEDIZIONE
    // ==========================================
    @FXML
    private TextField nomeField;
    @FXML
    private TextField cognomeField;
    @FXML
    private TextField viaField;
    @FXML
    private TextField cittaField;
    @FXML
    private TextField capField;
    @FXML
    private TextField provinciaField;

    @FXML
    private Label errNome;
    @FXML
    private Label errCognome;
    @FXML
    private Label errVia;
    @FXML
    private Label errCitta;
    @FXML
    private Label errCap;
    @FXML
    private Label errProvincia;

    // ==========================================
    // 💳 CAMPI PAGAMENTO
    // ==========================================
    @FXML
    private TextField nomeCartaField;
    @FXML
    private TextField cardField;
    @FXML
    private TextField scadenzaField;
    @FXML
    private TextField cvvField;

    @FXML
    private Label errNomeCarta;
    @FXML
    private Label errCard;
    @FXML
    private Label errScadenza;
    @FXML
    private Label errCvv;

    // 👉 icone circuiti carta
    @FXML
    private FontIcon visaIcon;
    @FXML
    private FontIcon mastercardIcon;
    @FXML
    private FontIcon amexIcon;

    // ==========================================
    // 🛒 RIEPILOGO ORDINE
    // ==========================================
    @FXML
    private VBox riepilogoBox;
    @FXML
    private Label lblTotaleCheckout;

    @FXML
    private Button btnPagaOra;

    @FXML
    private Button btnAnnulla;

    // 👉 flag per evitare loop infinito durante l'auto-formattazione della scadenza
    private boolean formattandoScadenza = false;

    @FXML
    public void initialize() {

        hideAllIcons();

        cardField.textProperty().addListener((obs, oldVal, newVal) -> {
            updateCardIcon(newVal);
        });

        setupCapFormatter();
        setupProvinciaFormatter();
        setupCardFormatter();
        setupCvvFormatter();
        setupScadenzaFormatter();

        popolaRiepilogo();
    }

    // ==========================================
    // 🔒 LIMITAZIONE INPUT IN TEMPO REALE
    // ==========================================

    private void setupCapFormatter() {
        UnaryOperator<TextFormatter.Change> filter = change -> {
            String newText = change.getControlNewText();
            if (newText.matches("\\d{0,5}")) {
                return change;
            }
            return null;
        };
        capField.setTextFormatter(new TextFormatter<>(filter));
    }

    private void setupProvinciaFormatter() {
        UnaryOperator<TextFormatter.Change> filter = change -> {

            String testoDigitato = change.getText();
            if (!testoDigitato.isEmpty()) {
                change.setText(testoDigitato.toUpperCase());
            }

            String newText = change.getControlNewText();

            if (newText.matches("[A-Za-z]{0,2}")) {
                return change;
            }
            return null;
        };
        provinciaField.setTextFormatter(new TextFormatter<>(filter));
    }

    private void setupCardFormatter() {
        UnaryOperator<TextFormatter.Change> filter = change -> {
            String newText = change.getControlNewText();
            if (newText.matches("\\d{0,16}")) {
                return change;
            }
            return null;
        };
        cardField.setTextFormatter(new TextFormatter<>(filter));
    }

    private void setupCvvFormatter() {
        UnaryOperator<TextFormatter.Change> filter = change -> {
            String newText = change.getControlNewText();
            if (newText.matches("\\d{0,3}")) {
                return change;
            }
            return null;
        };
        cvvField.setTextFormatter(new TextFormatter<>(filter));
    }

    private void setupScadenzaFormatter() {
        scadenzaField.textProperty().addListener((obs, oldVal, newVal) -> {

            if (formattandoScadenza) {
                return;
            }

            String digits = newVal.replaceAll("\\D", "");

            if (digits.length() > 4) {
                digits = digits.substring(0, 4);
            }

            String formattato;
            if (digits.length() > 2) {
                formattato = digits.substring(0, 2) + "/" + digits.substring(2);
            } else {
                formattato = digits;
            }

            if (!formattato.equals(newVal)) {
                formattandoScadenza = true;
                scadenzaField.setText(formattato);
                scadenzaField.positionCaret(formattato.length());
                formattandoScadenza = false;
            }
        });
    }

    // ==========================================
    // 💳 GESTIONE ICONA CIRCUITO CARTA
    // ==========================================
    private void updateCardIcon(String value) {

        if (value == null || value.isEmpty()) {
            hideAllIcons();
            return;
        }

        value = value.replaceAll("\\s", "");

        hideAllIcons();

        String circuito = rilevaCircuito(value);

        if ("VISA".equals(circuito)) {
            visaIcon.setVisible(true);
            visaIcon.setManaged(true);
        } else if ("MASTERCARD".equals(circuito)) {
            mastercardIcon.setVisible(true);
            mastercardIcon.setManaged(true);
        } else if ("AMEX".equals(circuito)) {
            amexIcon.setVisible(true);
            amexIcon.setManaged(true);
        }
    }

    private void hideAllIcons() {
        visaIcon.setVisible(false);
        visaIcon.setManaged(false);
        mastercardIcon.setVisible(false);
        mastercardIcon.setManaged(false);
        amexIcon.setVisible(false);
        amexIcon.setManaged(false);
    }

    private String rilevaCircuito(String numero) {

        if (numero == null || numero.isEmpty()) {
            return null;
        }

        if (numero.startsWith("4")) {
            return "VISA";
        }

        if (numero.length() >= 2) {
            String prefissoDue = numero.substring(0, 2);
            int p2 = Integer.parseInt(prefissoDue);

            if (p2 >= 51 && p2 <= 55) {
                return "MASTERCARD";
            }
            if (p2 == 34 || p2 == 37) {
                return "AMEX";
            }
        }

        if (numero.length() >= 4) {
            try {
                int prefissoQuattro = Integer.parseInt(numero.substring(0, 4));
                if (prefissoQuattro >= 2221 && prefissoQuattro <= 2720) {
                    return "MASTERCARD";
                }
            } catch (NumberFormatException ignored) {
            }
        }

        return null;
    }

    // ==========================================
    // 🛒 RIEPILOGO ORDINE
    // ==========================================
    private void popolaRiepilogo() {

        riepilogoBox.getChildren().clear();

        var prodotti = Carrello.getIstanza().getProdotti();

        for (ElementoCarrello p : prodotti) {

            HBox card = new HBox(12);
            card.setStyle("-fx-padding: 6 0 6 0;");

            ImageView img = new ImageView(p.getImmagine());
            img.setFitWidth(50);
            img.setFitHeight(50);
            img.setPreserveRatio(true);

            VBox info = new VBox(3);

            Label nome = new Label(p.getNome());
            nome.setStyle("-fx-font-weight: bold; -fx-font-size: 13; -fx-text-fill: #1d1d1f;");

            Label dettagli = new Label("Quantità: " + p.getQuantita() + "  ·  € " + String.format("%.2f", p.getTotale()));
            dettagli.setStyle("-fx-font-size: 12; -fx-text-fill: #666;");

            info.getChildren().addAll(nome, dettagli);
            card.getChildren().addAll(img, info);

            riepilogoBox.getChildren().add(card);
        }

        lblTotaleCheckout.setText("€ " + String.format("%.2f", Carrello.getIstanza().getTotale()));
    }

    // ==========================================
    // ✅ VALIDAZIONE FORM
    // ==========================================

    private void mostraErrore(Label label, String messaggio) {
        label.setText(messaggio);
        label.setVisible(true);
        label.setManaged(true);
    }

    private void nascondiErrore(Label label) {
        label.setVisible(false);
        label.setManaged(false);
    }

    private boolean validaForm() {

        boolean valido = true;

        if (nomeField.getText() == null || nomeField.getText().trim().isEmpty()) {
            mostraErrore(errNome, "Inserisci il nome");
            valido = false;
        } else {
            nascondiErrore(errNome);
        }

        if (cognomeField.getText() == null || cognomeField.getText().trim().isEmpty()) {
            mostraErrore(errCognome, "Inserisci il cognome");
            valido = false;
        } else {
            nascondiErrore(errCognome);
        }

        if (viaField.getText() == null || viaField.getText().trim().isEmpty()) {
            mostraErrore(errVia, "Inserisci la via");
            valido = false;
        } else {
            nascondiErrore(errVia);
        }

        if (cittaField.getText() == null || cittaField.getText().trim().isEmpty()) {
            mostraErrore(errCitta, "Inserisci la città");
            valido = false;
        } else {
            nascondiErrore(errCitta);
        }

        String cap = capField.getText();
        if (cap == null || cap.trim().isEmpty()) {
            mostraErrore(errCap, "Inserisci il CAP");
            valido = false;
        } else if (!cap.matches("\\d{5}")) {
            mostraErrore(errCap, "Il CAP deve avere 5 cifre");
            valido = false;
        } else {
            nascondiErrore(errCap);
        }

        String provincia = provinciaField.getText();
        if (provincia == null || provincia.trim().isEmpty()) {
            mostraErrore(errProvincia, "Inserisci la provincia");
            valido = false;
        } else if (!provincia.matches("[A-Z]{2}")) {
            mostraErrore(errProvincia, "La provincia deve avere 2 lettere");
            valido = false;
        } else {
            nascondiErrore(errProvincia);
        }

        if (nomeCartaField.getText() == null || nomeCartaField.getText().trim().isEmpty()) {
            mostraErrore(errNomeCarta, "Inserisci il nome sulla carta");
            valido = false;
        } else {
            nascondiErrore(errNomeCarta);
        }

        String numeroCarta = cardField.getText() == null ? "" : cardField.getText();
        if (numeroCarta.isEmpty()) {
            mostraErrore(errCard, "Inserisci il numero della carta");
            valido = false;
        } else if (!numeroCarta.matches("\\d{16}")) {
            mostraErrore(errCard, "Il numero della carta deve avere esattamente 16 cifre");
            valido = false;
        } else if (rilevaCircuito(numeroCarta) == null) {
            mostraErrore(errCard, "Circuito non riconosciuto (Visa, Mastercard o Amex)");
            valido = false;
        } else {
            nascondiErrore(errCard);
        }

        String scadenza = scadenzaField.getText();
        if (scadenza == null || scadenza.trim().isEmpty()) {
            mostraErrore(errScadenza, "Inserisci la scadenza");
            valido = false;
        } else if (!scadenza.matches("(0[1-9]|1[0-2])/\\d{2}")) {
            mostraErrore(errScadenza, "Formato non valido (MM/AA)");
            valido = false;
        } else {
            nascondiErrore(errScadenza);
        }

        String cvv = cvvField.getText();
        if (cvv == null || cvv.trim().isEmpty()) {
            mostraErrore(errCvv, "Inserisci il CVV");
            valido = false;
        } else if (!cvv.matches("\\d{3}")) {
            mostraErrore(errCvv, "Il CVV deve avere 3 cifre");
            valido = false;
        } else {
            nascondiErrore(errCvv);
        }

        return valido;
    }

    // ==========================================
    // 💳 PAGA ORA
    // ==========================================
    @FXML
    private void pagaOra(ActionEvent event) {

        if (!validaForm()) {
            return;
        }

        Carrello.getIstanza().svuota();
        NavigationManager.apriConferma((Node) event.getSource());
    }

    // ==========================================
    // ❌ ANNULLA CHECKOUT
    // ==========================================
    @FXML
    private void annullaCheckout(ActionEvent event) {
    AnimazioneUtil.cambiaScena((Node) event.getSource(), "/fxml/Home.fxml");
}
}