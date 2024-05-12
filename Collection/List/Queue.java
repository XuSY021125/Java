package Collection.List;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        //优先级队列不会按照存取顺序读取，内部使用了堆排序，最小的元素在根
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(5);
        queue.add(3);
        queue.add(2);
        queue.add(4);
        queue.add(4);
        queue.add(4);
        queue.add(4);
        queue.add(0);

        for (Integer integer : queue) {
            System.out.println(integer);
        }
        Integer remove = queue.remove();
        System.out.println(remove);

    }
}
