public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.setID("emp_00001");
        emp1.setName("Great");
        emp1.setSalary(99000000.99);

        emp2.setID("emp_00002");
        emp2.setName("Andrew");
        emp2.setSalary(98000000.99);

        System.out.println("Employee - 1 : \n Yearly Salary = " + (emp1.getSalary() * 12));
        System.out.println("Employee - 2 : \n Yearly Salary = " + (emp2.getSalary() * 12));

        System.out.println("\nAfter 10% raise of Salary\n");

        emp1.raiseSalary(10);
        emp2.raiseSalary(10);

        System.out.println("Employee - 1 : \n Updated Yearly Salary = " + (emp1.getSalary() * 12));
        System.out.println("Employee - 2 : \n Updated Yearly Salary = " + (emp2.getSalary() * 12));
    }
}

class Employee {
    private String empId;
    private String empName;
    private double empSalary;

    public Employee() {
        this.empId = null;
        this.empName = null;
        this.empSalary = 0.0;
    }

    public void setID(String empId) {
        this.empId = empId;
    }

    public void setName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getID() {
        return this.empId;
    }

    public String getName() {
        return this.empName;
    }

    public double getSalary() {
        return this.empSalary;
    }

    public void raiseSalary(double percentage) {
        if (percentage > 0) {
            this.empSalary += this.empSalary * (percentage / 100);
        }
    }

    public void displayEmployee() {
        System.out.println("Employee Details:");
        System.out.println("ID = " + this.empId);
        System.out.println("Name = " + this.empName);
        System.out.println("Salary = " + this.empSalary);
    }
}
