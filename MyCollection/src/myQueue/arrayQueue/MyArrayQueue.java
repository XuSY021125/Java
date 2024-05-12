package myQueue.arrayQueue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayQueue <E>{
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int rear;
    private int front;
    private int size;

    public MyArrayQueue(){
        array = new Object[DEFAULT_CAPACITY];
        rear = 0;
        front = 0;
        size = 0;
    }

    public MyArrayQueue(int initialCapacity){
        if (initialCapacity < 0) {
            throw new NegativeArraySizeException("队列初始化容量不能小于0");
        }
        array = new Object[initialCapacity];
        rear = 0;
        front = 0;
        size = 0;
    }

    public void enQueue(E e){
        ensureCapacity(size + 1);
        array[rear++] = e;
        size++;
    }

    public E deQueueu(){
        if (isEmpty()) {
            throw new NoSuchElementException("队列已经为空，没有元素可以出队");
        }
        E deQueueElement = (E) array[rear];
        array[front++] = null;
        size--;
        return deQueueElement;
    }

    public void clear(){
        while (!isEmpty()){
            array[front++] = null;
        }
        size = 0;
    }

    public boolean isEmpty(){
        if (front == rear){
            return true;
        }
        return false;
    }

    private void ensureCapacity(int minCapacity){
        if (isEmpty()){
            array = new Object[DEFAULT_CAPACITY];
        }
        else if (minCapacity > array.length ){
            int oldCapacity = array.length;
            int newCapacity = oldCapacity + oldCapacity >> 1;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("[");

        if (!isEmpty()) {
            for (int i = front; i < rear; i++) {
                if (i != rear - 1) {
                    stringBuilder.append(array[i]).append(",");
                } else {
                    stringBuilder.append(array[i]);
                }
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
