package com.cg.StackQueue;

public class MyStackMain {
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
    }
}
