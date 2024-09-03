import java.util.Scanner;

//promoote user for an int, and print its equivalent hexadecimal number

class Dec2Hex
{
	public static void main(String[] args) {
		//declare variables
		int dec; //the input decimal number in 'int'
		String hexStr = " "; //the equivalent hex String, to accumulate from an empty String
		int radix = 16; //Hex radix
		char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','E'};
		//Use this as lookup table for converting 0-15 to 0-9A-F

		Scanner in = new Scanner(System.in);

		//Promot and read input as 'int'

		System.out.println("Enter a Decimal number: ");
		dec = in.nextInt();

		//Repeated modulus/division and get the hex digits (0-15) in reverse order
		while(dec > 0)
		{
			int hexDigit = dec % radix; //0-15
			hexStr = hexChars[hexDigit] + hexStr;
			dec = dec/radix;
		} 
		System.out.println("The equivalent hexadecimal number is  " + hexStr);
		in.close();
	}
}