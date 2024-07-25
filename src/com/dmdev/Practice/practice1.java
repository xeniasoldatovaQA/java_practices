package com.dmdev.Practice;

public class practice1 {
    public static void main(String[] args) {
        int value = 33;
        if (value == 1 || value == 2 || value == 12) {
            System.out.println("Winter");
        } else if (value == 3 || value == 4 || value == 5) {
            System.out.println("Spring");
        } else if (value == 6 || value == 7 || value == 8) {
            System.out.println("Summer");
        } else if (value == 9 || value == 10 || value == 11){
            System.out.println("Autumn");
        } else {
            System.out.println("Incorrect number");
        }
    }
}
