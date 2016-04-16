package ua.artcode.oop.week4.homework.queue.src;

import ua.artcode.oop.week4.homework.utils.Node;

/**
 * Created by olsas on 4/16/2016.
 */
public class MyLinkedQueue implements MyQueue {
    private Node top;

    public MyLinkedQueue(Node top) {
        this.top = top;
    }

    @Override
    public void enqueue(Object obj) {
        top = new Node(obj, top);
    }

    @Override
    public Object dequeue() {
        //re-do
        return null;
    }

    private Node cutBottom(Node node) {
        // re-do
        while (node.next != null) {
            if (node.next.next == null) {
                node.next = null;
                return node.next;
            }
            node = node.next;
        }
        return node.next;
    }
}
