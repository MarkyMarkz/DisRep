package aufgabe6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * FachNotenListe.
 * @author Markus E.
 * @version 25.06.17
 */
public class FachNotenListe implements Iterable<FachNote> {

    private Element head = null;

    /**Konstruktor.
     */
    public FachNotenListe() {

        head = null;
    }

    /**FachNotenListe fuegt Elemente ein.
     * @param n FachNote n
     * @return FachNotenListe
     */

    public final FachNotenListe einfuegen(final FachNote n) {


        this.head = new Element(this.head, n);
        return this;
    }

    /**Innere Klasse Element.
     */
    private static final class Element {

        private final Element next;

        private FachNote fachNote;

        private Element(final Element e, final FachNote n) {

            fachNote = n;
            this.next = e;

        }

    }

    @Override
    public final Iterator<FachNote> iterator() {

        return new Iterator<FachNote>() {

            private Element current = FachNotenListe.this.head;

            @Override
            public boolean hasNext() {
                return this.current != null;
            }

            @Override
            public FachNote next() {
                if (this.current == null) {
                    throw new NoSuchElementException();
                }

                Element e = this.current;
                this.current = this.current.next;
                return e.fachNote;
            }


            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }


        };
    }
}
