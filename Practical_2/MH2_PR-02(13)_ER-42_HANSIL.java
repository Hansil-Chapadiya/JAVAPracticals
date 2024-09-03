import java.util.Scanner;
class input{
	public static void main(String[] args) {
		int temp[][] = new int[3][3];
		int i,j;
		Scanner test = new Scanner(System.in);
		for (i=0;i<3;i++){
			for (j=0;j<3;j++) {
				System.out.println("Enter Input: ");
				if (test.hasNextInt()) {
					temp[i][j] = test.nextInt();
				}
			}
		}
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.println("temp["+i +"]["+j+"]" + temp[i][j]);
			}
		}
	}
	
}