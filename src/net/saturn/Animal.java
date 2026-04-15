package net.saturn;

public class Animal {

    protected String picture;
    private String name;
    private int age;

    public Animal(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public void birthday() {
        System.out.println("It is " + name + "'s Birthday");
        age++;
    }

    public void makeSound() {
        System.out.println(name + " made a sound.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Picture: " + picture);
    }

    public String getName() {
        return name;
    }

    // Getter
    public int getAge() {
        return age;
    }

}
