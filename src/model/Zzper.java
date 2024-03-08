package model;

/**
 * hier de opdracht die je gaat maken
 *
 * @author B.J. Falkena
 */
public class Zzper extends Persoon{

    private static  final int DEFAULT_UREN_GEWERKT =0;

    private double uurtarief;
    private int urenGewerkt;

    public Zzper(String naam, String woonplaats, Afdeling afdeling, double uurtarief) {
        super(naam, woonplaats, afdeling);
        setUurtarief(uurtarief);
    }

    public void huurIn(int ingehuurd){
        if(urenGewerkt < DEFAULT_UREN_GEWERKT){
            urenGewerkt = DEFAULT_UREN_GEWERKT;
        } else {
            urenGewerkt = urenGewerkt + ingehuurd;
        }

    }

    @Override
    public String toString() {
        return String.format("%s, en is een Zzper met een uurtarief van %s", super.toString(), this.uurtarief);
    }

    public double berekenJaarInkomen() {
        return uurtarief * urenGewerkt;
    }

    public double getUurtarief() {
        return uurtarief;
    }

    public void setUurtarief(double uurtarief) {
        this.uurtarief = uurtarief;
    }

    public int getUrenGewerkt() {
        return urenGewerkt;
    }

    public void setUrenGewerkt(int urenGewerkt) {
        this.urenGewerkt = urenGewerkt;
    }
}