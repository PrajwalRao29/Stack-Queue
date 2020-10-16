package com.cg.StackQueue;
public class MyStack {

    MyLinkedList l=new MyLinkedList();

    public void push(int data)
    {
    Node node=new Node(data);
    l.addToStart(data);
    l.print();
    }
}
