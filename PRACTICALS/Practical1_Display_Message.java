/**
 * Practical-1_Display_Message
 */
public class Practical1_Display_Message {
    public static void main(String[] args) {
        System.out.println("************************************");
        System.out.println("Welcome to JAVA");
        System.out.println("Learning JAVA Now");
        System.out.println("Programming is fun");
        System.out.println("************************************");
        System.out.println("************************************");
        SimpleInterest SI = new SimpleInterest(12, 13, 2);
        System.out.println("Calculated Interest:");
        System.out.println("Interest = " + SI.calculateInterest());
        System.out.println("************************************");
        LeapYear LY = new LeapYear();
        System.out.println("Leap Year?:");
        System.out.println((LY.checkYear()?"It's LeapYear":"It's not a Leap Year"));
        System.out.println("************************************");
        System.out.println("Binary Addition");
        AddtwoBinary AB = new AddtwoBinary("1010","1010");
        System.out.println(AB.additionBinary());

    }
}

class SimpleInterest{
    double p,r,n; //p=prinipal interest, r=rate on amount, n=nuber of period
    SimpleInterest(){
        p=r=n=0;
    }
    SimpleInterest(double p, double r, double n)
    {
        this.p = p;
        this.r = r;
        this.n = n;
    }
    public double calculateInterest(){
        return (p*r*n)/100;
    }
}

class LeapYear{
    long year;
    LeapYear(){
        year = 2012;
    }
    LeapYear(long year)
    {
        this.year = year;
    }
    public boolean checkYear(){
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
}

class AddtwoBinary{
    StringBuilder num1, num2;
    StringBuilder sum;
    AddtwoBinary(){
        num1 = new StringBuilder("0");
        num2 = new StringBuilder("0");
        sum = new StringBuilder();
    }
    AddtwoBinary(String num1, String num2){
        this.num1 = new StringBuilder(num1);
        this.num2 = new StringBuilder(num2);
        this.sum = new StringBuilder();
    }
    public StringBuilder additionBinary() {
        boolean carry = false;
        for (int i = num1.length() - 1; i >= 0; i--) {
            char digit1 = num1.charAt(i);
            char digit2 = num2.charAt(i);
            if (digit1 == '0' && digit2 == '0') {
                if (carry) {
                    sum.append('1');
                    carry = false;
                } else {
                    sum.append('0');
                }
            } else if ((digit1 == '1' && digit2 == '0') || (digit1 == '0' && digit2 == '1')) {
                if (carry) {
                    sum.append('0');
                    carry = true;
                } else {
                    sum.append('1');
                }
            } else { // Both digits are '1'
                if (carry) {
                    sum.append('1');
                } else {
                    sum.append('0');
                }
                carry = true;
            }
        }
        if (carry) {
            sum.append('1');
        }
        return sum.reverse(); // Reverse the StringBuilder to get the correct binary sum
    }
}