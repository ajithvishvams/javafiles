package com.capgemini.arrayprograms;

import java.util.Arrays;
 
public class RemoveElement 
{
 
    public static void main(String[] args) 
    {
        int[] arr1 = new int[]{11,2,99,65,45};
        int[] arr2 = new int[arr1.length-1];
        int j=2;
        for(int i=0, k=0;i<arr1.length;i++)
        {
            if(arr1[i]!=j)
            {
                arr2[k]=arr1[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr1));
        System.out.println("After deletion :" + Arrays.toString(arr2));
 
    }
}