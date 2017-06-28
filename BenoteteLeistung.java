package aufgabe6;

import aufgabe4.Noten;

/**
 * BenoteteLeistung holt Note und arbeitet damit.
 * @author Markus E.
 * @version 25.06.17
 */
public class BenoteteLeistung extends FachNote {

    private final double note;

    /**
     * Konstruktor.
     * super spricht FachNote an.
     * @param fach String fach
     * @param note String note
     */
    public BenoteteLeistung(final String fach, final String note) {

        super(fach);
        if (Noten.istZulaessig(note)) {
            this.note = Noten.toDouble(note);

        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public final String getNote() {

        return Noten.toString(note);
    }

    @Override
    public final String getNoteInWorten() {


        if (note >= 1.0 && note <= 1.5) {
            return "sehr gut";
        } else if (note >= 1.6 && note <= 2.5) {
            return "gut";
        } else if (note >= 2.6 && note <= 3.5) {
            return "befriedigend";
        } else if (note >= 3.6 && note <= 4.0) {
            return "ausreichend";
        } else {
            return "nicht ausreichend";
        }
    }

    @Override
    public final boolean istBestanden() {

        if (Noten.istBestanden(note)) {

            return true;

        }
        return false;

    }

    @Override
    public final boolean istBenotet() {

        return true;
    }



}
