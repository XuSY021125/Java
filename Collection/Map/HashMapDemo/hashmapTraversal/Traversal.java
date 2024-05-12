package Collection.Map.HashMapDemo.hashmapTraversal;

import java.util.*;
import java.util.function.BiConsumer;

public class Traversal {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("三" , "张三");
        map.put("四" , "李四");
        map.put("五" , "王五");

        Set<Map.Entry<String,String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        System.out.println("-------------");

        map.forEach(( key,  value) -> System.out.println(key + " = " + value));
    }
}
