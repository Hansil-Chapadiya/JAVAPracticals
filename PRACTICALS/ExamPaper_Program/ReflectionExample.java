import java.lang.reflect.Method;
public class ReflectionExample {
    public static void main(String[] args) {
        try{
            Class<?> cls = Class.forName("java.util.ArrayList");
            cls.getClass();
            System.out.println(cls.getDeclaredFields());
            Method[] methods = cls.getDeclaredMethods();

            for (Method method: methods)
            {
                System.out.println("Method name: " + method.getName());
                System.out.println("Return type: " + method.getParameterTypes());

                Class<?>[] parameterTypes = method.getParameterTypes();
                for(Class<?> parameterType : parameterTypes)
                {
                    System.out.println("Parameter type: " + parameterType.getName());
                }
                System.out.println();
            }
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
