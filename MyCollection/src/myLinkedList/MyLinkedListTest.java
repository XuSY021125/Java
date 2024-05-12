package myLinkedList;


import java.util.Arrays;
import java.util.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.addAll(4,4,4);

        System.out.println("-------------------输出链表-------------------");
        System.out.println(myLinkedList);

        System.out.println("-------------------判断是否包含指定元素-------------------");
        System.out.println(myLinkedList.contain(1));

        System.out.println("-------------------获取下标元素-------------------");
        int index = 4;
        System.out.println("获取链表下标为 " + index + " 的元素：" + myLinkedList.get(index));

        System.out.println("-------------------获取指定元素下标-------------------");
        int i = 2;
        int index1 = myLinkedList.indexOf(i);
        System.out.println(i + "的下标为：" + index1);
        System.out.println("-------------------移除指定元素-------------------");
        Integer target = 1;
        myLinkedList.remove(target);
        System.out.println("移除" + target + "后:" + myLinkedList);

        System.out.println("-------------------移除链表第一个元素-------------------");
        System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList);

        System.out.println("-------------------移除链表最后一个元素-------------------");
        System.out.println(myLinkedList.removeLast());
        System.out.println(myLinkedList);

        System.out.println("-------------------链表的长度-------------------");
        System.out.println(myLinkedList.getSize());

        System.out.println("-------------------链表的长度-------------------");
        myLinkedList.clear();
        System.out.println("清空后链表的长度：" + myLinkedList.getSize());

        System.out.println("-------------------");

        LinkedList<Integer> l = new LinkedList<>();
        l.clear();
        l.add(2);
        l.add(5);
        l.add(2);
        l.add(5);
        System.out.println(l.indexOf(2));
        l.remove();
        l.clear();
        System.out.println(l);

    }
}
