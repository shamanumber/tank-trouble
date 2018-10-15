package org.academiadecodigo.invictus.tanktrouble.Field;

import org.academiadecodigo.invictus.tanktrouble.Direction;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class FieldPosition {

    private int col;
    private int row;
    private Color color;
    private Field field;
    private Picture tankPicture;

    public FieldPosition(int col, int row, Field field) {

        this.col = col;
        this.row = row;
        this.field = field;
        tankPicture = new Picture(col, row, "resources/cool-minecraft-background-piq-scorpion-tank-100x100-pixel-art-by-kamilo713-minecraft-background.png");
        tankPicture.draw();
    }


    public Field getField() {
        return field;

    }

    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;
        tankPicture.draw();
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
