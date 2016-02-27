package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by olsas on 2/25/2016.
 * 4.6. ?????? ??? ?????, ??????? ?? ????, ???? ??? ? ????????? ?? 11 ?? 19.
 */
public class TwoNumbersSum_4_6 {
    public static void main(String[] args) {
        Scanner stdinScanner = new Scanner(System.in);

        System.out.println("Input two decimal numbers. Now first ->");
        int firstNumber = stdinScanner.nextInt();
        System.out.println("And second ->");
        int secondNumber = stdinScanner.nextInt();
        int sum = firstNumber + secondNumber;

        if (sum>=11 && sum<=19){
            System.out.println("Sum of your numbers is " + sum);
        }
        else {
            System.out.println("Thats bad, just bad, bye!");
        }
    }
}
