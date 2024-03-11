package model;

/**
 * hier de opdracht die je gaat maken
 *
 * @author B.J. Falkena
 */
public class Werknemer extends Persoon{

    private static double GRENSWAARDE_BONUS = 4500.00;
    protected static final int DEFAULT_MAANDSALARIS = 0;
    private double maandSalaris;

    public Werknemer(String naam, String woonplaats, Afdeling afdeling, double maandSalaris) {
        super(naam, woonplaats, afdeling);
        setMaandSalaris(maandSalaris);

    }
    public Werknemer(String naam) {
        this(naam,DEFAULT_WOONPLAATS, new Afdeling(), DEFAULT_MAANDSALARIS);
    }
    public Werknemer(){
        this(DEFAULT_NAAM);
    }
    public boolean heeftRechtOpBonus() {
        return maandSalaris >= GRENSWAARDE_BONUS;
    }


    @Override
    public double berekenJaarInkomen(){
        double jaarInkomen = 12 * maandSalaris;
        if (heeftRechtOpBonus()) {
            jaarInkomen += maandSalaris;
        }
        return jaarInkomen;
    }

    private void setMaandSalaris(double maandSalaris) {
        if (maandSalaris < DEFAULT_MAANDSALARIS) {
            throw new IllegalArgumentException("maandsalaris moet positief zijn");
        }
        this.maandSalaris = maandSalaris;
    }
    public double getMaandSalaris() {
        return maandSalaris;
    }

    @Override
    public String toString() {
        return String.format("%s en is een werknemer  %s recht op een bonus",
                super.toString(), heeftRechtOpBonus()? "met" : "zonder");
    }



}