package comparator;

public class ComparatorTest{
    public static void main(String[] args) {
        //需要先创造个对象实例，然后通过这个对象来调用方法
        Comparator<String> comparator = new LengthComparator();

        String first = "123456";
        String second = "123";

        System.out.println(comparator.compare(first, second));

    }
}

