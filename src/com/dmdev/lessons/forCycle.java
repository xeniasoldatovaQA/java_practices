package com.dmdev.lessons;

public class forCycle {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--){
            if (i == 5) {
                continue; //скипает код, который должен идти при выполнении условия (вывод: все, кроме 5)
                //break; //если значение равно 5, то цикл остановится (вывод: от 10 до 5)
            }
            System.out.println(i);
        }
    }
}
