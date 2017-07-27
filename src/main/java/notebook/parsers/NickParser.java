package notebook.parsers;

/**
 * @author Oleksii Petrokhalko.
 */
public class NickParser implements Parser{
    private static final String NICK_PATTERN = "^[a-zA-Z][a-zA-z0-9\\.,\\-_]{5,31}$";

    @Override
    public boolean validate(String str) {
        return str.matches(NICK_PATTERN);
    }

}
