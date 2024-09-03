import java.util.ArrayList;
import java.util.Iterator;
public class ElementFromIterator {
     public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(12);
        array.add(23);
        array.add(90);

        Iterator<Integer> iterator = array.iterator();
        // System.out.println(iterator.next().doubleValue());
        // System.out.println(iterator.next().doubleValue());
        // System.out.println(iterator.next().doubleValue());

        while (iterator.hasNext()) {
            System.out.println(iterator.next().doubleValue());
        }
     }
}
