package org.biswa.snakeladder;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Player {
    private final String id;
    private final String name;
    @Setter
    private int position;

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
