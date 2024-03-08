package controller;


import model.Afdeling;
import model.Persoon;
import model.Werknemer;
import model.Zzper;

import java.util.ArrayList;

/**
 * Hier de opdracht die je gaat maken
 *
 * @author B.J. Falkena
 */
public class BedrijfLauncher {
    public static void main(String[] args) {


        Afdeling[] afdelingen = new Afdeling[4];
        afdelingen[0] = new Afdeling("Uitvoering", "Hilversum");
        afdelingen[1] = new Afdeling("Support", "Amsterdam");
        afdelingen[2] = new Afdeling("Management", "Almere");
        afdelingen[3] = new Afdeling("Documentatie", "Gouda");




        Werknemer baas = new Werknemer("Mark","Den Haag", afdelingen[2], 10000);
        Werknemer medewerker = new Werknemer("Caroline" ,"Delft", afdelingen[1], 4000);
        Zzper assistent = new Zzper("Klaas", "Diemen", afdelingen[3], 50);
        Zzper projectleider = new Zzper("Ronald", "Zaandam", afdelingen[0], 80);

        assistent.huurIn(160);
        projectleider.huurIn(320);

        ArrayList<Persoon> personen = new ArrayList<>();
        personen.add(new Werknemer("Mark", "Den Haag", afdelingen[2], 10000));
        personen.add(new Werknemer("Angelique", "Rotterdam", afdelingen[2], 5000));
        personen.add(new Werknemer("Caroline", "Delft", afdelingen[1], 4000));
        personen.add(new Zzper("Klaas", "Diemen", afdelingen[3], 50.00));
        personen.add(new Zzper("Ronald", "Zaandam", afdelingen[0], 80.00));
        personen.add(new Zzper("Jannie", "Utrecht", afdelingen[0], 60.00));
        personen.add(new Zzper("Anne", "Zwolle", afdelingen[0], 40.00));

        for (Persoon persoon : personen) {
            if (persoon instanceof Zzper) {
                ((Zzper) persoon).huurIn(320);
            }
        }

        for (Persoon opgeslagenPersoon : personen) {
            toonJaarInkomen(opgeslagenPersoon);
        }
//comment om te pushen



    }
    public static void toonJaarInkomen (Persoon persoon){
        System.out.printf(" %s verdient %s per jaar\n", persoon.getNaam(), persoon.berekenJaarInkomen());
    }

}