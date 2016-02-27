package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by olsas on 2/25/2016.
 * 4.2. ???????????? ?????? ??? ????? ? ???????, ????? ??????? ?? ??????? ??????????, ??????????
 */
public class ThreeNumbersComparator_4_2 {
    public static void main(String[] args) {
        Scanner stdinScanner = new Scanner(System.in);
        int maxNumber;
        int minNumber;

        System.out.println("Please input three different decimal numbers. First ->");
        int firstNumber = stdinScanner.nextInt();
        System.out.println("Second ->");
        int secondNumber = stdinScanner.nextInt();
        System.out.println("Third ->");
        int thirdNumber = stdinScanner.nextInt();

        maxNumber = returnBiggerInt(firstNumber, (returnBiggerInt(secondNumber, thirdNumber)));
        minNumber = returnLessInt(firstNumber, (returnLessInt(secondNumber, thirdNumber)));

        System.out.println("The biggest number of yours is " + maxNumber
                + "\nThe least number of yours is " + minNumber);

    }

    public static int returnBiggerInt(int firstNumber, int secondNumber){
        if (firstNumber>secondNumber){
            return firstNumber;
        }
        return secondNumber;
    }

    public static int returnLessInt(int firstNumber, int secondNumber){
        if (firstNumber>secondNumber){
            return secondNumber;
        }
        return firstNumber;
    }
}
