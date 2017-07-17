package controller;

import view.View;

import java.util.Scanner;

/**
 * @author Oleksii Petrokhalko.
 */
public class FirstCommand implements Command {
    private View view;

    public FirstCommand(View view) {
        this.view = view;
    }

    public String command(String next) {
        view.printMessage(View.INPUT_FIRST);
            if (next.equals("Hello")) {
                return next;
            } else {
                view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_FIRST);
            }
        return next;
    }

}
