package number_game;


import java.util.Scanner;

/**
 * @author Oleksii Petrokhalko.
 */
public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);
        setExpectedValue();
        setActualValue(sc);

    }

    private void setExpectedValue() {
        view.printMessage(View.FIND_NUMBER_FROM_MIN_MAX);
        model.setExpectedValue(model.rand(model.getMin(), model.getMax()));
    }

    private void setActualValue(Scanner sc) {
        view.printMessage(View.FIND_NUMBER_FROM_MIN_MAX);
        while (true) {
            if (!sc.hasNextInt()) {
                view.printMessage(View.EMPTY_VALUE);
            } else {
                if (sc.nextInt() >= model.getMin() && sc.nextInt() <= model.getMax()) {
                    if (model.findExpectedValue(sc.nextInt())) {
                        break;
                    }
                } else {
                    view.printMessage(View.CORRECT_RANGE, model.getMin(), model.getMax());
                }
                sc.nextLine();
            }
        }

    }

}
