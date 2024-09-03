import java.util.Scanner;
class StringObject{
	public static void main(String[] args) {
		//String[] s1 = new String[2];
		String st1 = "Hansil";
		String st2 = "Chapadiya";
		Scanner s1 = new Scanner(st1);
		System.out.println("Name-1: " + s1.nextLine());
		Scanner s2 = new Scanner(st2);
		System.out.println("Name-2: " + s2.nextLine());
	}
}
/*class array_avg
{
	public static void main(String[] args) {
		int i,sum=0;
		float avg;
		int a[] = new int[5];
		Scanner test = new Scanner(System.in);
		System.out.println("Enter the input: ");
		for (i=0; i<5 ; i++) {
			if(test.hasNextInt()){
				a[i] = test.nextInt();
				sum = sum + a[i];
			}
		}
		avg = sum/5.0;
		System.out.println("The avarage value is : " + avg);
	}
}*/

