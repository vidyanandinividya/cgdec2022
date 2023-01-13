package session9;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyDemo {
	
	
	public static void main(String[] args) {
		int[] a1= {1,2,3,4,5,6,7,8,9,10};
		int[] a2= {10,10,10,10,10,10,10};
		int[] a3= {3,4,3,4,3,2,1,3,7,5};

		Runnable task1=()->{
			int sum=Arrays.stream(a1).sum();
			System.out.println("1. The Sum is: "+ sum);
			
		};
		Runnable task2=()->{
			int sum=Arrays.stream(a2).sum();
			System.out.println("2. The Sum is: "+ sum);
			
		};
		Runnable task3=()->{
			int sum=Arrays.stream(a3).sum();
			System.out.println("3. The Sum is: "+ sum);
			
		};
		/*new Thread(task1).start();
		new Thread(task2).start();
		new Thread(task3).start();*/
		ExecutorService executor=Executors.newCachedThreadPool();
		executor.submit(task1);
		executor.submit(task2);
		executor.submit(task3);
		executor.shutdown();
	}

}
