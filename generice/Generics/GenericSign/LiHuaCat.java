package Generics.GenericSign;

public class LiHuaCat extends Cat{
    public LiHuaCat(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的狸花猫，正在吃鱼");
    }
}
