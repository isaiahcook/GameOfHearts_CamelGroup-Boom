package Gameplay;

public interface Rules {
    /*Declare methods without implementation all return true/false.
    True if rules followed and false otherwise.
    Implemented by game.
    Methods: Must play suit that is dealt
    */

    boolean mustPlaySuitThatIsDealt();

    boolean canNotDiscardQueenOfSpadesTurnOne();

    boolean canNotDiscardAHeartsCardTurnOne();

    boolean twoOfClubsMustBePlayedFirstTurnOne();

    boolean highestCardOfLedSuitWinsTheTrick();

}
