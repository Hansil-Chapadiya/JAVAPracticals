class BoxDemo{
	public static void main(String[] args) {
		Box mybox1 = new Box();
		mybox1.SetDim(10,10,10);

		System.out.println("Volume = " + mybox1.volume());
	}
}
class Box{
	double width,height,depth;
	void GetDim(double w, double h, double d){
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