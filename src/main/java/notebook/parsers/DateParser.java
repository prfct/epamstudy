package notebook.parsers;

/**
 * @author Oleksii Petrokhalko.
 */
public class DateParser implements Parser {
    private static final String DATE_PATTERN = "[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1]) (2[0-3]|[01][0-9]):[0-5][0-9]";

    //2014-02-04 12:34
    @Override
    public boolean validate(String str) {
        return str.matches(DATE_PATTERN);
    }
}
