package com.Multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		CallableTask obj = new CallableTask("Aniket");
		Future<String> future = executorService.submit(obj);
		System.out.println(future.get());
	//	String string = executorService.toString();
	//	System.out.println(string);
	//	System.out.println(future.toString());

		System.out.println("Thread completed..");

	}

}
