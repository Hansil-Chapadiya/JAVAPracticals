class BoxDemo{
	public static void main(String[] args) {
		Box mybox1 = new Box();
		mybox1.display();
		Box mybox2 = new Box(2);
		mybox2.display();
		Box mybox3 = new Box(2,3);
		mybox3.display();
		Box mybox4 = new Box(2,3,4);
		mybox4.display();
	}
}
class Box{
	double width,height,depth;
	Box(){
		System.out.println("Constructor Called");
		width = 0;
		height = 0;
		depth = 0;
	}
	Box(int w){
		System.out.println("1 parameter Constructor Called");
		width = w;
		height = 0;
		depth = 0;
	}
	Box(int w,int h){
		System.out.println("2 parameter Constructor Called");
		width = w;
		height = h;
		depth = 0;
	}
	Box(int w,int h, int d){
		System.out.println("3 parameter Constructor Called");
		width = w;
		height = h;
		depth = d;
	}
	void display(){
		System.out.println("Width = " + width);
		System.out.println("Height = " + height);
		System.out.println("Depth = " + depth);
	}
}