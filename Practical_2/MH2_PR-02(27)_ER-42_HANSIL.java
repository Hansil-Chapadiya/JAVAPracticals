import java.util.Scanner;
class PrimeNum{
	public static void main(String[] args) {
		int n,cnt=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Limit: ");
		n = in.nextInt();
		for (int i=2; cnt<n ;i++ ) {
				int flag=0;
				for (int j=2; j<i ;j++ ) {
					if ((i%j==0)){
						flag=1;
						break;
					}
				}
				if(flag==0){
					cnt++;
					System.out.print(i + " ");
				}
			}
	}
}