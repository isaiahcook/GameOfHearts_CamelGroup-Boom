package Gameplay;

import Players.HumanPlayer;
import Players.Player;
import playingCards.Card;
import playingCards.Deck;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game implements Rules {

    private static Scanner input = new Scanner(System.in);
    //the players playing the game
    public List<Player> players;
    //print stream of the game displayed to all players.
    private static PrintStream printStream = System.out;
    //The card that must lead first each round
    private Card startingCard;
    //a list of cumulative scores after each round
    private List<GameScoreList> scoreHistory = new ArrayList<GameScoreList>(10);
    //how many players
    private int numberOfPlayers;

    // Get name of players
    public static List<Player> GreetPlayers() {
        printStream.println("Welcome to Hearts");
        List<Player> listOfPlayers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            printStream.println("Player " + (i + 1) + " what is your name?");
            String nameOfPlayer = input.next();
            HumanPlayer newPlayer = new HumanPlayer(nameOfPlayer);
            listOfPlayers.add(newPlayer);
        }
        printStream.println(listOfPlayers);
        return listOfPlayers;

    }

    public Game(List<Player> players) {
        this.players = players;


        //the deck to be used for playing(Shuffle before use again)
        Deck deck = new Deck();

        numberOfPlayers = players.size();

        //display players to all
        displayPlayers();
        printStream.println();
        prepareDeck();
        //want the lowest card to lead each round

    }
    //get the printStream
    public PrintStream getPrintStream() {
        return printStream;

    }

    //display the player names and controller
    private void displayPlayers() {
        printStream.println("The players:");
        for (Player player : players) {
        player.displayNameAndType(printStream);
    }

}

private void prepareDeck() {

}






    @Override
    public boolean mustPlaySuitThatIsDealt() {
        return false;
    }
}




 //   public void play(){

   // }





