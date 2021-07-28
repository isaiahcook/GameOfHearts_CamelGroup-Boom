package Gameplay;

import Players.HumanPlayer;
import Players.Player;
import playingCards.Card;

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
    // Get name of players
    public static List<Player> GreetPlayers(){
        printStream.println("Welcome to Hearts");
        List<Player> listOfPlayers = new ArrayList<>();
        for(int i = 0; i<4; i++){
            printStream.println("Player "+(i+1)+" what is your name?");
            String nameOfPlayer = input.next();
            HumanPlayer newPlayer = new HumanPlayer(nameOfPlayer);
            listOfPlayers.add(newPlayer);

        }
        return listOfPlayers;

    }





    public Game(List<Player> players) {
        this.players = players;
    }
    public void play(){

    }

    @Override
    public boolean  mustPlaySuitThatIsDealt() {
        //bunch of if else statements
        boolean playerHasSuit = false;
        if (playerHasSuit) {
            boolean mustPlaySuitThatIsDealt = true;
            return mustPlaySuitThatIsDealt();
        }


        return false;
    }

    @Override
    public boolean canNotDiscardQueenOfSpadesTurnOne() {
        int clubs = 0;
        if (clubs == 0 ){
            return false;
        }

        return false;
    }

    @Override
    public boolean canNotDiscardAHeartsCardTurnOne() {return false; }

    @Override
    public boolean twoOfClubsMustBePlayedFirstTurnOne() {return false; }

    @Override
    public boolean highestCardOfLedSuitWinsTheTrick() {return false; }
}
