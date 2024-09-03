class CircleUser{
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.getValue(10,10,314);
		c1.SetValue();
		Circle c2 = new Circle();
		c2.assign(c1);
		c2.SetValue();
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

	void assign(Circle c1){
		x = c1.x;
		y = c1.y;
		radius = c1.radius;
	}
}