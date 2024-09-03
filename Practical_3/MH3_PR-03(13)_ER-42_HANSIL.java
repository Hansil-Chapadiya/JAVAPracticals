class Swap{
	int n1,n2;
	Swap(){
		this.n1 = 0;
		this.n2 = 1;
	}
	void swapped(Swap s){
		int temp = this.n1;
		this.n1 = this.n2;
		this.n2 = temp;
	}
	void display(){
		System.out.println("Num1 = " + n1 + "\n" + "Num2 = " + n2);
	}
}
class SwapTest{
	public static void main(String[] args) {
		Swap s1 = new Swap();
		s1.n1=10;
		s1.n2=14;
		s1.display();
		s1.swapped(s1);
		s1.display();
	}
}