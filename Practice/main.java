import java.util.Scanner;
class Person
{
    String name;
    int phoneno;
    int age;
    String address;
}
class Student extends Person 
{
    int no_of_courses;
    String name_of_courses[] = new String[30] ;
    String grades[] = new String[30];
    Scanner sc = new Scanner(System.in);
    void get()
    {
        System.out.println("Enter Number Of Courses :: ");
        no_of_courses = sc.nextInt();
        if(no_of_courses <= 30)
        {
            System.out.println("<--Enter Course Name And Grade--->");
            for(int i=0; i<no_of_courses; i++)
            {
                System.out.println("Name-" + (i+1) + ": ");
                name_of_courses[i] = sc.nextLine();
                if(i == 0)
                name_of_courses[i] = sc.nextLine();
                System.out.println("Grades-" + (i+1) + ": ");
                grades[i]= sc.nextLine();
            }
        }
        else
        {
            System.out.println("Number Of Courses Should Be Less Than 30");
        }
    }
    void put()
    {
        if(no_of_courses <= 30)
        {   
            System.out.println("Number of Courses = " + no_of_courses);
            System.out.println("Name \t Grades");
            for(int i=0; i<no_of_courses; i++)
            {
                System.out.println(name_of_courses[i] +"\t"+ grades[i]);
            }
        }
        else
        {
            System.out.println("Number Of Courses Should Be Less Than 30");
        }
    }
}
class Teacher extends Person
{
    int cnt = 0;
    int no_of_courses;
    String courses_name[] = new String[5];
    int courses_remove;
    Scanner sc = new Scanner(System.in);
    void add_courses()
    {
        System.out.println("Enter Number Of Courses To Add (Total Courses should be Less Than 5) :: ");
        no_of_courses = sc.nextInt();
        if(no_of_courses <= 5)
        {
            System.out.println("<--Enter Courses Name--->");
            for(int i=cnt; i<no_of_courses; i++)
            {
                System.out.println("Name-" + (i+1) + ": ");
                courses_name[i] = sc.nextLine();  
                if (i==0) {
                    courses_name[i] = sc.nextLine();  
                }   
                cnt++;    
            } 
        }
        else
        {
            System.out.println("Number Of Courses Should Be Less Than 5");
        }       
    }
    void remove_courses()
    {
        if(no_of_courses <= 5)
        {
            System.out.println("Enter Number Of Courses To Remove :: ");
            courses_remove = sc.nextInt();
            System.out.println("<--Courses Removed--->");
            for(int i=no_of_courses; i<courses_remove; i--)
            {
                courses_name[i] = " ";
                cnt--;               
            }
            no_of_courses -= courses_remove ;  
        }    
        else
        {
            System.out.println("Number Of Courses Should Be Less Than 5");
        }
    }
    void put()
    {
        if(no_of_courses <= 5)
        {   
            System.out.println("Number of Courses = " + no_of_courses);
            System.out.println("||---Name---||");
            for(int i=0; i<no_of_courses; i++)
            {
                System.out.println(courses_name[i]);
            }
        }
        else
        {
            System.out.println("Number Of Courses Should Be Less Than 5");
        }
    }
}
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        System.out.println("#-----STUDENT DETAILS-----#");
        st.get();
        st.put();
        Teacher tc = new Teacher();
        System.out.println("#-----TEACHER DETAILS-----#");
        int choice=0;
        while(choice != 4)
        {
            System.out.println("||---Choice---|| \n" + "1.Add_Courses \n2.Remove_Courses \n3.Display \n4.Exit \nEnter ::");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                tc.add_courses();
                break;
                case 2:
                tc.remove_courses();
                break;
                case 3:
                tc.put();
                break;
                case 4:
                System.exit(0);
                default:
                System.out.println("Enter Valid Detail");
            }
        }
    }
}