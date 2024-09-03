class AccessSpecifierTest {
    public static void main(String[] args) {
        AccessSpecifier A1 = new AccessSpecifier();
        System.out.println(A1.n1);
        //System.out.println(A1.n2); Not Accessing because of private
    }
}
class AccessSpecifier{
    public int n1 = 10;
    //private int n2 = 14;
}
