package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final double STEPS_IN_SPAWN = 2;
        final double SPANS_IN_FLOOR = 2;

        double floor, liveInStep;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.println("Эта программа рассчитывает сколько вы получите доп. секунд жизни, поднявшись на определённый этаж.");

        System.out.print("Введите этаж, на который хотите взобраться:");
        floor = input.nextDouble();

        System.out.print("Сколько секунд даёт одна ступенка: ");
        liveInStep = input.nextDouble();

        result = liveInStep * STEPS_IN_SPAWN * SPANS_IN_FLOOR * floor;
        System.out.println("Ваша жизнь увеличилась на: " + result + " сек");
    }
}
