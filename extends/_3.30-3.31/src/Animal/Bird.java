package Animal;

public class Bird extends Animal implements Fly{
    public Bird(String name) {
        setName(name);
    }

    public void eat() {
        System.out.println(getName() + "正在吃虫子");
    }

    public void fly(){
        System.out.println(getName() + "正在飞");
    }
}
