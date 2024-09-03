class Iteration2Darr{
	public static void main(String args[]){
		int sum = 0,cnt=0;
		int nums[][] = new int [3][5];

		for(int i = 0; i < 3; i++)
			for(int j = 0;j < 5; j++)
				nums[i][j]=(i+1)*(j+1);
		for(int x[] : nums){
			for(int y : x){
				if(cnt%5==0)
					System.out.println("");
				System.out.print(y + " ");
				cnt++;
				sum += y;
			}
		}
		System.out.println("\nSummation : " + sum);
	}
}