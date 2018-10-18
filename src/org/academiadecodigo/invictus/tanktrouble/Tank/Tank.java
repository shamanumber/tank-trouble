package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Direction;
import org.academiadecodigo.invictus.tanktrouble.Field.GridPosition;
import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;
import org.academiadecodigo.simplegraphics.pictures.Picture;



public class Tank {
    private GridPosition pos;
    private final int speed = 1;
    private SimpleGfxGrid field;
    private Direction direction=Direction.STOPPED;
    private  Picture tank;
    private int initialPos;

    public Tank(GridPosition pos, String path, int[] KEY_CODES) {

        this.pos = pos;
        tank = new Picture(pos.getx(),pos.gety(),path);
        TankMovement tankMovement=new TankMovement(this,KEY_CODES);
        tank.draw();
    }


    public GridPosition getPos() {

        return pos;
    }



    public void setField(SimpleGfxGrid field) {

        this.field = field;
    }



    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move(){

       switch (direction){
           case RIGHT:
               tank.setRotation(tank.getRotation()+3);
               break;
           case UP:
               tank.translate(0,-2);
               break;
           case DOWN:
               tank.translate(0,2);
               break;
           case LEFT:
               tank.setRotation(tank.getRotation()-3);
               break;
           case STOPPED:
               break;
       }
    }
}
