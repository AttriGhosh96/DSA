//Given an array consisting of 0,1,2 only, sort them without using any sorting algorithm
package com.dsa450.array;

public class Sort012 {

    public static void sort012(int arr[])
    {
        int low = 0, mid = 0, high = arr.length-1;
        for(int i=0; i<arr.length; i++)
        {
            while(mid <= high)
            {
                if(arr[mid] == 0)
                {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                }
                else if(arr[mid] == 1)
                {
                    mid++;
                }
                else //when 2
                {
                    int temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,2,1,2,0,2,1,1,2,0,2,1,0};
        sort012(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
