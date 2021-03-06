package ua.artcode.basic.week2.homework;

/**
 * Created by olsas on 2/29/2016.
 * <p>
 * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the
 * middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at
 * index i and going up to but not including index j.
 * makeOutWord("<<>>", "Yay") → "<<Yay>>"
 * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
 * makeOutWord("[[]]", "word") → "[[word]]"
 */
public class _4CodingBatString1_4 {
    public String makeOutWord(String out, String word) {
        int outMiddleIndex = out.length() / 2;
        return out.substring(0, outMiddleIndex) + word + out.substring(outMiddleIndex, out.length());
    }
}
