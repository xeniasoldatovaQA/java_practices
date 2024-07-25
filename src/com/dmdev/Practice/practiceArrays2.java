package com.dmdev.Practice;
//написать программу, заносящую в массив первые 100 целых чисел, делящихся на 13 или на 17 и печатающую его
public class practiceArrays2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int num = 0;
        for (int i = 1; num < 100; i++) {
            if (i % 13 == 0 || i % 17 == 0){
                arr[num] = i;
                System.out.print(arr[num] + " ");
                num++;
            }
        }
    }
}
