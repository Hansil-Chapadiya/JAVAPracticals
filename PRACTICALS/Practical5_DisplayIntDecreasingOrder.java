
/**
 * Practical5_DisplayIntDecreasingOrder
 */
import java.util.Scanner;

public class Practical5_DisplayIntDecreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number - 1:  ");
        int n1 = sc.nextInt();

        System.out.println("Enter Number - 2:  ");
        int n2 = sc.nextInt();

        System.out.println("Enter Number - 2:  ");
        int n3 = sc.nextInt();

        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 > n3) {
                    System.out.println("Numbers: " + n1 + " " + n2 + " " + n3);
                } else {
                    System.out.println("Numbers: " + n1 + " " + n3 + " " + n2);
                }
            } else {
                System.out.println("Numbers: " + n3 + " " + n1 + " " + n2);
            }
        } else {
            if (n2 > n3) {
                if (n3 > n1) {
                    System.out.println("Numbers: " + n2 + " " + n3 + " " + n1);
                }
                else
                {
                    System.out.println("Numbers: " + n2 + " " + n1 + " " + n3);
                }
            }
            else
            {
                System.out.println("Numbers: " + n3 + " " + n2 + " " + n1);
            }
        }

        sc.close();

    }
}