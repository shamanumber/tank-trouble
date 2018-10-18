package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Direction;
import org.academiadecodigo.invictus.tanktrouble.Field.GridPosition;
import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class Tank {
    private GridPosition pos;
    private final int speed = 1;
    private SimpleGfxGrid field;
    private Direction direction=Direction.STOPPED;
    private  Picture tank;

    public Tank(GridPosition pos, String path, int[] KEY_CODES) {

        this.pos = pos;
        tank = new Picture(pos.getx(),pos.gety(),path);
        TankMovement tankMovement=new TankMovement(this,KEY_CODES);
        tank.draw();
    }

    Graphics2D graphics2D = new Graphics2D() {
    }

    public GridPosition getPos() {

        return pos;
    }



    public void setField(SimpleGfxGrid field) {

        this.field = field;
    }


    public void accelerate(Direction direction){

    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move(){

       switch (direction){
           case RIGHT:
               this.rotation(-0.5);
               break;
           case UP:
               tank.translate(0,-2);
               break;
           case DOWN:
               tank.translate(0,2);
               break;
           case LEFT:
               this.rotation(0.5);
               break;
           case STOPPED:
               break;
       }
    }

    public void rotation(Double angle){


    }
}
