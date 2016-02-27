package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by olsas on 2/27/2016.
 * 3) ???? ??????????? ?????. ??????????: ?) ????? ??, ??? ??? ??? ?????
 * ??????????; ?) ???? ?? ????? ??? ???? ??????????.
 */
public class CharOfNumberComparator_3 {
    public static void main(String[] args) {
        int threeDigitNumber;
        int tensPart;
        int hundredsPart;
        int thousandsPart;
        Scanner stdinScanner = new Scanner(System.in);

        System.out.println("Please input three-digit decimal number ->");
        threeDigitNumber = stdinScanner.nextInt();

        tensPart = threeDigitNumber % 10;
        hundredsPart = threeDigitNumber % 100 / 10;
        thousandsPart = threeDigitNumber / 100;

        if (tensPart == hundredsPart && hundredsPart== thousandsPart){
            System.out.println("Your number contains three similar digits!!");
        }
        else if (tensPart == hundredsPart || hundredsPart == thousandsPart || tensPart == thousandsPart){
            System.out.println("You have two similar digits in your number, guess which ones!");
        }
        else {
            System.out.println("Thats bad number, very, very bad!!");
        }
    }
}
