package ua.artcode.week2;

import java.util.Scanner;

/**
 * Created by olsas on 2/28/2016.
 */
public class WhyWeNeedMethod {
    /*Method advantages:
    * - simplify
    * - set name to actions
    * - repeatable calling*/
    public static void main(String[] args) {
        inputNameAndSayHello();
    }

    public static void inputNameAndSayHello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input name ");
        String name = scanner.next();
        System.out.println("hello " + name);
    }
}
