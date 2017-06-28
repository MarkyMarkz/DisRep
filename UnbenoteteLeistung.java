package aufgabe6;


/**
 * Gibt Eigenschaften der unbenoteten Leistung aus.
 * @author Markus E.
 * @version 25.06.17
 */
public class UnbenoteteLeistung extends FachNote {

    private final boolean bestanden;

    /**Konstr.
     * @param fach String fach
     * @param bestanden boolean bestanden
     */
    public UnbenoteteLeistung(final String fach, final boolean bestanden) {

        super(fach);
        this.bestanden = bestanden;
    }

    /**falls bestanden, gibt bestanden aus.
     * @return boolean;
     */
    @Override
    public final boolean istBestanden() {

        return bestanden;
    }

    /**gibt aus, ob benotet.
     * @return boolean;
     */
    @Override
    public final boolean istBenotet() {

        return false;
    }




}
