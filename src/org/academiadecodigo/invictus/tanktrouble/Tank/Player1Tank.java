package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Field.GridPosition;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

public class Player1Tank extends Tank {

    private static final int[] KEY_CODES = {
            KeyboardEvent.KEY_UP,//moving up
            KeyboardEvent.KEY_DOWN,//moving down
            KeyboardEvent.KEY_LEFT,//moving left
            KeyboardEvent.KEY_RIGHT //moving right
    };


    public Player1Tank(GridPosition pos) {
        super(pos, "/Users/codecadet/Workspace/TankTrouble/tank-trouble/lib/Resources/Pictures/tank1.png",KEY_CODES);
    }
}
