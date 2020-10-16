package com.cg.StackQueue;

public class MyLinkedList {
    Node head = null;

    public boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Search Successful");
                return true;
            }
            temp = temp.next;
        }
        System.out.println("Search Not Successful");
        return false;
    }

    public void addSort(int data) {
        Node newNode = new Node(data);
        Node current = head;
        Node previous = null;
        while (current != null && data > current.data) {
            previous = current;
            current = current.next;
        }
        // insertion at beginning of the list
        if (previous == null) {
            head = newNode;
        } else {
            previous.next = newNode;
        }
        newNode.next = current;
    }

    public void addToStart(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addToEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void pop() {
        head = head.next;
    }

    public int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void popLast() {
        Node temp = head;
        if(this.size()==1)
        {
            head=null;
            return;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public boolean delete(int data) {
        if (!search(data)) {
            return false;
        }
        Node temp = head;
        while (temp.next.data != data) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return true;
    }

    public boolean addAfter(int prev, int data) {
        if (!search(prev)) {
            return false;
        }
        Node n = new Node(data);
        Node temp = head;
        while (temp.data != prev) {
            if (temp.next == null) {
                System.out.println("Previous value not found");
                return false;
            }
            temp = temp.next;
        }
        Node n1 = temp.next;
        temp.next = n;
        n.next = n1;
        return true;
    }

    public void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println();
    }
}

