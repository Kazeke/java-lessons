package com.javalessons.methods;

public class Methods {

    public static void main(String[] args) {
        printMessage("Alex");


        int a = 5;
        int b = 10;

        int square = calcSqure(b);
        System.out.println("Rectangle square = " + calkRectangleSquare(a, b));
        System.out.println("Square = " + calcSqure(b));

        System.out.println("Some Of Squares = " + (calkRectangleSquare(a, b) + calcSqure(b)));
    }

    static void printMessage(String name) {
        System.out.println("Hello " + name + "!!!");
    }

    static int calkRectangleSquare(int x, int y) {
        int square = x * y;
        return square;


    }

    static int calcSqure(int x) {
        return x * x;
    }
}
