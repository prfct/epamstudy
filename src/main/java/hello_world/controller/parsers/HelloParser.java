package hello_world.controller.parsers;

/**
 * @author Oleksii Petrokhalko.
 */
public class HelloParser implements Parser {

    public String pars(String next) {
        String result = null;
        if ("Hello".equals(next)) {
            result = next;
        }
        return result;
    }

}
