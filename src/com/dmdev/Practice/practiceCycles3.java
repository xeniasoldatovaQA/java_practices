package com.dmdev.Practice;
//есть 24 $, взятые в 1626 году. Написать программу, которая высчитывает сумму, получившуюся бы в текущем году,
//если бы индейцы положили эти деньги в банк под 5% годовых
public class practiceCycles3 {
    public static void main(String[] args) {
        double value = 24;
        for (int i = 1626 + 1; i <= 2020 ; i++) {
            value += value*0.05;
            System.out.println(i + " : " + value);
        }
        System.out.println(value);
    }
}
