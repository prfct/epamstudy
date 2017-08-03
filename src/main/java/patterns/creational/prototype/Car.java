package patterns.creational.prototype;

/**
 * @author Oleksii Petrokhalko.
 */
public class Car implements Cloneable {
    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public Object clone() {
        return new Car(name, speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
