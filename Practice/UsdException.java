class MyException extends Exception
{
    public static void tostring()
    {
        System.out.println("Exception");
    }
}
public class UsdException{
    public static void main(String args[]) throws MyException
    {
        int n = 10;
        try {
            if(n<11)
            {
                throw new MyException();
            }
        } catch (MyException e) {
            e.tostring();
        }
    }
}