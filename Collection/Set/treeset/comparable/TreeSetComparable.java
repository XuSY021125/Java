package Collection.Set.treeset.comparable;

import java.util.TreeSet;

public class TreeSetComparable {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 14);
        Student student2 = new Student("lisi", 15);
        Student student3 = new Student("wanwu", 16);

        TreeSet<Student> treeSet = new TreeSet<>();

        //当使用自定义类时，要重写Comparable接口的方法
        treeSet.add(student2);
        treeSet.add(student1);
        treeSet.add(student3);

        System.out.println(treeSet);
    }
}
