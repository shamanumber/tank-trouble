package org.academiadecodigo.invictus.tanktrouble.GameObjects.Tank;

import org.academiadecodigo.invictus.tanktrouble.Field.FieldPosition;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

public class Player1Tank extends Tank {

    private static final int[] KEY_CODES = {
            KeyboardEvent.KEY_UP,//moving up
            KeyboardEvent.KEY_DOWN,//moving down
            KeyboardEvent.KEY_LEFT,//moving left
            KeyboardEvent.KEY_RIGHT, //moving right
            KeyboardEvent.KEY_L
    };

    public Player1Tank(FieldPosition pos) {
        super(pos, "lib/Resources/Pictures/tank1.png", KEY_CODES);
    }
}
