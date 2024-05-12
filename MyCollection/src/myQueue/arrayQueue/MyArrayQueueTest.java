package myQueue.arrayQueue;

public class MyArrayQueueTest {
    public static void main(String[] args) {
        MyArrayQueue<Integer> myArrayQueue = new MyArrayQueue<>();

        myArrayQueue.enQueue(3);
        myArrayQueue.enQueue(2);
        myArrayQueue.enQueue(1);

        myArrayQueue.deQueueu();

        System.out.println(myArrayQueue);
    }
}
