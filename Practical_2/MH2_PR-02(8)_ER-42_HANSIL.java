//Demonstrate bolockscope
class Scope 
{
	public static void main(String[] args) {
		int x = 10;
		if(x==10)//start new scope
		{
			int y = 20;//know only to this block
			//x and y both known here
			System.out.println("x and y: " + x + " " + y);
			x = y*2;
		}
		//y= 100; not known
		System.out.println("x is " + x);
	}
}