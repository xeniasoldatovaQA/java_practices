package com.dmdev.lessons;
// написать функцию, которая принимает 2 целочисленных параметра и возвращает наибольший
public class funcPractice {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int result = getMax(a, b);
        System.out.println(result);
    }
    public static int getMax (int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        } else {
            return secondValue;
        }
    }
}
