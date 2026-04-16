package net.saturn;

import javax.xml.namespace.QName;

public class Dog extends Animal implements Pettable{
    public static int numberOfDogs = 0;

    public Dog(String picture, String name, int age) {
        super(picture, name, age); // Basically the same as new Animal(...)

        numberOfDogs++;
    }

    // have to implement every single Abstract class / method or be abstract themselves
    @Override
    public void move() {
        System.out.println("Dog is running!");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barked");
    }

    public void bellyRub() {
        System.out.println("Belly rubbed " + getName());

    }

    @Override
    public void pet() {
        bellyRub();
    }
}
