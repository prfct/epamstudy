package notebook.parsers;

/**
 * @author Oleksii Petrokhalko.
 */
public class AnyParser implements Parser {
    private static final String ANY = ".*";
    @Override
    public boolean validate(String str) {
        return str.matches(ANY);
    }
}
