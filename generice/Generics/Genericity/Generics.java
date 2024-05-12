package Generics.Genericity;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics {
    public static void main(String[] args) {
        //没有泛型的时候，集合如何存储数据
        //结论：
        //如果没有给集合指定类型，默认认为所有的数据类型都是Object类型，此时可以往集合添加任意类型
        //弊端：在获取数据的时候，无法使用他的特有行为，如果使用强转可能会出现错误，例如：int不能强转成Student类型
        //        ArrayList list = new ArrayList();
        //
        //        list.add(123);
        //        list.add("aaa");
        //        list.add(new Student("张三",20));
        //        System.out.println("Hello world!");
        //
        //        Iterator it = list.iterator();
        //        while (it.hasNext()){
        //            Object obj = it.next();
        //            //多态的弊端是不能访问子类的特有功能
        //            //obj.length();
        //            System.out.println(obj);


        //此次用泛型可以在添加数据的时候就把类型统一
        //在获取数据的是时候也不用强转了
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            //多态的弊端是不能访问子类的特有功能
            //obj.length();  错误
            System.out.println(obj);
        }
    }
}