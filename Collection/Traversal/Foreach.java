package Collection.Traversal;

import java.util.ArrayList;
import java.util.Collection;

public class Foreach {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("zhangsan");
        collection.add("lisi");
        collection.add("wangwu");

        for (String s : collection) {
            System.out.println(s);
        }
    }
}
