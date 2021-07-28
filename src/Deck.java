import Players.Player;
import playingCards.Card;

import java.util.ArrayList;

public class Deck {
    private static final int deckSize = 52;
    int count = 0;

    // Creates a deck 1-52 in that order.
    static ArrayList<Integer> deck = new ArrayList<Integer>();

    static void ShuffleDeck() {
        for (int x = 1; x <= deckSize; x++) {
            deck.add(x);
        }

        // Shuffles the array above and creates a new array of random order cards
        ArrayList<Integer> shuffleDeck = new ArrayList<Integer>();

        while (deck.size() > 0) {
            int index = (int) (Math.random() * deck.size());
            shuffleDeck.add(deck.remove(index));
            System.out.println(shuffleDeck.toString());
        }

    }

        static Player[] dealCards(Player[] players, Card[] deck) {
        int numOfCardsPerPlayer = deck.length / players.length;
        for(int i = 0; i < deck.length; i++) {
            int positionInHand = i % numOfCardsPerPlayer;
            players[i % players.length].receiveCard(deck[i], positionInHand);
        }
        return players;
    }

}
