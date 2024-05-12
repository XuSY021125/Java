package myQueue.linkedQueue;

import java.util.NoSuchElementException;

public class MyLinkedQueue <E>{
    private static class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }

    private Node<E> front;
    private Node<E> rear;
    private int size;

    public MyLinkedQueue(){
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty(){
        if (front == null) {
            return true;

        }
        return false;
    }

    public void enqueue(E e){
        Node<E> newNode = new Node<>(e);
        if (isEmpty()){
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public E dequeue(){
        if (isEmpty()) {
            throw new NoSuchElementException("队列已空，没有元素可以出队");
        }
        E dequeueElement = front.data;
        front = front.next;
        size--;
        return dequeueElement;
    }

    public void clear(){
        while (front != null) {
            front = front.next;
        }
        size = 0;
    }

    public  boolean contain(E e){
        if (isEmpty()){
            throw new NoSuchElementException("队列为空，查找不到指定元素");
        }
        Node<E> currentNode = front;
        while (currentNode != null) {
            if (currentNode.data == e) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public int indexOf(E e){
        if (isEmpty()){
            throw new NoSuchElementException("队列为空，查找不到指定元素");
        }
        Node<E> currentNode = front;
        for (int i = 0; i < size; i++) {
            if (currentNode.data == e) {
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    public int getSize(){
        return size;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("[");
        Node<E> currentNode = front;
        while (currentNode != null){
            stringBuilder.append(currentNode.data);
            if (currentNode.next != null){
                stringBuilder.append(",");
            }
            currentNode = currentNode.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
