package number_game;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Oleksii Petrokhalko.
 */
public class Model {
    private int min;
    private int max = 100;
    private int expectedValue;
    private int actualValue;
    private int count;
    private List<Integer> history = new ArrayList<>();

    public int rand(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public boolean findExpectedValue(int actualValue) {
        history.add(actualValue);
        count++;
        if (actualValue == expectedValue) {
            return true;
        }
        return false;
    }

    public int getCount() {
        return count;
    }
    public int getExpectedValue() {
        return expectedValue;
    }

    public void setExpectedValue(int expectedValue) {
        this.expectedValue = expectedValue;
    }

    public int getActualValue() {
        return actualValue;
    }

    public void setActualValue(int actualValue) {
        this.actualValue = actualValue;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public List<Integer> getHistory() {
        return history;
    }

}
