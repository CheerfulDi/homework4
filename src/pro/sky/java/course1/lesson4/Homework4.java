package pro.sky.java.course1.lesson4;

import java.sql.SQLOutput;

public class Homework4 {
    public static void main(String[] args) {

        //Задание 1

        int count = 0;
        while (count < 10) {
            count++;
            System.out.print(count + " ");
        }

        System.out.println();

        for (count = 10; count > 0; count--) {
            System.out.print(count + " ");
        }
        System.out.println();

        //Задание 2

        for (int friday = 5; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        //Задание 3

        int currentYear = 2021;
        int twoCenturyAgoComet = currentYear - 200;
        int futureCenturyComet = currentYear + 100;

        for (int cometYear = 0; cometYear < futureCenturyComet; cometYear = cometYear + 79) {
            if (cometYear > twoCenturyAgoComet) {
                System.out.println(cometYear);
            }
        }

        //ДОПОЛНИТЕЛЬНЫЕ ЗАДАНИЯ
        //Задание 4

        for (int i = 1; i <=30; i++) {
            if (i % 3 ==0 && i % 5 ==0) {
                System.out.println(i + ": ping pong");
            } else if (i % 3 ==0) {
                System.out.println(i + ": ping");
            } else if (i % 5 ==0) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i + ": ");
            }
            }
        System.out.println();

        //Задание 5
        //решение через массив? начала, но сдулась...

        /*
        int a = 0;
        int b = 1;
        int [] fibArray;
        fibArray = new int[10];
        for (int i = 0; i < fibArray.length; i ++) {

        }*/

    }
}