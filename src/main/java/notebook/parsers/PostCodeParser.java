package notebook.parsers;

/**
 * @author Oleksii Petrokhalko.
 */
public class PostCodeParser implements Parser {
    private static final String POST_CODE_PATTERN = "[0-9]{5}";

    @Override
    public boolean validate(String str) {
        return str.matches(POST_CODE_PATTERN);
    }

}
