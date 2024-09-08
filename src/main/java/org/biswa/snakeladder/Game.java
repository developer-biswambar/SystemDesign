package org.biswa.snakeladder;

import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private Dice dice;


    public Game(int boardSize, int diceSides, List<Player> players, List<BoardEnitty> boardEnittyList) {
        this.board = new Board(boardSize, boardEnittyList);
        this.players = players;
        this.dice = new Dice(diceSides);
    }

    public void startGame() {
        boolean isGameOver = false;
        while (!isGameOver) {

            for (Player player : players) {

                playPlayerTurn(player);

                if (player.getPosition() == board.getBoardSize()) {
                    System.out.println("Game Over !! \n " + player.getName() + " reached " + player.getPosition() + "  Won!!");
                    isGameOver = true;
                    break;
                }

            }

        }
    }

    private void playPlayerTurn(Player player) {
        System.out.println(player.getName() + "'s current Position " + player.getPosition());

        int roll = dice.roll();

        int currPosition = player.getPosition() + roll;
        System.out.println(player.getName() + " rolled a " + roll);

        currPosition = board.checkSnakeOrLadder(currPosition);
        System.out.println(player.getName() + "'s New Position " + player.getPosition());
        player.setPosition(currPosition);

    }
}
