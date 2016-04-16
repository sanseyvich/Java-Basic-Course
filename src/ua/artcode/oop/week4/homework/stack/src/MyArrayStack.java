package ua.artcode.oop.week4.homework.stack.src;

/**
 * Created by olsas on 4/15/2016.
 */
public class MyArrayStack implements MyStack {
    private Object[] myArray;
    private int lastElement;

    public MyArrayStack() {
        this.myArray = new Object[10];
        this.lastElement = -1;
    }

    public MyArrayStack(Object[] myArray, int lastElement) {
        this.myArray = myArray;
        this.lastElement = lastElement;
    }

    public MyArrayStackIterator createIterator() {
        return new MyArrayStackIterator(myArray, lastElement);
    }

    @Override
    public void push(Object obj) {
        if ((lastElement + 1) >= myArray.length) {
            System.out.println("Stack overflow!");
            return;
        }
        myArray[++lastElement] = obj;
    }

    @Override
    public Object pop() {
        if (lastElement < 0) {
            System.out.println("Stack is empty!");
            return null;
        }
        return myArray[lastElement--];
    }
}
