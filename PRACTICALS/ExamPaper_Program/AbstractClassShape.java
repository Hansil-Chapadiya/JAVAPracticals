import java.util.Scanner;

public class AbstractClassShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = null;

        while (true) {
            System.out.println("Choose a shape to calculate the area:");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        shape = new Triangle(sc);
                        break;
                    case 2:
                        shape = new Rectangle(sc);
                        break;
                    case 3:
                        shape = new Circle(sc);
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                }

                if (shape != null) {
                    double area = shape.area();
                    System.out.println("The area is: " + area);
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // Clear the invalid input
            }
        }
    }
}

abstract class Shape {
    protected Scanner sc;

    public Shape(Scanner sc) {
        this.sc = sc;
    }

    abstract public double area();
}

class Triangle extends Shape {
    public Triangle(Scanner sc) {
        super(sc);
    }

    @Override
    public double area() {
        System.out.println("Enter Value of Base");
        double base = sc.nextDouble();

        System.out.println("Enter Value of Height");
        double height = sc.nextDouble();

        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    public Rectangle(Scanner sc) {
        super(sc);
    }

    @Override
    public double area() {
        System.out.println("Enter Value of Length");
        double length = sc.nextDouble();

        System.out.println("Enter Value of Breadth");
        double breadth = sc.nextDouble();

        return length * breadth;
    }
}

class Circle extends Shape {
    public Circle(Scanner sc) {
        super(sc);
    }

    @Override
    public double area() {
        System.out.println("Enter value of radius");
        double radius = sc.nextDouble();

        return Math.PI * radius * radius;
    }
}
