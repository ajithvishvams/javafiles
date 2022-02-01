package com.capgemini.day3;
class MyShape {

	public int draw(int a, int b) {
		System.out.println("line drawing ");
		return 0;
	}
	public void draw(int a, int b,int c) {
		System.out.println("circle drawing ");
	}
	
	public void draw(int a, int b,int c,int d) {
		System.out.println("Sequare drawing ");
	}


}

public class MyPolymorphismMethodOverloading {

	public static void main(String[] args) {
		MyShape shape=new MyShape();
		shape.draw(1, 1);
		
	}

}
