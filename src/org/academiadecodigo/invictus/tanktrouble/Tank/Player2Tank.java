package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Field.FieldPosition;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

public class Player2Tank extends Tank {

    private static final int[] KEY_CODES = {
            KeyboardEvent.KEY_W,//moving up
            KeyboardEvent.KEY_S,//moving down
            KeyboardEvent.KEY_A,//moving left
            KeyboardEvent.KEY_D, //moving right
            KeyboardEvent.KEY_1
    };

    public Player2Tank(FieldPosition pos) {
        super(pos, "lib/Resources/Pictures/tank2.png", KEY_CODES);

    }
}
