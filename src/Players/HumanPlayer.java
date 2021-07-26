package Players;

import playingCards.Card;
import playingCards.Hand;

import java.io.PrintStream;

public class HumanPlayer  extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public void displayNameAndType(PrintStream printStream) {

    }

    //    @Override
//    public Card pickCardToPlay(Round round, Trick trick) {
//        //
//    }
}
