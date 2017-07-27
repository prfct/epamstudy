package notebook;

/**
 * @author Oleksii Petrokhalko.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new View());
        controller.process();
    }
}
