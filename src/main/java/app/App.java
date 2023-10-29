package app;

import app.exercice1.question2.Exemple;

/**
 * Hello world!
 */
public final class App {
    /**
     * le constructeur de la class main .
     */
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program .
     */
    public static void main(final String[] args) {
        System.out.println("Hello World!");
        try {
            Exemple test = new Exemple("fawzi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
