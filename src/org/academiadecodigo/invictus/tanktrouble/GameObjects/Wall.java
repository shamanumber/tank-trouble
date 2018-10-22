package org.academiadecodigo.invictus.tanktrouble.GameObjects;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Wall extends GameObject {

    private Rectangle rectangle;
    public final boolean IS_HORIZONTAL;
    int x;
    int y;
    int width;
    int height;

    public Wall(int x, int y, int width, int height, boolean isHorizontal) {
        IS_HORIZONTAL=isHorizontal;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        rectangle = new Rectangle(x, y, width, height);
        rectangle.setColor(Color.LIGHT_GRAY);
        rectangle.fill();

    }


    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }


}
