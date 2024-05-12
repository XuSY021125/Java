package Collection.Map.HashMapDemo.hashmapDemo1;

import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 18);
        Student student2 = new Student("李四", 20);
        Student student3 = new Student("王五", 15);
        Student student4 = new Student("李四", 20);

        HashMap<Student, String> hashMap = new HashMap<>();

        hashMap.put(student3,"北京");
        hashMap.put(student1,"福建");
        hashMap.put(student2,"上海");


        System.out.println(hashMap);

        hashMap.put(student4,"浙江");
        System.out.println(hashMap);
    }
}
