public class Practical3_23 {
    public static void main(String[] args) {
        Circle c1  =  new Circle(1.1, "Aqua");
        System.out.println(c1.toString());
        Circle c2 = new Circle(2.2);
        System.out.println(c2);
        Circle c3 = new Circle();
        System.out.println(c3);

    }
}
class Circle{
    double radius;
    String color;
    Circle(){
        radius = 1.0;
        color = "Red";
    }
    Circle(double r, String c){
        radius = r;
        color = c;
    }
    Circle(double r){
        radius = r;
        color = "Red";
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String c){
        this.color = c;
    }
    public String toString(){
        return "Circle[ Radius = " + this.radius + ", color = " + this.color + " ]";
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumFerence(){
        return 2 * Math.PI * radius;
    }

} 
