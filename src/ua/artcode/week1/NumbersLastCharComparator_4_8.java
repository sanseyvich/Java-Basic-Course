package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by olsas on 2/25/2016.
 * ?????? ??? ?????, ???????? ????????? ????? ???? ????? (???????????? ?????????? %)
 */
public class NumbersLastCharComparator_4_8 {
    public static void main(String[] args) {
        Scanner stdinScanner = new Scanner(System.in);

        System.out.println("Input two decimal numbers to be compared. Now first ->");
        int firstNumber = stdinScanner.nextInt();
        System.out.println("And second ->");
        int secondNumber = stdinScanner.nextInt();

        if (firstNumber % 10 == secondNumber % 10){
            System.out.println("Last char of your numbers are similar!!");
        }
        else {
            System.out.println("Last char of your numbers are different!!");
        }
    }
}
