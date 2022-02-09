package com.capgemini.day9;

interface PrintSeries {
	public void print();
}

public class MoreLamdaExamples {
	public static void main(String args[]) {
		PrintSeries ps = ()->{
			long a=0, b=1, c;
			int i=0;
			for(i=0; i<50; i++){
				c=a+b;
				System.out.println(a);
				a=b;
				b=c;
			}
	};
	System.out.println("fibonacci series: ");
	ps.print();
}
}