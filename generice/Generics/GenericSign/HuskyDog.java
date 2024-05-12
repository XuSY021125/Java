package Generics.GenericSign;

public class HuskyDog extends Dog{
    public HuskyDog(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的哈士奇，正在拆家");
    }
}
