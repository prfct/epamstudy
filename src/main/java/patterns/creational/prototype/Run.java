package patterns.creational.prototype;

/**
 * @author Oleksii Petrokhalko.
 */
public class Run {
    public static void main(String[] args) {
        Car original = new Car("bmw", 320);
        System.out.println(original);
        Car clone = (Car) original.clone();
        System.out.println(clone);
        System.out.println(original == clone);
    }
}
