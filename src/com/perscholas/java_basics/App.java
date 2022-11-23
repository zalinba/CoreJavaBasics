package com.perscholas.java_basics;

public class App {

    public static void main(String[] args) {
/*●	Write a program that declares 2 integer variables,
    assigns an integer to each, and adds them together.
    Assign the sum to a variable. Print out the result.
 */
        int a, b, sum;

        a = 4;
        b = 5;
        sum = a + b;


        /*●	Write a program that declares 2 double variables,
        assigns a number to each, and adds them together. Assign
        the sum to a variable. Print out the result.
         */

        double c, d, sum1;

        c = 2.0;
        d = 3.0;
        sum1 = c + d;


        /*●	Write a program that declares an integer variable and
        a double variable, assigns numbers to each, and adds them
        together. Assign the sum to a variable. Print out the result.
        What variable type must the sum be?
        Answer: double
         */

        int e = 1;
        double f = 2.0;
        double sum2 = e + f;




        /* ●Write a program that declares 2 integer variables, assigns
        an integer to each, and divides the larger number by the smaller
        number. Assign the result to a variable. Print out the result.
        Now change the larger number to a decimal. What happens? What
        corrections are needed?
         */

        int g, h, i, j, l;
        g = 2;
        h = 8;
        i = h/g;
        //result is 4;

        j = 2;
        double k = 8.0;
        l = (int) (k/j);
        //result ended up being an error. The corrections needed is typecast double



        System.out.println(l);
    }
}
