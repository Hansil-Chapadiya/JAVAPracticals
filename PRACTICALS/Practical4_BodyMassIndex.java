import java.util.Scanner;

public class Practical4_BodyMassIndex {
    public static void main(String[] args) {
        double weight, height;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Weight in Pounds");
        weight = sc.nextDouble();

        System.out.println("Enter Your Height in Inches");
        height = sc.nextDouble();

        CalculateBodyMassIndex cbmi = new CalculateBodyMassIndex(weight, height);
        System.out.println("Your Body Mass Index(BMI) = " + cbmi.calculateBMI());

        sc.close();
    }
}

class CalculateBodyMassIndex {
    double weight_pounds;
    double height_inch;

    CalculateBodyMassIndex(double weight, double height) {
        this.weight_pounds = weight;
        this.height_inch = height;
    }

    public double getWeight() {
        return this.weight_pounds;
    }

    public double getHeight(){
        return this.height_inch;
    }

    public void setValues(double weight, double height) {
        weight_pounds = weight;
        height_inch = height;
    }

    public double calculateBMI() {
        double weight_kg = weight_pounds * 0.45359237;
        double height_meter = height_inch * 0.0254;
        return weight_kg / Math.pow(height_meter, 2);
    }

    protected void finalize() {
        System.out.println("Object is destroyed by the Garbage Collector");
    }
}