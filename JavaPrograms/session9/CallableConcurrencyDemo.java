package session9;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableConcurrencyDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int[] a1= {1,2,3,4,5,6,7,8,9,10};
		int[] a2= {10,10,10,10,10,10,10};
		int[] a3= {3,4,3,4,3,2,1,3,7,5};
		/*Callable<Integer> task1=()->Arrays.stream(a1).sum();
		Callable<Integer> task2=()->Arrays.stream(a2).sum();
		Callable<Integer> task3=()->Arrays.stream(a3).sum();
		ExecutorService executor=Executors.newCachedThreadPool();
		Future<Integer> future1=executor.submit(task1);
		Future<Integer> future2=executor.submit(task2);
		Future<Integer> future3=executor.submit(task3);
		System.out.println("1. The sum is: "+future1.get());
		System.out.println("2. The sum is: "+future2.get());
		System.out.println("3. The sum is: "+future3.get());
		executor.shutdown();*/
		CompletableFuture.supplyAsync(()->Arrays.stream(a1).sum())
							.thenAccept(System.out::println);
		CompletableFuture.supplyAsync(()->Arrays.stream(a2).sum())
		.thenAccept(System.out::println);
		CompletableFuture.supplyAsync(()->Arrays.stream(a3).sum())
		.thenAccept(System.out::println).join();

		}
		
		

	}


