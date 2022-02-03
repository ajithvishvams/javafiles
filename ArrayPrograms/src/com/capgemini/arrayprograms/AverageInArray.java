package com.capgemini.arrayprograms;
//Avg of all the element of array
import java.util.Scanner;  
public class AverageInArray
{  
	public static void main(String[] args)   
	 {  
		 int n;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Size of Array: ");  
		n=sc.nextInt();  
			
		int[] a1 = new int[10];  	
		System.out.println("Enter the elements for the array: ");  
		for(int i=0; i<n; i++)  
		{  
			a1[i]=sc.nextInt();  
		} 
		int sum=0;
		for (int i = 0; i < n; i++) 
	    {  
	         sum = sum + a1[i];  
	    }
		int average=0;
		average = sum/ n;
	        System.out.println("Average of elements in the array: " + average);  
	        sc.close();
	 }	
}