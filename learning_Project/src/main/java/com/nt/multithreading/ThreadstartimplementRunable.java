package com.nt.multithreading;

import org.junit.internal.runners.statements.RunAfters;

public class ThreadstartimplementRunable implements Runnable {

	@Override
	public void run() {
		System.out.println("run executed ");
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello" + i);

		}

	}

	public static void main(String[] args) {
		ThreadstartimplementRunable thread = new ThreadstartimplementRunable();
		Thread th = new Thread(thread);
		th.start();
		System.out.println("main executed");
		
	}

}
