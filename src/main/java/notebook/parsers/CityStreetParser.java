package notebook.parsers;

/**
 * @author Oleksii Petrokhalko.
 */
public class CityStreetParser implements Parser {
    private static final String CITY_STREET_PATTERN = "[a-zA-Z]*";

    @Override
    public boolean validate(String str) {
        return str.matches(CITY_STREET_PATTERN);
    }
}
