import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentFromFile {
    public static void main(String[] args) {
        Student student1 = new Student("stud_001", "Anna", 90.90);
        File f = new File("student_info.txt");
        student1.write_in_file(f);

        // Read the student information back from the file
        Student student2 = new Student();
        student2.read_from_file(f);
        student2.displayStudent();
    }
}

class Student {
    String stud_enroll_no;
    String stud_name;
    Double stud_percentage;

    Student() {
        this.stud_enroll_no = null;
        this.stud_name = null;
        this.stud_percentage = 0.0;
    }

    Student(String er_no, String name, Double pr) {
        this.stud_enroll_no = er_no;
        this.stud_name = name;
        this.stud_percentage = pr;
    }

    public void write_in_file(File f) {
        try {
            FileOutputStream f_write = new FileOutputStream(f);
            StringBuilder stud_info = new StringBuilder();
            stud_info.append("Enrollment no = " + this.stud_enroll_no + "\n");
            stud_info.append("Name = " + this.stud_name + "\n");
            stud_info.append("Percentage = " + this.stud_percentage + "\n");
            String Info = stud_info.toString();
            f_write.write(Info.getBytes());
            f_write.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void read_from_file(File f) {
        try {
            FileInputStream f_read = new FileInputStream(f);
            BufferedReader reader = new BufferedReader(new InputStreamReader(f_read));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Enrollment no = ")) {
                    this.stud_enroll_no = line.substring("Enrollment no = ".length());
                } else if (line.startsWith("Name = ")) {
                    this.stud_name = line.substring("Name = ".length());
                } else if (line.startsWith("Percentage = ")) {
                    this.stud_percentage = Double.parseDouble(line.substring("Percentage = ".length()));
                }
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayStudent() {
        System.out.println("Student Details:");
        System.out.println("Enrollment no = " + this.stud_enroll_no);
        System.out.println("Name = " + this.stud_name);
        System.out.println("Percentage = " + this.stud_percentage);
    }
}
