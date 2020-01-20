package com.nt.multithreading;

public class SynchronizedApp {
	private int count = 0;

	protected synchronized void increment() {
		count++;
	}

	public static void main(String[] args) throws Exception {
		SynchronizedApp app = new SynchronizedApp();
		app.doWork();
	}

	private void doWork() throws Exception {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					increment();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("count is :" + count);
	}

}
