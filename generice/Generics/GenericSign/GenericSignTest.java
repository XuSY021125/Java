package Generics.GenericSign;

import java.util.ArrayList;

public class GenericSignTest {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Father> list2 = new ArrayList<>();
        ArrayList<Child> list3 = new ArrayList<>();

        //泛型不具备继承性，但是数据具备继承性

        method(list1);
        //     method(list2); 泛型不具备继承性
        //     method(list3);

        list1.add(new Father());//数据具备继承性
        list1.add(new Child());
    }
    public static void method(ArrayList<Ye> list){

    }
}
class Ye{}
class Father extends Ye{}
class Child extends Father{}
