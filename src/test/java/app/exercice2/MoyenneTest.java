package app.exercice2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
/**
 * la class des tests unitaire pour la fonction
 * qui retourne le plus petit
 */
public class MoyenneTest {
    /**
     * Teste la méthode "moyenne" sur un tableau contenant des valeurs positives et négatives.
     */
    @Test
    public void testMoyenneArrayPositifEtNegatif() {
        assertEquals(387.0, TabAlgos.moyenne(new int[]{-23, 0, -23, 65, 243, 13, 134, 987, 34, 500, -300, 134, -300, 5000, -657}));
    }

    /**
     * Teste la méthode "moyenne" sur un tableau contenant des valeurs positives.
     */
    @Test
    public void testMoyenneArrayPositif() {
        assertEquals(236.0, TabAlgos.moyenne(new int[]{12, 34, 1000, 342, 0, 134, 1, 19, 1000, 1, 56}));
    }

    /**
     * Teste la méthode "moyenne" sur un tableau contenant des valeurs négatives.
     */
    @Test
    public void testMoyenneArrayNegatif() {
        assertEquals(-50132.0, TabAlgos.moyenne(new int[]{-34, -47, -12, -66, -23, -99, -45, -1000, -500000, -1}));
    }

    /**
     * Teste la méthode "moyenne" sur un tableau vide.
     */
    @Test
    public void testMoyenneArrayVide() {
        try {
            assertEquals(0, TabAlgos.moyenne(new int[0]));
            fail("Une exception aurait dû être levée.");
        } catch (Exception e) {
            // TODO: Gérer l'exception
        }
    }

    /**
     * Teste la méthode "moyenne" sur un tableau contenant une seule valeur.
     */
    @Test
    public void testMoyenneArrayUneSeuleValeur() {
        assertEquals(6, TabAlgos.moyenne(new int[]{6}));
        assertEquals(0, TabAlgos.moyenne(new int[]{0}));
        assertEquals(-50000, TabAlgos.moyenne(new int[]{-50000}));
    }
}


