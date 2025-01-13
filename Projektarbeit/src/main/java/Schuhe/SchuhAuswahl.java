package Schuhe;

public class SchuhAuswahl {
    private String art;
    private String marke;
    private String farbe;
    private double groesse;
    private boolean leder;
    private double preis;

    public SchuhAuswahl (String art, String marke, String farbe, double groeße, boolean leder, double preis) {
        this.art = art;
        this.marke = marke;
        this.farbe = farbe;
        this.leder = leder;
        this.groesse = groeße;
        this.preis = preis;
    }

    public String getArt () {
        return art;
    }

    public void setArt () {
        this.art = art;
    }
    public String getMarke() {
        return marke;
    }

    public void setMarke () {
        this.marke = marke;
    }

    public String getFarbe () {
        return farbe;
    }

    public void setFarbe () {
        this.farbe = farbe;
    }

    public double getGroeße () {
        return groesse;
    }

    public void setGroeße () {
        this.groesse = groesse;
    }

    public boolean isLeder (boolean m) {
        isLeder(true);
        return m;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis () {
        this.preis = preis;
    }

    public String beschreibung() {
        return "Art: " + art + ", Marke: " + marke + ", Farbe: " + farbe + ", Größe: " + groesse + ", Leder:" + leder +
                ", Preis: " + preis;
    }

    // Main-Methode
    public static void main(String[] args) {

        // Erstellen eines Schuhobjekts
        SchuhAuswahl s1 = new SchuhAuswahl ("Sneaker", "Adidas", "blau", 40, false, 110);
        SchuhAuswahl s2 = new SchuhAuswahl("Boots","Dr.Martins","schwarz", 42,true,150);

        /*
        ArrayList<SchuhAuswahl> meineSchuhe = new ArrayList<SchuhAuswahl>();
        meineSchuhe.add(s1);
        //meineSchuhe.clear();
        meineSchuhe.add(s2);
         */

        // Ausgabe der Beschreibung des Schuhs
        System.out.println(s1.beschreibung());
    }
}
