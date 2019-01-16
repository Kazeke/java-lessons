package com.javalessons.methods;

public class Methods {

    public static void main(String[] args) {
        printMessage("Alex");


        System.out.println("Rectangle square = " + calkRectangleSquare(5, 10));
        System.out.println("Square = " + calcSqure(5));

        System.out.println("Some Of Squares = " + (calkRectangleSquare(5, 10) + calcSqure(10)));

        String str1 = "I like black coffee";
        String str3 = "I like coffee!!!";

        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        String str2 = "I like coffee";
        String str4 = new String("I like coffee");
        String substring = str3.substring(0, 13);
        System.out.println("Substring = " + str3.substring(0, 13));
        boolean b = str2.equals(substring);
        System.out.println(b);

        boolean like = str1.endsWith("fee!");
        System.out.println(like);

        System.out.println(str1.replace("black", "white"));

        System.out.println(str3.indexOf("!!!"));

    }

    private static void printMessage(String name) {
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
