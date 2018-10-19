package org.academiadecodigo.invictus.tanktrouble;

import org.academiadecodigo.invictus.tanktrouble.Field.FieldPosition;
import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;
import org.academiadecodigo.invictus.tanktrouble.Tank.Player1Tank;
import org.academiadecodigo.invictus.tanktrouble.Tank.Player2Tank;
import org.academiadecodigo.invictus.tanktrouble.Tank.Tank;

public class Game {

    private Tank player1;
    private Tank player2;
    private SimpleGfxGrid field;


    public Game(SimpleGfxGrid grid) {

        this.player1 = new Player1Tank(new FieldPosition(20, 20, grid));
        this.player2 = new Player2Tank(new FieldPosition(40, 40, grid));
        this.field = grid;
    }


    public void start() throws InterruptedException {

        while (true) {

            player1.move();
            player2.move();
            Thread.sleep(16);
        }
    }


}
