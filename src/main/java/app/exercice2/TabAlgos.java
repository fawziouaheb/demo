package app.exercice2;

/**
 * cette class impléménte des fonctions qui renvoie soit le
 * plus grand le plus petit ou la moyenne dans un tableau .
 **/
public final class TabAlgos {
/**
 * le constructeur de la class TabAlgos .
 */
private TabAlgos() {  }
/**
 * Renvoie la valeur la plus grande d'un tableau .
 * @param tab le tableau en question
 * @throw IllegalArgumentException si tab et null ou vide.
 * @return retourner la plus grande valeur du tableau
 **/
public static int plusGrand(final int[] tab) {
    if (tab.length == 0) {
        throw new IllegalArgumentException("le tableau est null");
    }
    int max = tab[0];
    for (int i : tab) {
        if (i > max) {
           max = i;
        }
    }
    return max;
}
/**
 * Renvoie la moyenne du tableau .
 * @param tab le tableau en question
 * @throw IllegalArgumentException si tab et null ou vide.
 * @return la moyenne du tableau
 */
public static double moyenne(final int[] tab) {
    if (tab.length == 0) {
        throw new IllegalArgumentException("le tableau est vide");
    }
    int somme = 0;
    for (int i : tab) {
        somme = somme + i;
    }
    return (double) somme / (double) tab.length;
 }
 /**
  * Renvoie un boolean si les deux tableaux sont identique .
  * les valeurs sont dans le meme ordre
  * @param tab1 le premier tableau à comparer
  * @param tab2 le deuxième tableau à comparer
  * @return retourner un booléan si les deux tableaux sont identique
  */
public static boolean egaux(final int[] tab1, final int[] tab2) {
    if (tab1.length != tab2.length) {
        throw new IllegalArgumentException("no identique length");
    }
    boolean identique = true;
    int index = 0;
    while (identique && index < tab1.length) {
        if (tab1[index] != tab2[index]) {
            identique = false;
            continue;
        }
        index++;
    }
    return identique;
}

}


