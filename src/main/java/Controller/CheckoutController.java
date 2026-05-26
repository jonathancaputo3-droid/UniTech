
package Controller;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.kordamp.ikonli.javafx.FontIcon;

public class CheckoutController {

    // 👉 collegamento al campo di testo (cardField) dove l’utente scrive il numero carta
    @FXML
    private TextField cardField;

    // 👉 icona VISA (visibile solo se carta inizia con 4)
    @FXML
    private FontIcon visaIcon;

    // 👉 icona MASTERCARD (visibile solo se carta inizia con 5 o 2)
    @FXML
    private FontIcon mastercardIcon;

    @FXML
    public void initialize() {

        // 👉 metodo chiamato automaticamente da JavaFX quando la UI è pronta
        // 👉 qui inizializziamo listener e logica della schermata

        // 👉 appena parte la UI, nascondiamo tutte le icone
        hideAllIcons();
        cardField.textProperty().addListener((obs, oldVal, newVal) -> {

            // 👉 questo listener si attiva OGNI VOLTA che l’utente scrive o cancella qualcosa

            updateCardIcon(newVal);
            // 👉 chiamiamo il metodo che decide quale icona mostrare
        });
    }

    private void updateCardIcon(String value) {

        // 👉 questo metodo decide quale icona mostrare in base al numero carta

        if (value == null || value.isEmpty()) {

            // 👉 se il campo è vuoto o null
            // 👉 non dobbiamo mostrare nessuna icona

            hideAllIcons();
            // 👉 nasconde tutte le icone
            return;
            // 👉 esce subito dal metodo perché non c’è nulla da controllare
        }

        // 👉 rimuoviamo eventuali spazi inseriti dall’utente
        // 👉 esempio: "4111 1111 1111" diventa "411111111111"
        value = value.replaceAll("\\s", "");

        // 👉 prima di mostrare una nuova icona
        // 👉 nascondiamo tutte le icone per evitare sovrapposizioni
        hideAllIcons();

        // 👉 controllo VISA
        if (value.startsWith("4")) {

            // 👉 se il numero carta inizia con 4
            // 👉 è una VISA

            visaIcon.setVisible(true);
            // 👉 rendiamo visibile icona VISA

            visaIcon.setManaged(true);
            // 👉 la includiamo nel layout (non lascia spazio vuoto)
        }

        // 👉 controllo MASTERCARD
        else if (value.startsWith("5") || value.startsWith("2")) {

            // 👉 Mastercard può iniziare con 5 (vecchie) o 2 (nuove serie)

            mastercardIcon.setVisible(true);
            // 👉 rendiamo visibile icona Mastercard

            mastercardIcon.setManaged(true);
            // 👉 la includiamo nel layout
        }

        // 👉 se non è né VISA né MASTERCARD
        // 👉 non mostriamo nessuna icona
    }

    private void hideAllIcons() {

        // 👉 questo metodo serve per rimuovere la vecchia icona della carta di credito quando l'utente cancella il numero della carta


        visaIcon.setVisible(false);
        mastercardIcon.setVisible(false);
    }
}