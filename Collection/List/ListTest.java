package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //在此集合中的指定位置插入指定元素
        list.add(1,"AAA");
        System.out.println(list);//[aaa, AAA, bbb, ccc]

        //List集合有两个删除的方法
        //    1、直接删除元素
        //    2、通过索引进行删除，删除指定索引处的元素，返回被删除的元素
        String remove = list.remove(0);
        System.out.println(remove);//aaa
        System.out.println(list);//[AAA, bbb, ccc]

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        //为什么是删除索引上的元素？
        //因为在调用方法的时候，如果出现了重载，优先调用实参和型参类型一致的那个方法
        list1.remove(1);

        String set = list.set(0,"QQQ");
        System.out.println(list);

        String get = list.get(0);
        System.out.println(get);

    }
}
