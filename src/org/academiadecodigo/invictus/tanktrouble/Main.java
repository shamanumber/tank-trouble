package org.academiadecodigo.invictus.tanktrouble;


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
