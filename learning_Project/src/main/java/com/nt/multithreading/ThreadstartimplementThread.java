package com.nt.multithreading;

public class ThreadstartimplementThread extends Thread {

	@Override
	public void run() {
		System.out.println("run executed");
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		ThreadstartimplementThread thread = new ThreadstartimplementThread();
		thread.start();
		System.out.println("main executed");
		
		// we can also create thread by this method
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					System.out.println("th thread" + i);

				}

			}
		});
		th.start();
	}

}
