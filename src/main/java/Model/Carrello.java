package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Carrello {

    private static Carrello istanza = null;

    private ObservableList<ElementoCarrello> prodotti = FXCollections.observableArrayList();

    private Carrello() {}

    public static Carrello getIstanza() {
        if (istanza == null) {
            istanza = new Carrello();
        }
        return istanza;
    }

    public ObservableList<ElementoCarrello> getProdotti() {
        return prodotti;
    }

    public void aggiungiProdotto(ElementoCarrello nuovo) {

        // Se esiste già un prodotto con stesso nome + caratteristiche → aumenta quantità
        for (ElementoCarrello e : prodotti) {
            if (e.getNome().equals(nuovo.getNome()) &&
                    e.getCaratteristiche().equals(nuovo.getCaratteristiche())) {

                e.aumentaQuantita();
                return;
            }
        }

        // Altrimenti lo aggiungo come nuovo elemento
        prodotti.add(nuovo);
    }

    public void diminuisciQuantita(ElementoCarrello e) {
        e.diminuisciQuantita();
        if (e.getQuantita() <= 0) {
            prodotti.remove(e);
        }
    }

    // Alias usato da CarrelloController
    public void diminuisciProdotto(ElementoCarrello e) {
        diminuisciQuantita(e);
    }

    public void rimuoviProdotto(ElementoCarrello e) {
        prodotti.remove(e);
    }

    public double getTotaleCarrello() {
        double totale = 0;
        for (ElementoCarrello e : prodotti) {
            totale += e.getTotale();
        }
        return totale;
    }

    // Alias usato da CarrelloController
    public double getTotale() {
        return getTotaleCarrello();
    }

    // Svuota completamente il carrello (usato dopo il pagamento)
    public void svuota() {
        prodotti.clear();
    }
}