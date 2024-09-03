import java.util.Scanner;
class ForEanhanced{
	public static void main(String args[]){
		//int nums[] = {0,1,2,3,,4,5,6,7,8,9};
		int nums[] = new int[10];
		Scanner in = new Scanner(System.in);
		for (int i=0;i<10;i++) {
			System.out.print("Number" + (i+1) + ": ");
			nums[i] = in.nextInt();
		}
		int sum = 0;
		System.out.print("Array : ");
		for(int x : nums){	
			System.out.print(x + " ");
			sum += x;
		}
		System.out.println("\nSummation : " + sum);
	}
}						