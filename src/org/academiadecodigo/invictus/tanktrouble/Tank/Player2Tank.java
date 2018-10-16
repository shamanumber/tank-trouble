package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Field.GridPosition;

public class Player2Tank extends Tank {

    public Player2Tank(GridPosition pos) {
        super(pos,"/Users/codecadet/Works/GroupProjects/tank-trouble/lib/Resources/Pictures/tank2.png");

        Player2Movement movement = new Player2Movement(this);
        movement.movement();
    }
}
