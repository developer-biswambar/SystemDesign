package org.biswa.snakeladder;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    @Getter
    private final int boardSize;

    private final Map<Integer, BoardEnitty> integerBoardEnittyMap;


    public Board(int boardSize, List<BoardEnitty> boardEnittyList) {
        this.boardSize = boardSize;
        this.integerBoardEnittyMap = new HashMap<>();
        addSnakeAndLadders(boardEnittyList);
    }

    public int checkSnakeOrLadder(int startPosition) {
        if (!integerBoardEnittyMap.containsKey(startPosition)) {
            return startPosition;
        } else {

            var boardEntity = integerBoardEnittyMap.get(startPosition);
            if (boardEntity instanceof Snake) {
                System.out.println("Found a Snake");
            } else {
                System.out.println("Found a ladder");
            }
            return integerBoardEnittyMap.get(startPosition).getEndPosition();
        }
    }

    private void addSnakeAndLadders(List<BoardEnitty> boardEnittyList) {

        for (BoardEnitty boardEnitty : boardEnittyList) {
            integerBoardEnittyMap.put(boardEnitty.getStartPosition(), boardEnitty);
        }
    }


}
