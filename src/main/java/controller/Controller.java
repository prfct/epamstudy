package controller;

import controller.parsers.HelloParser;
import controller.parsers.Parser;
import controller.parsers.WorldParser;
import model.Model;
import view.View;

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
        model.setValue(parseValue(new HelloParser(), sc));
        model.addValue(parseValue(new WorldParser(), sc));

        view.printFinalMessage(View.OUR_VALUE, model.getValue());
    }

    private String parseValue(Parser parser, Scanner sc) {
        view.printMessage(View.INPUT_DATA);
        while (true) {
            String result = parser.pars(sc.next());
            if (result != null) {
                return result;
            }
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_DATA);
        }
    }
}
