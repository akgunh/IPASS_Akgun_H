package main.backend.domein;

public class Medewerker extends Gebruiker{
    private int medewerkernummer;

    public Medewerker(String inlognaam, String wachtwoord, Boolean admin, int medewerkernummer) {
        super(inlognaam, wachtwoord, admin);
        this.medewerkernummer = medewerkernummer;
    }

    public Medewerker(String naam, String adres, int telefoonnummer, Boolean admin, String inlognaam, String wachtwoord, int medewerkernummer) {
        super(naam, adres, telefoonnummer, admin, inlognaam, wachtwoord);
        this.medewerkernummer = medewerkernummer;
    }
}
