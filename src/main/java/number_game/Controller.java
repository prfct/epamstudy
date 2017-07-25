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
        model.iniData();
        setExpectedValue();
        view.printMessage(View.FIND_NUMBER_FROM_MIN_MAX);
        while (true) {
            if (model.findExpectedValue(setActualValue(sc)) != 0) {
                view.printMessage(View.NUMBER_SHOULD_BE, model.getMin(), model.getMax());
            } else {
                view.printMessage(View.WIN, model.getHistory().size(), model.getHistoryOfTries());
                break;
            }
        }

    }

    private void setExpectedValue() {
        model.setExpectedValue();
        view.printMessage(View.SET_EXPECTED_VALUE);
    }

    private int setActualValue(Scanner sc) {
        while (true) {
            if (!sc.hasNextInt()) {
                view.printMessage(View.EMPTY_VALUE);
            } else {
                int actual = sc.nextInt();
                if (model.checkValue(actual)) {
                    return actual;
                } else {
                    view.printMessage(View.CORRECT_RANGE, model.getMin(), model.getMax());
                }
            }
            sc.nextLine();
        }

    }

}
