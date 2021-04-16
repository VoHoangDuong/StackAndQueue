package com.stack.demo;


import com.queue.demo.Node;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<E> {
    private LinkedList<E> stack;

    public MyGenericStack(){
        stack = new LinkedList();
    }
    public void push(E e){
        stack.addFirst(e);
    }
    public boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }
        return false;
    }
    public E pop(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }

        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }

    public void printData(){
        for (int i = 0; i < stack.size(); i ++){
            System.out.println(stack.get(i));
        }
    }

}
