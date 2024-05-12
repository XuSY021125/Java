package myArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        System.out.println("---------------------增---------------------");
        myArrayList.add(7);
        myArrayList.add(2);
        myArrayList.add(1);
        myArrayList.add(4);
        myArrayList.add(3);

        System.out.println(myArrayList);
        System.out.println(myArrayList.getSize());
        System.out.println("---------------------一次性增多个---------------------");

        myArrayList.addAll(9,10,22,11);
        System.out.println(myArrayList);
        System.out.println(myArrayList.getSize());

        System.out.println("---------------------判断是否包含指定元素---------------------");
        System.out.println(myArrayList.contain(3));

        System.out.println("-------------------获取指定下标元素-------------------");
        Integer integer = 1;
        System.out.println("下标为" + integer + "的元素:" + myArrayList.get(integer));

        System.out.println("-------------------获取指定元素下标-------------------");
        int t = 3;
        System.out.println(t+ "所在位置为：" + myArrayList.indexOf(t));

        System.out.println("-------------------利用下标删除-------------------");
        myArrayList.remove(3);
        System.out.println(myArrayList);
        System.out.println(myArrayList.getSize());

        System.out.println("-------------------指定元素删除-------------------");
        Integer i = 2;
        myArrayList.remove(i);
        System.out.println("删除指定元素" + i + ":" + myArrayList);
        System.out.println(myArrayList.getSize());

        System.out.println("-------------------清空列表-------------------");
        myArrayList.clear();
        System.out.println(myArrayList);
        System.out.println(myArrayList.getSize());

    }
}