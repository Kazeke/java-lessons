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
//        System.out.println("New a = " + a);

//        b--;
        --b;
//        System.out.println("New b = " + b);

//        a = a + 1;
//        a += 1;
//        a++;

        double n = 7;
        double m = 7;

        double res1 = 2 * n++;
        double res2 = 2 * ++m;
//        System.out.println("res1 = " + res1);
//        System.out.println("res2 = " + res2);


//          == != < > <= >= && || ?:

        int x = 3;
        int y = 5;
        int z = 8;

        boolean boolVal = x == y;

        System.out.println("boolVal = " + boolVal);

        boolean boolVal1 = y != z;

        System.out.println("boolVal1 = " + boolVal1);

        boolean boolVal2 = n != m;

        System.out.println("boolVal2 = " + boolVal2);

        boolean boolVal3 = n >= m;
        System.out.println("boolVal3 = " + boolVal3);


        boolean boolVol4 = y > z;

        boolean resultBoolean = boolVal3 && boolVol4;

        System.out.println("resultBoolean = " + resultBoolean);

//      true && true = true
//      true && false = false
//      true || false = true
//      fale || false = false

        int res = (x > y) && (z < y) ? x : y;
        System.out.println("Ternary res = " + res);

        System.out.println("NOT = "+ !(x>y));


    }

}
