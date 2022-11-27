package com.perscholas.java_basics.operators;
//Lab 303.1.2 - Core Java: Operators

/* Create a Java class AssignmentOperatorsDemo
 * and write the code below in that class.
 */
public class AssignmentOperatorsDemo
{

    public static void main(String[] args)
    {

        // Assigning Primitive Values
        int j, k; //Declaring int variables j and k
        j = 10; //Initializing variable j's value to 10
        j = 5; //j's previous value is overwritten  to the new value 5
        k = j; //Initializing variable k's value to 5

        System.out.println("j is : " + j); //output: j is : 5
        System.out.println("k is : " + k); //output: k is : 5

        //Multiple Assignments
        k = j = 10;
        /* (k = (j = 10)). The k variable value will equal to whatever
         * variable j's value will be assigned to.
         */

        System.out.println("j is : " + j); //output: j is 10
        System.out.println("k is : " + k); //output: k is 10
    }
}
