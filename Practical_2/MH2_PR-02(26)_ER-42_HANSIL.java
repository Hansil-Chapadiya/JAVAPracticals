import java.util.Scanner;
class Factorial{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number - ");
		int num = in.nextInt();
		fact f1 = new fact();
		System.out.println("Factorial = " + f1.factorial(num));

	}
}
class fact{
	int factorial(int n){
		if(n==0)
			return 1;
		else
			return (n * factorial(n-1));
		 
	}
}