package com.ust5;

public class Thread_7 implements Runnable {
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println("Current thread:"+t.getName());
		
		//checks if current thread is alive
		System.out.println("Is Alive?"+t.isAlive());
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Thread t=new Thread(new Thread_7());
		t.start();
		
		//waits for 1000ms this thread to die
		t.join(1000);
		
		System.out.println("\n Joining after 1000"+"milliseconds:\n");
		System.out.println("Current thread:"+t.getName());
		
		//checks if this thread is alive
		System.out.println("Is alive?"+t.isAlive());

	}

}
