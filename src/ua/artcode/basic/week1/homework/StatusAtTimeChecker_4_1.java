package ua.artcode.basic.week1.homework;

import java.util.Scanner;

/**
 * Created by olsas on 2/25/2016.
 * 4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
 * Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
 */
public class StatusAtTimeChecker_4_1 {
    public static void main(String[] args) {
        int currentUserTime;
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please specify your current time in hour - decimal number! -> ");
        currentUserTime = inputScanner.nextInt();

        if (currentUserTime >= 9 && currentUserTime <= 18) {
            System.out.println("Working like a slave now!");
        } else if (currentUserTime <= 24 && currentUserTime >= 0) {
            System.out.println("I'm relaxing like a boss!");
        } else {
            System.out.println("Please specify valid hour next time. It should be 0-24!");
        }
    }
}
