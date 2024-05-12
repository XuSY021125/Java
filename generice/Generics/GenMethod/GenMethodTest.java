package Generics.GenMethod;

import java.util.ArrayList;

public class GenMethodTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list,"aaa", "bbb", "ccc", "ddd");
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll(list2,1,2,3,3,3,3,3,3,3);
        System.out.println(list2);
    }
}
