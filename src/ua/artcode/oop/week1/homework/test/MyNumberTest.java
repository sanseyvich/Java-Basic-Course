package ua.artcode.oop.week1.homework.test;

import ua.artcode.oop.week1.homework.src.MyNumber;

/**
 * Created by olsas on 3/26/2016.
 */
public class MyNumberTest {
    public static void main(String[] args) {
        MyNumberTest testOne = new MyNumberTest();

        MyNumber sumExpected = null;
        MyNumber sumFirstNumber = null;
        MyNumber sumSecondNumber = null;

        boolean compareToExpected = true;
        MyNumber compareToFirstNumber= null;
        MyNumber compareToSecondNumber = null;

        testOne.sumTest(sumExpected, sumFirstNumber, sumSecondNumber);
        //testOne.multiplyTest(multiplyExpected, multiplyNumber, multiplier);
        //testOne.oddTest(oddExpected, oddFirstNumber, oddSecondNumber);
        //testOne.divisionTest(divisionExpected, divisionDivident, divisionDivider);
        //testOne.toPowerTest(toPowerExpected, toPowerNumber, toPowerPower);
        //testOne.factorialTest(factorialExpected, factorialNumber);
        //testOne.remainderTest(remainderExpected, remainderFirstNumber, remainderSecondNumber);
        testOne.compareToTest(compareToExpected, compareToFirstNumber, compareToSecondNumber);
    }

    private boolean sumTest(MyNumber expected, MyNumber firstNumber, MyNumber secondNumber) {
        boolean result = expected.compareTo(MyNumber.sum(firstNumber, secondNumber));
        message("sumTest", result);
        return result;
    }

    private boolean compareToTest(boolean expected, MyNumber firstNumber, MyNumber secondNumber) {
        boolean result = expected == firstNumber.compareTo(secondNumber);
        message("compareToTest", result);
        return result;
    }

    private void message(String method, boolean result) {
        System.out.printf("\n%s execution result is -> %b", method, result);
    }
}
