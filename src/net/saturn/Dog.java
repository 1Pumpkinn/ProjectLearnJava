package net.saturn;

public class Dog {
    // Members
    // FIELDS
    public String picture;  // A public field is accessible from anywhere and changeable
    protected String name;  // A Protected field is accessible from sub-classes and same package
    private int age;        // A Private field is accessible ONLY within this class
    // A Protected final field is accessible from sub-classes and same package and "finals" cannot be changed!

    // Constructor --> "Method to create a new Instance of a "Dog" Object
    // Default Constructor
//    public Dog() {
//
//    }

    public static int numberOfDogs = 0; // Statics are associated with the whole class
    // so for example numberOfDogs it gets all the dogs even if they are a different breed they are still "dogs"
    // It's kinda like a "global variable" not 100% true but similar

    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;

        numberOfDogs++;
    }


    // Methods
    public void birthday() {
        System.out.println("It is " + name + "'s Birthday");
        age++;
    }

    public void bark() {
        System.out.println(name + " barked.");
    }

    // Getter
    public int getAge() {
        return age;
    }

}
