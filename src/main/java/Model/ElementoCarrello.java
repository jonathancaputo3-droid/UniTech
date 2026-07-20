package Model;

import javafx.scene.image.Image;

public class ElementoCarrello {

    private String nome;
    private double prezzo;
    private int quantita;
    private Image immagine;
    private String caratteristiche;

    public ElementoCarrello(String nome, double prezzo, int quantita, Image immagine, String caratteristiche) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
        this.immagine = immagine;
        this.caratteristiche = caratteristiche;
    }

    public ElementoCarrello(String nome2, double prezzoMax2, int quantita2, Image immagineMax2,
            Object caratteristiche2) {
        //TODO Auto-generated constructor stub
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public Image getImmagine() {
        return immagine;
    }

    public String getCaratteristiche() {
        return caratteristiche;
    }

    public void aumentaQuantita() {
        quantita++;
    }

    public void diminuisciQuantita() {
        quantita--;
    }

    public double getTotale() {
        return prezzo * quantita;
    }
}
