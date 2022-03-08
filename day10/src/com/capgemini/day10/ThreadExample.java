package com.capgemini.day10;

class TestThread1 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
				System.out.println("Created thread" + i + " " + currentThread().getName());
				try {
					currentThread().sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}

	}
}

public class ThreadExample {
	public static void main(String args[]) {
		System.out.println(Thread.activeCount());
		TestThread1 T1 = new TestThread1();
		T1.setPriority(10);
		T1.setName("1");
		T1.start();
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}
