import java.util.ArrayList;
import java.util.Scanner;

public class KeyWords {
    public static void main(String[] args) {
        Integer n = Integer.valueOf(10);
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            {
                System.out.println("Enter Element : " + i);
                ar.add(i, Integer.valueOf(s.nextInt()));
            }
        }
        for (int index = 0; index < ar.size(); index++) {
            if(index == 5)
            {
                continue;
            }
            else if(index == 9)
            {
                break;
            }
            else
            {

                System.out.println(ar.get(index));
            }
        }
        s.close();

    }
}
