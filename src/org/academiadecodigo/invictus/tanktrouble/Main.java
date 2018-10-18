package org.academiadecodigo.invictus.tanktrouble;

import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;
import org.academiadecodigo.invictus.tanktrouble.Tank.Player1Movement;
import org.academiadecodigo.invictus.tanktrouble.Tank.Player1Tank;
import org.academiadecodigo.invictus.tanktrouble.Tank.Player2Tank;

public class Main {
    public static void main(String[] args) {

        SimpleGfxGrid grid = new SimpleGfxGrid(100,100);

        grid.init();

        Player1Tank player1 = new Player1Tank(grid.makeGridPosition(10 , 10));
        player1.setField(grid);

        Player2Tank player2 = new Player2Tank(grid.makeGridPosition(20 , 20));
        player2.setField(grid);


    }
}
