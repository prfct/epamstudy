package controller;

import view.View;

import java.util.Scanner;

/**
 * @author Oleksii Petrokhalko.
 */
public class SecondCommand implements Command {
    private View view;

    public SecondCommand(View view) {
        this.view = view;
    }

    public String command(String next) {
        view.printMessage(View.INPUT_SECOND);
        if (next.equals("World")) {
            return next;
        } else {
            view.printMessage(View.WRONG_INPUT_DATA + View.INPUT_SECOND);
        }
        return next;
    }
}
