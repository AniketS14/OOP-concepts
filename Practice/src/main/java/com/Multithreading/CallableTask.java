package com.Multithreading;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String call() throws Exception {
		
		Thread.sleep(1000);
		return "Hello...." + getName();
	}

}
