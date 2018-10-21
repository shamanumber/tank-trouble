package org.academiadecodigo.invictus.tanktrouble;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Menu {

    private Status status;
    private Picture menu;
    private Picture startGame;
    private Picture exit;
    private Picture toy;


    public Menu() {

        menu = new Picture(0, 0, "lib/Resources/Pictures/tankACback.jpg");
        startGame = new Picture(1, 1, "lib/Resources/Pictures/pressstart.gif");
        exit = new Picture(2, 2, "lib/Resources/Pictures/exit.png");
        toy = new Picture(10, 10, "lib/Resources/Pictures/toy.png");
        new MenuHandler();
        status = Status.MENU;

    }

    public Game.Status play() throws InterruptedException {

        status = menu.play();

        menu.draw();

        while (status == Game.Status.MENU) {
            Thread.sleep(50);
        }

        menu.delete();
        return status;

        if (status == Status.QUIT) {
            System.exit(0);
        }

        if (status == Status.GAME) {


        }
    }

    private class MenuHandler implements KeyboardHandler {

        private Keyboard k;

        public MenuHandler() {
            k = new Keyboard(this);
            mapKeys();
        }

        private void mapKeys() {
            KeyboardEvent pressGame = new KeyboardEvent();
            pressGame.setKey(KeyboardEvent.KEY_P);
            pressGame.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(pressGame);

            KeyboardEvent pressQuit = new KeyboardEvent();
            pressQuit.setKey(KeyboardEvent.KEY_Q);
            pressQuit.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            k.addEventListener(pressQuit);
        }

        @Override
        public void keyPressed(KeyboardEvent e) {

            switch (e.getKey()) {
                case KeyboardEvent.KEY_P:
                    status = Game.Status.GAME;
                    break;
                case KeyboardEvent.KEY_Q:
                    status = Game.Status.QUIT;
                    break;
                default:
                    System.err.println("MENU KEYS NOT WORKING.");
            }
        }

        @Override
        public void keyReleased(KeyboardEvent keyboardEvent) {

        }
    }
}





