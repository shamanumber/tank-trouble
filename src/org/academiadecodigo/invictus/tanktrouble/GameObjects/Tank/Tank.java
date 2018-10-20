package org.academiadecodigo.invictus.tanktrouble.GameObjects.Tank;

import org.academiadecodigo.invictus.tanktrouble.Field.FieldPosition;
import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.GameObject;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Tank extends GameObject {

    private final int pixels;
    private FieldPosition pos;
    private SimpleGfxGrid field;
    private Picture tank;
    private int numberOfProjectiles;
    private Projectile[] projectiles = new Projectile[3];
    private boolean up;
    private boolean down;
    private boolean canMoveUp;
    private boolean canMoveDown;
    private boolean left;
    private boolean right;
    private Rectangle hitbox;

    public Tank(FieldPosition pos, String path, int[] KEY_CODES) {
        hitbox = new Rectangle(pos.getX(), pos.getY(), 60, 42);
        hitbox.draw();
        this.pos = pos;
        tank = new Picture(pos.getX(), pos.getY(), path);
        new TankActions(this, KEY_CODES);
        tank.draw();
        canMoveDown = true;
        canMoveUp = true;
        pixels = tank.pixels();
        Rectangle rectangle = new Rectangle();

    }

    @Override
    public int getX() {

        return tank.getX();
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
    public int getWidth() {
        return tank.getWidth();
    }

    public void move() {

        if (right) {
            tank.setRotation(tank.getRotation() + 3);

        }
        if (left) {
            tank.setRotation(tank.getRotation() - 3);
        }
        if (down && canMoveDown) {
            tank.translate(-Math.cos(Math.toRadians(tank.getRotation())), -Math.sin(Math.toRadians(tank.getRotation())));
            hitbox.translate(-Math.cos(Math.toRadians(tank.getRotation())), -Math.sin(Math.toRadians(tank.getRotation())));
        }
        if (down && !canMoveDown) {
            tank.translate(Math.cos(Math.toRadians(tank.getRotation())), Math.sin(Math.toRadians(tank.getRotation())));
            hitbox.translate(Math.cos(Math.toRadians(tank.getRotation())), Math.sin(Math.toRadians(tank.getRotation())));
        }

        if (up && !canMoveUp) {
            tank.translate(-Math.cos(Math.toRadians(tank.getRotation())), -Math.sin(Math.toRadians(tank.getRotation())));
            hitbox.translate(-Math.cos(Math.toRadians(tank.getRotation())), -Math.sin(Math.toRadians(tank.getRotation())));
        }


        if (up && canMoveUp) {
            tank.translate(Math.cos(Math.toRadians(tank.getRotation())), Math.sin(Math.toRadians(tank.getRotation())));
            hitbox.translate(Math.cos(Math.toRadians(tank.getRotation())), Math.sin(Math.toRadians(tank.getRotation())));
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

    public void setCanMoveUp(boolean canMoveUp) {
        this.canMoveUp = canMoveUp;
    }

    public void setCanMoveDown(boolean canMoveDown) {
        this.canMoveDown = canMoveDown;
    }

    public void shoot() {

        if (numberOfProjectiles < 3) {
            projectiles[numberOfProjectiles] = new Projectile(this, tank.getRotation());
            numberOfProjectiles++;
        }
    }

}
