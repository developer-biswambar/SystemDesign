package org.biswa;


import org.biswa.snakeladder.BoardEnitty;
import org.biswa.snakeladder.Game;
import org.biswa.snakeladder.Player;
import org.biswa.snakeladder.Snake;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player biswa = new Player("1", "Biswa");
        Player shivangi = new Player("1", "shivangi");

        var snake1 = new Snake(90, 10);
        var snake2 = new Snake(55, 20);
        var ladder = new Snake(15, 80);
        var ladder2 = new Snake(30, 65);

        Game game = new Game(1000000, 6, new ArrayList<>(List.of(biswa, shivangi)),
                new ArrayList<>(List.of(snake1, snake2, ladder2, ladder)));


        game.startGame();

    }
}