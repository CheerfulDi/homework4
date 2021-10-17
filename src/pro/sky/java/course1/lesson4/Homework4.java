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

        for (int c = 10; c > 0; c--) {
            System.out.print(c + " ");
        }
        System.out.println();

        //Задание 2

        for (int friday = 5; friday < 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        //Задание 3

        int currentYear = 2021;
        int begin = currentYear - 200;
        int end = currentYear + 100;

        for (int g = begin; g < end; g++ ) {
            if (g % 79 == 0) {
                System.out.println(g);
            }
        }

        //ДОПОЛНИТЕЛЬНЫЕ ЗАДАНИЯ
        //Задание 4

        for (int i = 1; i <=30; i++) {
            System.out.print(i + ": ");

            if (i % 3 == 0) {
                System.out.print("ping ");
            }
            if (i % 5 == 0) {
                System.out.print("pong");
            }
            System.out.println();
        }
        System.out.println();

        //Задание 5

        int a = 0;
        int b = 1;

        for (int r = 0; r < 5; r ++) {
            System.out.print(a + " " + b + " ");
            a += b;
            b += a;
        }

    }
}