//print pattern 1111 222 33 for n=3
package com.cognizant;

public class Pattern {
    public static void main(String[] args) {
        int n=3,i,j;
        for(i=1; i<=n; i++)
        {
            for(j=n+1; j>=i; j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
