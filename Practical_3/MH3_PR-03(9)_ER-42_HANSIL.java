class Max{
	void maximum(int n1, int n2){
		int res = (n1>n2)?n1:n2;
		System.out.println("Result = " + res);
	}
	void maximum(String s1, String s2){
		String res = (s1.length()>s2.length())?s1:s2;
		System.out.println("Result = " + res);
	}
}
class testMax{
	public static void main(String[] args) {
		Max mx = new Max();
		mx.maximum(12,15);
		mx.maximum("String12","String2");
	}
	
}