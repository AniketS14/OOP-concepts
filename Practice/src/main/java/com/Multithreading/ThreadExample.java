package com.Multithreading;

public class ThreadExample {

	public static void main(String[] args) {
		Runner1 runner1 = new Runner1();
		runner1.start();

		Runner2 runner2 = new Runner2();
		runner2.start();
	}// ENDof Main
}

class Runner1 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Runner2 extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(5 * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
