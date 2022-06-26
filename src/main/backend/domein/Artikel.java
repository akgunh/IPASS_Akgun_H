package main.backend.domein;

public class Artikel {
    private int artikelnummer;
    private double prijs;
    private int voorraad;
    private String omschrijving;
    private Boolean halal;
    private Boolean vegan;

    public Artikel(int artikelnummer, double prijs, int voorraad, String omschrijving, Boolean halal, Boolean vegan) {
        this.artikelnummer = artikelnummer;
        this.prijs = prijs;
        this.voorraad = voorraad;
        this.omschrijving = omschrijving;
        this.halal = halal;
        this.vegan = vegan;
    }

    public Artikel(String artikelnummer, double prijs) {
    }

    public static Object getAssortiment() {
        return null;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(int artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public int getVoorraad() {
        return voorraad;
    }

    public void setVoorraad(int voorraad) {
        this.voorraad = voorraad;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public Boolean getHalal() {
        return halal;
    }

    public void setHalal(Boolean halal) {
        this.halal = halal;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public void setVegan(Boolean vegan) {
        this.vegan = vegan;
    }
}
