package myStream.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.IntFunction;

public class MethodReferenceDemo2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student student1 = new Student("zhangsan", 18);
        Student student2 = new Student("lisi", 24);
        Student student3 = new Student("wangwu", 16);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        String[] arr = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                String name = student.getName();
                return name;
            }
        }).toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println("===================");

        //类名::成员方法
        //Student类的getname方法满足map方法引用的所有需求
        /*
            1、已经存在这个方法
            2、是函数式接口
            3、被引用的方法型参需要和抽象方法的第二个到最后一个型参保持一致
            4、被引用方法的功能要满足需求
        */

        String[] arr2 = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(arr2));

        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);

        treeSet.stream().forEach(s -> System.out.println(s));
    }
}
