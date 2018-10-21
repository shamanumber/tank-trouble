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


    public Wall[] maze(int board) {
        if (board == 0) {

            Wall[] walls = new Wall[27];
            walls[0] = new Wall(PADDING, PADDING, 1200, 40, true);
            walls[1] = new Wall(PADDING, PADDING, 40, 900, false);
            walls[2] = new Wall(1200, PADDING, 40, 930, false);
            walls[3] = new Wall(PADDING, 900, 1230, 40, true);

            walls[4] = new Wall(130, 200, 195, 40, true);
            walls[5] = new Wall(125, 200, 5, 40, false);
            walls[6] = new Wall(325, 200, 5, 40, false);

            walls[7] = new Wall(1000, 200, 40, 400, false);
            walls[8] = new Wall(1000, 195, 40, 5, true);
            walls[9] = new Wall(1000, 600, 40, 5, true);

            walls[10] = new Wall(500, 450, 40, 300, false);
            walls[11] = new Wall(500, 450, 40, 5, true);
            walls[12] = new Wall(500, 750, 40, 5, true);

            walls[13] = new Wall(505, 750, 395, 40, true);
            walls[14] = new Wall(500, 750, 5, 40, false);
            walls[15] = new Wall(900, 750, 5, 40, false);

            walls[16] = new Wall(145, 650, 200, 40, true);
            walls[17] = new Wall(140, 650, 5, 40, false);
            walls[18] = new Wall(345, 650, 5, 40, false);

            walls[19] = new Wall(245, 655, 40, 145, false);
            walls[20] = new Wall(245, 800, 40, 5, true);

            walls[21] = new Wall(845, 150, 40, 300, false);
            walls[22] = new Wall(845, 145, 40, 5, true);
            walls[23] = new Wall(845, 450, 40, 5, true);

            walls[24] = new Wall(645, 150, 40, 100, false);
            walls[25] = new Wall(645, 145, 40, 5, true);
            walls[26] = new Wall(645, 250, 40, 5, true);

            return walls;
        }

        if (board == 1) {

            Wall[] walls = new Wall[25];
            walls[0] = new Wall(PADDING, PADDING, 1200, 40, true);
            walls[1] = new Wall(PADDING, PADDING, 40, 900, false);
            walls[2] = new Wall(1200, PADDING, 40, 930, false);
            walls[3] = new Wall(PADDING, 900, 1230, 40, true);

            walls[4] = new Wall(1000, 500, 100, 40, true);
            walls[5] = new Wall(995, 500, 5, 40, false);
            walls[6] = new Wall(1100, 500, 5, 40, false);

            walls[7] = new Wall(500, 800, 50, 40, true);
            walls[8] = new Wall(495, 800, 5, 40, false);
            walls[9] = new Wall(550, 800, 5, 40, false);

            walls[10] = new Wall(450, 250, 200, 40, true);
            walls[11] = new Wall(445, 250, 5, 40, false);
            walls[12] = new Wall(650, 250, 5, 40, false);

            walls[13] = new Wall(300, 750, 40, 150, false);
            walls[14] = new Wall(300, 745, 40, 5, true);
            walls[15] = new Wall(300, 900, 40, 5, true);

            walls[16] = new Wall(250, 450, 300, 40, true);
            walls[17] = new Wall(245, 450, 5, 40, false);
            walls[18] = new Wall(550, 450, 5, 40, false);

            walls[19] = new Wall(800, 250, 40, 250, false);
            walls[20] = new Wall(800, 245, 40, 5, true);
            walls[21] = new Wall(800, 500, 40, 5, true);

            walls[22] = new Wall(805, 700, 50, 40, true);
            walls[23] = new Wall(800, 700, 5, 40, false);
            walls[24] = new Wall(855, 700, 5, 40, false);

            return walls;
        }

        if (board == 2) {

            Wall[] walls = new Wall[22];
            walls[0] = new Wall(PADDING, PADDING, 1200, 40, true);
            walls[1] = new Wall(PADDING, PADDING, 40, 900, false);
            walls[2] = new Wall(1200, PADDING, 40, 930, false);
            walls[3] = new Wall(PADDING, 900, 1230, 40, true);

            walls[4] = new Wall(305, 200, 195, 40, true);
            walls[5] = new Wall(300, 200, 5, 40, false);
            walls[6] = new Wall(500, 200, 5, 40, false);

            walls[7] = new Wall(700, 500, 200, 40, true);
            walls[8] = new Wall(695, 500, 5, 40, false);
            walls[9] = new Wall(900, 500, 5, 40, false);

            walls[10] = new Wall(400, 700, 300, 40, true);
            walls[11] = new Wall(395, 700, 5, 40, false);
            walls[12] = new Wall(700, 700, 5, 40, false);

            walls[13] = new Wall(300, 205, 40, 195, false);
            walls[14] = new Wall(300, 200, 40, 5, true);
            walls[15] = new Wall(300, 400, 40, 5, true);

            walls[16] = new Wall(800, 300, 200, 40, true);
            walls[17] = new Wall(795, 300, 5, 40, false);
            walls[18] = new Wall(1000, 300, 5, 40, false);

            walls[19] = new Wall(900, 200, 40, 100, false);
            walls[20] = new Wall(900, 195, 40, 5, true);
            walls[21] = new Wall(900, 300, 40, 5, true);

            return walls;
        }


        return null;
    }
}


