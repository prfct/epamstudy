package patterns.creational.builder;

/**
 * @author Oleksii Petrokhalko.
 */
public class Run {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new ConcreteRecord());
        System.out.println(director.buildRecord());

    }
}
