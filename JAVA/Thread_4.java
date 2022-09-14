package com.ust5;

public class Thread_4 implements Runnable {
	@Override
	public void run() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread1=new Thread();
		
		try{
			thread1.sleep(1000);
			
		}catch(InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		thread1.setPriority(7);
		int priority=thread1.getPriority();
		System.out.println(priority);
		thread1.start();
		System.out.println("Thread Running");
	}

}
