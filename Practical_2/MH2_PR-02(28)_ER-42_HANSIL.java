import java.util.Scanner;
class Max3{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1 = in.nextInt();
		System.out.print("Enter number 2: ");
		int num2 = in.nextInt();
		System.out.print("Enter number 3: ");
		int num3 = in.nextInt();
		int result = ((num1>num2)?((num1>num3)?(num1):(num3)):((num2>num3)?num2:num3));
		System.out.println(result + " is maximum");
	}
}