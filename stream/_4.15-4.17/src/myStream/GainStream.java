package myStream;

import java.util.*;
import java.util.stream.Stream;

public class GainStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","f");

//        Stream<String> stringStream = list.stream();
//        stringStream.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //单列集合获取Stream
        list.stream().forEach( s -> System.out.println(s));

        //双列集合获取Stream
        HashMap<String,Integer> hashMap = new HashMap();
        hashMap.put("aaa",111);
        hashMap.put("bbb",222);
        hashMap.put("ccc",333);
        hashMap.put("ddd",444);

//        Set<String> keySet = hashMap.keySet();

//        keySet.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String key) {
//                System.out.println(key);
//            }
//        });

        Set<Map.Entry<String,Integer>> entrySet = hashMap.entrySet();
        entrySet.stream().forEach(s -> System.out.println(s));

        System.out.println("=============================");

        //数组集合获取Stream
        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9};

    String[] arr2 = {"a","b","c"};

        Arrays.stream(arr1).forEach(s -> System.out.println(s));

        Arrays.stream(arr2).forEach(s -> System.out.println(s));

        System.out.println("=============================");

        //一堆零散数据集合获取Stream
        //当数组使用Stream.of方法获取流时，数组要为引用数据类型的

        Stream.of(4,5,6,7,8,9).forEach(s -> System.out.println(s));

        Stream.of("g","w","z").forEach(s -> System.out.println(s));

        Stream.of(arr2).forEach(s -> System.out.println(s));
    }
}
