//import java.io.*;
import java.util.Scanner;
class input{
	public static void main(String args[]){
		 Scanner in = new Scanner(System.in);
			int number, num;
			
			System.out.println("Enter Number: ");
			number = in.nextInt();
			System.out.println("Number : " + number );

			while(number != 0)
			{
				System.out.println("Enter number: ");
				if (!in.hasNextInt()) {
					System.out.println("Enter valid integer: ");
					in.next();
				}
				number = in.nextInt();
				num = number;
				System.out.println("Number : " + num );
			}	    
	}
}
/*do {
			  System.out.print("Enter a positive number : ");
			  while (!in.hasNextInt()) {
			    System.out.println("It is not a positive number!");
			    in.next();
			  }
			  number = in.nextInt();
			} while (number <= 0);*/