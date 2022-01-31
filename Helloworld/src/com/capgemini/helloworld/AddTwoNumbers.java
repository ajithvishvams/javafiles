package com.capgemini.helloworld;

import java.util.Scanner;

public class AddTwoNumbers 
{
public static void main(String args[])
{
	int num1,num2;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter number 1=");
	num1 =sc.nextInt();
	
	System.out.println("Enter number 2=");
	num2 =sc.nextInt();
	
	sc.close();
	int sum= num1 +num2;
	System.out.println(sum);
	}
}
