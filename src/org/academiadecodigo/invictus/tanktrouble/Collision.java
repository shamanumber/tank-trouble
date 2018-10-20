package org.academiadecodigo.invictus.tanktrouble;

import org.academiadecodigo.invictus.tanktrouble.GameObjects.GameObject;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Projectile;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Wall;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Tank.Tank;


public class Collision {


    public void checkCollisions(Tank[] tanks, Wall[] walls, Projectile[] projectiles) throws InterruptedException {

        for (int i = 0; i < walls.length; i++) {
            for (int j = 0; j < tanks.length; j++) {
                if (collides(tanks[j], walls[i])) {
                    if (tanks[j].isUp()) {
                        tanks[j].getPicture().translate(-Math.cos(Math.toRadians(tanks[j].getPicture().getRotation()))*2, -Math.sin(Math.toRadians(tanks[j].getPicture().getRotation()))*2);
                        continue;
                    }
                    if (tanks[j].isDown()) {
                        tanks[j].getPicture().translate(Math.cos(Math.toRadians(tanks[j].getPicture().getRotation()))*2, Math.sin(Math.toRadians(tanks[j].getPicture().getRotation()))*2);
                        continue;
                    }
                }
            }
        }
        for (int i = 0; i < walls.length; i++) {
            for (int j = 0; j < projectiles.length; j++) {
                if(projectiles[j]!=null){
                    if (collides(projectiles[j], walls[i])) {
                        if (walls[i].IS_HORIZONTAL){
                            projectiles[j].changeSpeedY();
                            continue;
                        }
                        projectiles[j].changeSpeedX();
                    }
                }

            }
        }
        for (int i = 0; i < tanks.length; i++) {
            for (int j = 0; j < projectiles.length; j++) {
                if(projectiles[j] != null){
                    if(collides(projectiles[j] , tanks[i])){
                      tanks[i].destroyed();
                      projectiles[j].destroyed();
                      Thread.sleep(100000000);

                    }
                }
            }
        }
    }


    public boolean collides(GameObject p1, GameObject p2) {
        int hitboxModifier=0;
        if(p1 instanceof Tank){
            hitboxModifier=18;

        }
        if (p1.getX() + hitboxModifier > p2.getX() && p1.getX()+ hitboxModifier < p2.getX() + p2.getWidth() && p1.getY() > p2.getY() && p1.getY() < p2.getY() + p2.getHeight()
        ) {
            return true;
        }

        if (p1.getX() + p1.getWidth() - hitboxModifier > p2.getX() && p1.getX() + p1.getWidth() -hitboxModifier< p2.getX() + p2.getWidth() && p1.getY() > p2.getY() && p1.getY() < p2.getY() + p2.getHeight()
        ) {
            return true;
        }

        if (p1.getX() + hitboxModifier> p2.getX() && p1.getX() +hitboxModifier< p2.getX() + p2.getWidth() && p1.getY() + p1.getHeight() > p2.getY() && p1.getY() + p1.getHeight() < p2.getY() + p2.getHeight()
        ) {
            return true;
        }

        if (p1.getX() + p1.getWidth() - hitboxModifier > p2.getX() && p1.getX() + p1.getWidth() - hitboxModifier < p2.getX() + p2.getWidth() && p1.getY() + p1.getHeight() > p2.getY() && p1.getY() + p1.getHeight() < p2.getY() + p2.getHeight()
        ) {
            return true;
        }
        return false;
    }
}

