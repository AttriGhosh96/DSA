/* The function accepts an integers arr of size ’length’ as its arguments
you are required to return the sum of second largest largest element from the even positions
and second smallest from the odd position of given ‘arr’
 */
package com.accenture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LargeSmallSum {
    public static void main(String[] args) {
        int arr[] = {3,2,1,7,5,4};
        int result = findLargeSmallSum(arr);
        System.out.println(result);
    }

    public static int findLargeSmallSum(int arr[])
    {
        ArrayList<Integer> evenPositionNumbers = new ArrayList<Integer>();
        ArrayList<Integer> oddPositionNumbers = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++)
        {
            if(i%2 == 0)
                evenPositionNumbers.add(arr[i]);
            else
                oddPositionNumbers.add(arr[i]);
        }
        Collections.sort(evenPositionNumbers);
        Collections.sort(oddPositionNumbers);

        int sum = (evenPositionNumbers.get(evenPositionNumbers.size()-2)) + (oddPositionNumbers.get(1));
        return sum;
    }
}
