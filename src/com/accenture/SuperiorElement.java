/*superior element is one which is greater than all elements to its right. the rightmost element is always
superior. write a function to find no of superior elements
 */
package com.accenture;

public class SuperiorElement {
    public static void main(String[] args) {
        int arr [] ={7,9,5,2,8,7,3,6,1};
        int result = findNumberOfSuperior(arr, arr.length);
        System.out.println(result);
    }
    public static int findNumberOfSuperior(int arr[], int n)
    {
        int countSuperior = 0;
        boolean superior = true;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if (arr[j] > arr[i])
                {
                    superior = false;
                    break;
                }
                else
                {
                    superior = true;
                }
            }
            if(superior)
                countSuperior++;
        }
        return countSuperior+1;

    }
}
