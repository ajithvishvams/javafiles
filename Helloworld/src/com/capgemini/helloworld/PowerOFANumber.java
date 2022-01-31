package com.capgemini.helloworld;
import java.util.Scanner; 
public class PowerOFANumber {
 
static int power(int base, int exponent)  
{  
int power = 1;  
for (int i = 1; i <= exponent; i++)   
power = power * base;  
return power;  
}  
public static void main(String args[])  
{  
int base, exponent;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the base: ");  
base=sc.nextInt();  
System.out.print("Enter the exponent: ");  
exponent=sc.nextInt();  
//calling function  
int pow=power(base, exponent);  
//prints the result  
System.out.println(base +" to the power " +exponent + " is: "+pow);  
}
}
