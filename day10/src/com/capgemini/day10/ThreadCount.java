package com.capgemini.day10;

public class ThreadCount {
public static void main(String[] args) {
	System.out.println(Thread.activeCount());
	System.out.println(Runtime.getRuntime().availableProcessors());
}
}
