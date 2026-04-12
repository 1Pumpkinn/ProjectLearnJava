import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Use cases for operation operator +, - * /
        // or If statements if easier
        // Try clean code instead of messy

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Math Operator +, -, *, /");
        String operator = scanner.next();
        System.out.println("Input the first number");
        int num1 = scanner.nextInt();
        System.out.println("Input the second number");
        int num2 = scanner.nextInt();

        switch(operator) {
            case "+": System.out.println(num1 + num2); break;
            case "-": System.out.println(num1 - num2); break;
            case "*": System.out.println(num1 * num2); break;
            case "/": System.out.println(num1 / num2); break;

            default: System.out.println("Math operator either does not exist or you did not input numbers correctly"); break;
        }



        int min = 1;
        int max = 3;
        String pickaxe = "Pickaxe";
        String sword = "Sword";
        String shovel = "Shovel";

        int randomBlock = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(randomBlock);

        switch (randomBlock) {
            case 1: System.out.println("Stone Block has appeared"); break;
            case 2: System.out.println("Clay Block has appeared"); break;
            case 3: System.out.println("Cobwebs has appeared"); break;
        }




        /* EXERCISE 1b: Basic Resource Miner Game
         * Create a Basic "Resource Miner" Game. This is of course open to interpretation.
         *
         * The Basic idea is as follows: Via a random number generated, the "player" has one of (at least) three "blocks"
         * in front of them. Let's call them Clay, Stone, Cobweb as examples. The player must then decide which tool to use
         * Sword, Shovel, Pickaxe. Is the correct tool chosen then the player moves onto the next randomly selected block.
         * They should mine three blocks and then the game outputs the score on how many they mined correctly!
         *
         * When the player types in their tool, make sure to do a small amount of error correction. Make sure that both
         * lower and uppercase for the tool names are basically ignored! (Lesson: String Methods)
         *
         * For ease of use this, generates a number between 1 and 3, feel free to use it:
         * int min = 1;
         * int max = 3;
         * int randomBlock = (int) (Math.random() * (max - min + 1)) + min;
         *
         * Estimated Time ~60+ minutes
         *
         */


    }
}
