// import InnerFirsstInterface;

public class InnerFirstInterface implements InnerFirsstInterface {
    public void show() {
        System.out.println("A = " + a);
    }

    public static void main(String[] args) {
        InnerFirstInterface IF1 = new InnerFirstInterface();
        IF1.show();
    }
}
