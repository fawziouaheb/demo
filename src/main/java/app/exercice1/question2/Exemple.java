package app.exercice1.question2;
/***
 *  Exemple du premier devoir .
 * @author fawzi.ouaheb@gmail.com
 */
public class Exemple {
/**
 * Cette variable représente une chaîne de caractères immuable (final).
 * Elle est utilisée pour stocker...
 */
private String t;
/**
 * v c'est un entier .
 */
 private int v;
/**
 * le constructeur de la class Exemple .
 * @param var1 le praramtre
 */
public Exemple(final String var1) {
this.t = var1;
}
/**
* @return la valeur de v
*/
public int getV() {
return this.v;
}
/**
 * set the value of v .
 * @param var notre variable
 */
public final void setV(final int var) {
    this.v = var;
}
/**
 * @return t si v est positif
 */
public final String getT() {
if (v > 0) {
    return t;
}
return t;
}
}
