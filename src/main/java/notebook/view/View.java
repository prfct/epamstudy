package notebook.view;

/**
 * @author Oleksii Petrokhalko.
 */
public class View {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String message, String error) {
        System.out.println(message + error);
    }

}
