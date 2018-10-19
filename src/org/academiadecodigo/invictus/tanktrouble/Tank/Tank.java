package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Direction;
import org.academiadecodigo.invictus.tanktrouble.Field.GridPosition;
import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;
import org.academiadecodigo.simplegraphics.pictures.Picture;



public class Tank {
    private GridPosition pos;
    private SimpleGfxGrid field;
    private Direction direction=Direction.STOPPED;
    private  Picture tank;

    public Tank(GridPosition pos, String path, int[] KEY_CODES) {

        this.pos = pos;
        tank = new Picture(pos.getx(),pos.gety(),path);
        TankMovement tankMovement=new TankMovement(this,KEY_CODES);
        tank.draw();
    }


    public GridPosition getPos() {

        return pos;
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
               tank.translate(Math.cos(Math.toRadians(tank.getRotation())),Math.sin(Math.toRadians(tank.getRotation())));
               break;
           case DOWN:
               tank.translate(-Math.cos(Math.toRadians(tank.getRotation())),-Math.sin(Math.toRadians(tank.getRotation())));
               break;
           case LEFT:
               tank.setRotation(tank.getRotation()-3);
               break;
           case STOPPED:
               break;
       }
    }
}
