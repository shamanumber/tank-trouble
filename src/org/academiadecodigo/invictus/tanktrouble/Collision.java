package org.academiadecodigo.invictus.tanktrouble;

import org.academiadecodigo.invictus.tanktrouble.GameObjects.GameObject;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Wall;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Tank.Tank;


public class Collision {


    public void checkCollisions(Tank[] tanks, Wall[] walls) {

        for (int i = 0; i < walls.length; i++) {
            for (int j = 0; j < tanks.length; j++) {
                System.out.println("Esd gay");
                if (collides(tanks[j], walls[i])) {
                    if (tanks[j].isUp()) {
                        tanks[j].setCanMoveUp(false);
                        tanks[j].setCanMoveDown(true);
                        return;
                    }
                    if (tanks[j].isDown()) {
                        tanks[j].setCanMoveDown(false);
                        tanks[j].setCanMoveUp(true);
                        return;
                    }
                }
                    tanks[j].setCanMoveDown(true);
                    tanks[j].setCanMoveUp(true);
            }


        }
    }


    public boolean collides(GameObject p1, GameObject p2) {

        if (p1.getX() > p2.getX() && p1.getX() < p2.getX() + p2.getWidth() && p1.getY() > p2.getY() && p1.getY() < p2.getY() + p2.getHeight()
        ) {
            System.out.println("colisao 1");
            return true;
        }

        if (p1.getX() + p1.getWidth() > p2.getX() && p1.getX() + p1.getWidth() < p2.getX() + p2.getWidth() && p1.getY() > p2.getY() && p1.getY() < p2.getY() + p2.getHeight()
        ) {
            System.out.println("colisao 2");
            return true;
        }

        if (p1.getX() > p2.getX() && p1.getX() < p2.getX() + p2.getWidth() && p1.getY() + p1.getHeight() > p2.getY() && p1.getY() + p1.getHeight() < p2.getY() + p2.getHeight()
        ) {
            System.out.println("colisao 3");
            return true;
        }

        if (p1.getX() + p1.getWidth() > p2.getX() && p1.getX() < p2.getX() + p2.getWidth() && p1.getY() + p1.getHeight() > p2.getY() && p1.getY() + p1.getHeight() < p2.getY() + p2.getHeight()
        ) {
            System.out.println("colisao 4____________________________________");
            return true;
        }
        System.out.println("Não colide");
        return false;
    }
}




/*

        for (Alien alien : aliens) {

            Rectangle r2 = alien.getBounds();

            if (r3.intersects(r2)) {

                spaceship.setVisible(false);
                alien.setVisible(false);
                ingame = false;
            }



            List<Missile> ms = spaceship.getMissiles();

        for (Missile m : ms) {

            Rectangle r1 = m.getBounds();

            for (Alien alien : aliens) {

                Rectangle r2 = alien.getBounds();

                if (r1.intersects(r2)) {

                    m.setVisible(false);
                    alien.setVisible(false);
                }

 */





/*

public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);


private List<Missile> missiles;
All the missiles fired by the spacecraft are stored in the missiles list.

public void fire() {
    missiles.add(new Missile(x + width, y + height / 2));
}
When we fire a missile, a new Missile object is added to the missiles list. It is
 retained in the list until it collides with an alien or goes out of the window.


 */