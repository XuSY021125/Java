package Collection.Set.treeset.treesettraversal;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTraversal {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(3);

//        System.out.println(treeSet);

        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.println(i);
        }

        System.out.println("---------------------");

        for (Integer integer : treeSet) {
            System.out.println(integer);
        }

        System.out.println("---------------------");

        treeSet.forEach(integer-> System.out.println(integer));
    }

}