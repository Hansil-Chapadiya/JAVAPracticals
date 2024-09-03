public class IndexException {
    public static void main(String[] args) {
        String district[] = {"Ahemedabad", "Surat", "vadodara", "Rajkot", "Dangh"};
        try {
            System.out.println(district[0]);
            System.out.println(district[1]);
            System.out.println(district[2]);
            System.out.println(district[3]);
            System.out.println(district[4]);
            System.out.println(district[5]);
        } catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Out of Bounds");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
