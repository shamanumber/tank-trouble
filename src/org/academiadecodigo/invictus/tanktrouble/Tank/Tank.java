package org.academiadecodigo.invictus.tanktrouble.Tank;

import org.academiadecodigo.invictus.tanktrouble.Field.FieldPosition;
import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Tank {

    private FieldPosition pos;
    private SimpleGfxGrid field;
    private Picture tank;
    private int numberOfProjectiles;
    private Projectile[] projectiles = new Projectile[3];
    private boolean up;
    private boolean down;
    private boolean left;
    private boolean right;


    public Tank(FieldPosition pos, String path, int[] KEY_CODES) {

        this.pos = pos;
        tank = new Picture(pos.getX(), pos.getY(), path);
        new TankActions(this, KEY_CODES);
        tank.draw();
    }


    public int getX() {

        return tank.getX();
    }

    public int getY() {

        return tank.getY();
    }

    public int getHeight(){
        return tank.getHeight();
    }

    public int getWidth(){
        return  tank.getWidth();
    }

    public void move() {

        if (right) {
            tank.setRotation(tank.getRotation() + 3);
        }
        if (left) {
            tank.setRotation(tank.getRotation() - 3);
        }
        if (down) {
            tank.translate(-Math.cos(Math.toRadians(tank.getRotation())), -Math.sin(Math.toRadians(tank.getRotation())));
        }
        if (up) {
            tank.translate(Math.cos(Math.toRadians(tank.getRotation())), Math.sin(Math.toRadians(tank.getRotation())));
        }

        for (int i = 0; i < numberOfProjectiles; i++) {
            projectiles[i].move();
        }
    }


    public void setUp(boolean up) {
        this.up = up;
    }


    public void setDown(boolean down) {
        this.down = down;
    }


    public void setLeft(boolean left) {
        this.left = left;
    }


    public void setRight(boolean right) {
        this.right = right;
    }


    public void shoot() {

        if (numberOfProjectiles < 3) {
            projectiles[numberOfProjectiles] = new Projectile(this, tank.getRotation());
            numberOfProjectiles++;
        }
    }

    public boolean isUp() {
        return up;
    }

    public boolean isDown() {
        return down;
    }
}
