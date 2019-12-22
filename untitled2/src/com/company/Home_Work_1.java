package com.company;

import javax.swing.*;
import java.awt.*;

public class Home_Work_1 extends JFrame{
    private Flock f;

    public Home_Work_1() {
        this.setSize(1920, 1080);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Home_Work_1(Flock f) {
        this();
        this.f = f;
    }

    public void paint(Graphics g) {
        g.setColor(new Color(0,0,0));

        g.drawRect(700, 50, 400, 25);
        g.drawRect(700, 75, 400, 25);

        g.drawRect(200, 250, 400, 25);
        g.drawRect(200, 275, 400, 25);
        g.drawRect(200, 300, 400, 25);

        g.drawRect(200, 450, 400, 25);

        g.drawRect(1200, 250, 400, 25);
        g.drawRect(1200, 275, 400, 25);
        g.drawRect(1200, 300, 400, 25);

        g.drawRect(900, 450, 400, 25);
        g.drawRect(900, 475, 400, 25);
        g.drawRect(900, 500, 400, 25);

        g.drawRect(550, 650, 400, 25);
        g.drawRect(550, 675, 400, 25);
        g.drawRect(550, 700, 400, 50);

        g.drawRect(950, 650, 400, 25);
        g.drawRect(950, 675, 400, 25);
        g.drawRect(950, 700, 400, 50);

        g.drawRect(1350, 650, 400, 25);
        g.drawRect(1350, 675, 400, 25);
        g.drawRect(1350, 700, 400, 50);


        g.drawLine(900,100,400,250);
        g.drawLine(400,325,400,450);

        g.drawLine(900,100,1400,250);
        g.drawLine(1400,325,1100,450);
        g.drawLine(600,287,1200,287);

        g.drawLine(1100,525,700,650);
        g.drawLine(1100,525,1100,650);
        g.drawLine(1100,525,1500,650);


        Font font = new Font("Tahoma", Font.BOLD|Font.ITALIC, 10);
        g.setFont(font);
        g.setColor(new Color(0,150,250));


        g.drawString("Main", 850, 70);
        g.drawString("Flock f1 = new Flock();   MyWindow w1 = new MyWindow(f1);", 725, 95);

        g.drawString("MyWindow", 350, 270);
        g.drawString("private Flock f;", 225, 295);
        g.drawString("public MyWindow(){...}   public void paint(Graphics g){...}", 225, 320);

        g.drawString("JFrame", 350, 470);

        g.drawString("Flock", 1350, 270);
        g.drawString("public static int num;  private ArrayList<Bird> f;", 1225, 295);
        g.drawString("if(num==0){}else if(num==1){}else if(num==2){}else breake;", 1225, 320);

        g.drawString("Bird", 1050, 470);
        g.drawString("protected int x;   protected int y;   protected int size;", 925, 495);
        g.drawString("public void draw(Graphics g){...}", 925, 520);

        g.drawString("Macaw", 700, 670);
        g.drawString("private static int Xmax, Ymax, Xmin=1280, Ymin=1024, a=450;", 575, 695);
        g.drawString("this.x=(int)(Math.random()*a+10); this.y=(int)(Math.random()*a+10);", 575, 720);
        g.drawString("public void draw(Graphics g){...}", 575, 745);

        g.drawString("Penguin", 1100, 670);
        g.drawString("private static int Xmax, Ymax, Xmin=1280, Ymin=1024, a=450;", 975, 695);
        g.drawString("this.x = (int) (Math.random() * a + 20);", 975, 720);
        g.drawString("this.y = (int) (Math.random() * a + 20);", 975, 745);

        g.drawString("Vorobey", 1500, 670);
        g.drawString("private static int Xmax, Ymax, Xmin=1280, Ymin=1024, a=450;", 1375, 695);
        g.drawString("this.x = (int) (Math.random() * a + 30);", 1375, 720);
        g.drawString("this.y = (int) (Math.random() * a + 30);", 1375, 745);

        f.draw(g);
    }
}