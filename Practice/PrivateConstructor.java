class PrivateConstructorTest {
    private int a, b;

    private PrivateConstructorTest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static PrivateConstructorTest createConst(int a, int b) {
        return new PrivateConstructorTest(a, b);
    }

    public int geta() {
        return a;
    }

    public int getb() {
        return b;
    }
}

/**
 * PrivateConstructor
 */
public class PrivateConstructor {

    public static void main(String[] args) {
        PrivateConstructorTest P1 = PrivateConstructorTest.createConst(10, 14);
        int a = P1.geta();
        int b = P1.getb();
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
}