package Animal;

public  class Animal {
    private String name;
    private String describe = "我们都是动物";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal( ){
    }

    public void sleep(){
        System.out.println(this.name + "正在睡觉");
    }

    class Fish  implements Swim{
        public void swim(){
            System.out.println("正在游泳");
        }
    }
    public void describetion(){
        Fish fish = this.new Fish();
        fish.swim();
    }
}
