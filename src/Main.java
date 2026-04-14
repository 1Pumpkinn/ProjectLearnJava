import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* COLLECTIONS */
        // For when an Array is just not enough!

        // Reminder Arrays... But what if we want to EXPAND?
        String[] questions = new String[4];
        questions[0] = "What does WWW stand for?";
        questions[1] = "What is the World's largest Ocean?";
        questions[2] = "Which Year did East and West Germany Unify?";
        questions[3] = "What is the tallest mountain on Earth?";

        String[] answers = new String[4];
        answers[0] = "World Wide Web";
        answers[1] = "Pacific Ocean";
        answers[2] = "1990";
        answers[3] = "Mt. Everest";

        /* LIST */
        // The much BETTER Array
        // List of String
        List<String> moreQuestions = new ArrayList<>(); // Diamond Operator <> for "Generic Types"

        moreQuestions.add("What websites hosts the most videos in the world?");
        moreQuestions.add("What is the Capital of Germany?");
        System.out.println(moreQuestions.get(0));


        // Within the angle brackets we can put whatever data type we want that is not a basic one
        // use Class equivalent aka the Uppercase Letter version
        // List<Integer> numbers = new ArrayList<>();
        // List<Boolean> truthValues = new ArrayList<>();

        // Another type of For Loop
        // for each String question : whatever collection we want to loop through
        // for each String question inside moreQuestions output them
        for(String question : moreQuestions) {
            System.out.println(question);
        }

        /* SET */
        // Where each element appears once!
        Set<String> countriesToVisit = new HashSet<>();
        countriesToVisit.add("France");
        countriesToVisit.add("Germany");
        countriesToVisit.add("Spain");
        countriesToVisit.add("France");

        System.out.println(countriesToVisit);

        /* MAP */
        // To Map one Thing to Another (key-Value Pair)
        Map<String, Integer> countryToPopulationMap = new HashMap<>();
        countryToPopulationMap.put("USA", 331000000);
        countryToPopulationMap.put("United Kingdom", 67330000);
        countryToPopulationMap.put("Austria", 8950000);

        System.out.println(countryToPopulationMap.get("USA"));
        System.out.println(countryToPopulationMap.get("Germany")); // gives us a null because does not exist
        System.out.println(countryToPopulationMap); // outputting the whole Map

        /* STACK & QUEUE */
        // Stacks => LIFO (Last in, First Out)
        // Queue => FIFO (First in, First Out)
        Stack<String> cards = new Stack<>();
        cards.add("King of Spades");
        cards.add("Queen of Diamonds");
        cards.add("Three of Clubs");

        // Pop will get (AND REMOVE) the "top" element of the stack (Taking the card off of the deck)
        System.out.println(cards.pop());
        // Peek will look at the top element "get it" but not remove it (Look at card put it back again)
        System.out.println(cards.peek());

        Queue<String> registerQueue = new ArrayDeque<>();
        registerQueue.add("Kaupenjoe");
        registerQueue.add("PumpkinDev");
        registerQueue.add("SantaEevee");
        registerQueue.add("Magnet108");
        registerQueue.add("Panda");

        // Poll will get (AND REMOVE) the "front" element (in the case the first person at the register)
        System.out.println(registerQueue.poll());
        // Peek once again will get, but not remove the person at the front!
        System.out.println(registerQueue.peek());



    }
}





