package ua.artcode.basic.week1.homework;

import java.util.Scanner;

/**
 * Created by olsas on 2/25/2016.
 * 4.5. Вводим 2 числа. Если первое число больше второго,
 * то вывести на экран разницу чисел. Если второе больше, то выводим сумму.
 */
public class TwoNumbersComparator_4_5 {
    public static void main(String[] args) {
        Scanner stdinScanner = new Scanner(System.in);

        System.out.println("Insert two decimal numbers. Now first ->");
        int firstNumber = stdinScanner.nextInt();
        System.out.println("And second ->");
        int secondNumber = stdinScanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("First number is bigger than second on " + (firstNumber - secondNumber));
        } else if (secondNumber > firstNumber) {
            System.out.println("Sum of your numbers is = " + (firstNumber + secondNumber));
        } else {
            System.out.println("Thats bad, your numbers is totally match!");
        }
    }
}
