package com.Multithreading;

public class InstantiateUsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Thread main started");
		 
		MyTask obj1= new MyTask();
		MyTask obj2= new MyTask();
		obj1.setAnyData("Task 1 is Completed ...");
		obj2.setAnyData("Task 2 is Completed ...");

        
		Thread thread1 = new Thread(obj1);	
		Thread thread2 = new Thread(obj2);	
		thread1.start();
		thread2.start();
		
		System.out.println("Thread main finished");

	}

}
