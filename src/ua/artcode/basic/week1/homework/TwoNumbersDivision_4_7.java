package ua.artcode.basic.week1.homework;

import java.util.Scanner;

/**
 * Created by olsas on 2/25/2016.
 * 4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем
 * результат деления (целую часть от деления  и остачу) в другом случае выводим false и показываем
 * результат деления (целую часть от деления  и остачу)
 */
public class TwoNumbersDivision_4_7 {
    public static void main(String[] args) {
        Scanner stdinScanner = new Scanner(System.in);
        boolean isThereNoRemainder;

        System.out.println("Input two decimal numbers. Now divident ->");
        int firstNumber = stdinScanner.nextInt();
        System.out.println("And divider ->");
        int secondNumber = stdinScanner.nextInt();
        int division = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        if (remainder == 0) {
            isThereNoRemainder = true;
        } else {
            isThereNoRemainder = false;
        }
        System.out.println("Its " + isThereNoRemainder + ". Integer part of division is " + division
                + ". \nAnd remainder = " + remainder);
    }
}
