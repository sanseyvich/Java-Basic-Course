package ua.artcode.basic.week2.homework;

/**
 * Created by olsas on 3/2/2016.
 *
 * Given a string, return a version without the first and last char, so "Hello" yields "ell".
 * The string length will be at least 2.
 * withoutEnd("Hello") → "ell"
 * withoutEnd("java") → "av"
 * withoutEnd("coding") → "odin"
 */
public class _8CodingBatString1_8 {
    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }
}
