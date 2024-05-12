package Collection.Set.treeset.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {
    public static void main(String[] args) {

        //o1:表示当前要添加的元素
        //o2:表示已经存在红黑树的元素
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int length = o1.length() - o2.length();
                if (length == 0){
                    return o1.compareTo(o2);
                }
                return length;
            }
        });

        treeSet.add("c");
        treeSet.add("ab");
        treeSet.add("df");
        treeSet.add("qwer");

        System.out.println(treeSet);
    }
}
