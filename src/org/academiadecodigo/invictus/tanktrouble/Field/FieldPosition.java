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


    public SimpleGfxGrid getField() {
        return field;
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}



