package com.bridgelabz.linkedlist;

/**
 * create Node
 * @param <L>
 */
public class Node<L> {
    private L data;
    private Node<L> next;

    public Node(L data) {
        this.data=data;
        next=null;
    }

    public L getData() {
        return data;
    }

    public void setData(L data) {
        this.data = data;
    }

    public Node<L> getNext() {
        return next;
    }

    public void setNext(Node<L> next) {
        this.next = next;
    }
}
