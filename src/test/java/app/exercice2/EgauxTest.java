package app.exercice2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

/**
 * Classe de tests pour la méthode "egaux"
 */
public class EgauxTest {
    /**
     * Teste la méthode "egaux" lorsque les deux tableaux sont identiques.
     */
    @Test
    public void testTableauxIdentiques() {
        assertEquals(true, TabAlgos.egaux(new int[]{12, 64, -35, 0, 57, -1, 9, 232, -124, 0, -6}, new int[]{12, 64, -35, 0, 57, -1, 9, 232, -124, 0, -6}));
    }

    /**
     * Teste la méthode "egaux" lorsque les deux tableaux sont totalement différents.
     */
    @Test
    public void testTableauxDifferents() {
        assertEquals(false, TabAlgos.egaux(new int[]{54, 70, 500, -2, 9, 90, -19, 80}, new int[]{12, 65, 13, -345, -1, 12, 45, -2}));
    }

    /**
     * Teste la méthode "egaux" lorsque les deux tableaux ont des éléments en commun.
     */
    @Test
    public void testTableauxAvecElementsCommuns() {
        assertEquals(false, TabAlgos.egaux(new int[]{45, 64, 34, -23, 500, 76, -250, -2}, new int[]{45, 64, 5, 34, 98, -17, 6, 501}));
    }

    /**
     * Teste la méthode "egaux" lorsque les deux tableaux sont vides.
     */
    @Test
    public void testTableauxVides() {
        assertEquals(true, TabAlgos.egaux(new int[0], new int[0]));
    }

    /**
     * Teste la méthode "egaux" lorsque les deux tableaux ont des longueurs différentes.
     */
    @Test
    public void testTableauxLongueursDifferentes() {
        try {
            assertEquals(false, TabAlgos.egaux(new int[]{23, 15, -12, 0}, new int[]{23, 15, -12, 0, 23, 99, 124, 500, -1}));
            fail("Une exception aurait pu être levée");
        } catch (Exception e) {
            // TODO: Gérer l'exception
        }
    }

    /**
     * Teste la méthode "egaux" si l'un des tableaux est vide et l'autre non.
     */
    @Test
    public void testTableauVideAutreNon() {
        try {
            assertEquals(false, TabAlgos.egaux(new int[]{12, 34, 53, -13, 67, 53, -123}, new int[0]));
            fail("On est censé lever une exception car l'un des tableaux est vide");
        } catch (Exception e) {
            // TODO: Gérer l'exception
        }
    }
    /**
     * Tester la méthode "egaux" quand les deux tableaux sont identiques mais pas dans le meme ordre 
     */
    @Test
    public void testTableauxIdentiquesDansOrdreDifferent() {
        assertEquals(false, TabAlgos.egaux(new int[]{23,76,-12,0,46,5000,-12,-777,0,-1} ,new int[]{-1,0,5000,23,0,76,-12,46,-777,-12}));
    }

}
