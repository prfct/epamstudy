package notebook;

import notebook.parsers.Parser;

import java.util.Scanner;

/**
 * @author Oleksii Petrokhalko.
 */
public class InputAndCheckData {
    Scanner sc = new Scanner(System.in);

    public String checkInputData(String input, Parser parser, View view) {
        view.printMessage(input);

        while (true) {
            String result = sc.nextLine();
            if (!parser.validate(result)) {
                view.printMessage(Constants.WRONG_INPUT);
            } else {
                return result;
            }

        }

    }

}
