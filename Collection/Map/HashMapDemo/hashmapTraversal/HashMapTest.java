package Collection.Map.HashMapDemo.hashmapTraversal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("三" , "张三");
        map.put("四" , "李四");
        map.put("五" , "王五");

        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("-------------------------------");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("-------------------------------");

        set.forEach(key -> {
                String value = map.get(key);
                System.out.println(key + "=" + value);
        });
    }
}
