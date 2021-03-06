package ua.artcode.basic.week1.homework;

import java.util.Scanner;

/**
 * Created by olsas on 2/27/2016.
 * 3) Дано трехзначное число. Определить: а) верно ли, что все его цифры
 * одинаковые; б) есть ли среди его цифр одинаковые.
 */
public class CharOfNumberComparator_3 {
    public static void main(String[] args) {
        Scanner stdinScanner = new Scanner(System.in);

        System.out.println("Please input three-digit decimal number ->");
        int threeDigitNumber = stdinScanner.nextInt();

        int tensPart = threeDigitNumber % 10;
        int hundredsPart = threeDigitNumber % 100 / 10;
        int thousandsPart = threeDigitNumber / 100;

        if (tensPart == hundredsPart && hundredsPart == thousandsPart) {
            System.out.println("Your number contains three similar digits!!");
        } else if (tensPart == hundredsPart || hundredsPart == thousandsPart || tensPart == thousandsPart) {
            System.out.println("You have two similar digits in your number, guess which ones!");
        } else {
            System.out.println("Thats bad number, very, very bad!!");
        }
    }
}
