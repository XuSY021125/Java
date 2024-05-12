
package myStream;

import java.util.ArrayList;
import java.util.Collections;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三","李四","王五","赵六","张三丰");

//        List<String> newlist = list.stream().filter( s -> s.startsWith("张"))
//                .filter(s -> s.length() == 3)
//                .collect(Collectors.toList());
//
//        System.out.println(newlist);

        list.stream().filter( s -> s.startsWith("张"))
                .filter( s -> s.length() == 3)
                .forEach( s -> System.out.println(s));
    }
}