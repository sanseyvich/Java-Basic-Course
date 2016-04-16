package ua.artcode.oop.week4.homework.stack.src;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by olsas on 4/15/2016.
 */
class MyArrayStackIterator implements Iterator {
    private Object[] myArray;
    private int lastElement;
    private int top;

    MyArrayStackIterator(Object[] myArray, int lastElement) {
        if (lastElement >= myArray.length) {
            System.out.println("Wrong input parameters!");
            return;
        }
        this.myArray = myArray;
        this.lastElement = lastElement;
        this.top = lastElement;
    }

    @Override
    public void remove() {
        if (lastElement < 0) {
            System.out.println("Stack is empty!");
            return;
        }
        myArray[lastElement] = null;
    }

    @Override
    public boolean hasNext() {
        if (top < 0) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return myArray[top--];
    }
}
