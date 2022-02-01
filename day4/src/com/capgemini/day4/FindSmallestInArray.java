package com.capgemini.day4;

import java.util.Scanner;

public class FindSmallestInArray 
{
	public static void main(String[] args) 
	{  

		{  
			 int n;
			Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements: ");  
			n=sc.nextInt();  
				
			int[] a1 = new int[10];  	
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<n; i++)  
			{  

				a1[i]=sc.nextInt();  
			}
		int min = a1[0];
        for (int i = 0; i <n; i++) {  
           if(a1[i] < min)  
               min = a1[i]; 
        }  
        System.out.println("Smallest element present in given array: " + min);  
    }
}
}

