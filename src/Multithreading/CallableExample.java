package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<String>  future = executorService.submit(new CallableClass());
		
		//Future future1 =   executorService.submit(new RunnableTest());
		
		try {
			System.out.println("Vakue of Future=="+future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}



class CallableClass implements Callable<String>{

	@Override
	public String call() throws Exception {
		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return "Hai Hello how are you callable";
	}
	
}


class RunnableTest implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Runnable executed");
		
	}
	
}
