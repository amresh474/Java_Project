package com.nt.multithreading;

import static java.lang.Thread.currentThread;

import java.util.concurrent.TimeUnit;

/*
1) Thread.sleep() is a static method and it always puts the current thread to sleep.

2) You can wake-up a sleeping thread by calling interrupt() method on the thread which is sleeping.

3) The sleep method doesn't guarantee that the thread will sleep for exactly that many milliseconds, 
its accuracy depends on upon system timers and it's possible for a thread to woke before.

4) It doesn't release the lock it has acquired.



one of the key difference between wait() and sleep() method is that, Thread.sleep()
 puts the current thread on wait but doesn't release any lock it is holding, but wait does release the lock 
 it holds before going into blocking state.

*/

public class PauseThreadSleep {
	public static void main(String[] args) throws InterruptedException {
		Game game = new Game();
		Thread t1 = new Thread(game);
		t1.start();

		// Now, let's stop our Game thread
		System.out.println(currentThread().getName() + " is stopping game thread");
		game.stop();

		// Let's wait to see game thread stopped
		TimeUnit.MILLISECONDS.sleep(200);

		System.out.println(currentThread().getName() + " is finished now");
	}
}

class Game implements Runnable {
	private volatile boolean isStopped = false;

	public void run() {

		while (!isStopped) {
			System.out.println("Game thread is running.....");
			System.out.println("Game thread is now going to pause");

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Game thread is now resumed ..");
		}

		System.out.println("Game thread is stopped....");
	}

	public void stop() {
		isStopped = true;
	}
}
