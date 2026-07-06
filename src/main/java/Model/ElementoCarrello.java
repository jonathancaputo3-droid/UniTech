package Model;
import javafx.scene.image.Image;
public class ElementoCarrello {
    private String nome;
    private double prezzo;
    private Image immagine;
    private int quantita;

    public ElementoCarrello(String nome, double prezzo, Image immagine) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.immagine = immagine;
        this.quantita = 1;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public Image getImmagine() {
        return immagine;
    }

    public int getQuantita() {
        return quantita;
    }

    public void aumentaQuantita() {
        this.quantita++;
    }

    public void diminuisciQuantita() {

            this.quantita--;
        }


    public double getTotale() {
        return prezzo * quantita;
    }
}
