/**
 * inheritedClass1
 */
abstract class Parents {
    protected double r;
    abstract double area();
}
class Child extends Parents{
    Child(double r){
        this.r = r;
    }
    double area(){
        return (Math.PI*r*r);
    }
}
public class inheritedClass1 {
    public static void main(String[] args) {
        Parents p1 = new Child(10);
        System.out.println(p1.area()); 
    }
}

