package javaForBeginersAlishev;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(123));
        animals.add(new Animal(987));
        animals.add(new Animal(111));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(123));
        dogs.add(new Dog(456));
        dogs.add(new Dog(789));

        testAnyObject(animals);
        testAnyObject(dogs);

        testSuper(animals);
        testExtends(dogs);

        Animal animal = new Animal(56){
            @Override
            public void eat() {
                System.out.println("Other animal is eating...");
            }
        };

        animal.eat();

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };

        AbleToEat ableToEat1 = () -> System.out.println("Someone is eating...");

    }

    private static void testAnyObject(List<?> list) {
        for (Object animal : list) {
            System.out.println(animal);
        }
    }

    private static void testSuper(List<? super Animal> list) {
        for (Object animal : list) {
            System.out.println(animal);
        }
    }

    private static void testExtends(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }
}
