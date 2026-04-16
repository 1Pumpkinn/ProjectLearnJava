import net.saturn.*;

public class Main {
    public static void main(String[] args) {

        /* ABSTRACT CLASSES & INTERFACES */

        Dog bengie = new Dog("bengie.png", "Bengie", 11);
        Dog jeremy = new Dog("jeremy.jpg", "Jeremy", 7);
        Cat saturn = new Cat("saturn.png", "Saturn", 6);

        Bird theo = new Bird("theo.png", "Theo", 9);
        Bird yoshi = new Bird("yoshi.png", "Yoshi", 9);
        Bear browny = new Bear("browny", "Browny", 12);

        // Animal reference but actually a Cat
        Animal john = new Cat("john.png", "John", 31);


        Pettable nano = new Cat("nano.bmp", "Nano", 0);

        // Pettable nano = new Bear("nano.bmp", "Nano", 0);
        // does not work because Bear is not pettable


        PettingZoo myZoo = new PettingZoo(bengie, jeremy, saturn, (Cat) john);

        // PettingZoo myZoo = new PettingZoo(bengie, jeremy, saturn, theo);
        // does not work because Bird is in there, even if you try to cast it, it won't work

        // PettingZoo myZoo = new PettingZoo(bengie, jeremy, saturn, john);
        // does not work because "john" is an Animal and
        // Animal does not know Pettable exists
        // BUT you can cast it:
        // PettingZoo myZoo = new PettingZoo(bengie, jeremy, saturn, (Cat) john);


        myZoo.petRandomAnimal();
        myZoo.petRandomAnimal();
        myZoo.petRandomAnimal();


        // Animal is a categorization, but it's more "abstract"
        // wait... like abstract classes?

        // Animal john = new Animal("john.png", "John", 31);
        // you cannot make an instance of an abstract class

        // for this you would need to make a Dog or Cat instead
        // new Animal does not work with abstract classes

    }
}