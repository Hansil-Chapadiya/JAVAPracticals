import java.util.Scanner;
class MatrixAdd
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
      
            int a[][] = new int[3][3];   
            int b[][] = new int[3][3];   
            int c[][] = new int[3][3];   
            
            System.out.println("Enter 9 elements of first matrix:");
            for (int i = 0; i < 3; i++) 
            {
                for (int j = 0; j < 3; j++) 
                {
                	System.out.print("Element :  a["+ i +"]["+ j +"]= ");
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
            
            System.out.println("Enter 9 elements of second matrix:");
            for (int i = 0; i < 3; i++) 
            {
                for (int j = 0; j < 3; j++) 
                {
                	System.out.print("Element no: b["+ i +"]["+ j +"]= ");
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
            
            System.out.println("First Matrix:");
            for (int i = 0; i < 3; i++) 
            {
                for (int j = 0; j < 3; j++) 
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            
            System.out.println("\nSecond Matrix:");
            for (int i = 0; i < 3; i++) 
            {
                for (int j = 0; j < 3; j++) 
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
            
            for (int i = 0; i < 3; i++) 
            {
                for (int j = 0; j < 3; j++) 
                {
                    for (int k = 0; k <= j; k++) 
                    {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }
            
            System.out.println("\nMatrix after addition:");
            for (int i = 0; i < 3; i++) 
            {
                for (int j = 0; j < 3; j++) 
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
    }
}
