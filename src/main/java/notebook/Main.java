package notebook;

import notebook.controller.Controller;
import notebook.view.View;

/**
 * @author Oleksii Petrokhalko.
 */
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new View());
        controller.process();
    }
}
