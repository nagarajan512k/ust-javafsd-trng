package synchronisation;

public class Synchronisation1 extends Thread {

	public static void main(String[] args) {
		Synchronisation1 t1=new Synchronisation1();		
		t1.start();
		Thread t2=new Thread();
		t2.start();
	}
	
	public void run() {
		synchronized(this){
			System.out.println("In synchronized");
		}
		System.out.println("Thread is started");
		System.gc();
	}

}
