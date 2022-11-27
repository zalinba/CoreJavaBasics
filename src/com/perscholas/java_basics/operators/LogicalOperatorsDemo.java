package com.perscholas.java_basics.operators;
//Lab 303.1.2 - Core Java: Operators

/* Create a Java class named LogicalOperatorsDemo
 * and write the code below in that class.
 */

public class LogicalOperatorsDemo
{
    public static void main(String[] args)
    {
        boolean x = true;
        boolean y = false;

        System.out.println("x & y : " + (x & y));
        //output: false

        /*& returns true if both conditions are true
         */

        System.out.println("x && y : " + (x && y));
        //output: false

        /* && does not check the second condition
         * if the first condition is false. It checks
         * the second condition only when the first
         * one is true.
         */


        System.out.println("x | y : " + (x | y));
        //output: true

        /* | value returns true when at least one
         * given condition is true.
         */

        System.out.println("x || y: " + (x || y));
        //output: true

        /* || does not check the second condition
         * if the first condition is true. It checks
         * the second condition only when the first
         * one is false.
         */

        System.out.println("x ^ y : " + (x ^ y));
        //output: true

        System.out.println("!x : " + (!x));
        //output: false

        /* ! reverses the overall result. If the
         * value is returned true, it gives out
         * false.
         */
    }
}
