class A{
    int rollno;
    void method(int r){
        rollno = r;
        System.out.println(10);
    }
}
class B extends A{
    int rollno2;
    void method(int r2){
        rollno2 = r2;
        System.out.println(14);
        super.method(10);
    }
}
public class override {
    public static void main(String[] args) {
        B b = new B();
        b.method(2);
    }
}
