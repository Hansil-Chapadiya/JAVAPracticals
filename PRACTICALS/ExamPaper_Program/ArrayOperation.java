import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {
        int int_arr[] = { 1, 4, 5, 6, 8, 7, 9, 2, 3, 0 };
        System.out.println("Addition = " + add(int_arr));
        System.out.println("Max element = " + max(int_arr));
        System.out.println("Searching element = " + search(int_arr, 2));
    }

    public static int add(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static int max(int[] array) {
        int[] arr = array.clone(); // Create a clone to avoid modifying the original array
        Arrays.sort(arr);
        return arr[arr.length - 1]; // Return the last element (maximum) of the sorted array
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
