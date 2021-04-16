package com.stack.demo;

import com.queue.demo.Node;

public class TestMyGenericStack {
    public static void main(String[] args) {
        MyGenericStack<String> myGenericStack = new MyGenericStack<String>();
        myGenericStack.push("BMW");
        myGenericStack.push("Audi");
        myGenericStack.push("Toyota");
        myGenericStack.push("Honda");

        myGenericStack.printData();
        }
    }

