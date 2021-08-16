//difference of a given number in the array should be less than or equal to given diff
package com.accenture;

public class NumDifference {
    public static void main(String[] args) {
        int arr[] = {12,3,14,56,77,13};
        int num = 13;
        int diff = 2;
        int result = findCount(arr,arr.length, num, diff);
        System.out.println(result);
    }
    public static int findCount(int arr[], int length, int num, int diff)
    {
        int count = 0;
        for(int i=0; i<length; i++)
        {
            int difference = Math.abs(num - arr[i]);
            if(difference <= diff)
                count++;
        }
        if(count > 0)
            return count;
        else
            return -1;
    }
}
