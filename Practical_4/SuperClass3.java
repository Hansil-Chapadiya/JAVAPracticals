class Weight{
    double w;
    Weight(){
        w = 10;
    }
    Weight(double w){
        this.w = w;
    }
    void get(){
        System.out.println("Weight = " + w);
    }
}
class BoxColor extends Weight{
    String bcolor;
    BoxColor(){
        super(10);
        bcolor = "Scarlet RED";
    }
    BoxColor(String bcolor){
        this.bcolor = bcolor;
    }
    void get(){
        super.get();
        System.out.println("BoxColor = " + bcolor);
    }
}
public class SuperClass3 {
    public static void main(String[] args) {
        Weight b1 = new BoxColor();
        b1.get();
    }
}