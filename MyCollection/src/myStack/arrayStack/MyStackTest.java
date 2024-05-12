package myStack.arrayStack;

public class MyStackTest {
    public static void main(String[] args) {
        MyArrayStack<Integer> myStack = new MyArrayStack<>();

        System.out.println("--------------入栈--------------");
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack);

        System.out.println("--------------出栈--------------");
        myStack.pop();
        System.out.println(myStack);

        System.out.println("--------------查看栈顶元素--------------");
        System.out.println(myStack.peek());

        System.out.println("--------------栈的长度--------------");
        System.out.println(myStack.size());
    }
}
