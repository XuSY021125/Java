package myStack.linkedStack;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedStack<Integer> myLinkedStack = new MyLinkedStack<>();
        System.out.println("-------------入 栈-------------");
        myLinkedStack.push(1);
        myLinkedStack.push(2);
        myLinkedStack.push(3);
        myLinkedStack.push(2);
        myLinkedStack.push(2);
        System.out.println(myLinkedStack);

        System.out.println("-------------出 栈-------------");
        myLinkedStack.pop();

        System.out.println(myLinkedStack);

        System.out.println("-------------查看栈顶元素-------------");
        System.out.println(myLinkedStack.peek());

        System.out.println("-------------栈的长度-------------");
        System.out.println(myLinkedStack.getSize());
    }
}
