package org.biswa.snakeladder;

import lombok.Getter;

@Getter
public abstract class BoardEnitty {

    private final int startPosition;
    private final int endPosition;


    public BoardEnitty(int startPosition, int endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }
}
