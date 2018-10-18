package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Field.GridPosition;

public class Player1Tank extends Tank {

    private Player1Movement tank;



    public Player1Tank(GridPosition pos) {
        super(pos,"lib/Resources/Pictures/tank1.png");
        Player1Movement movement = new Player1Movement(this);
        movement.movement();
    }
}
