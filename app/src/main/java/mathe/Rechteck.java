package mathe;

import org.decimal4j.util.DoubleRounder;

/**
 * ein Rechteck
 */
public class Rechteck {
    private final double  seiteA;
    private final double seiteB;

    @Override
    public String toString() {
        return "Rechteck mit den Seitenlängen a =" + seiteA +
                " und b =" + seiteB;
    }

    /**
     * erteugt ein Rechteck mit den angegebenen Seitenlängen
     * @param seiteA Länge der Seite a
     * @param seiteB Länge der Seite b
     * @throws IllegalArgumentException wenn nicht-positive Seitenlängen angegeben werden
     */
    public Rechteck(double seiteA, double seiteB) {
        if(seiteA <= 0 || seiteB <= 0)
            throw new IllegalArgumentException("Negative Seitenlänge eines Rechtecks");
        this.seiteA = seiteA;
        this.seiteB = seiteB;
    }

    /**
     * liefert die Länge der Diagonalen von this
     * @return Länge der Diagonalen von this
     */
    public double getDiagonale()
    {
        return DoubleRounder.round(Math.sqrt(Math.pow(this.seiteA, 2) + Math.pow(this.seiteB, 2)),2);
    }
}
