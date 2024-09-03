//compute distance light travel using long/Int variable
class Light
{
	public static void main(String[] args) {
		int lightSpeed;
		//int days;
		long days;
		long seconds;
		//int seconds;
		//int distance;
		long distance;
		//speed of light on miles per second
		lightSpeed = 186000;
		days = 1000; //sepicy days here 
		seconds = days * 24 * 60 * 60; //convers seconds
		distance = lightSpeed * seconds;//compute distance
		System.out.print("In " + days);
		System.out.print("days light will travel about ");
		System.out.println(distance + "miles ");
	}
}