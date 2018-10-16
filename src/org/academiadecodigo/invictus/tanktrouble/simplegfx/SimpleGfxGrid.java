package org.academiadecodigo.invictus.tanktrouble.simplegfx;

import org.academiadecodigo.invictus.tanktrouble.Grid;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;

    private int cellSize = 15;
    private int cols;
    private int rows;

    private Rectangle field;

//grid constructor with a certain number of columns and rows

    public SimpleGfxGrid (int cols, int rows){
        this.cols = cols;
        this.rows = rows;
    }

// Initializes the field simple graphics rectangle and draws it

    @Override
    public void init() {
        this.field = new Rectangle(PADDING, PADDING, cols * cellSize, rows * cellSize);
        this.field.draw();
    }
    




}
