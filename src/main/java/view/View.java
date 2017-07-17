package view;

/**
 * @author Oleksii Petrokhalko.
 */
public class View {
    public static final String INPUT_FIRST = "Input first value = ";
    public static final String INPUT_SECOND = "Input second value = ";
    public static final String INPUT_DATA = "Input  value = ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String OUR_VALUE = "Value = ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printFinalMessage(String message, String value) {
        System.out.println(message + value);

    }

}
