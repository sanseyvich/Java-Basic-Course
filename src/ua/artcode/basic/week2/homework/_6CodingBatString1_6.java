package ua.artcode.basic.week2.homework;

/**
 * Created by olsas on 3/2/2016.
 * <p>
 * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X",
 * and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
 * firstTwo("Hello") → "He"
 * firstTwo("abcdefg") → "ab"
 * firstTwo("ab") → "ab" *
 */
public class _6CodingBatString1_6 {
    public String firstTwo(String str) {
        return str.length() < 2 ? str : str.substring(0, 2);
    }
}
