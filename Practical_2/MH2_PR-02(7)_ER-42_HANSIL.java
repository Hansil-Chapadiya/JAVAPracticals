//LifeTime and scope of variable

class LifeTime{
	public static void main(String[] args) {
		int x;
		for (x=0; x<3 ; x++ ) {
			int y=-1; //all time -1
			System.out.println("Y is : " + y);
			y = 100; // all time 100
			System.out.println("Y is now." + y);
		}
	}
}