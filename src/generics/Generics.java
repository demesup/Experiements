package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<java.io.Serializable> list = new ArrayList<>();
        list.add(56);
        list.add("hi");
        list.add('l');

        System.out.println(list);
        //Before Java 5
        List animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(new Animal(56));

        String animal = (String) animals.get(3);
        System.out.println(animal);


        //After Java 5
        List<String> animals1 = new ArrayList<>();
        animals1.add("cat");
        animals1.add("dog");
        animals1.add("frog");

        String animal1 = animals1.get(1);
        System.out.println(animal1);
    }
}
