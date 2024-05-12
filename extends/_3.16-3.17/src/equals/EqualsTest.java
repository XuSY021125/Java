package equals;

public class EqualsTest {
    public static void main(String[] args) {
        Employee role1 = new Employee("小明",5000,2000,2,1);
        Employee role2 = role1;
        Employee role3 = new Employee("小明",5000,2000,2,1);
        Employee role4 = new Employee("小红",8000,2001,3,6);

        System.out.println("role1.equals(role2) : " + role1.equals(role2));
        System.out.println("role1 == role2: " + (role1 == role2));
        System.out.println();

        System.out.println("role1.equals(role3) : " + role1.equals(role3));
        System.out.println("role1 == role3: " + (role1 == role3));
        System.out.println();

        Employee alicel = new Employee ("Alice Adams", 75000, 1987, 12 ,15);
        Employee alice2 = alicel;
        Employee alice3 = new Employee ("Alice Adams", 75000, 1987, 12, 15);
        Employee bob = new Employee("Bob Brandson" , 50000, 1989, 10, 1);

        System.out.println("alicel == alice2: " + (alicel == alice2));
        System.out.println("alicel == alice3: " + (alicel == alice3));

    }
}
