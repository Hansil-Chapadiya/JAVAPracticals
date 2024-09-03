//create two class and test it

/*public*/ class Test
{
	public static void main(String[] args) { //main method
		int a,b;//declaring variable
		a=100;
		b=23;
		add_num ob = new add_num();
		System.out.println("The Addition: " + ob.add(a,b));//invocking addition method
	}
}
class add_num
{
	public int add(int a, int b)
	{
		return a+b;//return addition
	}
}