package Generics.GenericSign;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        ArrayList<LiHuaCat> list1 = new ArrayList<>();
        ArrayList<PersianCat> list2 = new ArrayList<>();
        ArrayList<HuskyDog> list3 = new ArrayList<>();
        ArrayList<TeddyDog> list4 = new ArrayList<>();

        list3.add(new HuskyDog("小哈士奇", 5));

//        keepPet1(list1);//泛型不具备继承性
//        keepPet1(list2);
        keepPet3(list3);
    }

    public static void keepPet1(ArrayList<? extends Cat> list){
        for (Cat cat : list) {
            cat.eat();
        }
    }
    public static void keepPet2(ArrayList<? extends Dog> list){
        for (Dog dog : list) {
            dog.eat();
        }
    }
    public static void keepPet3(ArrayList<? extends Animal> list){
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
