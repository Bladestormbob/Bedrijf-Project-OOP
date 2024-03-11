package controller;


import model.*;

import java.sql.SQLOutput;
import java.util.*;

/**
 * Hier de opdracht die je gaat maken
 *
 * @author B.J. Falkena
 */
public class BedrijfLauncher {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<Persoon> personen = new ArrayList<>();

        double maandsalaris = 0;

                System.out.print("geef de naam: ");
                String naam = keyboard.nextLine();
                System.out.print("Geef de woonplaats: ");
                String woonplaats = keyboard.nextLine();
                System.out.print("geef de naam van de afdeling: ");
                String afdelingNaam = keyboard.nextLine();
                System.out.print("geef de plaats van de afdeling: ");
                String afdelingPlaats = keyboard.nextLine();

            while (maandsalaris <= 0) {
                try {
                    System.out.print("Geef het maandsalaris: ");
                    maandsalaris = keyboard.nextDouble();

                    personen.add(new Werknemer(naam, woonplaats, new Afdeling(afdelingNaam, afdelingPlaats), maandsalaris));
                    System.out.printf("%s",personen.get(0));


                } catch (IllegalArgumentException illegalArgumentException) {
                    System.out.println(illegalArgumentException.getMessage());
                } finally {
                    System.out.println();
                    System.out.println("Je invoer is correct afgehandeld");
                }
            }
        }

    }





//        Afdeling[] afdelingen = new Afdeling[4];
//        afdelingen[0] = new Afdeling("Uitvoering", "Hilversum");
//        afdelingen[1] = new Afdeling("Support", "Amsterdam");
//        afdelingen[2] = new Afdeling("Management", "Almere");
//        afdelingen[3] = new Afdeling("Documentatie", "Gouda");
//
//
//
//
//        Werknemer baas = new Werknemer("Mark","Den Haag", afdelingen[2], 10000);
//        Werknemer medewerker = new Werknemer("Caroline" ,"Delft", afdelingen[1], 4000);
//        Zzper assistent = new Zzper("Klaas", "Diemen", afdelingen[3], 50);
//        Zzper projectleider = new Zzper("Ronald", "Zaandam", afdelingen[0], 80);
//
//        assistent.huurIn(160);
//        projectleider.huurIn(320);
//
//        ArrayList<Persoon> personen = new ArrayList<>();
//        personen.add(new Werknemer("Mark", "Den Haag", afdelingen[2], 10000));
//        personen.add(new Werknemer("Angelique", "Rotterdam", afdelingen[2], 5000));
//        personen.add(new Werknemer("Caroline", "Delft", afdelingen[1], 4000));
//        personen.add(new Zzper("Klaas", "Diemen", afdelingen[3], 50.00));
//        personen.add(new Zzper("Ronald", "Zaandam", afdelingen[0], 80.00));
//        personen.add(new Zzper("Jannie", "Utrecht", afdelingen[0], 60.00));
//        personen.add(new Zzper("Anne", "Zwolle", afdelingen[0], 40.00));
//        personen.add(new Vrijwilliger("Ambi", "Amsterdam", afdelingen[0]));
//        personen.add(new Vrijwilliger("Naledi", "Gaborone", afdelingen[1]));
//        personen.add(new Vrijwilliger("Ceren", "Istanboel", afdelingen[2]));
//        personen.add(new Vrijwilliger("Haining", "Shaoxing", afdelingen[3]));
//
//
//        for (Persoon persoon : personen) {
//            if (persoon instanceof Zzper) {
//                ((Zzper) persoon).huurIn(320);
//            }
//        }
//        for (Persoon persoon : personen) {
//            if (persoon instanceof Vrijwilliger) {
//                ((Vrijwilliger) persoon).huurIn(160);
//            }
//        }
//
//        Collections.sort(personen);
//
//        for (Persoon persoon : personen){
//            System.out.println(persoon);
//            toonJaarInkomen(persoon);
//        }
//
//    }
//    public static void toonJaarInkomen (Persoon persoon){
//        System.out.printf(" %s verdient %s per jaar\n", persoon.getNaam(), persoon.berekenJaarInkomen());
//    }





