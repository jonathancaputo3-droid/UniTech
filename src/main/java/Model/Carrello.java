package Model;
import java.util.ArrayList;
import java.util.List;
public class Carrello {
    private static Carrello istanza;

    private List<ElementoCarrello> prodotti;

    private Carrello() {
        prodotti = new ArrayList<>();
    }

    public static Carrello getIstanza() {
        if (istanza == null) {
            istanza = new Carrello();
        }
        return istanza;
    }

    public List<ElementoCarrello> getProdotti() {
        return prodotti;
    }

    public void aggiungiProdotto(ElementoCarrello nuovo) {

        for (ElementoCarrello p : prodotti) {
            if (p.getNome().equals(nuovo.getNome())) {
                p.aumentaQuantita();
                return;
            }
        }

        prodotti.add(nuovo);
    }

    public void diminuisciProdotto(ElementoCarrello prodotto) {

        java.util.Iterator<ElementoCarrello> it = prodotti.iterator();

        while (it.hasNext()) {
            ElementoCarrello p = it.next();

            if (p.getNome().equals(prodotto.getNome())) {

                p.diminuisciQuantita();

                if (p.getQuantita() <= 0) {
                    it.remove(); // 👈 FIX IMPORTANTE
                }

                return;
            }
        }



    }

    public void rimuoviProdotto(ElementoCarrello prodotto) {
        prodotti.removeIf(p -> p.getNome().equals(prodotto.getNome()));
    }

    public void svuota() {
        prodotti.clear();
    }

    public double getTotale() {
        double totale = 0;
        for (ElementoCarrello p : prodotti) {
            totale += p.getTotale();
        }
        return totale;
    }
}

