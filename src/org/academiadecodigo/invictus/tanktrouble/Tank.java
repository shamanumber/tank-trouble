package org.academiadecodigo.invictus.tanktrouble;

public class Tank {

    private FieldPosition pos;
    private final int speed = 1;
    private Field field;
    private FieldPosition direction;


    public Tank(FieldPosition pos) {

        this.pos = pos;
    }



    public FieldPosition getPos() {

        return pos;
    }



    public void setField(Field field) {

        this.field = field;
    }



    public void accelerate(FieldPosition direction){

    }





    public void move(){

        if (direction == null){

            return;
        }

        accelerate(direction);
    }
}
