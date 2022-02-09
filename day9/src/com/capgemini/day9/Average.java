package com.capgemini.day9;

interface AverageOfElements {
	public void print();
}

public class Average {
	public static void main(String args[]) {
		AverageOfElements ps = ()->{
			int a=14, b=14, c=14;
			float d;
			d= (a+b+c)/3;
			System.out.println(d);
	};
	System.out.println("Average of elements: ");
	ps.print();
}
}