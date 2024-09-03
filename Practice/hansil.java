public class hansil {
    public static void main(String[] args) {
        A a1 = new B();
        a1.GetValue();
        a1 = new C();
        a1.GetValue();
   }
    
}
interface A{
    int a = 10; 
    void GetValue();
}
class B implements A{
    int b=14;
    public void GetValue(){
        System.out.println(a);
    }

}
class C extends B{
    public void GetValue(){
        System.out.println(b);
    }   
}
