package myStream.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;

public class MethodReferenceDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三,15","李四,13","王五,23","赵六,18","张三丰,17");

        Student[] students = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String[] arr = s.split(",");
                String name = arr[0];
                int age = Integer.parseInt(arr[1]);
                return new Student(name,age);
            }
        }).toArray(new IntFunction<Student[]>() {
            @Override
            public Student[] apply(int value) {
                return new Student[value];
            }
        });
        System.out.println(Arrays.toString(students));

        System.out.println("======================");

        Student[] students1 = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(students1));
    }
}
