import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireday;

    public Employee(){

    }
    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireday = LocalDate.of(year, month, day );
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + getSalary() +
                ", hireday=" + hireday +
                '}';
    }
}