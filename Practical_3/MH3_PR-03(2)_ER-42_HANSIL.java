class BoxDemo{
	public static void main(String[] args) {
		Box mybox1 = new Box();
		mybox1.width = 10;
		mybox1.height = 10;
		mybox1.depth = 10;

		System.out.println("Volume = " + mybox1.volume());
	}
}
class Box{
	double width,height,depth;
	double volume(){
		return width*height*depth;
	}
}