public class InterfaceInheritance {
    public static void main(String[] args) {
        Q result = new Q();
        result.getConstant1();
        result.getConstant2();
        result.getConstant3();
        result.getConstant4();
    }
}

interface P {
    double constant1 = 14.00;
    void getConstant1();
}

interface P1 extends P {
    double constant2 = 21.00;
    void getConstant2();
}

interface P2 extends P {
    double constant3 = 14.00;
    void getConstant3();
}

interface P12 extends P1, P2 {
    double constant4 = 21.00;
    void getConstant4();
}

class Q implements P12 {
    @Override
    public void getConstant1() {
        System.out.println("Constant 1 = " + P.constant1);
    }

    @Override
    public void getConstant2() {
        System.out.println("Constant 2 = " + P1.constant2);
    }

    @Override
    public void getConstant3() {
        System.out.println("Constant 3 = " + P2.constant3);
    }

    @Override
    public void getConstant4() {
        System.out.println("Constant 4 = " + P12.constant4);
    }
}
