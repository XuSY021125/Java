package abstractClasses;
public class PersonTest {
    public static void main(String[] args) {
        Person[] role = new Person[2];
        role[0] = new Student("张三", "计算机科学与技术");
        role[1] = new Student("李四", "人工智能");

        for (Person p:role){
            System.out.println(p.getDescription());
        }

        Employee[] employees = new Employee[]{new Employee("Tony", 6000, 1989,12,12)};
        for (Employee e : employees){
            System.out.println(e.getDescription());
        }

    }
}