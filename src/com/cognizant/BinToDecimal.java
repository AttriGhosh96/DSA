package com.cognizant;

public class BinToDecimal {
    public static void binToDec(long binaryNum)
    {
        int count = -1;
        long decimalNumber = 0;
        while(binaryNum > 0)
        {
            long digit = (binaryNum % 10);
            count++;
            decimalNumber = (long) (decimalNumber + digit*Math.pow(2,count));
            binaryNum = binaryNum/10;
        }
        System.out.println(decimalNumber);
    }

    public static void main(String[] args) {
        long bin = 1000;
        binToDec(bin);
    }
}
