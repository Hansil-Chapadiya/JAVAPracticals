import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class GenericProgramming {
   public static void main(String[] args) {
        InnerGenericProgramming<Integer> integerVal  = new InnerGenericProgramming<>();
        integerVal.set(12);
        System.out.println(integerVal.get());

        InnerGenericProgramming<String> stringVal = new InnerGenericProgramming<>();
        stringVal.set("Hello World!");
        System.out.println(stringVal.get());

        InnerGenericProgramming<String> stringArray = new InnerGenericProgramming<>();
        stringArray.addElemet("Hansil");
        stringArray.addElemet("Emily");
        stringArray.addElemet("Mia");

        System.out.println(stringArray.getArrayList());

        List<Integer> intlist = Arrays.asList(1,10,12);
        InnerGenericProgramming.printList(intlist);

   }

}
/**
 * InnerGenericProgramming<T>
 */
class InnerGenericProgramming<T> {
    private T t;
    private ArrayList<T> array =  new ArrayList<>();
    public void set(T t){
        this.t = t;
    }

    public T get(){
        return this.t;
    }

    public void addElemet(T t)
    {
        this.t = t;
        this.array.add((T) t);
    }

    public ArrayList<T> getArrayList()
    {
        return this.array;
    }

    public static void printList(List<?> list)
    {
        for (Object element : list) {
            System.out.println(element);
        }
        System.out.println();
    }
}
