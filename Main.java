package schoolsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ARAN
 */
public class Main {

    public static void main(String[] args) {
        Teacher salar = new Teacher(1, "Salar", 500);
        Teacher aram = new Teacher(2, "Aram", 700);
        Teacher bayan = new Teacher(3, "Bayan", 600);

        List<Teacher> teacherList = new ArrayList<>();
        // list of teachers
        teacherList.add(aram);
        teacherList.add(salar);
        teacherList.add(bayan);
        
        Student shayan = new Student(1, "Shayan", 4);
        Student aree = new Student(2, "Aree", 12);
        Student zanyar = new Student(3, "Zanyar", 5);
        
        List<Student> studentList = new ArrayList<>();
        //list of students
        studentList.add(aree);
        studentList.add(shayan);
        studentList.add(zanyar);
        
        
        
        School slemani = new School(teacherList, studentList);
        // new teacher
        Teacher shima = new Teacher(9, "Shima", 800);
        slemani.addTeacher(shima);
        
        // Testing Salary, List of teachers name, List of students name,  Student Fees
        
        aree.payFees(5000);
        System.out.println("Slemani Private High School has earned $"+slemani.getTotalMoneyEarned());
        zanyar.payFees(6000);
        System.out.println("Slemani Private High School has earned $"+slemani.getTotalMoneyEarned());
        
        System.out.println("<<< SCHOOL SALARY PAYING >>>");
        // giving teachers their salary
        salar.recieveSalary(salar.getSalary());
        System.out.println("Slemani Private High School has spent for salary to ("+salar.getName()+") and now has $"+slemani.getTotalMoneyEarned());
        aram.recieveSalary(aram.getSalary());
        System.out.println("Slemani Private High School has spent for salary to ("+aram.getName()+") and now has $"+slemani.getTotalMoneyEarned());
        //info
        System.out.println(zanyar);
        bayan.recieveSalary(bayan.getSalary());
        System.out.println(bayan);
        // new teacher , has not earned any because she's new
        System.out.println(shima); 
    
    
    
    }
}
