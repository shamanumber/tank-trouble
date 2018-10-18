package org.academiadecodigo.invictus.tanktrouble.Field;

import org.academiadecodigo.invictus.tanktrouble.Direction;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GridPosition {

    private int col;
    private int row;
    private Color color;
    private SimpleGfxGrid field;
    private Picture tankPicture;

    public GridPosition(int col, int row, SimpleGfxGrid grid) {

        this.col = col;
        this.row = row;
        this.field = grid;

    }


    public SimpleGfxGrid getGrid() {
        return field;

    }

    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;

    }

    public int getRow() {
        return row;
    }

    public void moveInDirection(Direction direction, int distance) {

        switch (direction) {

            case UP:
                setPos(getCol(), getRow() - 1);
                break;
            case DOWN:
                setPos(getCol(), getRow() + 1);
                break;
            case LEFT:
                setPos(getCol() - 1, getRow());
                break;
            case RIGHT:
                setPos(getCol() + 1, getRow());
                break;
        }


    }


}
