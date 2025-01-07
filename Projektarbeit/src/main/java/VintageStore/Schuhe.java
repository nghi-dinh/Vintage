package VintageStore;

public class Schuhe {

    private String art;
    private String farbe;
    private int groeße;
    private double preis;

    public Schuhe(String art, String farbe, int groeße, double preis) {
        this.art = art;
        this.farbe = farbe;
        this.groeße = groeße;
        this.preis = preis;
    }

    public String getArt () {
        return art;
    }

    public void setArt () {
        this.art = art;
    }

    public String getFarbe () {
        return farbe;
    }

    public void setFarbe () {
        this.farbe = farbe;
    }

    public int getGroeße () {
        return groeße;
    }

    public void setGroeße () {
        this.groeße = groeße;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis () {
        this.preis = preis;
    }

    public String beschreibung() {
        return "Art: " + art + ", Farbe: " + farbe + ", Größe: " + groeße +
                ", Preis: " + preis;
    }

    // Main-Methode
    public static void main(String[] args) {

        // Erstellen eines Schuhobjekts
        Schuhe schuh1 = new Schuhe("Sneaker", "Schwarz", 42, 110);

        // Ausgabe der Beschreibung des Schuhs
        System.out.println(schuh1.beschreibung());
    }
}
