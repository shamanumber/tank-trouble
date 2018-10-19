package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Field.FieldPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Projectile {

    private FieldPosition pos;
    private Picture bullet;
    private Tank tank;
    private int angle;

    public Projectile(Tank tank, int angle){
        this.angle = angle;
        this.pos = pos;
        bullet = new Picture(tank.getX(),tank.getY(), "lib/Resources/Pictures/toy.png");
        bullet.draw();

    }

    public void move(){
        bullet.translate(Math.cos(Math.toRadians(angle)),Math.sin(Math.toRadians(angle)));
    }

}
