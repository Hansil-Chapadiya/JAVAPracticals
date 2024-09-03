class Promote{
	public static void main(String[] args) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		//(f*b) is promoted to float
		//(i/c) is promoted to int
		//(d*s) is promoted to double
		double result = (f * b) + (i / c) - (d * s);
		//float + int  double = float - double = double
		System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		System.out.println("Result = " + result);
	}
}
