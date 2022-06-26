package main.backend.domein;

import java.util.ArrayList;

public class Winkelwagen {
    private double totaalBedrag;
    private ArrayList<Artikel> artikelen = new ArrayList<>();

    public Winkelwagen(){};

    public void addProduct(Artikel artikel){
        artikelen.add(artikel);
    }

    public void removeProduct(Artikel artikel){
        artikelen.remove(artikel);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < artikelen.size(); i++){
            totalPrice += artikelen.get(i).getPrijs();
        }
        return totalPrice;
    }

    public String toString(){
        if(artikelen.size() < 1){
            return("Uw winkelwagen is leeg!");
        }
        StringBuilder contentString = new StringBuilder();
        for (int i = 0; i < artikelen.size(); i++){
            contentString.append(artikelen.get(i).toString());
        }
        return("Winkelwagen:\n" + contentString + "\nTotaalprijs: €" + getTotalPrice());
    }
}
