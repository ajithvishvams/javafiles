package com.capgemini.helloworld;

import java.util.Scanner;

public class CheckEvenorOdd {
	public static void main(String args[])
	{
		int num ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1=");
		num=sc.nextInt();
		
		sc.close();
		
		if(num%2==0)
			System.out.println("The number is Even");
		else
			System.out.println("The number is Odd");
	}
}
