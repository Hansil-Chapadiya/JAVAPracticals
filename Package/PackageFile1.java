package Package;

public class PackageFile1 {
    public void getNumber(int n)
    {
        System.out.println("Number  = " + n);
    }
    public static void main(String[] args) {
        PackageFile1 p1 = new PackageFile1();
        p1.getNumber(10);
    }
}
