package number_game.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oleksii Petrokhalko.
 */
public class Model {
    private static final int MIN_BAR = 0;
    private static final int MAX_BAR = 100;
    private int min;
    private int max;
    private int expectedValue;
    private List<Integer> history = new ArrayList<>();

    public int rand(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public int findExpectedValue(int actualValue) {
        history.add(actualValue);

        if (actualValue == expectedValue) {
            return 0;
        } else if (actualValue < expectedValue) {
            min = actualValue;
            return 1;
        } else {
            max = actualValue;
            return -1;
        }
    }

    public boolean checkValue(int input) {
        return input >= min && input <= max;
    }

    public void iniData() {
        min = MIN_BAR;
        max = MAX_BAR;
    }

    public void setExpectedValue() {
        expectedValue = rand(min, max);
    }

    public String getHistoryOfTries() {
        StringBuilder result = new StringBuilder();
        for (Integer integer : history) {
            result.append(integer).append(" ");
        }
        return result.toString();
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public List<Integer> getHistory() {
        return history;
    }

}
