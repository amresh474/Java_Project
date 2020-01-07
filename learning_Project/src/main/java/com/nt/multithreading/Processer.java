package com.nt.multithreading;

import java.util.Scanner;

public class Processer extends Thread {
	private boolean ruuning =true;

	@Override
	public void run() {
		while (ruuning) {
			System.out.println("hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void shutdown() {
	ruuning=false;
	}

	public static void main(String[] args) {
		Processer proc1 = new Processer();
		proc1.start();
		System.out.println("Press return to stop ......");
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		proc1.shutdown();
	}

}
