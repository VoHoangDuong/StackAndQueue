package com.stack.demo;

public class TestMyGenericStack1 {
    public static void main(String[] args) {
        MyGenericStack1<Double>numbers = new MyGenericStack1<>();
        numbers.push(2.1);
        numbers.push(3.2);
        numbers.push(4.5);
        numbers.push(3.6);
        numbers.push(7.1);
        numbers.push(5.3);
        System.out.println("Stack after at element : ");
        numbers.display();
        System.out.println("***************************");
        numbers.pop();
        numbers.pop();
        System.out.println("Stack after pop element: ");
        numbers.display();
    }
}
