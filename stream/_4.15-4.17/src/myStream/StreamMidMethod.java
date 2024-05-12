package myStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamMidMethod {
    public static void main(String[] args) {
        //中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议链式编程
        //修改Stream流中的数据，不会影响原来集合或者数组中的数据
        //filter  过滤
        //limit 获取前几个元素
        //skip  跳过前几个元素
        //distinct  元素去重，依赖hashcode合equals方法
        //concat  合并a合b两个流为一个流
        //map  转换数据类型
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌-22","周芷若-24","赵敏-20","张强-19","张三丰-30","张翠山-35","赵良-53");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"Tom","Jone","Kit","Ash","Jone");


        Stream<String> stream1 = list1.stream().limit(3);
        Stream<String> stream2 = stream1.skip(1);
        //这里开始stream1已结不能再使用
        stream2.forEach(s -> System.out.println(s));
        System.out.println("=======================");

        list1.stream().skip(3).forEach(s -> System.out.println(s));

        System.out.println("=======================");

        //获取”赵敏“，"张强"
        list1.stream().skip(2).limit(2).forEach(s -> System.out.println(s));
        list1.stream().limit(4).skip(2).forEach(s -> System.out.println(s));

        System.out.println("=======================");

        //concat  合并a合b两个流为一个流
        Stream.concat(list1.stream(),list2.stream()).forEach(s -> System.out.println(s));

        System.out.println("=======================");

        //distinct  元素去重，依赖hashcode合equals方法

        list2.stream().distinct().forEach(s -> System.out.println(s));
        System.out.println("=======================");
        //map  转换数据类型
        //获取list1的年龄，并转换成整数型输出
        list1.stream().map( s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));

    }


}
