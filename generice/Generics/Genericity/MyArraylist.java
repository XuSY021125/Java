package Generics.Genericity;

import java.util.Arrays;

//当一个类中，某个变量的数据类型不确定时，就可以定义带有泛型的类
public class MyArraylist<E>{
    Object[] obj = new Object[10];
    int size;

    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E) obj[index];
    }

    public String toString() {
        return Arrays.toString(obj);
    }
}
