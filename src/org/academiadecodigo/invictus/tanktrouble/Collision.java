package org.academiadecodigo.invictus.tanktrouble;

import org.academiadecodigo.invictus.tanktrouble.Field.FieldPosition;
import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;
import org.academiadecodigo.invictus.tanktrouble.Tank.Player1Tank;
import org.academiadecodigo.invictus.tanktrouble.Tank.Player2Tank;
import org.academiadecodigo.invictus.tanktrouble.Tank.Tank;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Collision {

    SimpleGfxGrid grid;
    Player1Tank player1Tank;
    Player2Tank player2Tank;


    public boolean checkCollisions(SimpleGfxGrid grid, Player1Tank player1Tank, Player2Tank player2Tank) {


        if (player1Tank.getX() == grid.getWidth() || player1Tank.getX() == grid.getX()
                || player1Tank.getY() == grid.getHeight() || player1Tank.getY() == grid.getY()) {
            return true;
        }
        if (player2Tank.getX() == grid.getWidth() || player2Tank.getX() == grid.getX()
                || player2Tank.getY() == grid.getHeight() || player2Tank.getY() == grid.getY()) {
            return true;
        }
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