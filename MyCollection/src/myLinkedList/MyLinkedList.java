package myLinkedList;


public class MyLinkedList<E> {
    private static class Node<E>{
        E data;
        Node<E> next;

        public Node(E data){
            this.data = data;
            this.next = null;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public MyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(E e){
        Node<E> newNode = new Node(e);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }
    public void addAll(E...es){
        for (E e : es) {
            add(e);
        }
    }

    public int indexOf(E e){
        if (isEmpty()){
            throw new NegativeArraySizeException("链表为空");
        }
        Node<E> currentNode = head;
        for (int i = 0; i < size; i++) {
            if (currentNode.data == e) {
                return i;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    public boolean contain(E e){
        if (isEmpty()){
            throw new NegativeArraySizeException("链表为空");
        }
        Node<E> currentNode = head;
        for (int i = 0; i < size; i++) {
            if (currentNode.data == e) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    public boolean remove(E e){
        if (isEmpty()) {
            return false;
        }
        Node<E> currentNode = head;
        Node<E> previousNode = null;

        while (currentNode != null) {
            if (previousNode == null && currentNode.data == e){
                head = currentNode.next;
                size--;
                return true;
            }
            if (previousNode != null && currentNode.data == e) {
                previousNode.next = currentNode.next;
                size--;
                return true;
            }

            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        return false;
    }

    public E removeFirst(){
        if (isEmpty()){
            throw new NegativeArraySizeException("链表为空");
        }
        Node<E> currentNode = head.next;
        Node<E> removeElement = head;
        head = currentNode;
        size--;
        return removeElement.data;
    }

    public E removeLast(){
        if (isEmpty()){
            throw new NegativeArraySizeException("链表为空");
        }
        Node<E> currentNode = head;
        Node<E> previousNode = null;

        while (currentNode.next != null){
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if (previousNode == null) {
            head = currentNode.next;
        } else {
            previousNode.next = currentNode.next;
        }
        size--;
        return currentNode.data;
    }
    public void clear(){
        Node<E> currentNode = head;
        while (currentNode != null){
            currentNode = currentNode.next;
            size--;
        }
    }

    public E get(int index){
        checkRanfe(index);
        Node<E> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }

    public int getSize(){
        return size;
    }

    private void checkRanfe(int index){
        if (index < 0 || index >= size){
            throw new NegativeArraySizeException("下标越界");
        }
    }

    public String toString(){
        if (size == 0){
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder("[");
        Node<E> currentNode = head;
        do {
            stringBuilder.append(currentNode.data);
            if (currentNode.next != null){
                stringBuilder.append(",");
            }
            currentNode = currentNode.next;
        } while (currentNode != null);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
