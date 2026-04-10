import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* INPUT & OUTPUT */

        /* OUTPUT */
        // You usually output Strings

        System.out.println("Hello World!");
        System.out.println("Element Smp 💥🔫");

        // Values
        int health = 42;
        System.out.println(health);

        // Values with Strings
        int grade = 85;
        System.out.println("Your grade is: " + grade);

        /* INPUT */
        // we make a variable data type of Scanner
        // this allows us to read something in
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // HAS TO BE A NUMBER
        System.out.println("You just typed " + number);
        // outputs number what is the users value that they input into the console.

        String input = scanner.next(); // gets everything up until the next space.
        System.out.println("You just typed (String) " + input);





    }
}

