public class Manage extends Employee{
    private double bonus;

    public Manage(String name, double salary, int year, int month, int day){
        super(name,salary,year,month,day);
        bonus = 0;
    }
    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }
}
