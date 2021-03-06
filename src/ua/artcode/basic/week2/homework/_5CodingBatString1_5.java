package ua.artcode.basic.week2.homework;

/**
 * Created by olsas on 3/1/2016.
 * <p>
 * Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
 * The string length will be at least 2.
 * extraEnd("Hello") → "lololo"
 * extraEnd("ab") → "ababab"
 * extraEnd("Hi") → "HiHiHi"
 */
public class _5CodingBatString1_5 {
    public String extraEnd(String str) {
        String lastChars = str.substring(str.length() - 2, str.length());
        return String.format("%1$s%1$s%1$s", lastChars);
    }
}
