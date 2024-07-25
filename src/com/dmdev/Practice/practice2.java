package com.dmdev.Practice;
// дано целое число. определить, является ли последняя цифра этого числа - 3
public class practice2 {
    public static void main(String[] args) {
        int value = 912313;
        if (value % 10 ==3) { //деление по модулю - это алгоритм нахождения остатка от деления
            System.out.println("Последняя цифра числа - 3");
        }
    }
}
