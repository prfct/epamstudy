package hello_world.model;

/**
 * @author Oleksii Petrokhalko.
 */
public class Model {
    private String value;

    public String addValue(String str) {
        return value += " " + str;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
