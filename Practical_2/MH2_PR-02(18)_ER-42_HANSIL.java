class TestPreciseness{
	public static void main(String[]args){

		//Testing on integer numbers
		int i1 = 123456789;
		System.out.println( i1 * 10);

		//Testing on floating numbers
		float f1 = 123456789.0f;
		System.out.println(f1);
		System.out.println(f1 * 10);

		//Testing on double number
		System.out.println(2.2 + 4.4);
		System.out.println(6.6 - 2.2 - 4.4);

		//compare two doubles
		System.out.println((6.6) == (2.2 + 4.4));
	}
}