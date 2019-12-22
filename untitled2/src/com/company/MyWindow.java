package com.company;
import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame{
        private Flock f;
        public static int widht = 1280;
        public static int height = 720;

        public MyWindow(){
            this.f = f;
            this.setSize(widht,height);
            this.setVisible(true);
            this.setTitle("Окно");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public MyWindow(Flock f){
            this();
            this.f = f;
        }

        @Override
        public void paint(Graphics g){
           //g.translate(getWidth()/5, getHeight()/5); //Смещение начало координат в центр окна
            g.setColor(new Color(0,0,0));
            g.drawRect(0, 0, 10000, 10000);
            g.setColor(new Color(255,255,255));
            g.fillRect(0, 0, 10000, 10000);

            g.setColor(new Color(250,200,200));
            g.drawLine(4, 2, 1000, 2);
            g.drawLine(2, 4, 2, 1000);
            f.draw(g);

            g.setColor(new Color(0,255,0));
            g.drawArc(0, 0, 4, 4, 0, 360);
            //g.translate(getWidth()*5, getHeight()*5); //Возврат начало координат обратно
        }
}

