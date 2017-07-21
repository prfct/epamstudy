package number_game;

import number_game.model.Model;

/**
 * @author Oleksii Petrokhalko.
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);

        controller.processUser();


    }
}
