import java.util.ArrayList;
import java.util.Collections;


public class SortDecendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        DescendingOperation dc = new DescendingOperation(arr);
        System.out.println(dc.getDescendingArray());

    }
}
class DescendingOperation{
    ArrayList<Integer> arr = new ArrayList<>();
    DescendingOperation()
    {
        this.arr = null;
    }
    DescendingOperation(ArrayList<Integer> arr)
    {
        this.arr = arr;
    }
    public ArrayList<Integer> getDescendingArray()
    {
        Collections.sort(this.arr, Collections.reverseOrder());
        return this.arr;
    }
}
