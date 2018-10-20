package org.academiadecodigo.invictus.tanktrouble.Field;


import org.academiadecodigo.invictus.tanktrouble.GameObjects.Wall;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGrid {

    public static final int PADDING = 10;

    private int x;
    private int y;
    private Rectangle field;

//grid constructor with a certain number of columns and rows

    public SimpleGfxGrid(int x, int y) {
        this.x = x;
        this.y = y;
    }

// Initializes the field simple graphics rectangle and draws it

    public Wall[] init(int board) {
        this.field = new Rectangle(PADDING, PADDING, x, y);
        this.field.draw();
        return maze(board);
    }

    public int getWidth() {
        return this.field.getWidth();
    }

    public int getHeight() {
        return this.field.getHeight();
    }

    public int getX() {
        return this.field.getX();
    }

    public int getY() {
        return this.field.getY();
    }

//Grid#makeGridPosition()

    public FieldPosition makeGridPosition(int col, int row) {
        return new FieldPosition(col, row, this);
    }


    public Wall[] maze(int board){
        if (board==1){
            Wall[] walls = new Wall[7];
            walls[0] = new Wall (100,200,200,40);
            walls[1] = new Wall (290,200,60,200);
            walls[2] = new Wall (290,400,100,40);
            walls[3] = new Wall (450,30,60,200);
            walls[4] = new Wall (460,220,100,40);
            walls[5] = new Wall (750,100,60,600);
            walls[6] = new Wall (360,700,400,40);
            return walls;
        }
        return null;
    }
}


