// Paper 2018 - Q(3) - d
/*
 * interface interface1
 * {
 * public static final int a = 10;
 * abstract public void show();
 * }
 * interface interface2
 * {
 * public static final int b = 14;
 * abstract public void show();
 * }
 * interface interface3 extends interface1,interface2
 * {
 * }
 * public class PracticeExam implements interface3
 * {
 * public void show()
 * {
 * System.out.println("A = "+ a);
 * System.out.println("B = "+ b);
 * }
 * public static void main(String[] args) {
 * PracticeExam M1 = new PracticeExam();
 * M1.show();
 * }
 * }
 */

// Paper 2018 - Q(3) - d
/**
 * PracticeExam
 */
/*
 * public class PracticeExam {
 * int num;
 * public void getNum(int num)
 * {
 * this.num = num;
 * }
 * public PracticeExam addition(PracticeExam P1)
 * {
 * PracticeExam temp = new PracticeExam();
 * temp.num = this.num + P1.num;
 * return temp;
 * }
 * public void showNum()
 * {
 * System.out.println("Number = " + this.num);
 * }
 * public static void main(String[] args) {
 * PracticeExam P1 = new PracticeExam();
 * P1.getNum(10);
 * PracticeExam P2 = new PracticeExam();
 * P2.getNum(14);
 * 
 * PracticeExam sum = new PracticeExam();
 * sum = P1.addition(P2);
 * 
 * sum.showNum();
 * }
 * }
 */

// Paper 2018 - Q(4) - a
import java.io.*;

/**
 * PracticeExam
 */
public class PracticeExam {
    public static void main(String[] args) {
        File f1 = new File("PracticeExam1.txt");
        boolean bool = false;

        //creating file
        try {
            bool = f1.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
        }

        //writing in file
        try {
            FileOutputStream fout = new FileOutputStream(f1);
            bool = f1.canWrite();
            String s1 = "The Great Hansil";
            byte b[] = s1.getBytes();
            fout.write(b);
            fout.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
        }

        //Reading from file
        try {
            int i;
            FileInputStream fin = new FileInputStream(f1);
            while ((i = fin.read())!=-1) {
                System.out.println((char)i);
            }
            fin.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        f1.delete();
        System.out.println(bool);
    }

}