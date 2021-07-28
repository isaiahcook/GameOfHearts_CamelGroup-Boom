package playingCards;

public enum Suit {
    CLUBS, DIAMONDS, SPADES, HEARTS;

    @Override
    public String toString() {
        return Character.toString(this.name().charAt(0));
    }

    public String compactToString() {
        return toString().substring(0, 1);
    }
}










    /**
    CLUBS("Clubs"),
    DIAMONDS("Diamond"),
    SPADES("Spades"),
    HEARTS("Hearts");

    private final String suitText;
//constructors in a enum have to be private.

    private playingCards.Suit(String suitText ) {
        this.suitText = suitText;

    }

    public String printSuit() {
        return suitText;
    }

}
**/