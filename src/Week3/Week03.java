package Week3;
import java.util.ArrayList;
public class Week03 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        int id = 5; 
        Student nick = new Student (122111, "Nick");

        Student onkar = new Student( 223245,  "Onkar");

        Student uthman = new Student (0540054,  "Uthman");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add (nick);
        students.add(onkar);
        students.add(uthman);

        for (Student student :students)
        {
            student.print();
            
        }
    }     
    
}
