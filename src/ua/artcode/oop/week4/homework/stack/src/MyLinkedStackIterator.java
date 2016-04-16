package ua.artcode.oop.week4.homework.stack.src;

import ua.artcode.oop.week4.homework.utils.Node;

import java.util.Iterator;

/**
 * Created by olsas on 4/15/2016.
 */
public class MyLinkedStackIterator implements Iterator {
    private Node top;

    MyLinkedStackIterator(Node top) {
        this.top = top;
    }

    @Override
    public boolean hasNext() {
        if (top.next == null) return false;
        return true;
    }

    @Override
    public Object next() {
        Object value = top.val;
        top = top.next;
        return value;
    }
}
