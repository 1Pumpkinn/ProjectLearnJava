import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* (BASIC) Casting */
        // Turning one Data Type into another

        int health = 10;
        float damage = 1.5f;

        // int result = health - damage; // 10 - 1.5f = 8.5f
        float resultFloat = health - damage; // this works because it's a float!

        System.out.println("Result: " + resultFloat); // 8.5f

        int resultInt = health - (int) damage; // explicit "Cast" damage from float to int
        System.out.println("Result: " + resultInt);

        resultFloat = (float) health - damage;
        System.out.println(resultFloat); // 10 -> 10.0

        resultInt = (int) ((float) health - damage); // 8.5 to int --> 8
        System.out.println(resultInt);

        // health at 10 and damage at 9.99 -> 9.99 -> 9 everything gets cut off from the decimal

       // resultInt = (boolean) health; Not convertible

        String points = "100";
        String pi = "3.14159265";

        int result = Integer.parseInt(points); // String to Integer
        System.out.println("Result: " + result);

        double resultPi = Double.parseDouble(pi);
        System.out.println("Result Pi: " + resultPi);




    }
}
