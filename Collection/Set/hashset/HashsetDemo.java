package Collection.Set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("张三");
        hashSet.add("李四");
        hashSet.add("王五");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

        System.out.println("----------------------");

        for (String s : hashSet) {
            System.out.println(s);
        }

        System.out.println("----------------------");

        hashSet.forEach(s-> System.out.println(s));
    }
}
