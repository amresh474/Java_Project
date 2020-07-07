package com.nt.multithreading;

import java.util.concurrent.Semaphore;

public class CorrectSemaphoreExample {
	public static void Example() throws InterruptedException {
		final Semaphore semaphore = new Semaphore(1);
		Thread badthread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						semaphore.acquire();
						try {
							throw new RuntimeException("");

						} catch (Exception e) {
							return;
						}

					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} finally {
						System.out.println("Bad thread Reaslesing Semaphore. ");
						semaphore.release();
					}

				}
			}
		});
	}

}
