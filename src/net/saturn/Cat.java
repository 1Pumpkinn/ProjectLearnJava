package net.saturn;

public class Cat {
    public String picture;
    public String name;
    private int age;

    public static int numberOfCats = 0;

    public Cat(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;

        numberOfCats++;
    }
    // Getters
    public int getAge() {
        return age;
    }

}

