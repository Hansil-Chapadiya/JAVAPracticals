
public class InnerClasses {
    private String college_name = "L.D.College of Engineering";

    public class InnerInnerClasses {
        private String name = "Hansil";
        private int age = 19;

        void showDetails() {
            System.out.println("Name = " + name);
            System.out.println("Age = " + age);
            System.out.println("College = " + college_name);
        }
    }

    public static void main(String[] args) {
        InnerClasses in = new InnerClasses();
        InnerInnerClasses inner = in.new InnerInnerClasses();
        inner.showDetails();
    }

}
