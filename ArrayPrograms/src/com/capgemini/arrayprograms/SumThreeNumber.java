package com.capgemini.arrayprograms;

//Sum of three number
import java.util.Scanner;
public class SumThreeNumber {

public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	double num1 = scan.nextDouble();
	System.out.print("Enter the second number: ");
	double num2 = scan.nextDouble();
	System.out.print("Enter the third number: ");
	double num3 = scan.nextDouble();
	scan.close();
	System.out.print("The average of Three numbers is:" + avr(num1, num2, num3) );
}

	  public static double avr(double a, double b, double c)
	    {
	        return (a + b + c);
	    }
}
