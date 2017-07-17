package controller;

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
        model.setValue(parseValue(new FirstCommand(view), sc));
        model.addValue(parseValue(new SecondCommand(view), sc));

        view.printFinalMessage(View.OUR_VALUE, model.getValue());
    }

    public String parseValue(Command command, Scanner sc) {
        while (sc.hasNext()){
            command.command(sc.next());
        }
        return sc.next();
    }

}
