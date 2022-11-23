//303.1.2

package com.perscholas.java_basics;

public class App {

    public static void main(String[] args) {
        /*●Write a program that declares 2 integer variables,
         * assigns an integer to each, and adds them together.
         * Assign the sum to a variable. Print out the result.
         */
        int a, b, sum1;

        a = 4;
        b = 5;
        sum1 = a + b;

        System.out.println(sum1 + "\n");


        /* Write a program that declares 2 double variables,
         * assigns a number to each, and adds them together. Assign
         * the sum to a variable. Print out the result.
         */

        double c, d, sum2;

        c = 2.0;
        d = 3.0;
        sum2 = c + d;

        System.out.println(sum2 + "\n");


        /*●Write a program that declares an integer variable and
         * a double variable, assigns numbers to each, and adds them
         * together. Assign the sum to a variable. Print out the result.
         * What variable type must the sum be?
         * Answer: double
         */

        int e = 1;
        double f = 2.0;
        double sum3 = e + f;

        System.out.println(sum3 + "\n");


        /*●Write a program that declares 2 integer variables, assigns
         * an integer to each, and divides the larger number by the smaller
         * number. Assign the result to a variable. Print out the result.
         * Now change the larger number to a decimal. What happens? What
         * corrections are needed?
         */

        int g, h, i, j, l;
        g = 2;
        h = 8;
        i = h/g;

        System.out.println(i + "\n");
        //result is 4;

        j = 2;
        double k = 8.0;
        l = (int) (k/j);

        System.out.println(l + "\n");
        //result ended up being an error. The corrections needed is typecast double


    /* Write a program that declares 2 double variables, assigns a number to each,
     * and divides the larger by the smaller. Assign the result to a variable. Print
     * out the result. Now, cast the result to an integer. Print out the result again.
     */
        double m, n, sum4;

        m = 8;
        n = 2;
        sum4 = m/n;

        System.out.println(sum4 + "\n");

        int o = (int)sum4;

        System.out.println(o + "\n");


    /* Write a program that declares two integer variables, x, and y, and assigns
     * 5 to x and 6 to y. Declare a variable q and assign y/x to it and print q. Now,
     * cast y to a double and assign it to q. Print q again.
     */
        /*int x, y, q;

        x = 5;
        y = 6;
        q = y/x;

        System.out.println(q + "\n");

        q = (double)y;
        */

        //I get an error for casting y to a double variable
        //I need to change int q to a double q and recast y

        int x, y;

        x = 5;
        y = 6;

        double q = y/x;

        q = (double)y;

        System.out.println(q + "\n");


    /*●Write a program that declares a named constant and uses it in a calculation.
     * Print the result.
     */


    /*●Write a program where you create 3 variables that represent products at a cafe.
     * The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
     * Assign prices to each product. Create 2 more variables called subtotal and totalSale
     * and complete an “order” for 3 items of the first product, 4 items of the second
     * product, and 2 items of the third product. Add them all together to calculate the
     * subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to
     * obtain the totalSale amount. Be sure to format the results to 2 decimal places.
     */





    }
}
