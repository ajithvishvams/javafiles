package com.capgemini.arrayprograms;
//Avg of three number
import java.util.Scanner;
public class AverageOfThreeNumbers {

public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the num1: ");
	double num1 = scan.nextDouble();
	System.out.print("Enter the num2: ");
	double num2 = scan.nextDouble();
	System.out.print("Enter the num3: ");
	double num3 = scan.nextDouble();
	scan.close();
	System.out.print("The average of Three numbers is:" + avr(num1, num2, num3) );
}

	  public static double avr(double a, double b, double c)
	    {
	        return (a + b + c) / 3;
	    }
}