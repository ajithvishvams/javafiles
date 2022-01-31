package com.capgemini.helloworld;
import java.util.Scanner;
public class QuotientAndRemainder {
	public static void main(String[] args){    
        int dividend, divisor, quo, rem;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Dividend:");
        dividend = in.nextInt();
        System.out.print("Enter Divisor:");
        divisor = in.nextInt();
        quo = dividend / divisor;
        rem = dividend % divisor;

        System.out.println("Quotient: "+quo);
        System.out.println("Remainder: "+rem);
    }
}
