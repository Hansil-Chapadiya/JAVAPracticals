class test 
{
	public static void main(String args[])
	{
		byte b;
		int i = 257;
		double d = 323.142;
		b = (byte)i;
		System.out.println("Conversion of int to byte: " + i + " To " + b);
		i = (int)d;
		System.out.println("Conversion of double to int:" + d + " To " + i);
		b = (byte)d;
		System.out.println("Conversion of double to byte: " + d + " To " + b);
	}
}