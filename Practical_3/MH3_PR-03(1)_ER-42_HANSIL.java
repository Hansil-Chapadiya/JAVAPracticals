class Box{
	double width,height,depth;
}
class BoxDemo{
	public static void main(String[] args) {
		Box mybox1 = new Box();
		mybox1.width = 10;
		mybox1.height = 10;
		mybox1.depth = 10;

		double vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("Volume  = " + vol);
	}
}