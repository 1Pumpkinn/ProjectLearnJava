public class Main {
    public static void main(String[] args) {

      /* INTEGERS & MATH */
        // Equals is the assignment operator
        // Plus is the addition operator

        int a = 100;
        int b = 200;

        /* ADDITION */
        // a + b = sum;
        // does not work because the assignment operator
        // assigns the value from the right to the left

        int sum = a + b;
        System.out.println("Sum: " + sum);

        sum = 50;
        System.out.println("Sum: " + sum); // Overrides sum

        /* SUBTRACTION */

        int sub = a - b;
        System.out.println("Subtraction: " + sub);

        /* MULTIPLICATION */

        int multi = a * b;
        System.out.println("Multiplication: " + multi);

        /* DIVISION */

        int division = a / b;
        System.out.println("Division: " + division);
        // Cannot have 0.5 because we are using a int

        double x = 100;
        double y = 200;
        double doubleDivsion =  x / y;
        System.out.println("DoubleDivision: " + doubleDivsion);
        // Outputs 0.5 because we are using a double

        // Never divide by 0
        //division = b / 0;
        //System.out.println("Division: " + division);
        // Outputs error
        // Exception in thread "main" java.lang.ArithmeticException: / by zero


        /* REMAINDER (MODULO) */

        int remainder = 100 % 2; // = 0 => Even Number | = 1 => Uneven Number!
        // This pretty much does is take 100 divides it by 2 and then looks for anything remains
        // 2 fits into 100 150 times
        System.out.println("Remaining from 100 / 2: " + remainder);

        remainder = 100 % 3;
        System.out.println("Remaining from 100 / 3: " + remainder);
        // remains 1

        remainder = 100 % 4;
        System.out.println("Remaining from 100 / 4: " + remainder);


        /* MATH METHODS */

        System.out.println("Rounding " + Math.round(6.4));        // Output: 6
        System.out.println("Rounding Down " + Math.floor(6.4));   // Output: 6 // returns a double
        System.out.println("Rounding Down " + Math.floor(500.2f));   // Output: 6 // returns a float
        System.out.println("Rounding Up " + Math.ceil(6.4));      // Output: 7 // returns a double
        System.out.println("Exponent " + Math.pow(2, 3));         // Output: 2^3 = 8 returns a double

        // More "Math Methods"
        // Math. <---

        System.out.println(Math.max(2432, 5002));
        System.out.println(Math.min(2432, 5002));

        // How Division works
        /*
        It's just like a pack of skittles
        If u wanna share with ur friends
        But you all want the same amount
        If there's like 20 skittles
        And 4 of you
        And you each want the same amount
        You would give each person one until there aren't any
        Then how many would each person have
        4 people would get 5 skittles BC 5+5+5+5 = 20

         */

        int skittles = 20;
        System.out.println(skittles / 4);



    }
}
