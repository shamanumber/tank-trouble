package org.academiadecodigo.invictus.tanktrouble.GameObjects.Tank;

import org.academiadecodigo.invictus.tanktrouble.*;
import org.academiadecodigo.invictus.tanktrouble.Field.FieldPosition;
import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.GameObject;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Projectile;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Wall;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.lang.ref.Cleaner;


public class Tank extends GameObject {

    private Picture tank;
    private int numberOfProjectiles;
    private boolean up;
    private boolean down;
    private boolean left;
    private boolean right;
    private Game game;
    private Game getField;
    private Sound fire = new Sound(" lib/Resources/Sound/disparo.wav");

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

    public void resetBullet() {
        numberOfProjectiles--;
    }

    public Picture getPicture() {
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
    public int getWidth() {
        return tank.getWidth();
    }

    public void destroyed() throws InterruptedException {
        tank.delete();
        Picture tankExplosion = new Picture(getX(), getY(), "lib/Resources/Pictures/explosionfinal.png");
        tankExplosion.draw();
        Picture playerWon = new Picture(500, 300, "lib/Resources/Pictures/toy wins.png");
        playerWon.draw();

        Thread.sleep(2500);

        tankExplosion.delete();
        playerWon.delete();


        Game restart = new Game();
        restart.start();



        SimpleGfxGrid field = new SimpleGfxGrid(0,0);


       // Menu reStart = new Menu();
        // reStart.play();
    }

    public void move() {

        if (right) {
            tank.setRotation(tank.getRotation() + 3);

        }
        if (left) {
            tank.setRotation(tank.getRotation() - 3);
        }
        if (down) {
            tank.translate(-Math.cos(Math.toRadians(tank.getRotation())) * 2, -Math.sin(Math.toRadians(tank.getRotation())) * 2);
        }

        if (up) {
            tank.translate(Math.cos(Math.toRadians(tank.getRotation())) * 2, Math.sin(Math.toRadians(tank.getRotation())) * 2);
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
            game.addProjectile(new Projectile(this, tank.getRotation()));
            numberOfProjectiles++;
            fire.play(true);
        }
    }

}
