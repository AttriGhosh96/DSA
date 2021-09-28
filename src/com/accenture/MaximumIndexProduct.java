package com.accenture;

public class MaximumIndexProduct {
    public static void main(String[] args) {
        int arr[] = {3,4,3,6,4,5,-2};
        int a[] = {1,5,4,3,5,-2};
        int result = getMaximumIndexProduct(a, a.length);
        System.out.println(result);
    }

    public static int getMaximumIndexProduct(int arr[], int n)
    {
        int maximumIndexProduct = 0;
        int left, right, indexProduct;
        for(int j=0; j<n; j++)
        {
            indexProduct = 1;
            left = 0;
            right = 0;
            for(int k=j-1; k>=0; k--)
            {
                if(k<j && arr[k]>arr[j])
                {
                    left = k;
                    break;
                }
            }

            for(int l=j+1; l<n-1; l++)
            {
                if(l>j && arr[l]>arr[j])
                {
                    right = l;
                    break;
                }
            }

            indexProduct = left*right;
            //System.out.println(indexProduct);
            if(indexProduct > maximumIndexProduct)
                maximumIndexProduct = indexProduct;
        }
        return maximumIndexProduct;
    }
}
