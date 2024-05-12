package Animal;

public class AnimalTest {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal.Fish fish = animal.new Fish();


        Bird bird = new Bird("麻雀");
        bird.eat();
        System.out.println(bird.getName());
    }
}