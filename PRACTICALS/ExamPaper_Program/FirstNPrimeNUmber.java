public class FirstNPrimeNUmber {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the number of prime numbers to generate.");
            return;
        }

        int count = Integer.parseInt(args[0]);
        int flag, k = 0;
        int[] arr_prime = new int[count];
        arr_prime[k++] = 2;

        for (int i = 3; k < count; i++) {
            flag = 1;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                arr_prime[k++] = i;
            }
        }

        System.out.println("First " + count + " prime numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print(arr_prime[i] + " ");
        }
    }
}
