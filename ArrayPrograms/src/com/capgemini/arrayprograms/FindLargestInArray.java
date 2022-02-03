package com.capgemini.arrayprograms;

//find the max number from array element 
import java.util.Scanner;

public class FindLargestInArray 
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
		int max = a1[0];
      for (int i = 0; i <n; i++) {  
         if(a1[i] > max)  
             max = a1[i]; 
      }  
      System.out.println("Largest element present in given array: " + max);  
  }
}
}
