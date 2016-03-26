package ua.artcode.oop.week1.homework.src;

/**
 * Created by olsas on 3/26/2016.
 */
public class MyNumber {
    private int intNumber;

    public MyNumber(int number) {
        this.intNumber = number;
    }

    public static MyNumber sum(MyNumber firstNumber, MyNumber secondNumber) {
        return new MyNumber(firstNumber.returnInt() + secondNumber.returnInt());
    }

    public boolean compareTo(MyNumber number) {
        return intNumber == number.returnInt() ? true : false;
    }

    public int returnInt() {
        return intNumber;
    }
}
