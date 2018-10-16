package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Direction;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Player1Movement implements KeyboardHandler {

    private Tank tank;


    public Player1Movement(Tank tank){
        this.tank = tank;
    }

    public void movement(){

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent MovingUp = new KeyboardEvent();
        MovingUp.setKey(KeyboardEvent.KEY_UP);
        MovingUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(MovingUp);


        KeyboardEvent MovingDown = new KeyboardEvent();
        MovingDown.setKey(KeyboardEvent.KEY_DOWN);
        MovingDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(MovingDown);


        KeyboardEvent MovingLeft = new KeyboardEvent();
        MovingLeft.setKey(KeyboardEvent.KEY_LEFT);
        MovingLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(MovingLeft);


        KeyboardEvent MovingRight = new KeyboardEvent();
        MovingRight.setKey(KeyboardEvent.KEY_RIGHT);
        MovingRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(MovingRight);
    }

    @Override
    public void keyPressed(KeyboardEvent e) {

        if(e.getKey() == KeyboardEvent.KEY_UP){
            tank.setDirection((Direction.UP));
        }

        if(e.getKey() == KeyboardEvent.KEY_DOWN){
            tank.setDirection((Direction.DOWN));
        }

        if(e.getKey() == KeyboardEvent.KEY_LEFT){
            tank.setDirection((Direction.LEFT));
        }

        if(e.getKey() == KeyboardEvent.KEY_RIGHT){
            tank.setDirection((Direction.RIGHT));
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
