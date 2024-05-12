public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student(1,"张三","男",18);
        Student stu1 = new Student(2,"小红","女",20);

        System.out.println("老师是：" + Student.teacher);

        System.out.println(stu);
        System.out.println(stu1);

        stu.setAge(19);
        System.out.println("过了一年后，" + stu.getName() + "的年龄是：" + stu.getAge());
    }
}