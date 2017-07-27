package notebook.parsers;

/**
 * @author Oleksii Petrokhalko.
 */
public class HouseFlatPattern implements Parser {
    private static final String HOUSE_PATTERN = "[0-9]{1,5}[a-z]?";

    @Override
    public boolean validate(String str) {
        return str.matches(HOUSE_PATTERN);
    }
}
