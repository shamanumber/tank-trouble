package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class TankActions implements KeyboardHandler {

    private Tank tank;
    private int[] KEY_CODES;


    public TankActions(Tank tank, int[] KEY_CODES) {
        this.tank = tank;
        this.KEY_CODES = KEY_CODES;
        Keyboard keyboard = new Keyboard(this);

        for (int keyCode : KEY_CODES) {
            for (KeyboardEventType type : KeyboardEventType.values()) {
                KeyboardEvent event = new KeyboardEvent();
                event.setKey(keyCode);
                event.setKeyboardEventType(type);
                keyboard.addEventListener(event);
            }
        }
    }

    @Override
    public void keyPressed(KeyboardEvent e) {

        if (e.getKey() == KEY_CODES[0]) {
            tank.setUp(true);
        }

        if (e.getKey() == KEY_CODES[1]) {
            tank.setDown(true);
        }

        if (e.getKey() == KEY_CODES[2]) {
            tank.setLeft(true);
        }

        if (e.getKey() == KEY_CODES[3]) {
            tank.setRight(true);

        }

        if(e.getKey() == KEY_CODES[4]){
            tank.shoot();
        }
    }


    @Override
    public void keyReleased(KeyboardEvent e) {
        if (e.getKey() == KEY_CODES[0]) {
            tank.setUp(false);
        }

        if (e.getKey() == KEY_CODES[1]) {
            tank.setDown(false);
        }

        if (e.getKey() == KEY_CODES[2]) {
            tank.setLeft(false);
        }

        if (e.getKey() == KEY_CODES[3]) {
            tank.setRight(false);
        }
    }
}
