package notebook.parsers;

/**
 * @author Oleksii Petrokhalko.
 */
public class EmailParser implements Parser {
    private static final String EMAIL_PATTERN = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";

    @Override
    public boolean validate(String str) {
        return str.matches(EMAIL_PATTERN);
    }
}
