package com.dmdev.Practice;

//написать программу, высчитывающую факториал введенного целого числа
public class practiceCycles1 {
    public static void main(String[] args) {
        // 1 * 2 * 3 * 4 * 5 = 5!
        int value = 9;
        int result = 1;
        for (int i = 2; i <= value ; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
