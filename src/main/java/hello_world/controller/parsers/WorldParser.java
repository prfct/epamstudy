package hello_world.controller.parsers;

/**
 * @author Oleksii Petrokhalko.
 */
public class WorldParser implements Parser {

    public String pars(String next) {
        String result = null;
        if ("World".equals(next)) {
            result = next;
        }
        return result;
    }
}
