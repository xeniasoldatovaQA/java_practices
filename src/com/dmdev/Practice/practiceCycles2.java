package com.dmdev.Practice;
//имеется число. Посчитать сумму цифр данного числа
public class practiceCycles2 {
    public static void main(String[] args) {
        int value = 567;
        int result = 0;
        while (value > 0) {
            result += (value % 10);
            value /= 10;
        }
        System.out.println(result);
    }
}
