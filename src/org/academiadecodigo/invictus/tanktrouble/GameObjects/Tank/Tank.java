package org.academiadecodigo.invictus.tanktrouble.GameObjects.Tank;

import org.academiadecodigo.invictus.tanktrouble.Field.FieldPosition;
import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;
import org.academiadecodigo.invictus.tanktrouble.Game;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.GameObject;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Projectile;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Tank extends GameObject {

    private Picture tank;
    private int numberOfProjectiles;
    private boolean up;
    private boolean down;
    private boolean left;
    private boolean right;
    private Game game;

    public Tank(FieldPosition pos, String path, int[] KEY_CODES, Game game) {
        this.game = game;
        tank = new Picture(pos.getX(), pos.getY(), path);
        new TankActions(this, KEY_CODES);
        tank.draw();
    }

    @Override
    public int getX() {

        return tank.getX();
    }

    public void resetBullet(){
        numberOfProjectiles--;
        System.out.println(numberOfProjectiles);
    }

    public Picture getPicture(){
        return tank;
    }

    @Override
    public int getY() {

        return tank.getY();
    }

    public boolean isUp() {
        return up;
    }

    public boolean isDown() {
        return down;
    }

    @Override
    public int getHeight() {
        return tank.getHeight();
    }

    @Override
    public int getWidth(){
        return tank.getWidth();
    }

    public void destroyed(){
        tank.delete();
    }

    public void move() {

        if (right) {
            tank.setRotation(tank.getRotation() + 3);

        }
        if (left) {
            tank.setRotation(tank.getRotation() - 3);
        }
        if (down) {
            tank.translate(-Math.cos(Math.toRadians(tank.getRotation()))*2, -Math.sin(Math.toRadians(tank.getRotation()))*2);
        }

        if (up) {
            tank.translate(Math.cos(Math.toRadians(tank.getRotation()))*2, Math.sin(Math.toRadians(tank.getRotation()))*2);
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
            game.addProjectile( new Projectile(this, tank.getRotation()));
            numberOfProjectiles++;
        }
    }

}
