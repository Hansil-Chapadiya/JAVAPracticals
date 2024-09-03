class ReverseTheNumber{
	 public static void main(String[] args) {
		int  num = 15423;
		int res=0;
		System.out.println("The Reverse of the number 15423 is ");
		while(num>0){
			int rem = num%10;	
			res = (res*10) + rem;
			num=num/10;
		}
		String str = Integer.toString(res);
		for (int i=0;i<str.length() ;i++) {
			System.out.print(str.charAt(i) + " ");
		}


	}
}