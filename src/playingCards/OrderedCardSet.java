package playingCards;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("serial")
public class OrderedCardSet extends LinkedList<Card> {

    //shuffle the cards
    public void shuffle() {
        Collections.shuffle(this);
    }

    //Sort the cards
    public void sort() {
        Collections.sort(this);
    }

    //hearts count for 1 point each
    //Queen of Spades is 13 points.
    public int getPointsValue() {
        int pointsTotal = 0;
        for (Card card : this) {
            if (card.isHeart()) {
                pointsTotal += 1;
            }
            if(card.isQueenOfSpades()) {
                pointsTotal += 13;
            }
        }
        return pointsTotal;
    }


}
