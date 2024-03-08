package model;

/**
 * hier de opdracht die je gaat maken
 *
 * @author B.J. Falkena
 */
public class Afdeling {

    private static final String DEFAULT_AFDELING_NAAM = "onbekend";
    private static final String DEFAULT_AFDELING_PLAATS = "onbekend";
    private String afdelingsNaam;
    private String afdelingsPlaats;

    public Afdeling(String afdelingsNaam, String afdelingsPlaats) {
        setAfdelingsNaam(afdelingsNaam);
        setAfdelingsPlaats(afdelingsPlaats);
    }
    public Afdeling() {
        this(DEFAULT_AFDELING_NAAM, DEFAULT_AFDELING_PLAATS);

    }

    @Override
    public String toString() {
        return String.format("afdeling %s te %s", afdelingsNaam, afdelingsPlaats);
    }

    public String getAfdelingsNaam() {
        return afdelingsNaam;
    }

    public void setAfdelingsNaam(String afdelingsNaam) {
        this.afdelingsNaam = afdelingsNaam;
    }

    public String getAfdelingsPlaats() {
        return afdelingsPlaats;
    }

    public void setAfdelingsPlaats(String afdelingsPlaats) {
        this.afdelingsPlaats = afdelingsPlaats;
    }
}