package ua.artcode.week2;

/**
 * Created by olsas on 2/27/2016.
 */
public class ArraysIntro {
    public static void main(String[] args) {
        String [] mas = new String[10];
        String tst = mas [0];
        mas[1] = "Valera";
        mas[2] = "Vasya";

        String el_min_1 = mas[-1]; //runtime error - interesting
    }
}
