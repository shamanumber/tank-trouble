package org.academiadecodigo.invictus.tanktrouble;

import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;
import org.academiadecodigo.invictus.tanktrouble.Tank.Player1Movement;
import org.academiadecodigo.invictus.tanktrouble.Tank.Player1Tank;
import org.academiadecodigo.invictus.tanktrouble.Tank.Player2Tank;

public class Main {
    public static void main(String[] args) {

        SimpleGfxGrid grid = new SimpleGfxGrid(100,100);

        grid.init();

        Game g = new Game(grid);
        try{
            g.start();
        }catch (InterruptedException ex){
            System.out.println("Deu merda");
        }
    }
}
