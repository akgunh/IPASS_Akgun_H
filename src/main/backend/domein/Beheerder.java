package main.backend.domein;

public class Beheerder extends Gebruiker{
    private int beheerderNummer;

    public Beheerder(String inlognaam, String wachtwoord, Boolean admin, int beheerderNummer) {
        super(inlognaam, wachtwoord, admin);
        this.beheerderNummer = beheerderNummer;
    }

    public Beheerder(String naam, String adres, int telefoonnummer, Boolean admin, String inlognaam, String wachtwoord, int beheerderNummer) {
        super(naam, adres, telefoonnummer, admin, inlognaam, wachtwoord);
        this.beheerderNummer = beheerderNummer;
    }
}
