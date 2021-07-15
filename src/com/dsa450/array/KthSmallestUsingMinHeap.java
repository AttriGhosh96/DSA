//Smallest using min heap but forming a heap of size k.
package com.dsa450.array;

public class KthSmallestUsingMinHeap {

    public static void main(String[] args) {
        int arr[] = {7,10,4,3,20,15};
        int k = 3;
        int maxCapacity = arr.length;
        MinHeap minHeap = new MinHeap(arr,maxCapacity,k);

    }
}

class MinHeap
{
    int [] heapArray;
    int maxCapacity;
    int heapSize;
    int k;

    MinHeap(int [] arr, int maxCapacity, int k)
    {
        this.maxCapacity = maxCapacity;
        this.k = k;
        heapArray = new int[maxCapacity];
        heapSize = 0;

        for(int i=0; i<arr.length; i++ )
        {
            heapArray[heapSize++] = arr[i];

        }
    }

}
