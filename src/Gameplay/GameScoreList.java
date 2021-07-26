package Gameplay;

import java.util.ArrayList;

public class GameScoreList extends ArrayList<Integer> {

    //Every Score is Zero : Score Start at game
    public static GameScoreList zeros(int numberOfPlayers) {
        GameScoreList allZeros = new GameScoreList();
        for (int index = 0; index < numberOfPlayers; index++) {
            allZeros.add(0);
        }
        return allZeros;
    }
}
