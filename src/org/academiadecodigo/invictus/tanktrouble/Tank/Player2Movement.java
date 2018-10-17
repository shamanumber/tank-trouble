package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Direction;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Player2Movement implements KeyboardHandler {

    private Tank tank;


    public Player2Movement(Tank tank){
        this.tank = tank;

        Keyboard keyboard2 = new Keyboard(this);

        KeyboardEvent MovingUp = new KeyboardEvent();
        MovingUp.setKey(KeyboardEvent.KEY_W);
        MovingUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard2.addEventListener(MovingUp);


        KeyboardEvent MovingDown = new KeyboardEvent();
        MovingDown.setKey(KeyboardEvent.KEY_S);
        MovingDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard2.addEventListener(MovingDown);


        KeyboardEvent MovingLeft = new KeyboardEvent();
        MovingLeft.setKey(KeyboardEvent.KEY_A);
        MovingLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard2.addEventListener(MovingLeft);


        KeyboardEvent MovingRight = new KeyboardEvent();
        MovingRight.setKey(KeyboardEvent.KEY_D);
        MovingRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard2.addEventListener(MovingRight);

        KeyboardEvent StopMovingLeft = new KeyboardEvent();
        StopMovingLeft.setKey(KeyboardEvent.KEY_A);
        StopMovingLeft.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard2.addEventListener(StopMovingLeft);

        KeyboardEvent StopMovingUp = new KeyboardEvent();
        StopMovingUp.setKey(KeyboardEvent.KEY_W);
        StopMovingUp.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard2.addEventListener(StopMovingUp);

        KeyboardEvent StopMovingRight = new KeyboardEvent();
        StopMovingRight.setKey(KeyboardEvent.KEY_D);
        StopMovingRight.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard2.addEventListener(StopMovingRight);

        KeyboardEvent StopMovingDown = new KeyboardEvent();
        StopMovingDown.setKey(KeyboardEvent.KEY_S);
        StopMovingDown.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        keyboard2.addEventListener(StopMovingDown);
    }

    @Override
    public void keyPressed(KeyboardEvent e) {

        if(e.getKey() == KeyboardEvent.KEY_W){
            tank.setDirection((Direction.UP));
        }

        if(e.getKey() == KeyboardEvent.KEY_S){
            tank.setDirection((Direction.DOWN));
        }

        if(e.getKey() == KeyboardEvent.KEY_A){
            tank.setDirection((Direction.LEFT));
        }

        if(e.getKey() == KeyboardEvent.KEY_D){
            tank.setDirection((Direction.RIGHT));
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        tank.setDirection(Direction.STOPPED);
    }
}
