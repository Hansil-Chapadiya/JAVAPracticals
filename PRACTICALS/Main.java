/* public class Main {
    private int availableQuantity;

    public Main(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    // Method to perform buying with exception handling
    public void buy(int quantityToBuy) {
        try {
            if (quantityToBuy > availableQuantity) {
                throw new IllegalArgumentException("Quantity to buy exceeds available quantity");
            } else {
                // Perform the buying process here
                availableQuantity -= quantityToBuy;
                System.out.println("Purchase successful! Remaining quantity: " + availableQuantity);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Main item = new Main(10); // Assuming there are initially 10 items available
        int quantityToBuy = 12; // Quantity user wants to buy

        // Attempt to buy the specified quantity
        item.buy(quantityToBuy);
    }
}
 */

/*  public class Main {
    private double balance;

    public Main(double balance) {
        this.balance = balance;
    }

    // Method to perform withdrawal with exception handling
    public void withdraw(double withdrawalAmount) {
        try {
            if (withdrawalAmount > balance) {
                throw new IllegalArgumentException("Withdrawal amount exceeds available balance");
            } else {
                // Perform the withdrawal process here
                balance -= withdrawalAmount;
                System.out.println("Withdrawal successful! Remaining balance: " + balance);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Main account = new Main(1000); // Assuming there is initially $1000 balance
        double withdrawalAmount = 12000; // Amount user wants to withdraw

        // Attempt to withdraw the specified amount
        account.withdraw(withdrawalAmount);
    }
} */

/* import java.util.HashMap;

public class Main {
    private HashMap<String, String> studentDetails;

    public Main() {
        // Initialize student details hashmap
        studentDetails = new HashMap<>();
        // Populate with sample data (student name as key, details as value)
        studentDetails.put("John", "Age: 20, Grade: A");
        studentDetails.put("Alice", "Age: 22, Grade: B");
        studentDetails.put("Bob", "Age: 21, Grade: A-");
    }

    // Method to search for student details with exception handling
    public void searchStudent(String studentName) {
        try {
            String details = studentDetails.get(studentName);
            if (details == null) {
                throw new IllegalArgumentException("Student not found");
            } else {
                System.out.println("Student details for " + studentName + ": " + details);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Main mainObj = new Main(); // Create an instance of Main class
        String studentName = "Alice"; // Name of the student to search

        // Attempt to search for the student details
        mainObj.searchStudent(studentName);
    }
}
 */

 import java.io.*;

// Serializable class representing student details
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John", 20);

        // File path
        String filePath = "student_data.txt";

        try {
            // Create FileWriter to write data to file
            FileWriter writer = new FileWriter(filePath);

            // Write the student data to the file
            writer.write(student.getName() + "," + student.getAge());

            // Close the writer
            writer.close();

            System.out.println("Student data saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}


