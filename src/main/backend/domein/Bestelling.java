package main.backend.domein;

import java.util.ArrayList;
import java.util.Date;

public class Bestelling {
    private int bestellingNummer;
    private Date tijd;
    private int aantal;
    private ArrayList<Artikel> artikelAantal = new ArrayList<>();

    public Bestelling(int bestellingNummer, Date tijd, int aantal, ArrayList<Artikel> artikelAantal) {
        this.bestellingNummer = bestellingNummer;
        this.tijd = tijd;
        this.aantal = aantal;
        this.artikelAantal = artikelAantal;
    }
}
