import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] strArray = new String[3] ;
    int num[]  = new int[3];
    System.out.print("Enter Three name:");
    for (int i=0;i<3;i++) {
    	System.out.print("Name - " + i  + "= ");
    	strArray[i] = in.nextLine();
    	
    }
    for (int i=0;i<3 ;i++) {
    	System.out.print("Er_No = ");
    	num[i] = in.nextInt();	
    }

    System.out.println("Name :\tEr_Num :");
    for (int i=0;i<3;i++) {
    	System.out.println(strArray[i] + " " + num[i]);
    }
    
  }
}