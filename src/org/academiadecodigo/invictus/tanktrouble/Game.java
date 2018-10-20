package org.academiadecodigo.invictus.tanktrouble;

import org.academiadecodigo.invictus.tanktrouble.Field.FieldPosition;
import org.academiadecodigo.invictus.tanktrouble.Field.SimpleGfxGrid;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Wall;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Tank.Player1Tank;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Tank.Player2Tank;
import org.academiadecodigo.invictus.tanktrouble.GameObjects.Tank.Tank;

public class Game {

    private Tank player1;
    private Tank player2;
    private SimpleGfxGrid field;
    private Collision collisionDetect;
    private Wall[] walls;
    private Tank[] tanks = new Tank[2];
    public Game() {
        field = new SimpleGfxGrid(400,400);
        walls= field.init(1);
        tanks[0]= new Player1Tank(new FieldPosition(50, 60, field));
        tanks[1] = new Player2Tank(new FieldPosition(40, 40, field));
        collisionDetect = new Collision();
    }


    public void start() throws InterruptedException {

        while (true) {

           for(int i = 0; i<tanks.length;i++){
               tanks[i].move();
           }

            collisionDetect.checkCollisions( tanks,walls);

            Thread.sleep(16);
        }
    }





}
