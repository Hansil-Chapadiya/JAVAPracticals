// import java.util.Scanner;

public class Practical2_EquationSolver {
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // System.out.println("Values from Equestion - 1 :");
        // System.out.print("Enter value of a : ");
        // double a = input.nextDouble();
        // System.out.print("Enter value of b : ");
        // double b = input.nextDouble();
        // System.out.print("Enter value of e : ");
        // double e = input.nextDouble();

        // System.out.println("Values from Equestion - 2 :");
        // System.out.print("Enter value of c : ");
        // double c = input.nextDouble();
        // System.out.print("Enter value of d : ");
        // double d = input.nextDouble();
        // System.out.print("Enter value of f : ");
        // double f = input.nextDouble();

        // input.close();

        // Operation op = new Operation();
        // double[] result = op.getValuesFromEquation(a, b, e, c, d, f);
        // System.out.print(" X = " + result[0] + " Y = " + result[1]);

        // System.out.println("***********************************************************");
        // System.out.println("***********************************************************");
        // System.out.println("Armstrong Number");
        // Armstrong am = new Armstrong(10);
        // if (am.is_armstrong()) {
        //     System.out.println(am.number + " = Armstrong Number");
        // }
        // else{
        //     System.out.println(am.number + " = Not Armstrong Number");
        // }

        System.out.println("***********************************************************");
        System.out.println("***********************************************************");
        System.out.println("Bubble sort on String");
        BubbleSort bs = new BubbleSort(new StringBuilder("HelloWorld"));
        String sorted_str = bs.bubble_operation();
        System.out.println("Sorted string = " + sorted_str);
    }
}

class Operation {
    public double[] getValuesFromEquation(double a, double b, double e, double c, double d, double f) {

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        double[] values = { x, y };
        return values;
    }
}

class Armstrong {
    int number;
    String number_str;

    Armstrong() {
        number=0;
    }
    Armstrong(int number){
        this.number = number;
        this.number_str = String.valueOf(this.number);
    }
    boolean is_armstrong()
    {
        int power = this.number_str.length();
        int temp = this.number;
        int rem=0,arm_sum =0;
        while (temp > 0) {
            rem = temp % 10;
            arm_sum += Math.pow(rem, power);
            temp /= 10;
        }
        if (this.number == arm_sum) {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class BubbleSort{
    StringBuilder oprated_string;
    BubbleSort()
    {
        oprated_string = new StringBuilder();
    }
    BubbleSort(StringBuilder oprated_string)
    {
        this.oprated_string = new StringBuilder(oprated_string);
    }
    String bubble_operation()
    {
        StringBuilder temp_oprated_string = new StringBuilder(oprated_string.toString().toLowerCase());
        for (int i = 0; i < temp_oprated_string.length(); i++) {
               boolean swapped = false;
                for (int j = 0; j < temp_oprated_string.length() - i - 1; j++) {
                    if (temp_oprated_string.charAt(j) > temp_oprated_string.charAt(j+1)) {
                        char temp = temp_oprated_string.charAt(j);
                        temp_oprated_string.setCharAt(j, temp_oprated_string.charAt(j+1));
                        temp_oprated_string.setCharAt(j+1, temp);
                        swapped = true;
                    }
                }

                if (swapped == false) {
                    break;
                }
        }
        return temp_oprated_string.toString() ;
    }
}