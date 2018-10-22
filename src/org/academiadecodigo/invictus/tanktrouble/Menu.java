package org.academiadecodigo.invictus.tanktrouble;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;



public class Menu {

    private Game.Status status;
    private Picture menu;
    private Picture toy;
    private Sound introMenu;



    public Menu() {

        menu = new Picture(0, 0, "lib/Resources/Pictures/tankACback.jpg");
        toy = new Picture(1050, 800, "lib/Resources/Pictures/toy.png");
        introMenu = new Sound(" lib/Resources/Sound/IntroEyeoftheTiger1.wav");
        new MenuHandler();
        status = Game.Status.MENU;

    }

    public Game.Status play() throws InterruptedException {

        menu.draw();
        toy.draw();

        introMenu.play(true);
        introMenu.loopIndef();

        while (status == Game.Status.MENU) {
            Thread.sleep(400);
        }

        menu.delete();
        toy.delete();
        introMenu.stop();
        introMenu.close();

        return status;

    }

    private class MenuHandler implements KeyboardHandler {

        private Keyboard k;

        public MenuHandler() {
            k = new Keyboard(this);
            mapKeys();
        }

        private void mapKeys() {
            KeyboardEvent pressGame = new KeyboardEvent();
            pressGame.setKey(KeyboardEvent.KEY_S);
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
                case KeyboardEvent.KEY_S:
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





