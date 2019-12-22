package com.company;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class Macaw extends Bird {
    private static int Num1 = 0; //Переменная для подсчета птиц
    ArrayList<Integer> xm = new ArrayList<>();
    ArrayList<Integer> ym = new ArrayList<>();

    private static int X, Y, X1, Y1, Xmax = 0, Ymax = 0, Xmin = MyWindow.widht, Ymin = MyWindow.height;
    public  String name = "JIZA";// На данный момент static елает переменну только одно,т.е. будет заниматься только одна ячейка памяти.
                                 // Без static будет создаваться переменная name в новой ячейке памяти.

    public Macaw(){
        System.out.println("Gagi");
        Num1++; //Считает кол-во попугаев

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
        //

        if (Flock.vetka == 0) {
            //Отрисовка птицd
            this.color = new Color(255, 0, 0);
            this.size = 10;
            this.x = (int) (Math.random() * MyWindow.widht + 10);
            this.y = Flock.YVetka;
            this.color1 = new Color(0, 0, 255);

            //Заключение птиц в прямоугольник
            if (Xmax < this.x)Xmax = this.x + 10;
            if (Ymax < this.y)Ymax = this.y + 10;
            if (Xmin > this.x)Xmin = this.x;
            if (Ymin > this.y)Ymin = this.y;
            //
        }
        else {
            //Отрисовка птиц
            this.color = new Color(255, 0, 0);
            this.size = 10;
            this.x = (int) (Math.random() * MyWindow.widht + 10);
            this.y = (int) (Math.random() * MyWindow.height + 10);
            this.color1 = new Color(0, 0, 255);

            //Заключение птиц в прямоугольник
            if (Xmax < this.x)Xmax = this.x + 10;
            if (Ymax < this.y)Ymax = this.y + 10;
            if (Xmin > this.x)Xmin = this.x;
            if (Ymin > this.y)Ymin = this.y;
            //
        }
    }

    public Macaw(String name){
      this.name = name;
      System.out.println(name);
        Num1++;
        this.color = new Color(255,0,0);
        this.size = 10;
        this.x = 80;
        this.y = 50;
    }

    public void draw(Graphics g){
        if (Flock.vetka == 0) {
            g.setColor(this.color);
            g.fillOval(this.x, this.y, this.size, this.size);
            g.drawRect(Xmin, Ymin, Xmax - Xmin, Ymax - Ymin);
            g.setColor(new Color(255,0,255));
            g.drawLine(0, Flock.YVetka + 5, MyWindow.widht, Flock.YVetka + 5);
        }
        else {
            g.setColor(this.color);
            g.fillOval(this.x, this.y, this.size, this.size);
            g.drawRect(Xmin, Ymin, Xmax - Xmin, Ymax - Ymin);

            if(X!=0 && Y!=0) {
                    g.setColor(new Color(255, 0, 255));
                    g.drawLine(X + this.size / 2, Y + this.size / 2, this.x + this.size / 2, this.y + this.size / 2);
            }
            X = this.x;
            Y = this.y;
/*
            xm.add(this.x);
            ym.add(this.y);
            g.setColor(new Color(255, 0, 255));
            for(int i=0; i<xm.size(); i++) {
                g.drawLine(xm.get(i) + this.size / 2, ym.get(i) + this.size / 2, xm.get(i+1)+ this.size / 2, ym.get(i+1) + this.size / 2);
            }

*/
        }
    }


    public void speak(){
        System.out.println("menya zovut " + name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    //Обращение одной птицы к другой птице
    public void Hello(Macaw m){
        System.out.println("Hello, " + m.getName());
    }

    //Вывод кол-во попугаев
    public static void printNum1(){
        System.out.println("Macaw = " + Num1 + ".");
    }
}
