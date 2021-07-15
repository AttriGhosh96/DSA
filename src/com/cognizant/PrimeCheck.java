package com.cognizant;

public class PrimeCheck {

    public static boolean isPrime(int n)
    {
        boolean flag = true;
        for(int i=2; i<=n/2; i++)
        {
            if(n%i == 0)
                flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        int n=2;
        if(isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Non Prime");
    }
}
