package model;

/**
 * hier de opdracht die je gaat maken
 *
 * @author B.J. Falkena
 */
public class Vrijwilliger extends Persoon implements Oproepbaar {

private int urenGewerkt;

    public Vrijwilliger(String naam, String woonplaats, Afdeling afdeling) {
        super(naam, woonplaats, afdeling);
        this.urenGewerkt = 0;
    }

    @Override
    public double berekenJaarInkomen() {
        return 0;
    }
    @Override
    public String toString() {
        return String.format("%s en is eeen vrijwilliger", super.toString());
    }

    @Override
    public void huurIn(int uren) {
        urenGewerkt += uren;

    }
}