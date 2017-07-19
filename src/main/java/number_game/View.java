package number_game;

/**
 * @author Oleksii Petrokhalko.
 */
public class View {
    public static final String MIN_MAX = "Enter min and max value ";
    public static final String FIND_NUMBER_FROM_MIN_MAX = "Try to find number ";
    public static final String EMPTY_VALUE = "Please enter positive number!";
    public static final String CORRECT_RANGE = "Number should be from %d to %d";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String message, int min, int max) {
        System.out.println(String.format(message, min, max));
    }
}
