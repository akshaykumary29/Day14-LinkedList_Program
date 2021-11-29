package com.bridgelabz.linkedlist;

/**
 * Here implements all the operations using Generics cancepts
 *
 * @param <L>
 */
public abstract class LinkedList<L> implements LinkedListOperation {

    Node<L> head;
    Node<L> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * uc1 : create simple linked list
     */
    public void insert(L data) {
        Node<L> newNode = new Node<L>(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    /**
     * UC2 : ability to create linked list by adding 30 and 56 to 70
     */
    public void add(L data) {
        Node<L> newNode = new Node<L>(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }

    }

    /**
     * UC3 : ability to create linkedList by appending
     */
    public void append(L data) {
        Node<L> newNode = new Node<L>(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    /**
     * UC4 : ability to insert an element in between
     */
    public void insertBetween(L newKey, L key) {
        Node<L> node = head;
        Node<L> temp;
        Node<L> newNode = new Node<L>(newKey);
        while (node != null) {
            if (node.getData() == key) {
                break;
            }
            node = node.getNext();
        }
        temp = node.getNext();
        node.setNext(newNode);
        newNode.setNext(temp);
    }

    /**
     * uc5 : ability to delete the first element
     */
    public void pop() {
        Node<L> node = head;
        head = node.getNext();
        node.setNext(null);
    }

    /**
     * uc6 : ability to delete the last element from the given sequence.
     */
    public void popLastElement() {
        Node<L> node = head;
        while (node.getNext() != tail) {
            node = node.getNext();
        }
        node.setNext(null);
        tail = node;
    }

    /**
     * uc7: ability to search LL to find node with certain value
     */
    public boolean findNodeWithGivenValue(L value) {
        Node<L> node = head;
        while (node != null) {
            if (node.getData() == value)
                return true;
            node = node.getNext();
        }
        return false;
    }

    /**
     * uc8: ability to insert number after given value to the LL sequence
     */
    public void insertNumberAfterGivenNode(L newKey, L key) {
        Node<L> node = head;
        Node<L> temp;
        Node<L> newNode = new Node<L>(newKey);
        while (node != null) {
            if (node.getData() == key)
                break;
            node = node.getNext();
        }
        temp = node.getNext();
        node.setNext(newNode);
        newNode.setNext(temp);
    }

    /**
     * uc9: ability to delete element from linked list sequence
     */
    public void deleteNodeWithGivenValue(L key) {
        Node<L> node = head;
        Node<L> prev = null;
        while (node != null) {
            if (node.getData() == key)
                break;
            prev = node;
            node = node.getNext();
        }
        if (prev == null) {
            head = head.getNext();
        } else {
            prev.setNext(node.getNext());
            node.setNext(null);
        }
    }

    public void sortLinkedList(L data) {
        Node<L> newNode = new Node<L>(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node<L> temp = null, prev = null;
            temp = head;
            while (temp != null) {
                if (sort(temp, newNode) > 0) {
                    break;
                }
                prev = temp;
                temp = temp.getNext();
            }
            if (temp == head) {
                newNode.setNext(temp);
                head = newNode;
            } else if (temp == null) {
                prev.setNext(newNode);
                tail = newNode;
            } else {
                prev.setNext(newNode);
                newNode.setNext(temp);
            }
        }
    }

    private int sort(Node<L> temp, Node<L> newNode) {
        return ((Comparable) temp.getData()).compareTo(newNode.getData());
    }

    public void display() {
        Node<L> node = head;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public int size() {
        int size = 0;
        Node<L> node = head;
        while (node != null) {
            size++;
            node = node.getNext();
        }
        return size;
    }
}
