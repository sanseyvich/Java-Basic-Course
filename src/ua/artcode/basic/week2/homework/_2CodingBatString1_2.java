package ua.artcode.basic.week2.homework;

/**
 * Created by olsas on 2/29/2016.
 * <p>
 * Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
 * makeAbba("Hi", "Bye") → "HiByeByeHi"
 * makeAbba("Yo", "Alice") → "YoAliceAliceYo"
 * makeAbba("What", "Up") → "WhatUpUpWhat"
 */
public class _2CodingBatString1_2 {
    public String makeAbba(String a, String b) {
        return String.format(a + b + b + a);
    }
}
