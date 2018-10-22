package org.academiadecodigo.invictus.tanktrouble;

import org.academiadecodigo.invictus.tanktrouble.Field.FieldPosition;
import org.academiadecodigo.invictus.tanktrouble.Field.Mazes;
import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Projectile;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Wall;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Tank.Player1Tank;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Tank.Player2Tank;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Tank.Tank;

public class Game {

    private SimpleGfxGrid field;
    private Collision collisionDetect;
    private Wall[] walls;
    private Tank[] tanks = new Tank[2];
    private Projectile[] projectiles = new Projectile[tanks.length * 3];
    private Menu menu;
    private Status status;


    public Game() {
        menu = new Menu();
        status = Status.MENU;
    }

    public void start() throws InterruptedException {

        status = menu.play();

        if (status == Status.QUIT) {
            System.exit(0);
        }
        if (status == Status.GAME) {

            field = new SimpleGfxGrid(1500, 1500);
            int random = (int) Math.floor(Math.random() * (Mazes.values().length));
            walls = field.init(random);
            tanks[0] = new Player1Tank(new FieldPosition(50, 60), this);
            tanks[1] = new Player2Tank(new FieldPosition(600, 600), this);
            collisionDetect = new Collision();

            while (true) {

                for (int i = 0; i < tanks.length; i++) {
                    tanks[i].move();
                }
                collisionDetect.checkCollisions(tanks, walls, projectiles);

                for (int i = 0; i < projectiles.length; i++) {
                    if (projectiles[i] != null) {
                        projectiles[i].move();
                        for(int j = 0; j <tanks.length;j++){
                            if(tanks[j].isDestroyed()){
                                projectiles[i].destroyed();
                            }
                        }
                    }


                }
                Thread.sleep(16);

            }

        }
    }


    public void addProjectile(Projectile projectile) {

        for (int i = 0; i < projectiles.length; i++) {

            if (projectiles[i] == null) {
                for (int j = 0; j < tanks.length; j++) {
                    if (tanks[j].isDestroyed() == false) {
                        projectiles[i] = projectile;
                        return;

                    }
                }

            }
        }
        for (int i = 0; i < projectiles.length; i++) {
            if (!projectiles[i].isUsed()) {
                projectiles[i] = projectile;
                return;
            }
        }

    }

    public void reset() {

        for (int k = 0; k < tanks.length; k++) {

            tanks[k].delete();
        }
        for (int m = 0; m < walls.length; m++) {
            walls[m].delete();
        }
    }


    public enum Status {
        MENU,
        GAME,
        QUIT
    }
}
