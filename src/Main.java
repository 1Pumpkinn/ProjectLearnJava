import net.saturn.Cat;
import net.saturn.Dog;
import net.saturn.Rabbit;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* CLASSES & OBJECTS */



        System.out.println("How many dogs are there? " + Dog.numberOfDogs);
        System.out.println("How many rabbits are there? " + Rabbit.numberOfRabbits);
        System.out.println("How many cats are there? " + Cat.numberOfCats);





        Dog bengie = new Dog("bengie.png", "Bengie", 11);
        Dog jeremy = new Dog("jeremy.jpg", "Jeremy", 7);
        Cat saturn = new Cat("saturn.png", "Saturn", 4);

        System.out.println("How many dogs are there? " + Dog.numberOfDogs);


        System.out.println("How many cats are there? " + Cat.numberOfCats);


        System.out.println("Bengie Age: " + bengie.getAge());
        System.out.println("Jeremy Age: " + jeremy.getAge());
        System.out.println("Saturn Age: " + saturn.getAge());

        System.out.println("How many cats are there? " + Cat.numberOfCats);
        jeremy.bark();
        jeremy.birthday();

        System.out.println("Bengie Age: " + bengie.getAge());
        System.out.println("Jeremy Age: " + jeremy.getAge());

        // bengie.age = 100; // Modify this field directly! (not usually what we want)

        System.out.println("Bengie age: " + bengie.getAge());

        System.out.println("How many rabbits are there? " + Rabbit.numberOfRabbits);

        Cat axis = new Cat("axis.png", "Axis", 11);


        Rabbit pumpkin = new Rabbit("pumpkin.jpg", "Pumpkin", 3);
        System.out.println(pumpkin.getAge());

        Dog charlie = new Dog("charlie.png", "Charlie", 13);


        System.out.println("How many dogs are there? " + Dog.numberOfDogs);
        System.out.println("How many rabbits are there? " + Rabbit.numberOfRabbits);
        System.out.println("How many cats are there? " + Cat.numberOfCats);


    }
}





