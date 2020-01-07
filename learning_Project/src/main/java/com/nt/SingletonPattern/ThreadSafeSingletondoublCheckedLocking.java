package com.nt.SingletonPattern;

/* 
  Above implementation works fine and provides thread-safety but it reduces the performance
   because of the cost associated with the synchronized method, although we need it only for 
   the first few threads who might create the separate instances (Read: Java Synchronization). 
   To avoid this extra overhead every time, double checked locking principle is used. In this approach, 
   the synchronized block is used inside the if condition with an additional check to ensure that only one 
   instance of a singleton class is created.
    
 */

public class ThreadSafeSingletondoublCheckedLocking {
	
	private static ThreadSafeSingletondoublCheckedLocking instance;
	
	public static ThreadSafeSingletondoublCheckedLocking getInstanceUsingDoubleLocking(){
	    if(instance == null){
	        synchronized (ThreadSafeSingletondoublCheckedLocking.class) {
	            if(instance == null){
	                instance = new ThreadSafeSingletondoublCheckedLocking();
	            }
	        }
	    }
	    return instance;
	}

}
