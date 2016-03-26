package ua.artcode.oop.week1.homework.src;

/**
 * Created by olsas on 3/21/2016.
 */
public class MyString {
    private char[] myStringArray;

    public MyString(char[] charArr) {
        this.myStringArray = charArr;
    }

    public int length() {
        return myStringArray.length;
    }

    public void concat(MyString concatMyString) {
        char[] newArray = new char[(this.length() + concatMyString.length())];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i < myStringArray.length ? myStringArray[i] : concatMyString.toString().charAt(i - myStringArray.length);
        }
        this.myStringArray = newArray;
    }

    public void toUpperCase() {
        for (int i = 0; i < myStringArray.length; i++) {
            int charCodePoint = myStringArray[i];
            if (charCodePoint < 123 && charCodePoint > 96) {
                charCodePoint -= 32;
                myStringArray[i] = (char) charCodePoint;
            }
        }
    }

    public void toLowerCase() {
        for (int i = 0; i < myStringArray.length; i++) {
            int charCodePoint = myStringArray[i];
            if (charCodePoint < 91 && charCodePoint > 64) {
                charCodePoint += 32;
                myStringArray[i] = (char) charCodePoint;
            }
        }
    }

    public boolean findSubstring(MyString stringToFind) {
        int count = 0;
        for (int i = 0; i < myStringArray.length; i++) {
            if (count < stringToFind.length() && myStringArray[i] == stringToFind.toString().charAt(count)) {
                count++;
            }
        }
        return count == stringToFind.length() ? true : false;
    }

    public MyString substring(int start, int end) {
        char[] newArr = new char[end - start];
        for (int i = 0; i < myStringArray.length; i++) {
            if (i >= start && i < end) {
                newArr[i - start] = myStringArray[i];
            }
        }
        return new MyString(newArr);
    }

    public void removeSpaces() {
        char[] newArr = new char[countNonWhitespaced(myStringArray)];
        int count = 0;
        for (int i = 0; i < myStringArray.length; i++) {
            if (myStringArray[i] != ' ') {
                newArr[count] = myStringArray[i];
                count++;
            }
        }
        myStringArray = newArr;
    }

    public boolean compareTo(MyString another) {
        if (this.length() != another.length()) return false;
        for (int i = 0; i < myStringArray.length; i++) {
            if (myStringArray[i] != another.toString().charAt(i)) return false;
        }
        return true;
    }

    private int countNonWhitespaced(char[] arr) {
        int count = 0;
        for (char i : arr) {
            count = i != ' ' ? count + 1 : count;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(myStringArray.length);
        for (int i = 0; i < myStringArray.length; i++) {
            stringBuilder.append(myStringArray[i]);
        }
        return stringBuilder.toString();
    }
}

