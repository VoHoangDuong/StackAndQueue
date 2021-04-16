package com.stack.demo;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack1<E> {
    public LinkedList<E> stack = new LinkedList<>();

    public MyGenericStack1(){
        stack = new LinkedList();
    }
    public void push(E e){
        stack.addFirst(e);
    }
    public boolean isEmpty(){
     if (stack.size()==0){
         return true;
     }else {
         return false;
     }
    }
    public int size(){
        return stack.size();
    }
    public E pop(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }else {
         return stack.removeFirst();
        }
    }
    // duyệt các phần tử của mảng bằng cách truyền phương thức tham chiếu
    //        stack.forEach(System.out::println);
    public void display(){
    stack.forEach(System.out::println);
    }
}
