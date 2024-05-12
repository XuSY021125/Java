package equals;

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

    public boolean equals(Object otherobject){
        if (!super.equals(otherobject)){
            return false;
        }

        Manage other = (Manage) otherobject;

        return bonus == other.bonus;
    }

    public int hashCode(Object otherobject){
        return super.hashCode() + 5 * new Double(bonus).hashCode();
    }

    public String toString(){
        return super.toString() + "[" + "bonus=" + bonus + "]";
    }
}
