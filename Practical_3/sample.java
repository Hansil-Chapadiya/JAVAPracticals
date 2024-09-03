import java.util.Scanner;
class sample{
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Range: ");
		n = in.nextInt();
		Students s[] = new Students[n];
		//sarr = new Students[n];
		for (int i = 0 ;i<n ;i++ ) {
			s[i] = new Students();
			s[i].getDetails();
		}
		System.out.println("Er_no: " + " " + "Name: " + " " + "CollegeName: ");
		for (int i = 0;i<n ;i++ ) {
			s[i].putDetails();
		}

		
		in.close();
	}
}
class Students{
	String enroll_no;
	String name;
	String clg;
	static int cnt = 0;
	Scanner in = new Scanner(System.in);
	Students(){
		cnt++;
	}
	void getDetails(){
		System.out.println("Enter Er_number: ");
		enroll_no = in.nextLine();
		System.out.println("Enter Name: ");
		name = in.nextLine();
		System.out.println("Enter College Name: ");
		clg = in.nextLine();
	}
	void putDetails(){
		System.out.print(enroll_no + " " + name + " " + clg + "\n");
	}
	static void showCount(){
		System.out.println("Object = " + cnt);
	}
}