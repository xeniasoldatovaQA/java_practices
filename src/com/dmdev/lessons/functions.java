package com.dmdev.lessons;

public class functions {
    // public and static - модификаторы
    //после модификаторов - возвращаемый тип (void, int, boolean etc)
    // main - название функции
    //внутри скобок - параметры (args), а String[] - тип параметра
    public static void main(String[] args) {
        int value = 2000;
        isLeapYear(value);
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
