package Generics.GenericSign;

public class TeddyDog extends Dog{
    public TeddyDog(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的泰迪，正在吃骨头");
    }
}
