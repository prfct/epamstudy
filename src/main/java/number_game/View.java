package number_game;

/**
 * @author Oleksii Petrokhalko.
 */
public class View {
    public static final String FIND_NUMBER_FROM_MIN_MAX = "Try to find number ";
    public static final String SET_EXPECTED_VALUE = "Expected value set";
    public static final String EMPTY_VALUE = "Please enter number!";
    public static final String CORRECT_RANGE = "Number should be from %d to %d";
    public static final String NUMBER_SHOULD_BE = "Number should be  from %d to %d";
    public static final String WIN = "You win! Quantity of tries: %d. History of tries: %s";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(String message, int min, int max) {
        System.out.println(String.format(message, min, max));
    }

    public void printMessage(String message, int quantity, String historyOfTries) {
        System.out.println(String.format(message, quantity, historyOfTries));
    }
}
