package Multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

	public static void main(String[] args) {
		
		Semaphore semaphore = new Semaphore(3);
		
		Thread t1 = new Thread(new SemaphoreImpl(semaphore, 9000),"1");
		
		Thread t2 = new Thread(new SemaphoreImpl(semaphore, 8000),"2");
		
		Thread t3 = new Thread(new SemaphoreImpl(semaphore, 7000),"3");
		
		
		Thread t4 = new Thread(new SemaphoreImpl(semaphore, 2000),"4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}

class SemaphoreImpl implements Runnable{
	
	Semaphore semaphore;
	
	int sleeptime;
	
	SemaphoreImpl(Semaphore sema,int sltime){
		semaphore = sema;
		sleeptime= sltime;
	}

	@Override
	public void run() {
		System.out.println("Thread entered into run method="+Thread.currentThread().getName());
		try {
			semaphore.acquire();
			System.out.println("Semaphore acquired by thread ="+Thread.currentThread().getName());
			Thread.sleep(sleeptime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		semaphore.release();
		System.out.println("Semaphore released by thread ="+Thread.currentThread().getName());
	}
	
	
	
}
