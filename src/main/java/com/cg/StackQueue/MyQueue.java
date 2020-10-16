package com.cg.StackQueue;

public class MyQueue {

    MyLinkedList l=new MyLinkedList();
    public void enqueue(int data)
    {
        Node node=new Node(data);
        l.addToEnd(data);
        l.print();
    }
    public void print()
    {
        l.print();
    }
}
