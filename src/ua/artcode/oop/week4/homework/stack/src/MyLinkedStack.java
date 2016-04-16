package ua.artcode.oop.week4.homework.stack.src;

import ua.artcode.oop.week4.homework.utils.Node;

/**
 * Created by olsas on 4/15/2016.
 */
public class MyLinkedStack implements MyStack {
    private Node top;

    public MyLinkedStack(Node top) {
        this.top = top;
    }

    public MyLinkedStackIterator createIterator() {
        return new MyLinkedStackIterator(top);
    }

    @Override
    public void push(Object obj) {
        top = new Node(obj, top);
    }

    @Override
    public Object pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        }

        Object obj = top.val;
        top = top.next;
        return obj;
    }
}
