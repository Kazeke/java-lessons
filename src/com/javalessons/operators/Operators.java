package com.javalessons.operators;

public class Operators {

    public static void main(String[] args) {
//          + - / * %
        double a = 10;
        double b = 3;

        double c = a + b;
        double d = a - b;

        double e = a * b;
        double f = a / b;

        double g = a % b;

        System.out.println("с = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);


//        a = a + 5;
//        a += 5;
//        a++;
        ++a;
        System.out.println("New a = " + a);

//        b--;
        --b;
        System.out.println("New b = " + b);

//        a = a + 1;
//        a += 1;
//        a++;

        double n = 6;
        double m = 7;

        double res1 = 2 * n++;
        double res2 = 2 * ++m;
        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);


    }

}
