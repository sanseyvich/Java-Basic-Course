package ua.artcode.oop.week1.homework.test;

import ua.artcode.oop.week1.homework.src.MyString;

/**
 * Created by olsas on 3/21/2016.
 */
public class MyStringTest {
    public static void main(String[] args) {
        int lengthExpected = "expected_length ".length();
        MyString lengthTest = new MyString("expected_length ".toCharArray());

        String toStringExpected = "Valera go home, you are drunk!";
        MyString toStringTest = new MyString(toStringExpected.toCharArray());

        String concatExpected = "12345 I'm going to find and eat you)";
        MyString concatGeneral = new MyString("12345 ".toCharArray());
        MyString concatToConcat = new MyString("I'm going to find and eat you)".toCharArray());

        String toUpperCaseExpected = "123 Can Not count fuRtHer!".toUpperCase();
        MyString toUpperCaseTest = new MyString("123 Can Not count fuRtHer!".toCharArray());

        String toLowerCaseExpected = "123 Can Not count fuRtHer!".toLowerCase();
        MyString toLowerCaseTest = new MyString("123 Can Not count fuRtHer!".toCharArray());

        boolean findSubstringExpected = true;
        MyString findSubstringTest = new MyString("You are able to find cadabra here - not abra!".toCharArray());
        MyString findSubstringToFindTest = new MyString("cadabra".toCharArray());

        String substringExpected = "cada";
        MyString substringTest = new MyString("You are able to find cadabra here - not abra!".toCharArray());
        int substringStart = "You are able to find cadabra here - not abra!".indexOf("cada");
        int substringEnd = "You are able to find cadabra here - not abra!".indexOf("cada") + "cada".length();

        String removeSpacesExpected = "don'tKnowWhatSpaceIs";
        MyString removeSpacesTest = new MyString(" don't Know   What Spa ce Is ".toCharArray());

        boolean compareToExpected = true;
        MyString compareToOriginalTest = new MyString("totally matched Strings is compared $ ( @".toCharArray());
        MyString compareToComparantTest = new MyString("totally matched Strings is compared $ ( @".toCharArray());

        MyStringTest testOne = new MyStringTest();

        testOne.lengthTest(lengthExpected, lengthTest);
        testOne.toStringTest(toStringExpected, toStringTest);
        testOne.concatTest(concatExpected, concatGeneral, concatToConcat);
        testOne.toUpperCaseTest(toUpperCaseExpected, toUpperCaseTest);
        testOne.toLowerCaseTest(toLowerCaseExpected, toLowerCaseTest);
        testOne.findSubstringTest(findSubstringExpected, findSubstringTest, findSubstringToFindTest);
        testOne.substringTest(substringExpected, substringTest, substringStart, substringEnd);
        testOne.removeSpacesTest(removeSpacesExpected, removeSpacesTest);
        testOne.compareToTest(compareToExpected, compareToOriginalTest, compareToComparantTest);
    }

    private boolean lengthTest(int expected, MyString testMyString) {
        boolean result = expected == testMyString.length();
        message("lengthTest", result);
        return result;
    }

    private boolean toStringTest(String expected, MyString testMyString) {
        boolean result = expected.equals(testMyString.toString());
        message("toStringTest", result);
        return result;
    }

    private boolean concatTest(String expected, MyString general, MyString toConcat) {
        general.concat(toConcat);
        boolean result = expected.equals(general.toString());
        message("concatTest", result);
        return result;
    }

    private boolean toUpperCaseTest(String expected, MyString testMyString) {
        testMyString.toUpperCase();
        boolean result = expected.equals(testMyString.toString());
        message("toUpperCaseTest", result);
        return result;
    }

    private boolean toLowerCaseTest(String expected, MyString testMyString) {
        testMyString.toLowerCase();
        boolean result = expected.equals(testMyString.toString());
        message("toLowerCaseTest", result);
        return result;
    }

    private boolean findSubstringTest(boolean expected, MyString testMyString, MyString stringToFind) {
        boolean result = expected == testMyString.findSubstring(stringToFind);
        message("findSubstringTest", result);
        return result;
    }

    private boolean substringTest(String expected, MyString testMyString, int start, int end) {
        MyString newMyString = testMyString.substring(start, end);
        boolean result = expected.equals(newMyString.toString());
        message("substringTest", result);
        return result;
    }

    private boolean removeSpacesTest(String expected, MyString testMyString) {
        testMyString.removeSpaces();
        boolean result = expected.equals(testMyString.toString());
        message("removeSpacesTest", result);
        return result;
    }

    private boolean compareToTest(boolean expected, MyString original, MyString toCompare) {
        boolean result = expected == original.compareTo(toCompare);
        message("compareToTest", result);
        return result;
    }

    private void message(String method, boolean result) {
        System.out.printf("\n%s execution result is -> %b", method, result);
    }
}
