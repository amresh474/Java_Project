package com.nt.multithreading;

import java.util.concurrent.CountDownLatch;

/*
2. CountDownLatch - Important Points
Now that you know what is CountDownLatch in Java and how to use it for inter-thread communication and synchronization.
It's time to revise and remember some important points:

1. The CountDownLatch utility or class is only available on JRE 1.5 or later version.

2. You cannot reuse the latch once the count reaches zero. This is the main difference between a CyclicBarrier and CountDownLatch, 
which can be reused.

3. The getCount() method return the current count i.e. remaining threads which have not finished yet.

4. A thread can wait on latch by calling latch.await() method to start progress after remaining thread finishes their task.
Btw, if you are new to threading and concurrency and don't understand what is waiting for means in the context of a thread,
I suggest you go through Threading Essentials a  Mini-Course by Java Champion Heinz Kabutz.

5. One of the simplest use of CountDownLatch class is to block a thread until other threads have finished their jobs.

In our example, it was the main thread which was blocked by calling the await() method of CountDownLatch until all loader class 
finished their job i.e. downloaded courses from Udemy.

*/

public class countdownLatches {
	private static final CountDownLatch loadingLatch = new CountDownLatch(3);

	public static void main(String[] args) {

		Thread pythonCourseLoader = new Thread("PythonCourseLoader") {

			@Override
			public void run() {
				System.out.println("Loading all Python courses from Udemy..");
				// loading Python courses ....
				// loading completed, time to count down
				System.out.println("loading completed for Python courses");
				loadingLatch.countDown();
			}
		};

		Thread javaCourseLoader = new Thread("JavaCourseLoader") {
			@Override
			public void run() {
				System.out.println("Loading all Java courses from Udemy ..");
				// loading Java courses ....
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("loading completed for Java courses");
				loadingLatch.countDown();
			}
		};

		Thread developmentCourseLoader = new Thread("developmentCourseLoader") {
			@Override
			public void run() {
				System.out.println("Loading all Develoment courses from Udemy ..");
				// loading development courses ....
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("loading completed for development courses");
				loadingLatch.countDown();
			}
		};
		pythonCourseLoader.start();
		javaCourseLoader.start();
		developmentCourseLoader.start();

		while (loadingLatch.getCount() != 0) {
			// wait
		}

		// loadingLatch.await();

		System.out.println("all done.");
	}
}
