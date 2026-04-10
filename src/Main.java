import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* ASSIGNMENT OPERATORS */

        // Assignment =
        int mana = 100;
        System.out.println("Mana: " + mana);

        // 1000 = mana; <-- no work because assignment operator
        // is sided take right value and assign to left

        // int x = 1000;
        // mana = x;


        // ADDITION +=
        mana += 20; // mana = mana + 20; adding 20 to mana itself
        System.out.println("Mana: " + mana);

        mana++; // mana = mana + 1; // This is also known as INCREMENTING
        System.out.println("Mana: " + mana); // 121


        // SUBTRACTION -=
        mana--; // mana = mana - 1; // This is also known as DECREMENTING
        System.out.println("Mana: " + mana); // 120
        mana -= 60; // mana = mana - 60;
        System.out.println("Mana: " + mana); // 60


        // MULTIPLY *=
        mana *= 2;
        System.out.println("Mana: " + mana);


        // DIVISION /=
        mana /= 4;
        System.out.println("Mana: " + mana);


        // MODULO (REMAINDER) %=
        mana %= 2;
        System.out.println("Mana: " + mana);


    }
}
