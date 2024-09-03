import java.math.BigInteger;
import java.util.ArrayList;

public class ExamPractice3_Employee {
    public static void main(String[] args) {
        ArrayList<String> emoployee_info = new ArrayList<>();
        emoployee_info.add(args[0]);
        emoployee_info.add(args[1]);
        emoployee_info.add(args[2]);
        emoployee_info.add(args[3]);

        EmployeeInfo E1 = new EmployeeInfo(emoployee_info);
        System.out.println(E1.getDesignationSalary());
        System.out.println(E1.getMonthlySalary());
        ArrayList<Double> salary_array = EmployeeInfo.salary_more;
        for (int i = 0; i < salary_array.size(); i++) {
            System.out.println(salary_array.get(i));
        }
    }

}

abstract class Employee {
    protected BigInteger employee_id;
    protected String employee_name;
    protected static ArrayList<Double> salary_more;
    Employee() {

    }

    Employee(ArrayList<String> e_info) {
        this.employee_id = new BigInteger(e_info.get(0));
        this.employee_name = e_info.get(1);
    }

    abstract protected double getDesignationSalary();

    abstract protected void setDesignationSalary(double designation_salary);

    abstract protected double getMonthlySalary();

    abstract protected void setMonthlySalary(double monthly_salary);
}

class EmployeeInfo extends Employee {
    protected double designation_salary;
    protected double monthly_salary;

    EmployeeInfo(ArrayList<String> e_info) {
        super(e_info);
        this.designation_salary = Double.parseDouble(e_info.get(3));
        if (this.designation_salary > 20000) {
            salary_more.add(this.designation_salary);
        }
        this.monthly_salary = Double.parseDouble(e_info.get(2));
    }

    protected double getDesignationSalary() {
        return designation_salary;
    }

    protected void setDesignationSalary(double designation_salary) {
        this.designation_salary = designation_salary;
        if (this.designation_salary > 20000) {
            salary_more.add(this.designation_salary);
        }
    }

    protected double getMonthlySalary() {
        return monthly_salary;
    }

    protected void setMonthlySalary(double monthly_salary) {
        this.monthly_salary = monthly_salary;
    }
}
