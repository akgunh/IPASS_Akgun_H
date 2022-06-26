package main.backend.domein;

public class Klant extends Gebruiker{
    private int klantNummer;

    public Klant(String inlognaam, String wachtwoord, Boolean admin, int klantNummer) {
        super(inlognaam, wachtwoord, admin);
        this.klantNummer = klantNummer;
    }

    public Klant(String naam, String adres, int telefoonnummer, Boolean admin, String inlognaam, String wachtwoord, int klantNummer) {
        super(naam, adres, telefoonnummer, admin, inlognaam, wachtwoord);
        this.klantNummer = klantNummer;
    }

}
