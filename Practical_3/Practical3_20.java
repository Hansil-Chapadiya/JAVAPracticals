public class Practical3_20 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
                int f =1;
                for (int k = 1; k <= Integer.parseInt(args[i]); k++) {
                    f = f*k;
                }
                System.out.println("Factorial " + args[i] + " = " + f);
            }
    }
}
