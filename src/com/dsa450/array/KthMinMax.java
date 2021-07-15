//Returns the kth smallest and largest element of an array
//Complexity O(nlogn)
package com.dsa450.array;

import java.util.Arrays;

public class KthMinMax {

    public static int kthSmallest(int arr[], int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static int kthLargest(int arr[], int k)
    {
        Arrays.sort(arr);
        return arr[arr.length-k];
    }

    public static void main(String[] args) {
        int arr[] = {7,10,4,3,20,15};
        int k = 3;
        int kthSmallestElement = kthSmallest(arr, k);
        int kthLargestElement = kthLargest(arr, k);
        System.out.println("The " +k + "th smallest element: " +kthSmallestElement);
        System.out.println("The " +k + "th largest element: " +kthLargestElement);
    }
}
