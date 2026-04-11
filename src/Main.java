import javax.naming.NamingEnumeration;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* BOOLEANS AND LOGIC */

        // Booleans are either true or false
        boolean saturnIsAGoodDeveloper = true;
        boolean saturnIsAdminAbuser = false;

        System.out.println("Is Saturn a good Developer ? " + saturnIsAGoodDeveloper);
        System.out.println("Is Saturn a Admin Abuser ? " + saturnIsAdminAbuser);

        boolean isCreative = false;
        System.out.println("Player is in Creative Mode: " + isCreative);


        /* COMPARISON
        (  <  <=  >=  > ==  !=  )*/
        int points = 82;
        int pointsForPassing = 55;

        boolean hasPassedTest = points >= pointsForPassing;
        System.out.println("Has Passed Test: " + hasPassedTest);

        int health = 10;
        boolean isAlive = health > 0;
        System.out.println("Player is still Alive: " + isAlive); // Health = 1 TRUE, Health = 0 FALSE

        // VARIABLE/VALUE comparison ==> VARIABLE/VALUE ==> BOOLEAN
        // int + int ==> int

        // BEWARE of STRINGS
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

         // boolean isSaturn = name == "Saturn"; // .equals for Strings
        boolean isSaturn = name.equals("Saturn"); // <-- name.equals()
        System.out.println("Is your name Saturn? " + isSaturn);

        /* LOGIC */
        // "addition and "subtraction" for Booleans

        // (BOOLEAN logicOperator BOOLEAN) ==> BOOLEAN

        // OR || ==> (a || b) // 1 is true, 0 is false
        // a | b | c
        // 0 | 0 | 0
        // 1 | 0 | 1
        // 0 | 1 | 1
        // 1 | 1 | 1

        // AND && ==> (a && b)
        // a | b | c
        // 0 | 0 | 0
        // 1 | 0 | 0
        // 0 | 1 | 0
        // 1 | 1 | 1

        // NOT !
        // a | !a
        // 0 |  1
        // 1 |  0


        boolean passTest1 = true;
        boolean passTest2 = true;
        boolean hasHonors = passTest1 && passTest2;

        // Mining example
        boolean hasPickaxe = true;
        int durability = 5;
        int neededDurability = 9;

        boolean canMine3x3Area = (hasPickaxe && (durability >= neededDurability)) || isCreative;

        /* DRINKING AGE EXAMPLE (*/
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Put in or true or false, you are from Europe?");
        boolean isEuropean = scanner.nextBoolean();


//        boolean canPersonDrinkAlcohol = (isEuropean && age >= euDrinkingAge) || !isEuropean && age >= usDrinkingAge;
//        System.out.println("Can you drink? " + canPersonDrinkAlcohol);

        // Breaking It Down

        int euDrinkingAge = 18;
        int usDrinkingAge = 21;

        boolean isAmerican = !isEuropean;
        boolean couldDrinkInEU = age >= euDrinkingAge;
        boolean couldDrinkInUS = age >= usDrinkingAge;


        boolean canPersonDrinkAlcohol = isEuropean && couldDrinkInEU || isAmerican && couldDrinkInUS;
        System.out.println("Can you drink? " + canPersonDrinkAlcohol);





    }
}
