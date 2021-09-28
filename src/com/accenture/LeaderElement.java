package com.accenture;

public class LeaderElement {
    public static void main(String[] args) {
        int arr[] = {17, 18, 2, 4, 6, 8};
        int result = getLeaderElement(arr);
        System.out.println(result);
    }

    public static int getLeaderElement(int arr[])
    {
        int sum = 0;
        boolean leader = true;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] > arr[i])
                {
                    leader = false;
                    break;
                }
                else
                    leader = true;
            }
            if(leader == true)
                sum += arr[i];

        }
        sum += arr[arr.length - 1];
        return sum;
    }
}
