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


        test();


    }


    public static void test() {
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
                result = number1 + number2; wantToContunue();
                break;
            case "minus", "-":
                result = number1 - number2; wantToContunue();
                break;
            case "multiply", "*":
                result = number1 * number2; wantToContunue();
                break;
            case "divide", "/": wantToContunue();
                result = number1 / number2; break;
            default: wantToContunue(); break;

        }
        System.out.println("Your result it " + number1 + " " + operation + " " + number2 + " = " + result);
    }

    public static void wantToContunue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to continue if so type \"y\"");
        String caculatorContinue = scanner.next();
        if (caculatorContinue.equals("y")) {
            while (true) {
                test();
            }
        }
    }
}




