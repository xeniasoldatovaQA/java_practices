package com.dmdev.Practice;
/*написать программу, которая определяет, является ли год високосным.
год считается високосным, если он делится без остатка на 4. Однако, если год
также делится на 100, то этот год не високосный, за исключением годов, делящихся на 400 */
public class practice4 {
    public static void main(String[] args) {
        int year = 104;
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не високосный");
        }
    }
}
