import java.util.Scanner;
public class SecMax{

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
/*
 * class SecMax{
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int b=0,c=0, n3=30, middle=0,temp=0;
 * 
 * for (int i=0;i<5;i++) {
 * int n = sc.nextInt();
 * if(n>b){
 * temp = n;
 * n = b;
 * b = temp;
 * if(b>c){
 * temp = b;
 * b = c;
 * c = temp;
 * }
 * }
 * }
 * 
 * System.out.println(b);
 * }
 * }
 * 
 * /*if((n1<n2)&&(n1>n3) || (n1>n2)&&(n1<n3))
 * middle = n1;
 * else if((n2<n1)&&(n2>n3) || (n2>n1)&&(n2<n3))
 * middle = n2;
 * else
 * middle = n3;
 */