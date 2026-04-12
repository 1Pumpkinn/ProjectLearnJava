import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* LOOPS (FOR & WHILE */
        // Doing things Multiple times (easily)
        // Doing things Multiple times (easily)

        // Output all numbers from 0 to 99
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);

        // Now output numbers between 1000 and 2000 and only leap years!
        System.out.println(1000);
        System.out.println(1004);
        System.out.println(1008);

        /* FOR LOOP */
        // for(Initialization; Condition; Update) if condition is false the loop stops
        // Example 0 to 99
        for(int i = 0; i < 100; i++) { // if "i" is smaller than 100 keep adding until you get to 99

            if(i == 56 || i == 57 || i == 58) {
                continue;
            }
            System.out.println(i);
        }

        int countTo = 100;
        for(int i = 0; i < countTo; i++) {

            System.out.println(i);
        }

        // Example: Leap years
        for(int i = 1000; i <= 2000; i++) {

            if(i == 1980) {
                break;
            }

            // If the year is divisible by 4 AND (it's NOT divisible by 100 OR it is divisible by 400)
            if(i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                System.out.println(i);
            }
        }

        /* WHILE LOOP */
        int health = 10;
        while (health > 0) { // Infinite loop
            System.out.println("The Player is still Alive with " + health + " HP");
            health--;
        }

        System.out.println("-------------");

        // CAUTION for While Loops
        // They can cause: INFINITE LOOPS!
        health = 10;
        while (health > 0) {
            if(health == 6) {
                continue; // skip the rest of the loop
            }
            if(health == 2) {
                break; // exit and break out of the loop
            }
            System.out.println("The Player is still Alive with " + health + " HP");
            health--;

            }
        }
    }

