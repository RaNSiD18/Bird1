package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.awt.*;

public class Flock {
    public static int num, vetka, YVetka;
    private ArrayList<Bird> f; //Массив

    public Flock(){
        f = new ArrayList<>(0); //Создание массива

        Scanner gg = new Scanner(System.in);
        System.out.print("Введите число, которое соотвествует птице, чтобы посадить на ветку 0-попугаев, 1-пингвинов, 2-воробьев: ");
        vetka = gg.nextInt();

        Scanner ff = new Scanner(System.in);
        System.out.print("Введите, на какой высоте будет находиться ветка?  ");
        YVetka = ff.nextInt();


        Scanner in = new Scanner(System.in);
     for(int i = 0;; i++)
     {
         System.out.print("Введите число 0, чтобы добавить попугая. Число 1, чтобы добавить пнигвина. Число 2, чтобы добавить воробья. Любое число, чтобы закончить добавлять птиц: ");

         num = in.nextInt();
         if(num==0) {
             System.out.println("Вы добавили попугая");
             f.add(i, new Macaw());
         }
         else
             if(num==1)
             {
                 System.out.println("Вы добавили пингвина");
                 f.add(i, new Penguin());
             }
             else
             if(num==2)
             {
                 System.out.println("Вы добавили воробья");
                 f.add(i, new Vorobey());
             }
             else
             break;
     }
     in.close();
    }

    public int vivod(){
        //System.out.println(f.size());
        return f.size();
    }

    public void flu(){
        for(int i = 0; i < f.size(); i++) {
            f.get(i).fly();
        }
    }

    public void draw(Graphics g){
        for(int i = 0; i < f.size(); i++){
            f.get(i).draw(g);
        }
    }

}
