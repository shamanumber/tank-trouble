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

            Wall[] walls = new Wall[27];
            walls[0]=new Wall(PADDING,PADDING,1200,40,true);
            walls[1]=new Wall(PADDING,PADDING,40,900,false);
            walls[2]=new Wall(1200,PADDING,40,930,false);
            walls[3]=new Wall(PADDING,900,1230,40,true);

            walls[4]=new Wall(135,200,195,40,true);
            walls[5]=new Wall(130,200,5,40,false);
            walls[6]=new Wall(330,200,5,40,false);

            walls[7] = new Wall (1000,200,40,400, false);
            walls[8] = new Wall (1000,205,40,5,true);
            walls[9] = new Wall (1000,600,40,5,true);

            walls[10] = new Wall (500,450,40,300, false);
            walls[11] = new Wall (500,205,40,5,true);
            walls[12] = new Wall (500,600,40,5,true);

            walls[13] = new Wall (500,750,400,40, true);
            walls[14] = new Wall (1000,205,40,5,false);
            walls[15] = new Wall (1000,600,40,5,false);

            walls[16] = new Wall (145,650,200,40, true);
            walls[17] = new Wall (145,650,5,40, false);
            walls[18] = new Wall (345,650,5,40,false);

            walls[19] = new Wall (245,650,40,150, false);
            walls[20] = new Wall (245,800,40,5,true);

            walls[21] = new Wall (845,150,40,300, false);
            walls[22] = new Wall (845,150,40,5, true);
            walls[23] = new Wall (845,450,40,5,true);

            walls[24] = new Wall (645,150,40,100, false);
            walls[25] = new Wall (645,150,40,5, true);
            walls[26] = new Wall (645,250,40,5,true);

            return walls;
        }

        if (board==2){

            Wall[] walls = new Wall[27];
            walls[0]=new Wall(0,0,1200,40,true);
            walls[1]=new Wall(0,0,40,900,false);
            walls[2]=new Wall(1200,0,40,940,false);
            walls[3]=new Wall(0,900,1240,40,true);

            walls[4]=new Wall(1000,500, 100,40,true);
            walls[5]=new Wall(100,200,0,0,false);
            walls[6]=new Wall(300,200,0,0,false);

            walls[7] = new Wall (500,800,50,40, true);
            walls[8] = new Wall (1000,205,0,0,false);
            walls[9] = new Wall (1000,600,0,0,false);

            walls[10] = new Wall (450,250,200,40, false);
            walls[11] = new Wall (00,205,0,0,true);
            walls[12] = new Wall (1000,600,0,0,true);

            walls[13] = new Wall (300,750,40,150, false);
            walls[14] = new Wall (1000,205,0,0,true);
            walls[15] = new Wall (1000,600,0,0,true);

            walls[16] = new Wall (250,450,300,40, true);
            walls[17] = new Wall (145,650,0,0, false);
            walls[18] = new Wall (345,650,0,0,false);

            walls[19] = new Wall (245,650,0,0, false);
            walls[20] = new Wall (245,800,0,0,true);

            walls[21] = new Wall (845,150,0,0, false);
            walls[22] = new Wall (845,150,0,0, true);
            walls[23] = new Wall (845,450,0,0,true);

            walls[24] = new Wall (645,150,0,0, false);
            walls[25] = new Wall (645,150,0,0, true);
            walls[26] = new Wall (645,250,0,0,true);



            return walls;
        }


        return null;
    }
}


