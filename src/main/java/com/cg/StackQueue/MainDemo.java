package com.cg.StackQueue;

public class MainDemo {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        System.out.println("PUSH OPERATION");
        s.push(70);
        s.push(30);
        s.push(56);
        System.out.println("PEAK");
        s.peek();
        System.out.println("POP");
        s.pop();
        s.print();
        MyQueue q=new MyQueue();
        q.enqueue(56);
        q.enqueue(30);
        q.enqueue(70);
        System.out.println();
        System.out.println("DEQUEUE 1");
        q.dequeue();
        q.print();
        System.out.println("DEQUEUE 2");
        q.dequeue();
        q.print();
        System.out.println("DEQUEUE 3");
        q.dequeue();
        q.print();
    }
}
