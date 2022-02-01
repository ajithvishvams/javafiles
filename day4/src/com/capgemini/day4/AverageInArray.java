package com.capgemini.day4;
import java.util.Scanner;  
public class AverageInArray
{  
	public static void main(String[] args)   
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
		int sum=0;
		for (int i = 0; i < n; i++) 
	    {  
	         sum = sum + a1[i];  
	    }
		int average=0;
		average = sum/ n;
	        System.out.println("Average of all the elements in an array: " + average);  
	 }	
}