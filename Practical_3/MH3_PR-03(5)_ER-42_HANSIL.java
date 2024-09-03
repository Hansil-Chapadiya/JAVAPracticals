class BoxDemo{
	public static void main(String[] args) {
		Box mybox1 = new Box();
		mybox1.getDim(10,10,10);
		mybox1.SetDim();
		System.out.println("Volume = " + mybox1.volume());
	}
}
class Box{
	double width,height,depth;
	Box(){
		System.out.println("Constructor Called");
	}
	void getDim(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}

	void SetDim(){
		System.out.println("Width = " + width);
		System.out.println("Height = " + height);
		System.out.println("Depth = " + depth);
	}

	double volume(){
		return width*height*depth;
	}
}