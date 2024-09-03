class CustomExceptionClient extends Exception {
    int rollno;

    CustomExceptionClient(int rollno) {
        this.rollno = rollno;
    }

    public String toString() {
        return "Roll No = " + this.rollno + "\nless than 0";
    }

    public void display() {
        System.out.println("Roll No = " + this.rollno);
    }
}

public class CustomException {
    public static void check_rollno(int r) throws CustomExceptionClient {
        if (r < 0) {
           throw new CustomExceptionClient(r);
        } else {
            CustomExceptionClient c1 = new CustomExceptionClient(r);
            c1.display();
        }
    }

    public static void main(String[] args) {
        try {
            check_rollno(10);

        } catch (CustomExceptionClient me) {
            System.out.println(me.toString());
        }
    }
}