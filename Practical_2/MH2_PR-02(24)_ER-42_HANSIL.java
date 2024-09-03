import java.util.*;
import java.io.*;
class SeperateDigit{
	public static void main(String args[]){
		int num = 15423;
		System.out.println("Original Number : " + num );
		System.out.print("Seperated Number : "  );
		String result = Integer.toString(num);
		for(int i = 0;i<result.length();i++){
			System.out.print(result.charAt(i)+" ");
		}

	}
}