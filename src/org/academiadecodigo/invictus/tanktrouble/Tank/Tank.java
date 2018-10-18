package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Direction;
import org.academiadecodigo.invictus.tanktrouble.Field.GridPosition;
import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Tank {
    private GridPosition pos;
    private SimpleGfxGrid field;
    private Direction direction;
    private  Picture tank;

    public Tank(GridPosition pos, String path) {

        this.pos = pos;
        tank = new Picture(pos.getCol()*10,pos.getRow()*10.,path);
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
               if(getPos().getCol() == SimpleGfxGrid.-1);
               tank.translate(50,0);
               break;
           case UP:
               tank.translate(0,-50);
               break;
           case DOWN:
               tank.translate(0,50);
               break;
           case LEFT:
               tank.translate(-50,0);
               break;

       }
    }





}
