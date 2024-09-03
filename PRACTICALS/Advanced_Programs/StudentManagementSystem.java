/* import java.util.*;

class Student {
    private int rollNumber;
    private String name;
    private int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

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
        return "Roll Number: " + rollNumber + ", Name: " + name + ", Age: " + age;
    }
}

public class StudentManagementSystem {
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student details");
            System.out.println("2. Update Student details");
            System.out.println("3. Search for a Student");
            System.out.println("4. Delete Student details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudentDetails(scanner);
                    break;
                case 2:
                    updateStudentDetails(scanner);
                    break;
                case 3:
                    searchStudent(scanner);
                    break;
                case 4:
                    deleteStudentDetails(scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void addStudentDetails(Scanner scanner) {
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        students.add(new Student(rollNumber, name, age));
        System.out.println("Student details added successfully.");
    }

    private static void updateStudentDetails(Scanner scanner) {
        System.out.print("Enter Roll Number to update: ");
        int rollNumber = scanner.nextInt();
        Student student = findStudent(rollNumber);
        if (student != null) {
            System.out.println("Enter updated details:");
            System.out.print("Enter Name: ");
            String name = scanner.next();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            student.setName(name);
            student.setAge(age);
            System.out.println("Student details updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void searchStudent(Scanner scanner) {
        System.out.print("Enter Roll Number to search: ");
        int rollNumber = scanner.nextInt();
        Student student = findStudent(rollNumber);
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void deleteStudentDetails(Scanner scanner) {
        System.out.print("Enter Roll Number to delete: ");
        int rollNumber = scanner.nextInt();
        Student student = findStudent(rollNumber);
        if (student != null) {
            students.remove(student);
            System.out.println("Student details deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static Student findStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }
}
 */


 import javafx.application.Application;
 import javafx.geometry.Insets;
 import javafx.geometry.Pos;
 import javafx.scene.Scene;
 import javafx.scene.control.*;
 import javafx.scene.layout.GridPane;
 import javafx.stage.Stage;

 import java.util.ArrayList;
 import java.util.List;

 class Student {
     private int rollNumber;
     private String name;
     private int age;

     public Student(int rollNumber, String name, int age) {
         this.rollNumber = rollNumber;
         this.name = name;
         this.age = age;
     }

     // Getters and setters
     public int getRollNumber() {
         return rollNumber;
     }

     public void setRollNumber(int rollNumber) {
         this.rollNumber = rollNumber;
     }

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
         return "Roll Number: " + rollNumber + ", Name: " + name + ", Age: " + age;
     }
 }

 public class StudentManagementSystem extends Application {
     private List<Student> students = new ArrayList<>();

     @Override
     public void start(Stage primaryStage) {
         GridPane gridPane = new GridPane();
         gridPane.setAlignment(Pos.CENTER);
         gridPane.setHgap(10);
         gridPane.setVgap(10);
         gridPane.setPadding(new Insets(25, 25, 25, 25));

         Label menuLabel = new Label("Menu:");
         gridPane.add(menuLabel, 0, 0);

         Button addBtn = new Button("Add Student details");
         addBtn.setOnAction(e -> addStudentDetails(primaryStage));
         gridPane.add(addBtn, 0, 1);

         Button updateBtn = new Button("Update Student details");
         updateBtn.setOnAction(e -> updateStudentDetails(primaryStage));
         gridPane.add(updateBtn, 0, 2);

         Button searchBtn = new Button("Search for a Student");
         searchBtn.setOnAction(e -> searchStudent(primaryStage));
         gridPane.add(searchBtn, 0, 3);

         Button deleteBtn = new Button("Delete Student details");
         deleteBtn.setOnAction(e -> deleteStudentDetails(primaryStage));
         gridPane.add(deleteBtn, 0, 4);

         Button exitBtn = new Button("Exit");
         exitBtn.setOnAction(e -> primaryStage.close());
         gridPane.add(exitBtn, 0, 5);

         Scene scene = new Scene(gridPane, 400, 300);
         primaryStage.setTitle("Student Management System");
         primaryStage.setScene(scene);
         primaryStage.show();
     }

     private void addStudentDetails(Stage primaryStage) {
         GridPane addGridPane = new GridPane();
         addGridPane.setAlignment(Pos.CENTER);
         addGridPane.setHgap(10);
         addGridPane.setVgap(10);
         addGridPane.setPadding(new Insets(25, 25, 25, 25));

         Label rollNumberLabel = new Label("Roll Number:");
         addGridPane.add(rollNumberLabel, 0, 0);
         TextField rollNumberField = new TextField();
         addGridPane.add(rollNumberField, 1, 0);

         Label nameLabel = new Label("Name:");
         addGridPane.add(nameLabel, 0, 1);
         TextField nameField = new TextField();
         addGridPane.add(nameField, 1, 1);

         Label ageLabel = new Label("Age:");
         addGridPane.add(ageLabel, 0, 2);
         TextField ageField = new TextField();
         addGridPane.add(ageField, 1, 2);

         Button addDetailsBtn = new Button("Add Details");
         addDetailsBtn.setOnAction(e -> {
             int rollNumber = Integer.parseInt(rollNumberField.getText());
             String name = nameField.getText();
             int age = Integer.parseInt(ageField.getText());
             students.add(new Student(rollNumber, name, age));
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
             alert.setTitle("Success");
             alert.setHeaderText(null);
             alert.setContentText("Student details added successfully.");
             alert.showAndWait();
         });
         addGridPane.add(addDetailsBtn, 1, 3);

         Scene scene = new Scene(addGridPane, 400, 300);
         primaryStage.setScene(scene);
     }

     private void updateStudentDetails(Stage primaryStage) {
         // Similar to addStudentDetails
     }

     private void searchStudent(Stage primaryStage) {
         // Similar to addStudentDetails
     }

     private void deleteStudentDetails(Stage primaryStage) {
         // Similar to addStudentDetails
     }

     public static void main(String[] args) {
         launch(args);
     }
 }
