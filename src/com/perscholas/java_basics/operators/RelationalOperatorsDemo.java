package com.perscholas.java_basics.operators;
//Lab 303.1.2 - Core Java: Operators

/* Create a Java class named RelationalOperatorsDemo
 * and write the code below in that class.
 */
public class RelationalOperatorsDemo
{

    public static void main(String[] args)
    {
        int x = 10, y = 5;

        System.out.println("x > y : "+(x > y));
        //output: true

        System.out.println("x < y : "+(x < y));
        //output: false

        System.out.println("x >= y : "+(x >= y));
        //output: true

        System.out.println("x <= y : "+(x <= y));
        //output: true

        System.out.println("x == y : "+(x == y));
        //output: false

        System.out.println("x != y : "+(x != y));
        //output: true

        int variable1 = 50, variable2 = 100, variable3 = 50;

        System.out.println("variable1 = " + variable1);
        //output: 50

        System.out.println("variable2 = " + variable2);
        //output: 100

        System.out.println("variable3 = " + variable3);
        //output: 50

        System.out.println("variable1 == variable2: "
                + (variable1 == variable2));
        //output: false

        System.out.println("variable1 == variable3: "
                + (variable1 == variable3));
        //output: true

    }
}
