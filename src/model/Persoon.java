package model;

/**
 * hier de opdracht die je gaat maken
 *
 * @author B.J. Falkena
 */
public abstract class Persoon implements Comparable<Persoon> {

    public static int aantalPersonen = 0;
    protected static final String DEFAULT_NAAM = "onbekend";
    protected static final String DEFAULT_WOONPLAATS = "onbekend";

    protected int personeelsNummer;
    protected String naam;
    protected String woonplaats;
    protected Afdeling afdeling;



    public Persoon(String naam, String woonplaats, Afdeling afdeling) {
        setNaam(naam);
        setWoonplaats(woonplaats);
        setAfdeling(afdeling);
        this.personeelsNummer = ++aantalPersonen;
    }

    public Persoon(String naam) {
        this( naam, DEFAULT_WOONPLAATS, new Afdeling());
    }

    public Persoon() {
        this(DEFAULT_NAAM);
    }

    public abstract double berekenJaarInkomen();

    @Override
    public String toString() {
        return String.format("%s woont in %s en werkt op %s",naam, woonplaats, afdeling.toString());
    }

    public int compareTo(Persoon anderPersoon){
        return this.naam.compareTo(anderPersoon.getNaam());
    }

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public void setPersoneelsNummer(int personeelsNummer) {
        this.personeelsNummer = personeelsNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }


    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }
}

