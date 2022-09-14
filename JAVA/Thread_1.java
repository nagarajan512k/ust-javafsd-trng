package com.ust5;

public class Thread_1 implements Runnable{

	public static void main(String[] args) {
		
		Runnable r=new Thread_1();
		r.run();
	}

	public void run() {
		System.out.println("Doing heavy processing - START"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			//Get database connection,delete unused data from DB
			doDBProcessing();
		}catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		System.out.println("Doing heavy processing-END"+Thread.currentThread().getName());
	}
	private void doDBProcessing()throws InterruptedException{
		Thread.sleep(5000);
	}
}
