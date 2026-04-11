import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /* CONTROL FLOW (IF & SWITCH) */
        // "Everything is just an if statement"
        // To "Control The Flow of the program, not just line by line!

       Scanner scanner = new Scanner(System.in);
       int mana = scanner.nextInt();

       if(mana >= 75) {
           System.out.println("You can use any Ability");
       } else if(mana > 50) {
           System.out.println("You can use Ability 1");
        } else {
           System.out.println("You cannot perform a Ability");
       }

        System.out.println("Choose a number from 0 to 10");
       int number = scanner.nextInt();

       switch(number) {
           case 0: System.out.println("The correct number was 0"); break;
           case 1: System.out.println("The correct number was 1"); break;
           case 2: System.out.println("The correct number was 2"); break;
           case 3: System.out.println("The correct number was 3"); break;
           case 4: System.out.println("The correct number was 4"); break;
           case 5: System.out.println("The correct number was 5"); break;
           case 6: System.out.println("The correct number was 6"); break;
           case 7: System.out.println("The correct number was 7"); break;
           case 8: System.out.println("The correct number was 8"); break;
           case 9: System.out.println("The correct number was 9"); break;
           case 10: System.out.println("The correct number was 10"); break;
           default: System.out.println("ERROR: You exceeded the Number Limit!");
       }


    }
}
