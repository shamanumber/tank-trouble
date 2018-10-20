package org.academiadecodigo.invictus.tanktrouble.GameObjects.Tank;

import org.academiadecodigo.invictus.tanktrouble.GameObjects.GameObject;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Projectile extends GameObject {

    private Picture bullet;
    private int angle;

    public Projectile(Tank tank, int angle) {
        this.angle = angle;
        bullet = new Picture(tank.getX()+tank.getHeight()/2, tank.getY()+tank.getWidth()/2, "lib/Resources/Pictures/bullets-game-assets_0.png");
        bullet.draw();
        bullet.setRotation(angle);
    }


    public void move() {
        bullet.translate(Math.cos(Math.toRadians(angle))*4, Math.sin(Math.toRadians(angle))*4);
    }

    @Override
    public int getX() {
        return bullet.getX();
    }

    @Override
    public int getY() {
        return bullet.getY();
    }

    @Override
    public int getWidth() {
        return bullet.getWidth();
    }

    @Override
    public int getHeight() {
        return bullet.getHeight();
    }
}
