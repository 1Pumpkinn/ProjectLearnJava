import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /* CONTROL FLOW (IF & SWITCH) */
        // "Everything is just an if statement"
        // To "Control The Flow of the program, not just line by line!

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much health do you have?");
        int health = scanner.nextInt();
        boolean isAlive = health > 0;

        if(isAlive) {
            System.out.println("You are still alive with " + health + " hp"); // only calls this when (true)
        } else {
            System.out.println("You are ermmm dead!"); // calls when only false
        }

        System.out.println("How many points did you have in the Exam?");
        int points = scanner.nextInt();

        if(points >= 100) {
            System.out.println("Ez Passing 🤓");
        } else if(points >= 50) {
            System.out.println("You passed");
        } else {
            System.out.println("You failed gulp...");
        }

        /* SWITCH STATEMENT */
        // for explicit action for cases

        System.out.println("Give me a number from 0 and 5...");
        int studentId = scanner.nextInt();
        switch(studentId) {
            case 0: System.out.println("Student Bob has Id 0"); break;
            case 1: System.out.println("Student Meow has Id 1"); break;
            case 2: System.out.println("Student EEE has Id 2"); break;
            case 3: System.out.println("Student BBB has Id 3"); break;
            case 4: System.out.println("Student TTT has Id 4"); break;
            case 5: System.out.println("Student PPP has Id 5"); break;

            default: System.out.println("Number does not exist in the Program erm IDIOT learn numbers."); break;
        }




    }
}
