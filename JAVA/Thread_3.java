package com.ust5;

public class Thread_3 implements Runnable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread Thread1=new Thread("Guru1");
		Thread Thread2=new Thread("Guru2");
		Thread1.start();
		Thread2.start();
		System.out.println("Thread names are following:");
		System.out.println(Thread1.getName());
		System.out.println(Thread2.getName());

	}
	@Override
	public void run() {
		
	}

}
