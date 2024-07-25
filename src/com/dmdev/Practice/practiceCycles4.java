package com.dmdev.Practice;
//написать программу, определяющую, является ли введенное число простым
public class practiceCycles4 {
    public static void main(String[] args) {
        int value = 7;
        boolean result = isSimple(value);
        System.out.println(result);
    }
    public static boolean isSimple(int value) {
        boolean result = true;
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
