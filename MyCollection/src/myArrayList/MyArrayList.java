package myArrayList;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public MyArrayList(){
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public MyArrayList(int initialCapacyty) throws IllegalAccessException {
        if (initialCapacyty < 0){
            throw new IllegalAccessException("初始容量必须大于0");
        }
        array = new Object[initialCapacyty];
        size = 0;
    }

    public boolean add(E e){
        ensureCapacity(size + 1);
        array[size] = e;
        size++;
        return true;
    }

    public boolean addAll(E...es){
        for (E e : es) {
            add(e);
        }
        return true;
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    public boolean contain(E e){
        if (isEmpty()){
            throw new NoSuchElementException("列表为空");
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == e) {
                return true;
            }
        }
        return false;
    }

    public E remove(int index){
        checkRange(index);
        Object element = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
        return (E) element;
    }

    public boolean remove(E e){
        if (isEmpty()) {
            throw new NoSuchElementException("列表已经为空");
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == e) {
                for (int j = i; j < size; j++) {
                    array[j] = array[j + 1];
                }
                array[--size] = null;
                return true;
            }
        }
        return false;
    }

    public void clear(){
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public E get(int index){
        checkRange(index);
        return (E) array[index];
    }

    public int indexOf(Object obj){
        if (isEmpty()){
            throw new NoSuchElementException("列表为空");
        }
        for (int i = 0; i < size; i++) {
            if (array[i] == obj){
                return i;
            }
        }
        return -1;
    }

    private void ensureCapacity(int minCapacity){
        if (size == 0){
            array = new Object[DEFAULT_CAPACITY];
        }
        else if (minCapacity > array.length){
            int oldCapacity = array.length;
            int newCapacity = oldCapacity + oldCapacity >> 1;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    private void checkRange(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("下标越界");
        }
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null){
                stringBuilder.append(array[i] + ",");
            }
        }
        if (stringBuilder.toString().equals("[")){
            return stringBuilder.append("]").toString();
        } else {
            return stringBuilder.deleteCharAt(stringBuilder.length() - 1).append("]").toString();
        }
    }
}
