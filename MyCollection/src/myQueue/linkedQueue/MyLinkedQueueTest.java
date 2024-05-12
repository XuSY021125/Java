package myQueue.linkedQueue;


public class MyLinkedQueueTest {
    public static void main(String[] args) {
        MyLinkedQueue<Integer> myLinkedQueue = new MyLinkedQueue<>();

        System.out.println("----------入 队----------");
        myLinkedQueue.enqueue(1);
        myLinkedQueue.enqueue(2);
        myLinkedQueue.enqueue(3);
        System.out.println(myLinkedQueue);

        System.out.println("----------判断是否包含指定元素----------");
        System.out.println(myLinkedQueue.contain(4));
        System.out.println(myLinkedQueue.contain(2));

        System.out.println("----------获取指定元素的下标----------");
        System.out.println(myLinkedQueue.indexOf(3));

        System.out.println("----------出 队----------");
        myLinkedQueue.dequeue();
        System.out.println(myLinkedQueue);

        System.out.println("----------清空队列----------");
        myLinkedQueue.clear();
        System.out.println(myLinkedQueue);
    }
}
