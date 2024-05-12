package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ListTraversal {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(s -> System.out.println(s));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String s = listIterator.next();
            //当满足条件 if ("bbb".equals(s)) 时，执行 listIterator.add("KKK")。
            //这行代码在当前元素（即 s 存储的元素）之后插入新的元素 "KKK"。注意，此时 listIterator 仍然指向原来的元素 s，并未因为插入操作而改变位置
            if ("bbb".equals(s)){
                listIterator.add("KKK");
            }
            System.out.println(s);
        }
        System.out.println(list);
    }
}
