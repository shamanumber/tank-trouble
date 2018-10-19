package org.academiadecodigo.invictus.tanktrouble;

import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;

public class Main {
    public static void main(String[] args) {

        SimpleGfxGrid grid = new SimpleGfxGrid(170,90);

        grid.init();

        Game g = new Game(grid);
        try{
            g.start();
        }catch (InterruptedException ex){
            System.out.println("The execution was interrupted");
        }
    }
}
