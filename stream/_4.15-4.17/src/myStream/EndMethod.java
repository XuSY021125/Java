package myStream;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EndMethod {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌-男-22","周芷若-女-24","赵敏-女-20","张强-男-19","张三丰-男-30","周芷若-女-24","张翠山-女-35","赵良-男-53");

        System.out.println(list1);
        System.out.println("==============================");

        long count = list1.stream().count();
        System.out.println(count);
        System.out.println("==============================");
        //获取集合中所有的男性，并返回一个新的集合
        List<String> newlist1 = list1.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                String[] arr = s.split("-");
                String gender = arr[1];
                return "男".equals(gender);
            }
        }).collect(Collectors.toList());
        System.out.println(newlist1);

        System.out.println("==============================");

        Set<String> newSet = list1.stream().collect(Collectors.toSet());
        System.out.println(newSet);

        System.out.println("==============================");

        String[] strings = list1.stream().toArray( value -> new String[value]);
        System.out.println(Arrays.toString(strings));

        System.out.println("==============================");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"张无忌-男-22","周芷若-女-24","赵敏-女-20","张强-男-19","张三丰-男-30","张翠山-女-35","赵良-男-53");


        Map<String,Integer> newMap = list2.stream().collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                String[] arr = s.split("-");
                String key = arr[0];
                return key;
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                Integer value = Integer.parseInt(arr[2]);
                return value;
            }
        }));
        System.out.println(newMap);
    }
}
