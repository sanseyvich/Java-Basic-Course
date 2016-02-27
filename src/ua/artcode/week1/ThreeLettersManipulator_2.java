package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by olsas on 2/27/2016.
 * 2) ?????? ? ?????????? ??? ?????, ????????????? ???????? ? ???, ? ??????-
 * ??????? ???????? ?? 0.
 */
public class ThreeLettersManipulator_2 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int thirdNumber;

        Scanner stdinScanner = new Scanner(System.in);

        System.out.println("Input three decimal numbers for manipulations. Now first ->");
        firstNumber = stdinScanner.nextInt();
        System.out.println("And second ->");
        secondNumber = stdinScanner.nextInt();
        System.out.println("And third ->");
        thirdNumber = stdinScanner.nextInt();

        firstNumber = numberManipulate(firstNumber);
        secondNumber = numberManipulate(secondNumber);
        thirdNumber = numberManipulate(thirdNumber);

        System.out.println("Your numbers after manipulations: First " + firstNumber + ", second " + secondNumber
                +", third " + thirdNumber);
    }

    public static int numberManipulate(int number){
        if (number >= 0){
            return ((int) Math.pow(number, 3));
        }
        else {
            return 0;
        }
    }
}
