package myStack.linkedStack;

import java.util.NoSuchElementException;

public class MyLinkedStack <E>{
    private static class Node<E> {
        E data;
        Node<E> next;

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }

    private Node<E> top;
    private int size;

    public MyLinkedStack(){
        this.top = null;
        this.size = 0;
    }

    public boolean push(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = top;
        top = newNode;
        size++;
        return true;
    }

    public E pop(){
        if (isEmpty()){
            throw new NoSuchElementException("栈为空");
        }
        E popElement = top.data;
        top = top.next;
        size--;
        return popElement;
    }

    public E peek(){
        if (isEmpty()){
            throw new NoSuchElementException("栈为空");
        }
        return top.data;
    }

    public boolean isEmpty(){
        if (top == null){
            return true;
        }
        return false;
    }

    public int getSize(){
        return size;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder("[");
        Node<E> currentNode = top;
        while (currentNode != null){
            stringBuilder.append(currentNode.data);
            if (currentNode.next != null) {
                stringBuilder.append(",");
            }
            currentNode = currentNode.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
