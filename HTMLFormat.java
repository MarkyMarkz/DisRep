package aufgabe6;

import java.io.PrintWriter;

/**
 * Erstellt die hmtl Datei.
 * @author Markus E.
 * @version 25.06.17
 */
public final class HTMLFormat {

    /**Konstruktor.
     */
    private HTMLFormat() {
    }

    /**
     * gibt ausgabe, name und notenListe aus.
     * @param ausgabe PrintWriter ausgabe
     * @param name String[] name
     * @param notenListe FachNotenListe notenListe
     */
    public static void ausgeben(final PrintWriter ausgabe,
                                final String[] name,
                                final FachNotenListe notenListe) {

        ausgabe.printf("<!DOCTYPE html>%n" + "<html lang =\"de\">%n"
                        + "<head>%n"
                        + "<meta charset=\"utf-8\">%n"
                        + "<meta name=\"viewport\""
                        + " content=\"width=device-width, initial-scale=1.0\">"
                        + "<title>Notenspiegel</title>%n"
                        + "</head>%n"
                        + "<body>%n"
                        + "<h1>Notenspiegel für: %n");

        for (String s : name) {
            ausgabe.println(s);
        }

        ausgabe.printf("</h1>%n<hr>");

        ausgabe.println("<table width=\"100%\"><tr><th align=\"left\">"
                        + "Fach:</th><th align=\"left\">Art:</th><th align"
                        + "=\"left\">"
                        + "Note:</th></tr>");

        for (FachNote fachNote : notenListe) {
            if (!fachNote.istBenotet()) {
                //das Julian Theorem
                if (Noten.istBestanden(fachNote)) {
                    //setcolor black
                } else {
                    // red
                }
                ausgabe.printf("<tr><td>%s</td><td>S</td><td>%s</td></tr>%n",
                               fachNote.getFach(), fachNote.getNoteInWorten());
            } else {
                
                //insert Julian T
                ausgabe.printf("<tr><td>%s</td><td>L</td><td>"
                               + "%s (%s)</td></tr>%n", fachNote.getFach(),
                               fachNote.getNoteInWorten(), fachNote.getNote());
            }
        }

        ausgabe.printf("</table>%n <hr>%n L = Leistungsnachweis, S = Schein%n"
                        + "</body>%n</html>");

    }
}
