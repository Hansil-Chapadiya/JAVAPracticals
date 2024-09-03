public class RaiseToUsingRepetiveMultiPlication {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Enter two numeric argument for x^y operation");
                return;
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid numeric arguments.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Double n1 = Double.parseDouble(args[0]);
        Integer n2 = Integer.parseInt(args[1]);
        Operation op = new Operation(n1,n2);
        System.out.println(op.getResult());

    }
}
class Operation
{
    Double n1;
    Integer n2;
    Operation()
    {
        this.n1 = 0.0;
        this.n2 = 0;
    }
    Operation(Double n1, Integer n2)
    {
        this.n1 = n1;
        this.n2 = n2;
    }
    public Double getResult()
    {
        Double result=1.0;
        for (int i = 0; i < n2; i++) {
            result *= this.n1;
        }
        return result;
    }
}
