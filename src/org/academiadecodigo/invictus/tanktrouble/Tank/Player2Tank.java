package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Field.GridPosition;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;

public class Player2Tank extends Tank {
    private static final int[] KEY_CODES = {
            KeyboardEvent.KEY_W,//moving up
            KeyboardEvent.KEY_S,//moving down
            KeyboardEvent.KEY_A,//moving left
            KeyboardEvent.KEY_D //moving right
    };

    public Player2Tank(GridPosition pos) {
        super(pos,"/Users/codecadet/Workspace/TankTrouble/tank-trouble/lib/Resources/Pictures/tank2.png",KEY_CODES);

    }
}
