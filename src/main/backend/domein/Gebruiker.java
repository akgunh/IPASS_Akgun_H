package main.backend.domein;

import java.util.ArrayList;

public class Gebruiker {
    private String naam;
    private String adres;
    private int telefoonnummer;
    private Boolean admin;
    private static ArrayList<Gebruiker> gebruikers = new ArrayList<>();
    private String inlognaam;
    private String wachtwoord;


    public Gebruiker(String inlognaam, String wachtwoord, Boolean admin) {
        this.inlognaam = inlognaam;
        this.wachtwoord = wachtwoord;
        this.admin = admin;
    }

    public Gebruiker(String naam, String adres, int telefoonnummer, Boolean admin, String inlognaam, String wachtwoord) {
        this.naam = naam;
        this.adres = adres;
        this.telefoonnummer = telefoonnummer;
        this.admin = admin;
        this.inlognaam = inlognaam;
        this.wachtwoord = wachtwoord;
    }

    public static Gebruiker createGebruiker(String inlognaam, String wachtwoord, Boolean admin) {
        Gebruiker gebruiker = new Gebruiker(inlognaam, wachtwoord, admin);

        if (!gebruikers.contains(gebruiker)) {
            gebruikers.add(gebruiker);
            return gebruiker;
        }
        return null;
    }

    public static String validateLogin(String email, String password) {
        for (Gebruiker geb : getGebruikers()) {
            if (geb.getInlognaam().equals(email)) {
                if (geb.getWachtwoord().equals(password)) {
                    if (geb.getAdmin() == true) {
                        return "admin";
                    }
                    return "user";
                }
            }
        }
        return null;
    }

    public static Gebruiker getGebruikerByInlognaam(String inlognaam){
        for (Gebruiker geb : getGebruikers()){
            if (geb.getInlognaam() == inlognaam){
                return geb;
            }
        }
        return null;
    }

    public String getRole() {
        if(getAdmin()){
            return "admin";
        }
        return "user";
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(int telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public static ArrayList<Gebruiker> getGebruikers() {
        return gebruikers;
    }

    public static void setGebruikers(ArrayList<Gebruiker> gebruikers) {
        Gebruiker.gebruikers = gebruikers;
    }

    public String getInlognaam() {
        return inlognaam;
    }

    public void setInlognaam(String inlognaam) {
        this.inlognaam = inlognaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }
}
