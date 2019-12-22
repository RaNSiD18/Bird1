package com.company;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public class Penguin extends Bird{
        private static int Num = 0; //Переменная для подсчета пенгвинов
        private static int Xmax = 0, Ymax = 0, Xmin = MyWindow.widht, Ymin = MyWindow.height;

    public Penguin(){
        System.out.println("Jenya"); //Выводит имя при вызове
        Num++; //Считает кол-во птиц


        //Вывод времени суток
        String greeting;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        //определяем время
        int temp = calendar.get(Calendar.HOUR_OF_DAY);
        if (temp <= 4) greeting = "ночь";
        else if (temp <= 12) greeting = "утро";
        else if (temp <= 18) greeting = "день";
        else greeting = "вечер";
        System.out.print("Сейчас " + greeting + "\n");

        if(Flock.vetka==1) {
            this.color = new Color(0, 0, 255);
            this.size = 20;
            this.x = (int) (Math.random() * MyWindow.widht + 20);
            this.y = Flock.YVetka;

            if (Xmax < this.x) Xmax = this.x;
            if (Ymax < this.y) Ymax = this.y;
            if (Xmin > this.x) Xmin = this.x;
            if (Ymin > this.y) Ymin = this.y;
        }
        else{
            this.color = new Color(0, 0, 255);
            this.size = 20;
            this.x = (int) (Math.random() * MyWindow.widht + 20);
            this.y = (int) (Math.random() * MyWindow.height + 20);

            if (Xmax < this.x) Xmax = this.x;
            if (Ymax < this.y) Ymax = this.y;
            if (Xmin > this.x) Xmin = this.x;
            if (Ymin > this.y) Ymin = this.y;
        }
    }

    @Override
    public void draw(Graphics g){
        if(Flock.vetka==1) {
            g.setColor(this.color);
            g.fillOval(this.x, this.y, this.size, this.size);
            g.setColor(new Color(0,255,0));
            g.fillOval(this.x + 8, this.y + 8, this.size /5, this.size/5);
            g.setColor(new Color(0,0,255));
            g.drawRect(Xmin, Ymin, Xmax - Xmin + 20, Ymax - Ymin + 20);
            g.setColor(new Color(255,0,255));
            g.drawLine(0,Flock.YVetka + 10, MyWindow.widht, Flock.YVetka + 10);
        }
        else{
            g.setColor(this.color);
            g.fillOval(this.x, this.y, this.size, this.size);
            g.setColor(new Color(0,255,0));
            g.fillOval(this.x + 8, this.y + 8, this.size /5, this.size/5);
            g.setColor(new Color(0,0,255));
            g.drawRect(Xmin, Ymin, Xmax - Xmin + 20, Ymax - Ymin + 20);
        }
    }

    public void fly(){
        System.out.println("Letau");
    }

    //Выводит кол-во пенгвинов
    public static void printNum(){
        System.out.println("Penguin = " + Num + ".");
    }
}
