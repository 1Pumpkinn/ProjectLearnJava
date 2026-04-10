import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* ERRORS */
        // Errors are normal in software / programming, They are normal and very good FEEDBACK!

        /* Compiler Errors (Syntax Errors) */
        // Errors that are shown before you run the Program!

//        int x = 0.0; // Error: incompatible type
//        int x = 0;   // Error x is already defined

//        }} too many closing curly brackets!

//        int z = 0 // Error: expected ;



        /* Runtime errors (Exceptions) */
//        Errors that happen during the Program!

//        float y = 1 / 0; // Exception: Divide By Zero

//        Exception: NullPointerException

//        String text = null;
//        System.out.println("Text is " + text); // <-- this does not error
//        int length = text.length();
//        System.out.println("The length of the text is " + length);
//        this errors because the variable text is null (meaning it's nothing)


// Errors = Feedback fail = yummy = errors = something to fix = productivity
// Errors = Feedback fail = yummy = errors = something to fix = productivity
// Errors = Feedback fail = yummy = errors = something to fix = productivity
// Errors = Feedback fail = yummy = errors = something to fix = productivity
// Errors = Feedback fail = yummy = errors = something to fix = productivity
// Errors = Feedback fail = yummy = errors = something to fix = productivity


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter anything that is not a number, that's gonna throw an error");
        int number = scanner.nextInt();
        System.out.println("You just typed " + number);



        // This is a StackTrace pretty much finds the error where it is located

//        Exception in thread "main" java.util.InputMismatchException
//        at java.base/java.util.Scanner.throwFor(Scanner.java:977)
//        at java.base/java.util.Scanner.next(Scanner.java:1632)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2297)
//        at java.base/java.util.Scanner.nextInt(Scanner.java:2251)
//        at Main.main(Main.java:38)

    }
}
