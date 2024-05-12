package Collection.Set.treeset.comparable2;

import java.util.TreeSet;

public class TreeSetComparable2 {
    public static void main(String[] args) {
        Student2 student1 = new Student2("张三", 18,81,90,96);
        Student2 student2 = new Student2("李四", 15,70,91,85);
        Student2 student3 = new Student2("王五", 16,90,85,96);
        Student2 student4 = new Student2("赵六", 20,69,70,80);
        Student2 student5 = new Student2("小七", 23,95,99,100);

        TreeSet<Student2> treeSet = new TreeSet<>();

        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);

//        System.out.println(treeSet);
        for (Student2 student : treeSet) {
            System.out.println(student);
        }
    }
}
