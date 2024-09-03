class CircleUser{
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.getValue(10,10,314);
		c1.SetValue();
		System.out.println("Area = " + c1.Area());
	}
}
class Circle{
	double x,y,radius;
	void getValue(double cx,double cy, double r){
		x = cx;
		y = cy;
		radius = r; 
	}
	void SetValue(){
		System.out.println("CenterX = " + x);
		System.out.println("CenterY = " + y);
		System.out.println("Radius = " + radius);
	}
	double Area(){
		return 3.14*radius*radius;
	}
}