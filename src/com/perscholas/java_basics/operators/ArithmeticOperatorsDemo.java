package com.perscholas.java_basics.operators;
//Lab 303.1.2 - Core Java: Operators

/* Create a Java class named ArithmeticOperatorsDemo
 * and write the code below in that class.
 */
public class ArithmeticOperatorsDemo
{

    public static void main(String[] args)
    {
        //TODO Auto-generated method stub
        int x, y = 10, z = 5;
        //int variables y and z are declared and initialized.

        x = y + z;

        System.out.println("+ operator resulted in " + x);
        //output: + operator resulted in 15

        x = y - z;

        System.out.println("- operator resulted in " + x);
        //output: - operator resulted in 5

        x = y * z;

        System.out.println("* operator resulted in " + x);
        //output: * operator resulted in 50

        x = y / z;

        System.out.println("/ operator resulted in " + x);
        //output: / operator resulted in 2

        x = y % z;

        System.out.println("% operator resulted in " + x);
        //output: % operator resulted in 0

        x = y++;

        System.out.println("Postfix ++ operator resulted in " + x);
        //output: Postfix ++ operator resulted in 10

        /* Postfix operator increments the value of a variable after
         * the result of a statement. The postfix operator will give
         * two results of y's value at different execution points.
         * The first result is a copy of the old value of y (10) and
         * the second result is a copy of the updated value of y (11)
         * after the postfix operator is incremented.
         *
         * In the statement x = y++;, the copy of the old y variable
         * (10) is assigned to the value of x before the postfix
         * operator is able to increment the value of y. When the
         * statement prints out x, the value will be 10.
         *
         * After the statement prints the results, the postfix
         * operator will then increment (+1) the copy of the old y
         * variable value (10) and the results of y's calculated value
         * will become the new value of y (11).
         *
         * When the y variable is used again in another statement x = -y;
         * , the second result will show the updated value of y (11)
         * instead of the old value (10). The - unary operator is then
         * applied to the y's value and changes the value to -11.
         */

        x = ++z;

        System.out.println("Prefix ++ operator resulted in " + x);
        //output: Prefix ++ operator resulted in 6

        /* Prefix operator increments the value of a variable first
         * and then prints the calculated results. The calculations
         * of ++z is done first, so the ++ operator increments (+1)
         * the value of z (5) and the new value of z is now equal
         * to 6 which is assigned to x. When you print x, the results
         * will show 6.
         */

        x = -y;

        System.out.println("Unary operator resulted in " + x);
        //output: Unary operator resulted in -11

        //Some examples of special class
        int tooBig = Integer.MAX_VALUE + 1;
        //-2147483648 which is Integer.MIN_VALUE.

        int tooSmall = Integer.MIN_VALUE - 1;
        //2147483647 which is Integer.MAX_VALUE.

        System.out.println("tooBig becomes " + tooBig);
        //output: tooBig becomes -2147483648

        System.out.println("tooSmall becomes " + tooSmall);
        //output: tooSmall becomes 2147483647

        System.out.println(4.0 / 0.0);
        //output: Infinity

        System.out.println(-4.0 / 0.0);
        //output: -Infinity

        System.out.println(0.0 / 0.0);
        //output: NaN

        double d1 = 12 / 8;
        double d2 = 12.0F / 8;

        System.out.println("d1 is " + d1);
        //output: d1 is 1.0

        System.out.println("d2 is " + d2);
        //output: d2 is 1.5




    }
}
