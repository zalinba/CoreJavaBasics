package com.perscholas.java_basics.operators;
//Lab 303.1.2 - Core Java: Operators

/* Create a Java class named TernaryOperatorDemo
 * and write the code below in that class.
 */

public class TernaryOperatorDemo
{
    public static void main(String[] args)
    {
        //Ternary operator shortens an if-else statement
        //Ternary operator format: condition ? exprTrue : exprFalse;
        int age = 18;
        String result = age < 100 ? "Less than 100" : "Greater than 100";

        System.out.println(result);
        //output: Less than 100

        //Longer way to code an if-else statement
        int dog = 8;
        String results;

        if( dog > 10 ) {
            results = "Greater than 10";
        } else {
            results = "Less than 10";
        }

        System.out.println(results);
        //output: Less than 10
    }
}
