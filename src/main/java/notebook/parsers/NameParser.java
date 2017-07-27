package notebook.parsers;

import javax.print.attribute.standard.MediaSize;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Oleksii Petrokhalko.
 */
public class NameParser implements Parser {
    private static final String NAME_PATTERN = "^[a-zA-Z]+(([\\'\\,\\.\\- ][a-zA-Z ])?[a-zA-Z]*)*$";

    @Override
    public boolean validate(String str) {
        return str.matches(NAME_PATTERN);
    }
}
