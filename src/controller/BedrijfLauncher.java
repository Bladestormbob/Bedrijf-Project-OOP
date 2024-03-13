package controller;

import database.AfdelingDAO;
import database.DBaccess;
import model.*;

import java.util.ArrayList;


/**
 * Hier de opdracht die je gaat maken
 *
 * @author B.J. Falkena
 */
public class BedrijfLauncher {
    //    public static void main(String[] args) throws FileNotFoundException {
//        Scanner keyboard = new Scanner(System.in);
//        File afdelingenBestand = new File("resources/Afdelingen.txt");
//        File personenBestand = new File("resources/Personen.csv");
//
//        ArrayList<Afdeling> afdelingen = new ArrayList<>();
//        ArrayList<Persoon> personen = new ArrayList<>();
//
//
//        try {
//            Scanner afdelingenScanner = new Scanner(afdelingenBestand);
//
//            while (afdelingenScanner.hasNextLine()) {
//                String afdelingsnaam = afdelingenScanner.nextLine();
//                String afdelingPlaats = afdelingenScanner.nextLine();
//
//
//                afdelingen.add(new Afdeling(afdelingsnaam, afdelingPlaats));
//            }
//
//        } catch (FileNotFoundException fileNotFoundException) {
//            System.out.println("Het bestand is niet gevonden");
//        }
//
//        try {
//            Scanner personenScanner = new Scanner(personenBestand);
//
//            while (personenScanner.hasNextLine()) {
//                String[] personenUitLijst = personenScanner.nextLine().split(",");
//
//                String rol = personenUitLijst[0];
//                String naam = personenUitLijst[1];
//                String woonplaats = personenUitLijst[2];
//                int afdeling = Integer.parseInt(personenUitLijst[3]);
//                double bedragen = Double.parseDouble(personenUitLijst[4]);
//
//                if ("Werknemer".equals(rol)) {
//                    personen.add(new Werknemer(naam, woonplaats, afdelingen.get(afdeling), bedragen));
//                } else if ("Zzper".equals(rol)) {
//                    personen.add(new Zzper(naam, woonplaats, afdelingen.get(afdeling), bedragen));
//                } else if ("Vrijwilliger".equals(rol)) {
//                    personen.add(new Vrijwilliger(naam, woonplaats, afdelingen.get(afdeling)));
//                }
//
//
//            }
//
//        } catch (FileNotFoundException fileNotFoundException) {
//            System.out.println("Het bestand is niet gevonden");
//        }
//
//        Collections.sort(personen);
//
//        try (PrintWriter personenSchrijver = new PrintWriter("resources/PersonenPerAfdeling")) {
//            for (Afdeling afdeling : afdelingen) {
//                personenSchrijver.printf("\nAfdeling: %s\n", afdeling.getAfdelingsNaam());
//
//                for (Persoon persoon : personen) {
//                    if (persoon.getAfdeling().getAfdelingsNaam().equals(afdeling.getAfdelingsNaam())) {
//                        personenSchrijver.printf("\n-- %s", persoon);
//
//                    }
//                }
//                personenSchrijver.println();
//            }
//
//        }
//        catch (FileNotFoundException fileNotFoundException) {
//            System.out.println("Het bestand is niet gevonden");
//        }
//
//
//
//
//
//    }
    public static void main(String[] args) {
        DBaccess dBaccess = new DBaccess("Bedrijf", "userBedrijf", "userBedrijfPW");
        dBaccess.openConnection();
        AfdelingDAO afdelingDAO = new AfdelingDAO(dBaccess);
        afdelingDAO.slaAfdelingOp(new Afdeling("HR", "Hilversum"));

        System.out.println("----- Alle afdelingen -----");
        ArrayList<Afdeling> afdelingen = afdelingDAO.geefAfdelingen();
        for (Afdeling afdeling : afdelingen) {
            System.out.println(afdeling);
        }
        System.out.println();
        System.out.println("----- Afdelingen in Hilversum -----");
        ArrayList<Afdeling> afdelingenHilversum = afdelingDAO.geefAfdelingenMetPlaats("Hilversum");
        for (Afdeling afdeling : afdelingenHilversum) {
            System.out.println(afdeling);
        }

        dBaccess.closeConnection();
    }


}













//        ArrayList<Persoon> personen = new ArrayList<>();
//
//        double maandsalaris = 0;
//
//                System.out.print("geef de naam: ");
//                String naam = keyboard.nextLine();
//                System.out.print("Geef de woonplaats: ");
//                String woonplaats = keyboard.nextLine();
//                System.out.print("geef de naam van de afdeling: ");
//                String afdelingNaam = keyboard.nextLine();
//                System.out.print("geef de plaats van de afdeling: ");
//                String afdelingPlaats = keyboard.nextLine();
//
//            while (maandsalaris <= 0) {
//                try {
//                    System.out.print("Geef het maandsalaris: ");
//                    maandsalaris = keyboard.nextDouble();
//
//                    personen.add(new Werknemer(naam, woonplaats, new Afdeling(afdelingNaam, afdelingPlaats), maandsalaris));
//                    System.out.printf("%s",personen.get(0));
//
//
//                } catch (IllegalArgumentException illegalArgumentException) {
//                    System.out.println(illegalArgumentException.getMessage());
//                } finally {
//                    System.out.println();
//                    System.out.println("Je invoer is correct afgehandeld");
//                }
//            }
//






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





