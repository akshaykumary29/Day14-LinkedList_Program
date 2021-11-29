package com.bridgelabz.linkedlist;

/**
 * create the Operations for perform LinkedList
 */
public interface LinkedListOperation {
    void insert(int data);
    void add();
    void append();
    void insertBetween();
    void pop();
    void popLastElement();
    boolean findNodeWithGivenValue();
    void insertNumberAfterGivenNode();
    void deleteNodeWithGivenValue();
    void sortLinkedList();
}
