//given an array print for each element (sumOfNumbersLess * sumOfNumberMore)
package com.accenture;
import java.util.*;
public class ArrayManipulation {
    public static void main(String[] args) {
        int arr[] ={8,4,5,3,2,6,9,1};
        manipulation(arr);
    }

    public static void manipulation(int arr[])
    {
        int output [] = new int [arr.length];
        int lessSum, moreSum, result, k=0;
        for(int i=0; i<arr.length; i++)
        {
            lessSum = 0; moreSum = 0; result = 0;
            for(int j=i+1; j<arr.length; j++)
            {

                if(arr[j] < arr[i])
                {
                    lessSum += arr[j];
                }
                else
                {
                    moreSum += arr[j];
                }

            }
            result = lessSum * moreSum;
            System.out.println(result);
            output[k++] = result;
        }

        for(int i=0; i<output.length; i++)
        {
            System.out.print(output[i] + " ");
        }
    }
}
