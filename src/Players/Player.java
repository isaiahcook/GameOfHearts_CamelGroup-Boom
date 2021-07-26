package Players;

import playingCards.Card;
import playingCards.Hand;

import java.io.InputStream;
import java.io.PrintStream;


public abstract class Player {

    //player name.
    private String name;
    //the cards in the players hand.
    private Hand hand = new Hand();
    //where to get input
    protected InputStream inputStream = System.in;
    //Where to get output
    protected PrintStream printStream = System.out;

    //constructor : sets the players name.
    public Player(String name) {
        this.name = name;
    }

    //get Player Name
    public String getName() {
        return name;
    }

    //get the print Stream
    public PrintStream getPrintStream() {
        return printStream;
    }


     public void receiveCard(Card card, int position) {
        //cards[position] = card;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void displayNameAndType(PrintStream givenPrintStream) {
        String type = "";
        givenPrintStream.println(getName() + " (" + type + ")");
    }
}
