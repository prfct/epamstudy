package patterns.creational.singleton;

/**
 * @author Oleksii Petrokhalko.
 */
public class Synchronized {
    private static Synchronized instance;

    private Synchronized() {
    }

    public static synchronized Synchronized getInstance() {
        if (instance == null) {
            instance = new Synchronized();
        }
        return instance;
    }
}
