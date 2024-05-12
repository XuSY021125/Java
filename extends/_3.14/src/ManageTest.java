public class ManageTest {
    public static void main(String[] args) {
        Manage boss = new Manage("Pite", 50000,1989,1,1);
        boss.setBonus(10000);

        Employee[] employees = new Employee[3];
        employees[0] = boss;
        employees[1] = new Employee("Jackey",20000,2002,11,25);
        employees[2] = new Employee("Mike",15000,1999,10,21);

        System.out.println("公司有" + employees.length + "个员工");

        for (Employee element:employees){
            System.out.println(element);
        }

        employees[1].raiseSalary(10);
        System.out.println(employees[1].getName() + "的工资是：" + employees[1].getSalary());

        for (Employee element:employees){
            System.out.println(element);
        }
    }
}