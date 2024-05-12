package Collection.Traversal;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        System.out.println(collection);

//        collection.clear();

        //因为Collection里面定义的是共性的方法（Set是没有索引的），所以此时不能用索引来删除，只能通过元素的对象进行删除
        System.out.println(collection.remove("aaa"));//true
        System.out.println(collection);//[bbb, ccc]


        Boolean result = collection.contains("aaa");
        System.out.println(result);//false

        boolean result2 = collection.isEmpty();
        System.out.println(result2);//false

        collection.add("222");
        int size = collection.size();
        System.out.println(size);//2
    }
}

