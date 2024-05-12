package Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("张三", new Address("长安街", "北京", "中国"));
        Person.Student student = person.new Student("清华大学");
        student.introduceYourself();
        student.communicate();
        student.work();

        System.out.println();

        Person person1 = new Person("李四", new Address("魔都", "上海", "中国"));
        Person.Engineer engineer = person1.new Engineer("阿里巴巴集团");
        engineer.introduceYourself();
        engineer.performDuties();
        engineer.communicate();
        engineer.work();
    }
}
