package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("修改了两次");
        System.out.println("修改了四次");
        System.out.println(add(1, 2));
        System.out.println("修改了");
    }
    public static int add(int a, int b) {
        return a + b;
    }


}