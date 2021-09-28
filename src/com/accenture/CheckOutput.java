package com.accenture;

public class CheckOutput {
    public static void main(String[] args) {
        for(int i=0; i<=9; i++)
        {
            System.out.print("#");
            if(i>6)
                continue;
            System.out.print(i);
        }

        int a[] = {3, 0, 1, 0, 2};
        int m=-1;
        for(int i=m+1; i<=m+5; i++) {
            if ((a[i] & i) > 0)
                a[i] = a[i] & i;
        }
        m = a[0] + a[4] - a[1];
        System.out.println(m);


    }
}
