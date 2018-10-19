package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Projectile {

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

}
