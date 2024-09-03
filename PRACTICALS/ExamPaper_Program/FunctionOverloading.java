/**
 * FunctionOverloading
 */
public class FunctionOverloading {

    public int multiplication(int n1, int n2)
    {
        return n1*n2;
    }
    public int multiplication(int n1, int n2, int n3)
    {
        return n1*n2*n3;
    }
    public int multiplication(int n1, int n2, int n3, int n4)
    {
        return n1*n2*n3*n4;
    }
    public static void main(String[] args) {
        System.out.println("Example of Function Overloading");
        System.out.println("Multiplicaton of Two numbers");
        FunctionOverloading F1 = new FunctionOverloading();
        System.out.println(F1.multiplication(12, 12));
        System.out.println("Multiplicaton of Three numbers");
        System.out.println(F1.multiplication(12, 12, 12));
        System.out.println("Multiplicaton of Four numbers");
        System.out.println(F1.multiplication(12, 12, 12, 12));
    }
}