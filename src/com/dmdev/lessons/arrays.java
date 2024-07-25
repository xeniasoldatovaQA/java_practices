package com.dmdev.lessons;


public class arrays {
    public static void main(String[] args) {
        //одномерные массивы
        int[] values = {1, 5, 6, 8, 9};
        System.out.println(values[2]);
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println(" ");
        //многомерные массивы
        int[][] values2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < values2.length; i++) {
            int[] ints = values2[i];
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
        }
    }
}
