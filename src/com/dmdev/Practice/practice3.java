package com.dmdev.Practice;
//пользователь вводит число в консоль. Вывести это число, добавив к нему слово "рубль" в нужном падеже
public class practice3 {
    public static void main(String[] args) {
        int value = 112;
        if (value % 10 == 0 || value % 10 >= 5 || value % 100 >= 11) {
            System.out.println(value + " рублей");
        } else if (value % 10 == 1) {
            System.out.println(value + " рубль");
        } else {
            System.out.println(value + " рубля");
        }
    }
}
