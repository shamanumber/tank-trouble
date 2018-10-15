package org.academiadecodigo.invictus.tanktrouble;

public class Tank {

    private FieldPosition pos;
    private final int speed = 1;
    private Field field;
    private Direction direction;


    public Tank(FieldPosition pos) {

        this.pos = pos;
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
