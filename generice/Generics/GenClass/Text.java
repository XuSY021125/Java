package Generics.GenClass;
public class Text {
    public static void main(String[] args) {
        MyArraylist<String> myArraylist = new MyArraylist<>();

        myArraylist.add("aaa");
        myArraylist.add("bbb");
        myArraylist.add("ccc");

        System.out.println(myArraylist);
    }
}