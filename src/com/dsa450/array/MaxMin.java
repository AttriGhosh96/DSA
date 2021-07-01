//Returns the maximum and minimum number in an array together
package com.dsa450.array;

class Pair
{
    int max;
    int min;
}

public class MaxMin {

    public static Pair findMinMax(int arr[] )
    {
        Pair minMax = new Pair();
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] < min)
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];
        }
        minMax.min = min;
        minMax.max = max;

        return minMax;
    }

    public static void main(String[] args) {
        int arr[] = {3,5,1,8,6,7,12,4,11,9};
        Pair minMax = findMinMax(arr);
        System.out.println("Minimum element in the array: " +minMax.min);
        System.out.println("Maximum element in the array: " +minMax.max);
    }
}
