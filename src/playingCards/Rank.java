package playingCards;

public enum Rank {
    N2('2'),
    N3('3'),
    N4('4'),
    N5('5'),
    N6('6'),
    N7('7'),
    N8('8'),
    N9('9'),
    T('T'),
    J('J'),
    Q('Q'),
    K('K'),
    A('A');

    private char rank;

    Rank(char rank) {
    this.rank = rank;
}

@Override
public String toString() {
    return Character.toString(rank);
}
}












/**
    TWO(2), THREE(3), FOUR(4),
    FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8), NINE(9), TEN(10),
    JACK(10), QUEEN(13), KING(10), ACE(11);

    //Private Fields
    private final int rankValue;

    //Constructor
    private playingCards.Rank(int rankValue) {
        this.rankValue = rankValue;

    }

    //public methods
    public int getRank() {
        return rankValue;
    }
}
**/