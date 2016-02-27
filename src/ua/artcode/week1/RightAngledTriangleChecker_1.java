package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by olsas on 2/27/2016.
 * 1) ?????? ? ?????????? ???????? ???? ?????? ???????????? a, b ? c ? ??????-
 * ????, ???????? ?? ?? ?????????????. ????? ??????? ? ???? ?????????.
 */
public class RightAngledTriangleChecker_1 {
    public static void main(String[] args) {
        Scanner stdinScanner = new Scanner(System.in);
        double hypotenuse;
        double cathetus_1;
        double cathetus_2;

        System.out.println("Input three double numbers as triangle's sides. Now first side ->");
        double firstSide = stdinScanner.nextDouble();
        System.out.println("And second ->");
        double secondSide = stdinScanner.nextDouble();
        System.out.println("And third ->");
        double thirdSide = stdinScanner.nextDouble();

        hypotenuse = hypotenuseDiscover(firstSide, secondSide, thirdSide);

        if (firstSide == hypotenuse){
            cathetus_1 = secondSide;
            cathetus_2 = thirdSide;
        }
        else if (secondSide == hypotenuse){
            cathetus_1 = firstSide;
            cathetus_2 = thirdSide;
        }
        else {
            cathetus_1 = firstSide;
            cathetus_2 = secondSide;
        }

        if (Math.pow(hypotenuse,2) == Math.pow(cathetus_1,2) + Math.pow(cathetus_2,2)){
            System.out.println("Your triangle is right-angled!!");
        }
        else {
            System.out.println("Sorry this shi.. is not right-angled triangle!)");
        }

    }

    public static double hypotenuseDiscover (double a, double b, double c){
        return returnBiggerDouble(a, returnBiggerDouble(b, c));
    }

    public static double returnBiggerDouble (double firstNumber, double secondNumber){
        if (firstNumber>secondNumber){
            return firstNumber;
        }
        return secondNumber;
    }
}
