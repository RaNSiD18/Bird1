package com.company;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public class Vorobey extends Bird{
    private static int Num = 0; //Переменная для подсчета воробьев
    private static int Xmax = 0, Ymax = 0, Xmin = MyWindow.widht, Ymin = MyWindow.height;

    public Vorobey(){
        System.out.println("Golub"); //Выводит имя при вызове
        Num++; //Считает кол-во птиц

        //Вывод времени  суток
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

        if(Flock.vetka == 2) {
            this.color = new Color(0, 255, 0);
            this.size = 30;
            this.x = (int) (Math.random() * MyWindow.widht + 30);
            this.y = Flock.YVetka;

            this.color1 = new Color(255, 0, 0);
            if (Xmax < this.x) Xmax = this.x;
            if (Ymax < this.y) Ymax = this.y;
            if (Xmin > this.x) Xmin = this.x;
            if (Ymin > this.y) Ymin = this.y;
        }
        else
        {
            this.color = new Color(0, 255, 0);
            this.size = 30;
            this.x = (int) (Math.random() * MyWindow.widht + 30);
            this.y = (int) (Math.random() * MyWindow.height + 30);

            this.color1 = new Color(255, 0, 0);
            if (Xmax < this.x) Xmax = this.x;
            if (Ymax < this.y) Ymax = this.y;
            if (Xmin > this.x) Xmin = this.x;
            if (Ymin > this.y) Ymin = this.y;
        }
    }

    public void draw(Graphics g){
        if(Flock.vetka == 2) {
            g.setColor(this.color);
            g.fillOval(this.x, this.y, this.size, this.size);
            g.drawRect(Xmin, Ymin, Xmax - Xmin + 30, Ymax - Ymin + 30);
            g.setColor(new Color(255,0,255));
            g.drawLine(0 ,Flock.YVetka + 15, MyWindow.widht, Flock.YVetka + 15);
        }
        else {
            g.setColor(this.color);
            g.fillOval(this.x, this.y, this.size, this.size);
            g.drawRect(Xmin, Ymin, Xmax - Xmin + 30, Ymax - Ymin + 30);
        }
    }

    //Выводит кол-во воробьев
    public static void printNum2(){
        System.out.println("Vorobey = " + Num + ".");
    }
}
