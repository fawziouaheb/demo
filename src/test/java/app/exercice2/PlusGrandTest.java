package app.exercice2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
/**
 * la class des tests pour la methode plusGrand
 */
public class PlusGrandTest {
    /**
     * Teste la méthode "PlusGrand" lorsque le contenu du tableau est positif.
     */
    @Test
    public void testPlusGrandArrayPositif() {
        assertEquals(6000, TabAlgos.plusGrand(new int[]{8, 17, 6000, 134, 123, 1000, 65, 17, 123, 565}));
        assertEquals(6000, TabAlgos.plusGrand(new int[]{8, 17, 6000, 134, 123, 0, 1000, 65, 17, 123, 565}));
    }

    /**
     * Teste la méthode "plusGrand" lorsque les valeurs du tableau sont négatives.
     */
    @Test
    public void testPlusGrandArrayNegatif() {
        assertEquals(-2, TabAlgos.plusGrand(new int[]{-12, -2, -76, -234, -765, -100, -1000, -13, -45, -565}));
        assertEquals(0, TabAlgos.plusGrand(new int[]{-12, -2, -76, -234, 0, -765, -100, -1000, -1, -45, -565}));
    }

    /**
     * Teste la méthode "plusGrand" lorsque les valeurs du tableau sont négatives et positives.
     */
    @Test
    public void testPlusGrandArrayNegatifEtPositif() {
        assertEquals(59000, TabAlgos.plusGrand(new int[]{-56, 100, 1, -78, 123, 6, -1000, 87, -45, 1000, 675, -235, 59000, 124, -90, -10000}));
    }

    /**
     * Teste la méthode "plusGrand" lorsque le tableau est vide.
     */
    @Test
    public void testPlusGrandArrayVide() {
        try {
            assertEquals(0, TabAlgos.plusGrand(new int[0]));
            fail("Une exception aurait pu être levée");
        } catch (Exception e) {
            // TODO: Gérer l'exception
        }
    }

    /**
     * Teste la méthode "plusGrand" lorsque le tableau contient une seule valeur, qu'elle soit positive ou négative.
     */
    @Test
    public void testPlusGrandArrayUneSeuleValeur() {
        assertEquals(37, TabAlgos.plusGrand(new int[]{37}));
        assertEquals(-6, TabAlgos.plusGrand(new int[]{-6}));
        assertEquals(0, TabAlgos.plusGrand(new int[]{-0}));
    }
}
