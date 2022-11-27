package com.perscholas.java_basics.operators;
//Lab 303.1.2 - Core Java: Operators

/* Create a Java class named LogicalOperatorsDemo
 * and write the code below in that class.
 */

public class BitwiseOperatorsDemo
{
    public static void main(String[] args)
    {
        int x = 58; //bitwise: 00111010
        int y =13; //bitwise: 00001101

        System.out.println("x & y : " + (x & y));
        //output: x & y : 8
        //bitwise: 00001000

        System.out.println("x | y : " + (x | y));
        //output: 63
        //bitwise: 00111111

        System.out.println("x ^ y : " + (x ^ y));
        //output: 55
        //bitwise: 00110111

        System.out.println("~x : " + (~x));
        //output: -59
        //bitwise: 00111011

        System.out.println("x << y : " + (x << y));
        //output: 475136
        //bitwise: 01110100000000000000

        System.out.println("x >> y : " + (x >> y));
        //output: 0
        //bitwise: 0
    }
}
