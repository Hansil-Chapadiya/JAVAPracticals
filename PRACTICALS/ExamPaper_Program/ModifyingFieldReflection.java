import java.lang.reflect.Field;
public class ModifyingFieldReflection {
    public static void main(String[] args) {
        try {
            Person person = new Person("Hansil", 19);
            Class<?> cls = person.getClass();

            Field  ageField = cls.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(person, 20);

            System.out.println("Updated age: " + person.getAge());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name,  int age)
    {
        this.name = name;
        this.age = age;
    }

    public int getAge()
    {
        return this.age;
    }
}
