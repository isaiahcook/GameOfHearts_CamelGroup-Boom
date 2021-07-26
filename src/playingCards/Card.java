package playingCards;

public class Card implements Comparable<Card> {

    /**
     * Private Fields.
     * each playing card contains a rank and a suit.
     */
    private Suit suit;
    private Rank rank;
    private boolean isFaceUp;

    /**
     * Constructor Method
     * everycard created must be given the rank and the suit.
     *
     * @param rank
     * @param suit
     */
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        isFaceUp = true;
    }

    //common cards
    public static final Card queenOfSpades = new Card(Rank.Q, Suit.SPADES);
    public static final Card kingOfSpades = new Card(Rank.K, Suit.SPADES);
    public static final Card aceOfSpades = new Card(Rank.A, Suit.SPADES);
    public static final Card twoOfDiamonds = new Card(Rank.N2, Suit.DIAMONDS);

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    /**
     * Now  to Check Cards
     *
     * @return Is The playingCards.Card A heart?
     */
    public boolean isHeart() {
        return this.getSuit().equals(Suit.HEARTS);
    }

    //is the card the QueenOfSpades?
    public boolean isQueenOfSpades() {
        return this.equals(queenOfSpades);
    }
    //Is the card a heart or the queen of spades?
    public boolean  isPointsCard() {
    return this.isHeart() || this.isQueenOfSpades();
    }
    //example Q of Hearts.
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
    //example QH
    public String compactToString() {
        return getRank().toString() + getSuit().compactToString();

    }

    //now we want to compare our suit and rank
    //lexicographically compare (suit, rank)
    public int compareTo(Card card) {
        int comparedSuits = this.getSuit().compareTo(card.getSuit());
        if (comparedSuits == 0) {
            return this.getRank().compareTo(card.getRank());

        }
        return comparedSuits;

    }


}












