package notebook.parsers;

import java.util.regex.Pattern;

/**
 * @author Oleksii Petrokhalko.
 */
public interface Parser {
    boolean validate(String str);
}
