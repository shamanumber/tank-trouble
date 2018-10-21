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

    public Wall[] init( int maze) {
        return maze(maze);
    }


    public Wall[] maze(int maze) {
        switch (Mazes.values()[maze]) {
            case MAZE1:
                Wall[] walls1 = new Wall[25];
                walls1[0] = new Wall(PADDING, PADDING, 1200, 40, true);
                walls1[1] = new Wall(PADDING, PADDING, 40, 900, false);
                walls1[2] = new Wall(1200, PADDING, 40, 930, false);
                walls1[3] = new Wall(PADDING, 900, 1230, 40, true);

                walls1[4] = new Wall(130, 200, 195, 40, true);
                walls1[5] = new Wall(125, 200, 5, 40, false);
                walls1[6] = new Wall(325, 200, 5, 40, false);

                walls1[7] = new Wall(1000, 200, 40, 400, false);
                walls1[8] = new Wall(1000, 195, 40, 5, true);
                walls1[9] = new Wall(1000, 600, 40, 5, true);

                walls1[10] = new Wall(500, 450, 40, 300, false);
                walls1[11] = new Wall(500, 450, 40, 5, true);
                walls1[12] = new Wall(500, 750, 40, 5, true);

                walls1[13] = new Wall(505, 750, 395, 40, true);
                walls1[14] = new Wall(500, 750, 5, 40, false);
                walls1[15] = new Wall(900, 750, 5, 40, false);

                walls1[16] = new Wall(145, 650, 200, 40, true);
                walls1[17] = new Wall(140, 650, 5, 40, false);
                walls1[18] = new Wall(345, 650, 5, 40, false);

                walls1[19] = new Wall(845, 150, 40, 300, false);
                walls1[20] = new Wall(845, 145, 40, 5, true);
                walls1[21] = new Wall(845, 450, 40, 5, true);

                walls1[22] = new Wall(645, 150, 40, 100, false);
                walls1[23] = new Wall(645, 145, 40, 5, true);
                walls1[24] = new Wall(645, 250, 40, 5, true);

                return walls1;

            case MAZE2:
                Wall[] walls2 = new Wall[25];
                walls2[0] = new Wall(PADDING, PADDING, 1200, 40, true);
                walls2[1] = new Wall(PADDING, PADDING, 40, 900, false);
                walls2[2] = new Wall(1200, PADDING, 40, 930, false);
                walls2[3] = new Wall(PADDING, 900, 1230, 40, true);

                walls2[4] = new Wall(1000, 500, 100, 40, true);
                walls2[5] = new Wall(995, 500, 5, 40, false);
                walls2[6] = new Wall(1100, 500, 5, 40, false);

                walls2[7] = new Wall(500, 800, 50, 40, true);
                walls2[8] = new Wall(495, 800, 5, 40, false);
                walls2[9] = new Wall(550, 800, 5, 40, false);

                walls2[10] = new Wall(450, 250, 200, 40, true);
                walls2[11] = new Wall(445, 250, 5, 40, false);
                walls2[12] = new Wall(650, 250, 5, 40, false);

                walls2[13] = new Wall(300, 750, 40, 150, false);
                walls2[14] = new Wall(300, 745, 40, 5, true);
                walls2[15] = new Wall(300, 900, 40, 5, true);

                walls2[16] = new Wall(250, 450, 300, 40, true);
                walls2[17] = new Wall(245, 450, 5, 40, false);
                walls2[18] = new Wall(550, 450, 5, 40, false);

                walls2[19] = new Wall(800, 250, 40, 250, false);
                walls2[20] = new Wall(800, 245, 40, 5, true);
                walls2[21] = new Wall(800, 500, 40, 5, true);

                walls2[22] = new Wall(805, 700, 50, 40, true);
                walls2[23] = new Wall(800, 700, 5, 40, false);
                walls2[24] = new Wall(855, 700, 5, 40, false);

                return walls2;

            case MAZE3:

                Wall[] walls3 = new Wall[22];
                walls3[0] = new Wall(PADDING, PADDING, 1200, 40, true);
                walls3[1] = new Wall(PADDING, PADDING, 40, 900, false);
                walls3[2] = new Wall(1200, PADDING, 40, 930, false);
                walls3[3] = new Wall(PADDING, 900, 1230, 40, true);

                walls3[4] = new Wall(305, 200, 195, 40, true);
                walls3[5] = new Wall(300, 200, 5, 40, false);
                walls3[6] = new Wall(500, 200, 5, 40, false);

                walls3[7] = new Wall(700, 500, 200, 40, true);
                walls3[8] = new Wall(695, 500, 5, 40, false);
                walls3[9] = new Wall(900, 500, 5, 40, false);

                walls3[10] = new Wall(400, 700, 300, 40, true);
                walls3[11] = new Wall(395, 700, 5, 40, false);
                walls3[12] = new Wall(700, 700, 5, 40, false);

                walls3[13] = new Wall(300, 205, 40, 195, false);
                walls3[14] = new Wall(300, 200, 40, 5, true);
                walls3[15] = new Wall(300, 400, 40, 5, true);

                walls3[16] = new Wall(800, 300, 200, 40, true);
                walls3[17] = new Wall(795, 300, 5, 40, false);
                walls3[18] = new Wall(1000, 300, 5, 40, false);

                walls3[19] = new Wall(900, 200, 40, 100, false);
                walls3[20] = new Wall(900, 195, 40, 5, true);
                walls3[21] = new Wall(900, 300, 40, 5, true);

                return walls3;
            }
            return null;
        }
    }


