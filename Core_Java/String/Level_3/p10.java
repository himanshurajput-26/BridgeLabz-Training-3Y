package Level_3;
import java.util.*;

public class p10 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        List<String> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        Collections.shuffle(deck);

        System.out.println("Shuffled deck of cards:");
        for (String card : deck) {
            System.out.println(card);
        }

        // Distribute to 4 players (example: 5 cards each)
        System.out.println("\nDistributing cards to 4 players:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Player " + (i+1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(deck.get(i*5 + j) + ", ");
            }
            System.out.println();
        }
    }
}
