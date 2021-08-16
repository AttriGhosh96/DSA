/*The function accepts two integers n, m as arguments
Find the sum of all numbers in range from 1 to m(both inclusive) that are not divisible by n.
Return difference between sum of integers not divisible by n with sum of numbers divisible by n.
 */
package com.accenture;

public class DifferenceOfFactors {
    public static void main(String[] args) {
        int n=4;
        int m=20;
        int result = differenceOfSum(n,m);
        System.out.println(result);
    }
    public static int differenceOfSum(int n, int m)
    {
        int sumDivisible = 0, sumNotDivisible = 0;
        for(int i=1; i<=m; i++)
        {
            if(i%n == 0)
                sumDivisible += i;
            else
                sumNotDivisible += i;
        }
        return Math.abs(sumNotDivisible - sumDivisible);
    }
}
