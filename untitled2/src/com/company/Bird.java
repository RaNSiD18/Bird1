package com.company;
import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public abstract class Bird {
    private static int count;
    private int radius;
    protected int x;
    protected int y;
    protected int size;
    protected int size2;
    protected Color color, color1;

    public void fly() {
        System.out.println("Я лечу!");
    }

    public static int getCount() {
        return count;
    }

    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.size, this.size);
    }
}

