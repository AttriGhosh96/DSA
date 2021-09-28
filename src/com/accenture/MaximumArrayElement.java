package com.accenture;

public class MaximumArrayElement {
    public static void main(String[] args) {
        int arr[] = {23,45,82,27,66,12,78,13,71,86 };
        getMaximumElement(arr);
    }

    public static void getMaximumElement(int arr[])
    {
        int maxElement = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > maxElement)
            {
                maxElement = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(maxElement);
        System.out.println(maxIndex);
    }
}
