class Swap{
	int n1,n2;
	Swap(){
		this.n1 = 0;
		this.n2 = 1;
	}
	void swapped(int n1, int n2){
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}
	void display(){
		System.out.println("Num1 = " + n1 + "\n" + "Num2 = " + n2);
	}
}
class SwapTest{
	public static void main(String[] args) {
		Swap s1 = new Swap();
		int n1=10;
		int n2=14;
		s1.display();
		s1.swapped(n1,n2);
		s1.display();
	}
}