import Gameplay.Game;
import Players.ComputerPlayer;
import Players.HumanPlayer;
import Players.Player;


import java.util.ArrayList;
import java.util.*;

public class PlayHearts {

    static List<Player> players;
    public static void main(String args[]) {


        //List of players
        List<Player> players = Game.GreetPlayers();





        //create game
        Game game = new Game(players);

        //play game
        game.play();
    }
}

