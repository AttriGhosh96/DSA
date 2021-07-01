//Returns the reverse of the array
package com.dsa450.array;

public class Reverse {

    public static void reverseArray(int arr[])
    {
        int low = 0, high = arr.length-1, temp;
        while(low < high)
        {
            temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low ++;
            high --;
        }
    }

    public static void display(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Original Array");
        display(arr);
        reverseArray(arr);
        System.out.println("Reversed Array");
        display(arr);
    }

}
