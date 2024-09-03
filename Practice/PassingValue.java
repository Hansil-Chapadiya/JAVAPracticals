public class PassingValue {
    public int data = 100;

    void show(int data) {
        data += data; 
    }
    public static void main(String[] args) {
        PassingValue P1 = new PassingValue();
        System.out.println("Before = " + P1.data);
        P1.show(10);
        System.out.println("After = " + P1.data);
    }
}
