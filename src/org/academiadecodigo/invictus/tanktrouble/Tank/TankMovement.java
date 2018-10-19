package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Direction;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class TankMovement implements KeyboardHandler {

    private Tank tank;
    private int[] KEY_CODES;

    public TankMovement(Tank tank, int[] KEY_CODES) {
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
            tank.setDirection((Direction.UP));
        }

        if (e.getKey() == KEY_CODES[1]) {
            tank.setDirection((Direction.DOWN));
        }

        if (e.getKey() == KEY_CODES[2]) {
            tank.setDirection((Direction.LEFT));
        }

        if (e.getKey() == KEY_CODES[3]) {
            tank.setDirection((Direction.RIGHT));

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        tank.setDirection(Direction.STOPPED);
    }
}
