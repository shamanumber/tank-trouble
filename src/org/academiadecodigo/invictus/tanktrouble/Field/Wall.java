package org.academiadecodigo.invictus.tanktrouble.Field;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Wall {

    private Rectangle rectangle;

    int v;
    int v1;
    int v2;
    int v3;

    public Wall(int v,int v1,int v2,int v3){

        this.v=v;
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
        rectangle = new Rectangle(v,v1,v2,v3);
        rectangle.setColor(Color.LIGHT_GRAY);
        rectangle.fill();


    }

    public int getV(){
        return v;
    }

    public int getV1(){
        return v1;
    }

    public int getV2(){
        return v2;
    }

    public int getV3(){
        return v3;
    }











}
