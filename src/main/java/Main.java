import controller.Controller;
import model.Model;
import view.View;

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
