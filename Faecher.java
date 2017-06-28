package aufgabe6;

/** Faecher listet Facher auf.
 * @author Markus E.
 * @version 24.06.17
 */
public final class Faecher {

    /**Konstruktor.
     */
    private Faecher() {
    }

    private static final String[] FAECHER = {"Mathematik1",
                                             "Digitaltechnik",
                                             "ProgTechnik1",
                                             "SysMod",
                                             "Konsolidierung",
                                             "Studienmethodik"
        };

    /** Prueft, ob Note zulaessig.
     * @param f String f
     * @return boolean
     */
    public static boolean istZulaessig(final String f) {

        for (int i = 0; i < FAECHER.length; i++) {

            if (FAECHER[i].equals(f)) {

                return true;

            }

        }
        return false;
    }

}