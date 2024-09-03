import java.util.Scanner;

public class Palindrome {
 public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter number :");
    int number = sc.nextInt();
    int temp = number;
    int sum = 0, rem =0;
    while (temp > 0) {
        rem = temp%10;
        sum = (sum*10) + rem;
        temp /= 10;
    }
    if (sum == number) {
        System.out.println("Given number is Palindrome");
    }
    else{
        System.out.println("Given Number is not Palindrome" );
    }
    sc.close();
 }
}