interface AreaOfCircle{
    public double getCArea(double r);
}
interface AreaOfSquare{
    public double getSArea(double s);
}
public class MultipleInheritance implements AreaOfCircle, AreaOfSquare {
    @Override
    public double getCArea(double r) {
        return Math.PI*r*r;
    }
    @Override
    public double getSArea(double s) {
        return s*s;
    }
    public static void main(String[] args) {
        MultipleInheritance AreaOfCircle = new MultipleInheritance();
        System.out.println("Area Of Circle = " + AreaOfCircle.getCArea(23));
        MultipleInheritance AreaOfSquare = new MultipleInheritance();
        System.out.println("Area Of Circle = " + AreaOfSquare.getSArea(23));
    }
}

