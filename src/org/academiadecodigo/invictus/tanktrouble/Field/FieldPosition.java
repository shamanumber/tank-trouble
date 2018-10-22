package org.academiadecodigo.invictus.tanktrouble.Field;


public class FieldPosition {

    private int x;
    private int y;
    private SimpleGfxGrid field;


    public FieldPosition(int x, int y, SimpleGfxGrid field) {

        this.x = x;
        this.y = y;
        this.field = field;
    }





    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}



