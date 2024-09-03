import java.util.Scanner;
class Stack 
{		
	int top=-1;
	int stk[] = new int[20];
	int n;

	void range(int nn){
		n = nn;
	}

	void push(int item){
		if (top > n) {
			System.out.println("Stack is overflow");
		}
		else{
			stk[++top] = item;
		}
	}

	void pop(){
		if (top == -1) {
			System.out.println("Stack is Underflow");
		}
		else{
			stk[top--];
		}
	}

	void Display(){
		for (int x; i<n; i++) {
			System.out.println(x);
		}
	}
}
class StackDriver
{
	public static void main(String[] args) {
		Stack stk = new Stack();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter range: ");
		int n = in.nextInt();
		stk.range(n);
		for (int i=0;i<n;i++) {
			stk.push(i);
		}
		stk.Display();
		/*for (int i=0;i<n;i++) {
			stk.pop();
		}
		stk.Display();*/
	}
	
}