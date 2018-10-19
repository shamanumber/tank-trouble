package org.academiadecodigo.invictus.tanktrouble.Field;


import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGrid  {

    public static final int PADDING = 10;

    private int cellSize = 10;
    private int cols;
    private int rows;



    private Rectangle field;
    private Wall wall;

//grid constructor with a certain number of columns and rows

    public SimpleGfxGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
    }

// Initializes the field simple graphics rectangle and draws it

    public void init(int maze) {
        this.field = new Rectangle(PADDING, PADDING, cols * cellSize, rows * cellSize);
        this.field.draw();
        maze(maze);



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

    public void maze(int maze){
        if (maze==1){

            Wall wall1 = new Wall (100,200,200,10);
            Wall wall2 = new Wall (290,200,10,200);
            Wall wall3 = new Wall (290,400,100,10);

            Wall wall4 = new Wall (450,30,10,200);
            Wall wall5 = new Wall (460,220,100,10);

            Wall wall6 = new Wall (750,100,10,600);
            Wall wall7 = new Wall (360,700,400,10);








        }

    }
}


