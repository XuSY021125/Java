package clone;

public class CloneTest {
    public static void main(String[] args) {
        /*
        为什么需要抛出异常？
         1   Object类提供了默认的clone()方法，但它声明为protected，这意味着子类可以直接访问并覆盖它，但外部类不能随意调用任意对象的 clone() 方法
         2   抛出 CloneNotSupportedException 可以让类的作者决定是否允许克隆以及如何克隆
         3   不是所有类都适合或者安全地进行克隆操作，特别是那些包含非基本类型字段（如内部状态复杂的对象引用）的类，可能需要特别的深拷贝逻辑
        */
        try {
            Employee original = new Employee("Tome", 50000);
            original.setHireDay(2000, 1, 1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002, 12, 31);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
