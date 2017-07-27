package notebook.parsers;

/**
 * @author Oleksii Petrokhalko.
 */
public class PhoneParser implements Parser {
    private static final String PHONE_PATTERN = "^(\\(?\\+?[0-9]*\\)?)?[0-9_\\- \\(\\)]*$";

    @Override
    public boolean validate(String str) {
        return str.matches(PHONE_PATTERN);
    }
}
