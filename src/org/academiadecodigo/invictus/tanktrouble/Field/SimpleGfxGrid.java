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
        return maze(board);
    }


    public Wall[] maze(int board){
        if (board==1){

            Wall[] walls = new Wall[7];
            //walls[0] = new Wall (100,200,200,5);
            walls[0]=new Wall(0,0,1200,40,true);
            walls[1]=new Wall(0,0,40,900,false);
            walls[2]=new Wall(1200,0,40,940,false);
            walls[3]=new Wall(0,900,1240,40,true);
            walls[4]=new Wall(105,200,195,40,true);
            walls[5]=new Wall(100,200,5,40,false);
            walls[6]=new Wall(300,200,5,40,false);
            /*walls[1] = new Wall (290,200,5,200);
            walls[2] = new Wall (290,400,100,5);
            walls[3] = new Wall (450,30,5,200);
            walls[4] = new Wall (460,220,100,5);
            walls[5] = new Wall (750,100,5,600);
            walls[6] = new Wall (360,700,400,5);*/
            return walls;
        }
        return null;
    }
}


