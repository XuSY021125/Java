package Collection.Map.HashMapDemo.hashmapDemo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class HashMapDemo2 {
    public static void main(String[] args) {
        String[] palce = {"A", "B", "C", "D"};

        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(palce.length);
            list.add(palce[index]);
        }
        System.out.println(list);

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String p : list) {
            if (hashMap.containsKey(p)){
                int count = hashMap.get(p);
                count++;
                hashMap.put(p,count);
            } else {
                hashMap.put(p,1);
            }
        }
        System.out.println(hashMap);
    }
}
