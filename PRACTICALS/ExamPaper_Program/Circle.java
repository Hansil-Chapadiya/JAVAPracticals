public class Circle {
    private double radius;

    public static void main(String args[]) {
        Circle c1 = new Circle(2);
        System.out.println("Area " + c1.getArea());
        B b1 = new B(2, 2);
        System.out.println("Area " + b1.getArea());
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class B extends Circle {
    private double length;

    B(double radius) {
        super(radius);
    }

    B(double radius, double length) {
        super(radius);
        this.length = length;
    }

    public double getArea() {
        return (super.getArea() * length);
    }
}
