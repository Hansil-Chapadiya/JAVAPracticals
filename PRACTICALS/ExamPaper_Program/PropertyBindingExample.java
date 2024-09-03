import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class PropertyBindingExample {
    public static void main(String[] args) {
        DoubleProperty a = new SimpleDoubleProperty(1);
        DoubleProperty b = new SimpleDoubleProperty(2);

        b.bind(a.multiply(2));
        System.out.println("a: " + a.get() + ", b: " + b.get());

        a.set(3);
        System.out.println("a: " + a.get() + ", b: " + b.get());
    }
}
