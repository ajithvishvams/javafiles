package com.capgemini.helloworld;

import java.util.Scanner;

public class CheckLeapYear
{
	public static void main(String arg[])
{
		int a ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number 1=");
		a=sc.nextInt();
		
		sc.close();
		
		if (a%4==0)
		{
			if(a%100==0)
			{
				if(a%400==0)
					System.out.println(a +" is a leap year");
				else
					System.out.println(a +" is not a leap year");
			}
			else
				System.out.println(a +" is a leap year");
		}
		else
			System.out.println(a +" is not a leap year");		
}
}