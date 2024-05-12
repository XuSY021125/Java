package Collection.Map.TreeMap;

import java.util.ArrayList;
import java.util.Collections;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for (String name : list) {

        }

        Collections.addAll(list,"z","s","f","g","a","w","i");

        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
