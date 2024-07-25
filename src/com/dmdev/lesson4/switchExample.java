package com.dmdev.lesson4;

public class switchExample {
    public static void main(String[] args) {
        //в скобках - тип (byte, short, int, char, String, enum)
        int value = 23;
        //проверяем входящее значение, если оно совпало со значением кейса - выполяется программа и останавливается
        //если не найдено ничего, срабатывает дефолт

        //старый вариант:
        switch (value) {
            case 1:
                System.out.println("value == 1");
                break; //если нужно, чтобы код выполнялся при нескольких кейсах, можно не писать break
            case 2:
                System.out.println("value == 2");
                break;
            case 8:
                System.out.println("value == 8");
                break;
            default: //обязательно
                System.out.println("Нет такого значения");
        }

        //новый вариант
        //switch (value) {
            //case 1 -> System.out.println("value == 1");
           // case 2, 3, 4 -> System.out.println("value == 2, 3, 4");
           // default -> System.out.println("ничего");
       // }
    }
}
