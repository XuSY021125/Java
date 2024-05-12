package Generics.GenInterface;

public class GenInterfaceText {
    public static void main(String[] args) {

        /* 泛型接口的两种使用方式：
               1、实现类给出具体的类型
               2、实现类延续泛型，创建实现类对象时再确定类型
        */
        MyArraylist2 myArraylist2 = new MyArraylist2();
        myArraylist2.add("aaa");
        myArraylist2.add("bbb");
        myArraylist2.add("ccc");
        System.out.println(myArraylist2);

        MyArraylist3<Integer> myArraylist3 = new MyArraylist3<>();
        myArraylist3.add(123);
        myArraylist3.add(456);
        myArraylist3.add(789);
        System.out.println(myArraylist3);
    }
}
