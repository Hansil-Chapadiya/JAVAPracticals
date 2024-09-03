import java.util.Scanner;
public class Practical3_MeterToFeet {
    public static void main(String[] args)
    {
        double meter, feet;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in meter");
        meter = sc.nextDouble();
        feet = meter * 3.28084;
        System.out.println("Meter = " + meter + " To Feet = " + feet);
        sc.close();

        Student s1 = new Student();
        s1.setData(11122345, "steve");
        s1.display();
    }
}

class Student{
    static long enr_no;
    String name;
    void display()
    {
        System.out.println("Name = " + this.name + "\nEnrollement = " + enr_no);
    }
    void setData(long enr_no, String name)
    {
        Student.enr_no = enr_no;
        this.name  = name;
    }
}