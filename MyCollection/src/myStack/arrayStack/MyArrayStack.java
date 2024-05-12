package myStack.arrayStack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayStack<E>{
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int topIndex;

    public MyArrayStack(){
        array = new Object[DEFAULT_CAPACITY];
        topIndex =  -1;
    }

    public MyArrayStack(int initialCapacity) throws IllegalAccessException {
        if(initialCapacity < 0){
            throw new IllegalAccessException("初始容量必须大于0");
        }
        array = new Object[initialCapacity];
        topIndex =  -1;
    }

    public void push(E e){
        ensureCapacity(topIndex + 2);
        array[++topIndex] = e;
    }

    public void pop(){
        if (isEmpty()) {
            throw new NoSuchElementException("已经是个空栈");
        }
        array[topIndex--] = null;
    }

    public void clear(){
        while (!isEmpty()){
            array[topIndex--] = null;
        }
    }

    public E peek(){
        if (isEmpty()){
            throw new NoSuchElementException("栈是空的");
        }
        return (E) array[topIndex];
    }

    public int size(){
        return topIndex + 1;
    }
    public boolean isEmpty(){
        if (topIndex == -1){
            return true;
        }
        return false;
    }

    private void ensureCapacity(int minCapacity){
        if (isEmpty()) {
            array = new Object[DEFAULT_CAPACITY];
        }
        if (minCapacity > array.length ){
            int oldCapacity = array.length;
            int newCapacity = oldCapacity + oldCapacity >> 1;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("[");
//        if (topIndex > -1) {
            for (int i = 0; i <= topIndex ; i++) {
                if (i != topIndex){
                    stringBuilder.append(array[i]).append(",");
                }else
                    stringBuilder.append(array[i]);
            }
//        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
