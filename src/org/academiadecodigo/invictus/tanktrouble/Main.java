package org.academiadecodigo.invictus.tanktrouble;

import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;

public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        try{
            g.start();
        }catch (InterruptedException ex){
            System.out.println("The execution was interrupted");
        }
    }
}
