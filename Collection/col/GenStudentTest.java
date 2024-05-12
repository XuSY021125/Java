package Collection.col;

import java.util.ArrayList;
import java.util.Collection;

public class GenStudentTest {
    public static void main(String[] args) {
        Collection<Student> collection = new ArrayList<>();

        Student student1 = new Student("张三", 14);
        Student student2 = new Student("李四", 15);
        Student student3 = new Student("王五", 16);

        collection.add(student1);
        collection.add(student2);
        collection.add(student3);

        Student student4 = new Student("张三", 14);
        //contain底层是依靠equals方法进行判断是否存在的，所以如果集合中存储的是自定义对象，那要重写equals方法
        System.out.println(collection.contains(student4));
    }
}
