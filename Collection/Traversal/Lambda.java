package Collection.Traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
//()->{}
public class Lambda {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("zhangsan");
        collection.add("lisi");
        collection.add("wangwu");

        //底层原理：会自己遍历集合，依次得到每个元素，把得到的每一个元素，传递给下面的accept方法
        collection.forEach(new Consumer<String>() {
            @Override
            //s依次表示集合中的每一个数据
            public void accept(String s) {
                System.out.println(s);
            }
        });
        collection.forEach( s -> System.out.println(s));
    }
}
