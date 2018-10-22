package org.academiadecodigo.invictus.tanktrouble.GameObjects;

import org.academiadecodigo.invictus.tanktrouble.GameObjects.Tank.Tank;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Projectile extends GameObject {

    private Picture bullet;
    private double speedX;
    private double speedY;
    private int bouncesLeft = 4;
    private Tank tank;
    private boolean isUsed;
    private boolean destroyed;


    public Projectile(Tank tank, int angle) {
        this.tank = tank;
        bullet = new Picture(tank.getX() + tank.getWidth()/2 -10 + Math.cos(Math.toRadians(angle))*60, tank.getY() + tank.getHeight()/2 -10 +Math.sin(Math.toRadians(angle))*60, "lib/Resources/Pictures/17980_1.png");
        bullet.draw();
        bullet.setRotation(angle);
        speedX = Math.cos(Math.toRadians(angle)) * 4;
        speedY = Math.sin(Math.toRadians(angle)) * 4;
        isUsed = true;
        destroyed = false;
    }

    public void changeSpeedY() {
        speedY *= -1;
        bouncesLeft--;
    }

    public void changeSpeedX() {
        speedX *= -1;
        bouncesLeft--;
    }

    public void destroyed(){
        bullet.delete();
        destroyed = true;
    }

    public void move() {
        bullet.translate(speedX, speedY);
        if (bouncesLeft == 0) {
            bullet.delete();
            speedX = 0;
            speedY = 0;
            bullet.translate(-2000, -2000);
            if (isUsed) {
                tank.resetBullet();
                isUsed = false;
            }
        }
    }


    @Override
    public int getX() {
        return bullet.getX();
    }

    public boolean isUsed() {
        return isUsed;
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
