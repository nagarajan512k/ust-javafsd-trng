package com.ust5;

public class Thread_2 extends Thread {

	public static void main(String[] args) {
		String name="RAJA";
		Thread_2 t=new Thread_2(name);
				t.run();
		
		// TODO Auto-generated method stub
	}
		public Thread_2(String name)
		{
			super(name);
		}
	
	
		public void run()
		{
			System.out.println("MyThread-START"+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
				//Get database connection, delete unused data from DB
				doDBProcessing();
				
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			System.out.println("MyThread-END"+Thread.currentThread().getName());
		
		}
	
		private void doDBProcessing() throws InterruptedException{
			Thread.sleep(5000);
		}
	}
