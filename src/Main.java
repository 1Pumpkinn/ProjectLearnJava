import net.saturn.Animal;
import net.saturn.Cat;
import net.saturn.Dog;

public class Main {
    public static void main(String[] args) {
        /* INHERITANCE & POLYMORPHISM */

        Dog bengie = new Dog("bengie.png", "Bengie", 11);
        Dog jeremy = new Dog("jeremy.jpg", "Jeremy", 7);

        Cat saturn = new Cat("saturn.png", "Saturn", 4);

        // If something repeats... we can do something! :o

        bengie.displayInfo();
        bengie.birthday();

        bengie.displayInfo();
        bengie.makeSound();

        saturn.displayInfo();
        saturn.birthday();

        saturn.displayInfo();
        saturn.makeSound();

        Animal myCuteAnimal;
        myCuteAnimal = new Dog("charlie.png", "Charlie", 15);

        myCuteAnimal.makeSound();
        ((Dog) myCuteAnimal).bellyRub();

        bengie.bellyRub();
        saturn.scratch();

    }
}





