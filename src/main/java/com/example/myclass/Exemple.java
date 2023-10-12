package com.example.myclass;

/***
 *  Exemple du premier devoir .
 * @author fawzi.ouaheb@gmail.com
 */

public class Exemple {
    private final String t;
    private final int v;
    /**
     * le constructeur de la class Exemple .
     * @param t
     */

    public Exemple(String t) {
        this.t = t;
    }
    /**
     * get the value of V .
     * @return la valeur de v
     */
    public int getV() {
        return this.v;
    }
    /**
     * set the value of v .
     * @param v
     */
    public final void setV(int v) {
        this.v = v;
    }

    /**
     *@return t si v est positif
     */
    public final String getT() {
        if (v > 0) {
            return this.t;
        }
    }
}
