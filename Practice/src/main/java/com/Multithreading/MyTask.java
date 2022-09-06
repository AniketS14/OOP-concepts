package com.Multithreading;

public class MyTask implements Runnable {
	private String anyData;

	public String getAnyData() {
		return anyData;
	}

	public void setAnyData(String anyData) {
		this.anyData = anyData;
	}

	// public MyTask(String anyData) {
	// this.anyData = anyData;
//	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("[data=" + getAnyData() + "] Message " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
