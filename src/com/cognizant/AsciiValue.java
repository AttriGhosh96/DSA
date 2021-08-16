//printing ascii values
package com.cognizant;

import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit:");
        int alpha = sc.nextInt();
        char alphaChar = (char) alpha;
        String alphaString = Integer.toString(alpha);
        System.out.println("Integer: " +alpha);
        System.out.println("Character: " +alphaChar);
        System.out.println("String: " +alphaString.substring(1));
//        System.out.println(alphaChar);
//        for(int i = 0; i <= 255; i++)
//        {
//            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
//        }
    }
}
