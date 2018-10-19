package org.academiadecodigo.invictus.tanktrouble.Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GridPosition {

    private int x;
    private int y;
    private SimpleGfxGrid field;

    public GridPosition(int x, int y, SimpleGfxGrid grid) {

        this.x = x;
        this.y = y;
        this.field = grid;

    }


    public SimpleGfxGrid getGrid() {
        return field;

    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

}



