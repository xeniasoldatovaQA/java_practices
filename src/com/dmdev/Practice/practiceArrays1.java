package com.dmdev.Practice;
//написать программу, которая печатает массив в обычном порядке, а потом наоборот
public class practiceArrays1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
}
