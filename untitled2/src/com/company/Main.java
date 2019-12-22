package com.company;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        //Взаимодействие с классами

        //System.out.println("gg");
        //Bird a = new Bird();
        //a.fly();
        //Macaw b = new Macaw();
        Macaw c = new Macaw("Tom");
        Macaw f = new Macaw("Jerry");
        //b.fly();
        //b.speak();

        c.speak();
        c.name = "Jojo";
        c.speak();
        c.setName("Jenya");
        c.speak();
        System.out.println(c.getName());

        //Penguin d = new Penguin();
        //Penguin e = new Penguin();
        //Penguin r = new Penguin();

        //d.fly();
        c.Hello(f);
        //d.Hello(e);

        Penguin.printNum();
        Macaw.printNum1();

 */
/*
        //Указатели

        int n1 = 3; // Имя ячейки в памяти
        int n2 = 5;
        n1 = n2;
        Macaw m1 = new Macaw("Petya"); // Указатель на ячейку памяти
        Macaw m2 = new Macaw("Keha");
        m1=m2;// Указаетль m1  указывает на ячейку памяти указателя m2, а прошлая ячейка памяти утеряна.
        m2.setName("Sharik");
        m1.speak();
 */
/*
        // Массив

        Bird[] f = new Bird[3]; // массив Bird. f.length - размер массива f.length = 3
        f[0] = new Macaw("Petya");
        f[1] = new Macaw("Keha");
        f[2] = new Penguin();
 */
/*
        // Неопределенный массив

        ArrayList<Bird> f = new ArrayList<>(3);
        f.add(0,new Macaw("Petya"));
        f.add(1,new Macaw("Keha"));
        f.add(2,new Penguin());

        Flock flock = new Flock();
        flock.flu();
        System.out.println(flock.vivod());
        //((Macaw) f[0]).fly();
 */
/*
        // Что-то вроде похожее на интерфейс

        JFrame f = new JFrame("Поляна");
        f.setSize(200,400);// Размер окна
        f.setVisible(true);// Включение видимости окна
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Завершение программы при закрытии окна
 */

        //Работа с Graphics (Выод попугаев на граф окно)

        Flock f1 = new Flock();
        MyWindow w1 = new MyWindow(f1);

        //Home_Work_1 w2 = new Home_Work_1(); //Домяашняя работа Блок схема программы


    }
}
