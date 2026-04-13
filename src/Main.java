import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXERCISE 2a: Easy Calculator (Now with Methods)
         *
         * Use the same Calculator, we've made in Exercise 1a and remake it with methods!
         * In addition, make it so that the calculator asks if you'd like to continue, you can then say "y" if you do!
         * Think how this "infinite" loop could be made! (Hint: Lesson Loops)
         *
         * Estimated Time: 30-45 minutes
         *
         */
        caculate();
    }

    public static void caculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the operation (plus or +, minus or -, multiply or *, divide or /)");
        String operation = scanner.next();

        System.out.println("Type in your first number!");
        int number1 = scanner.nextInt();
        System.out.println("Type in your second number!");
        int number2 = scanner.nextInt();


        int result = 0;

        switch (operation) {
            case "plus", "+":
                result = number1 + number2; wantToContinue();
                break;
            case "minus", "-":
                result = number1 - number2; wantToContinue();
                break;
            case "multiply", "*":
                result = number1 * number2; wantToContinue();
                break;
            case "divide", "/": wantToContinue();
                result = number1 / number2; break;
            default: wantToContinue(); break;

        }
        System.out.println("Your result it " + number1 + " " + operation + " " + number2 + " = " + result);
    }

    public static void wantToContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to continue if so type \"y\"");
        String calculatorContinue = scanner.next();

        if (calculatorContinue.equals("y")) {
            while (true) {
                caculate();
            }
        } else {
            System.out.println("Calculator Stopped");
        }
    }
}




