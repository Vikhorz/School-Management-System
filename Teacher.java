package schoolsystem;

/**
 *
 * @author ARAN
 */
public class Teacher  {

    private int id;
    private String name;
    private int salary;
    private int earnedSalary;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.earnedSalary=0;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary){
        this.salary=salary;
    }

    public void recieveSalary(int salary){
        earnedSalary+=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher " + name + ", salary Earned $" + earnedSalary ;
    }
    
}
