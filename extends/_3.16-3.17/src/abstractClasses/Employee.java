package abstractClasses;
import java.time.LocalDate;

public class Employee extends Person{
    private double salary;
    private LocalDate hireday;

    public Employee(String name, double salary, int year, int month, int day){
        super(name);
        this.salary = salary;
        hireday = LocalDate.of(year, month, day );
    }

    public String getDescription(){
        return getName() + "是一个员工，工资:" + getSalary();
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public LocalDate getHireday(){
        return hireday;
    }

    public void raiseSalary(double percent){
        double raise = salary  * percent / 100;
        salary += raise;
    }
}
