import java.util.Scanner;
public class SecMax {

	public static void main(String args[]) {
		int limit, num, fbig = 0, sbig = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		limit = sc.nextInt();

		System.out.println("Enter " + limit + " positive numbers");

		while (limit > 0) {
			num = sc.nextInt();

			if (num > fbig) {
				sbig = fbig;
				fbig = num;
			}
			if (num > sbig && num < fbig) {
				sbig = num;
			}

			limit--;
		}

		System.out.println("First Big is " + fbig);
		System.out.println("Second Big is " + sbig);

	}
}