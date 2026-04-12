import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* TERNARY OPERATOR */
        // A very "compact" way to do if-else

        int health = 0;
        String status = "";
        System.out.println("What is your Status? " + status);

        if(health > 0) {
            status = "Alive";
        } else {
            status = "Dead";
        }
        System.out.println("What is your Status? " + status);
        status = "";

        // TERNARY OPERATOR
        // BOOLEAN ? TRUE_RETURN : FALSE_RETURN;
        status = (health > 0) ? "Alive" : "Dead";
        System.out.println("What is your Status? " + status);

        int mana = 100;
        boolean canUseAbility =

        canUseAbility = (mana >= 50) ? true : false;
        System.out.println("Can Player use Ability 1: " + canUseAbility);

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean canDrinkInNSW;

        canDrinkInNSW = (age >= 18) ? true : false;
        System.out.println("Can you drink in NSW Australia \"" +  canDrinkInNSW  + "\" Person is at the age of " + age);





    }
}
