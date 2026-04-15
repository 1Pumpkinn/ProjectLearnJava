package net.saturn;

public class Rabbit {
    public String picture;
    public String name;
    private int age;

    public static int numberOfRabbits = 0;

    public Rabbit(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;

        numberOfRabbits++;
    }

    // Getters
    public int getAge() {
        return age;
    }
}
