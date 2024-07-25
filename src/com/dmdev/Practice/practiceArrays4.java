package com.dmdev.Practice;
//определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями
public class practiceArrays4 {
    public static void main(String[] args) {
        int[] values = {1, 0, 6, 5, 6, 4, 12, 14};
        int maxRes = 0;
        int maxId = 0;
        int minId = 0;
        int result = 0;
        //максимальный результат
        for (int i = 0; i < values.length ; i++) {
            if (values[i] > maxRes) {
                maxRes = values[i];
                maxId = i;
            }
        }
        System.out.println(maxId);
        int minRes = maxRes;
        // минимальный результат
        for (int j = 0; j < values.length ; j++) {
            if (values[j] < minRes) {
                minRes = values[j];
                minId = j;
            }
        }
        System.out.println(minId);
        //считаем сумму
        for (int a = minId + 1; a < maxId ; a++) {
            result += values[a];
        }
        System.out.println(result);
    }
}
