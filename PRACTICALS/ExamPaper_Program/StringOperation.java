import java.util.Arrays;
import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        String str_arr[] = new String[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < str_arr.length; i++) {
            System.out.println("Enter String - " + (i+1));
            str_arr[i] = sc.nextLine();
        }
        sc.close();

        System.out.println("Searching string_index = " + search(str_arr, "Surat"));
        sort(str_arr);

    }
    public static int search(String str_arr[], String key)
    {
        for (int i = 0; i < str_arr.length; i++) {
            if (str_arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    public static void sort(String str_arr[])
    {
        String sorted_arr[] = str_arr.clone();
        Arrays.sort(sorted_arr);
        for (String string : sorted_arr) {
            System.out.println(string);
        }
    }
}
