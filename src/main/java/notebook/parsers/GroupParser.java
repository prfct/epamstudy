package notebook.parsers;

/**
 * @author Oleksii Petrokhalko.
 */
public class GroupParser implements Parser {
    private static final String ENUM_PATTERN = "FRIENDS|FAMILY|WORK";

    @Override
    public boolean validate(String str) {
        return str.matches(ENUM_PATTERN);
    }
}
