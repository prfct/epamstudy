package hello_world;

import hello_world.controller.Controller;
import hello_world.model.Model;
import hello_world.view.View;

/**
 * @author Oleksii Petrokhalko.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
