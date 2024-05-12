package Collection.Traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");

        //迭代器就像一个箭头，默认指向集合的0索引处
        Iterator<String> iterator = collection.iterator();
        //迭代器遍历时，不能用集合的方法进行增加或删除
        while (iterator.hasNext()){
            //获取元素，并移动指针
            String str = iterator.next();

            if ("bbb".equals(str)){
                //collection.remove("bbb");  迭代器遍历时，不能用集合的方法进行增加或删除
                //可以使用迭代器里的remove方法
                iterator.remove();
            }
            System.out.println(str);
        }
        //循环完之后指针指到最后，不会复位，再次调用next方法会NoSuchElementException
        //System.out.println(iterator.next());

        System.out.println(collection);


    }
}
