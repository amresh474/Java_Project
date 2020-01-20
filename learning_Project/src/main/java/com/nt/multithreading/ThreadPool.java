package com.nt.multithreading;

import java.lang.Character.UnicodeScript;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Process implements Runnable {
	private int id;

	Process(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println("starting ..." + id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed..." + id);
	}
}

public class ThreadPool {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 10; i++) {
			executor.submit(new Process(i));
		}
		executor.shutdown();
		System.out.println("All task Submited ......");
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All task completed.....");
	}
}
