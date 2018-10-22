package org.academiadecodigo.invictus.tanktrouble;

import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;

import java.lang.ref.Cleaner;

public class Main {
    public static void main(String[] args) {

        Cleaner.create();
        Game g = new Game();
        try{
            g.start();
        }catch (InterruptedException ex){
            System.out.println("The execution was interrupted");
        }
    }
}
