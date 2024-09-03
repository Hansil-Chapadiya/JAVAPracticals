public class ExamPractice2_Triangle {
    public static void main(String[] args) throws IllegalArgumentException {
        try {
            TriangleImplementation triangle = new TriangleImplementation(3, 4, 5);
            triangle.getSide();
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
        } catch (IllegalArgumentException ie) {
            System.out.println(ie.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

abstract class Triangle {
    protected double side1, side2, side3;
    protected double area;
    protected double perimeter;
    protected boolean is_filled;

    Triangle() {
        side1 = side2 = side3 = 0;
        area = 0;
        perimeter = 0;
        is_filled = false;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    protected void getSide() {
        System.out.println("SIDE 1-2-3: " + side1 + " " + side2 + " " + side3);
    }

    protected void setSide(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    abstract protected double getArea();

    abstract protected double getPerimeter();
}

class TriangleImplementation extends Triangle {
    TriangleImplementation() {
        super();
    }

    TriangleImplementation(double side1, double side2, double side3) {
        super(side1, side2, side3);
    }

    protected double getArea() {
        // Using Heron's formula to calculate the area of the triangle
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    protected double getPerimeter() {
        return side1 + side2 + side3;
    }
}
