package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Direction;
import org.academiadecodigo.invictus.tanktrouble.Field.Field;
import org.academiadecodigo.invictus.tanktrouble.Field.FieldPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Tank {
    private FieldPosition pos;
    private final int speed = 1;
    private Field field;
    private Direction direction;
    private  Picture tank;

    public Tank(FieldPosition pos, String path) {

        this.pos = pos;
        tank = new Picture(10,10,path);
        tank.draw();
    }



    public FieldPosition getPos() {

        return pos;
    }



    public void setField(Field field) {

        this.field = field;
    }



    public void accelerate(Direction direction){

    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move(){

        if (direction == null){

            return;
        }

        accelerate(direction);
    }
}
