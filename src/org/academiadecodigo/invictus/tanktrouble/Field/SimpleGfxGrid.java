package org.academiadecodigo.invictus.tanktrouble.Field;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGrid  {

    public static final int PADDING = 10;

    private int cellSize = 10;
    private int cols;
    private int rows;

    private Rectangle field;

//grid constructor with a certain number of columns and rows

    public SimpleGfxGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

// Initializes the field simple graphics rectangle and draws it

    public void init() {
        this.field = new Rectangle(PADDING, PADDING, cols * cellSize, rows * cellSize);
        this.field.draw();
    }

    public void setCellSize(int cellSize) {
        this.cellSize = cellSize;
    }

    public int getCellSize() {
        return cellSize;
    }

    public int getCols() {
        return this.cols;
    }

    public int getRows() {
        return this.rows;
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

    public GridPosition makeGridPosition(int col, int row) {
        return new GridPosition(col, row, this);
    }

// Auxiliary method to compute the y value that corresponds to a specific row
//     * @param row index
//     * @return y pixel value

    public int rowToY(int row) {
        return PADDING + cellSize * row;
    }

    //Auxiliary method to compute the x value that corresponds to a specific column
//     * @param column index
//     * @return x pixel value
    public int columnToX(int column) {
        return PADDING + cellSize * column;
    }
}
